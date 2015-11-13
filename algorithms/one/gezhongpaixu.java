package aaaaaaaaaa;

import edu.princeton.cs.algs4.*;

class Example {
	public static void sort(int[] a) {
	}

	static boolean less(int l, int r) {
		return l < r;
	}

	static void exch(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	static void show(int[] a) {
		for (int i = 0; i < a.length; i++) {
			StdOut.print(a[i]+",");
		}
		StdOut.println();
	}

	public static boolean isSorted(int[] a) {
		for (int i = 1; i < a.length; i++) {
			if (less(a[i], a[i - 1]))
				return false;
		}
		return true;
	}
}

class Selection {
	public static void sort(int[] a) {
		int N = a.length;
		for (int i = 0; i < N; i++) {
			int min = i;
			for (int j = i+1; j < N; j++) {
				if (Example.less(a[j], a[min])) {
					min = j;
				}
			}
			Example.exch(a, min, i);
		}
	}
}

class Insertion {
	public static void sort(int[] a) {
		int N = a.length;
		for (int i = 1; i < N; i++) {
			for (int j = i; j > 0 && Example.less(a[j], a[j - 1]); j--) {
				Example.exch(a, j - 1, j);
			}
		}
	}
}

class Shell {
	public static void sort(int[] a) {
		int N = a.length;
		int h = 1;
		while (h < N / 3) {
			h = 3 * h + 1;
		}
		while (h >= 1) {
			for (int i = h; i < N; i++) {
				for (int j = i; j >= h && Example.less(a[j], a[j - h]); j -= h) {
					Example.exch(a, j - h, j);
				}
			}
			h /= 3;
		}
	}
}

public class gezhongpaixu {
	public static void main(String[] args) {
		int[] a = { 3, 4, 6, 3, 2, 5, 6, 7, 4, 67, 8, 4, 7, 745, 7, 85 };
		int[] b = { 3, 4, 6, 3, 2, 5, 6, 7, 4, 67, 8, 4, 7, 745, 7, 85 };
		int[] c = { 3, 4, 6, 3, 2, 5, 6, 7, 4, 67, 8, 4, 7, 745, 7, 85 };
		Insertion.sort(a);
		Selection.sort(b);
		Shell.sort(c);
		Example.show(a);
		Example.show(b);
		Example.show(c);
	}
}
