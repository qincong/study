package myProject;
import edu.princeton.cs.algs4.StdOut;
public class MaxPQ {
	private int[] pq;
	private int N=0;
	
	private MaxPQ(int max) {
		pq=new int[max];
	}
	public boolean isEmpty() {
		return N==0;
	}
	public int size() {
		return N;
	}
	public void insert(int v) {
		pq[++N]=v;
		swim(N);
	}
	public int delMax() {
		int max=pq[1];
		exch(1,N--);
		sink(1);
		return max;
	}
	private void exch(int i,int j) {
		int temp=pq[i];
		pq[i]=pq[j];
		pq[j]=temp;
	}
	private void swim(int k) {
		while(k>1 && pq[k/2]<pq[k]) {
			exch(k/2,k);
			k/=2;
		}
	}
	private void sink(int k) {
		while(k<N) {
			int j=k*2;
			if(pq[j+1]>pq[j])
				j++;
			if(pq[j]>pq[k]){
				exch(j,k);
				k=j;
			}
			else break;
		}
	}
	public static void main(String[] args) {
		MaxPQ maxPq=new MaxPQ(5);
		maxPq.insert(3);
		maxPq.insert(5);
		StdOut.print(maxPq.delMax());
	    maxPq.insert(8);
	    StdOut.print(maxPq.delMax());
	}
}








