package aaaaaaaaaa;

import edu.princeton.cs.algs4.*;
import java.io.*;
import java.util.*;

public class BinarySearch {
	public static int rank (int key,int[] a) {
		int lo=0;
		int hi=a.length-1;
		while(lo<=hi) {
			int mid=lo+(hi-lo)/2;
			if (key<a[mid])
				hi=mid-1;
			else if (key>a[mid])
				lo=mid+1;
			else
				return mid;
		}
		return -1;
	}
	public static void main(String args[]) throws FileNotFoundException {
		int[] whiteList=In.readInts("E:\\Users\\qinc0\\Documents\\algs4-data\\tinyW.txt");
		FileInputStream fis=new FileInputStream("E:\\Users\\qinc0\\Documents\\algs4-data\\tinyT.txt");  
        System.setIn(fis);
		Scanner sc=new Scanner(System.in);
		
		Arrays.sort(whiteList);
		while(true) {
			int key=sc.nextInt();
			if(rank(key,whiteList)<0)
				StdOut.println(key);
			if(!sc.hasNext())
				break;
		}
	}
}