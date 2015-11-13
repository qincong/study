package aaaaaaaaaa;

import edu.princeton.cs.algs4.*;

public class WeightQuickUnionUF {
	private int[] id;
	private int[] sz;
	private int count;

	public WeightQuickUnionUF(int N) {
		count = N;
		id = new int[N];
		sz = new int[N];
		for (int i = 0; i < N; i++) {
			id[i] = i;
			sz[i] = 1;
		}
	}

	public int count() {
		return count;
	}

	public boolean connected(int p, int q) {
		return find(p) == find(q);
	}

	public int find(int p) {
		while (p != id[p]) {
			p = id[p];
		}
		return p;
	}

	public void union(int p, int q) {
		int pRoot = find(p);
		int qRoot = find(q);
		if (pRoot == qRoot)
			return;
		if(sz[pRoot]<sz[qRoot]) {
			id[pRoot]=id[qRoot];
			sz[qRoot]+=sz[pRoot];
		}
		else {
			id[qRoot]=id[pRoot];
			sz[pRoot]+=sz[qRoot];
		}
		count--;
	}

	public static void main(String[] args) {
		In read = new In("E:\\Users\\qinc0\\Documents\\algs4-data\\largeUF.txt");
		int N = read.readInt();
		WeightQuickUnionUF uf = new WeightQuickUnionUF(N);
		while (!read.isEmpty()) {
			int p = read.readInt();
			int q = read.readInt();
			if (uf.connected(p, q))
				continue;
			uf.union(p, q);
			StdOut.println(uf.count() + "conponents");
		}
	}

}
