package aaaaaaaaaa;

import edu.princeton.cs.algs4.*;
import java.io.*;
import java.util.*;

public class BinarySearch_1_1_29 {
	public static int rank(int key,int[] str) {
		int lo=0,hi=str.length;
		int mid=(lo+hi)/2;
		while(lo<=hi){
			if(str[mid]==key) {
				while(str[mid--]==key);
				return mid+2;
			}
			else {
				if(str[mid]<(key)) {
					lo=mid+1;
					mid=(lo+hi/2);
				}
				else {
					hi=mid-1;
					mid=(lo+hi)/2;
				}
			}
		}
		return -1;
	}
	public static  int count(int key,int[] str) {
		int num=rank(key,str);
		int i=0;
		while(str[num]==key) {
			num++;
			i++;
		}
		return i;
	}
	public static void main(String[] args) {
		int[] a={1,2,3,4,5,5,5,6,7};
		StdOut.print(rank(5,a));
		StdOut.print(count(5,a));
	}
	
	
}














