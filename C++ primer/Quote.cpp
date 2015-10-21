#include "stdafx.h"
#include <vector>
#include <string>
#include <initializer_list>
#include <memory>
#include <stdexcept>
#include <iostream>
#include <fstream>
#include <sstream>
#include <map>
#include <list>
#include <set>
#include <algorithm>
#include <functional>

using namespace std;

class Quote {
	friend ostream & operator<<(ostream &, Quote &);
public:
	Quote() = default;
	Quote(const string &book, double sales_price) :bookNo(book),price(sales_price) {
		cout << "Quote constructor is running" << endl;
	}
	string isbn() const {
		return bookNo;
	}
	virtual double net_price(size_t n) const {
		return n*price;
	}
	virtual void debug() {
		cout << "prive,bookNo" << endl;
	}
	virtual Quote* clone() const & {
		return new Quote(*this);
	}
	virtual Quote* clone() && {
		return new Quote(std::move(*this));
	}
	virtual ~Quote() = default;
private:
	string bookNo;
protected:
	double price = 0.0;
};

ostream & operator<<(ostream &os, Quote &e) {
	os << "using operator<<(ostream &,Quote &)" << endl;
	return os;
}

class Disc_quote:public Quote {
public:
	Disc_quote(const string &book,double p,size_t qty,double disc):Quote(book,p),min_qty(qty),disc(disc) {}
	virtual double net_price(size_t n) const = 0;
protected:
	size_t min_qty;
	double disc;

};

class Bulk_quote :public Disc_quote {
	friend ostream &operator<<(ostream &, Bulk_quote &);
public:
	Bulk_quote(const string &book="",double p=0.0,size_t qty=0,double disc=0.0):Disc_quote(book,p,qty,disc) {}
	double net_price(size_t n) const override{
		if (n > min_qty)
			return n*(1 - disc)*price;
		else
			return n*price;
	}
	Bulk_quote* clone() const & {
		return new Bulk_quote(*this);
	}
	Bulk_quote* clone() && {
		return new Bulk_quote(std::move(*this));
	}
};

ostream &operator<<(ostream &os, Bulk_quote &bulk) {
	os << "using operator<< (ostream &,Bulk_quote &)" << endl;
	return os;
}

int print_total(ostream &os, const Quote &item, size_t n) {
	double ret = item.net_price(n);
	os << "ISBN" << item.isbn() << "# SOLD: " << n << "total due: " << ret << endl;
	return ret;
}

void bug(Quote &item) {
	item.debug();
}

class Basket {
public:
	void add_item(const shared_ptr<Quote> &sale) {
		items.insert(sale);
	}
	void add_item(const Quote& sale) {
		items.insert(shared_ptr<Quote>(sale.clone()));
	}
	void add_item(Quote&& sale) {
		items.insert(shared_ptr<Quote>(std::move(sale).clone()));
	}
	double total_receipt(ostream &) const;
private:
	static bool compare(const shared_ptr<Quote> &lhs, const shared_ptr<Quote> &rhs) {
		return lhs->isbn() < rhs->isbn();
	}
	multiset<shared_ptr<Quote>, decltype(compare)*> items{ compare };
};

double Basket::total_receipt(ostream &os) const {
	double sum = 0.0;
	for (auto iter = items.cbegin();iter != items.cend();iter = items.upper_bound(*iter)) {
		sum += print_total(os, **iter, items.count(*iter));
	}
	os << "Total Sale: " << sum << endl;
	return sum;
}

void main() {
	Quote quo("haoshu", 30);
	Bulk_quote bulk("dazhe", 30, 10, 0.5);
	vector<shared_ptr<Quote>> ve;
	ve.push_back(make_shared<Quote>(quo));
	cout << ve.back()->net_price(10) << endl;
}