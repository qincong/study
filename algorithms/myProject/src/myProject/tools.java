package myProject;

import edu.princeton.cs.algs4.StdOut;

public class tools {
	static void exch(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	static void printArray(int[] a) {
		for(int i:a) {
			StdOut.print(i+",");
		}
	}
}

