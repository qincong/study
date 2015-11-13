package aaaaaaaaaa;

import edu.princeton.cs.algs4.*;

public class UF {
	private int[] id;
	private int count;

	public UF(int N) {
		count = N;
		id = new int[N];
		for (int i = 0; i < N; i++) {
			id[i] = i;
		}
	}

	public int count() {
		return count;
	}
	 public boolean connected(int p,int q) {
	 return find(p)==find(q);
	 }
	 public int find(int p){
		 return id[p];
	 }
	 public void union(int p,int q) {
		 int Pid=find(p);
		 int Qid=find(q);
		 if(Pid==Qid)
			 return;
		 for (int i = 0; i < id.length; i++) {
			if(id[i]==Pid)
				id[i]=Qid;
		}
		 count--;
	 }

	public static void main(String[] args) {
		In read = new In("E:\\Users\\qinc0\\Documents\\algs4-data\\largeUF.txt");
		int N = read.readInt();
		UF uf = new UF(N);
		while (! read.isEmpty()) {
			int p = read.readInt();
			int q = read.readInt();
			 if(uf.connected(p,q))
				 continue;
			 uf.union(p,q);
			StdOut.println(uf.count() + "conponents");
		}
	}

}
