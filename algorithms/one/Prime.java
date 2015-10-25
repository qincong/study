package aaaaaaaaaa;

import edu.princeton.cs.algs4.*;
import java.io.*;
import java.util.*;
public class Prime {
	public static boolean isPrime(int i,int j) {
		for(int n=2;n<i&&n<j;n++) {
			if(i%n==0 && j%n==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int N=10;
		boolean[][] prime = new boolean[N][N];
		for(int i=0;i<N;i++)
			for(int j=0;j<N;j++) {
				if(isPrime(i,j)) {
					prime[i][j]=true;
				}
				else
					prime[i][j]=false;
				
			}
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				StdOut.print(prime[i][j]+"  ");
			}
		StdOut.println();
		}
	}
}














