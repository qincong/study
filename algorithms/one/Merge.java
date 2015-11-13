package aaaaaaaaaa;

import java.util.Iterator;

import org.omg.CORBA.PUBLIC_MEMBER;

import edu.princeton.cs.algs4.StdOut;

class Merge_ { 
	public static void merge(int[] a,int lo,int mid,int hi) {
		int i=lo,j=mid+1;
		for(int k=lo;k<=hi;k++) {
			aux[k]=a[k];
		}
		for (int k = lo; k <= hi; k++) {
			if(i>mid) a[k]=aux[j++];
			else if(j>hi) a[k]=aux[i++];
			else if(aux[i]<aux[j])
				a[k]=aux[i++];
			else
				a[k]=aux[j++];
		}
	}
	static public int[] aux;
	public static void sort(int[] a) {
		aux=new int[a.length];
		sort(a,0,a.length-1);
	}
	private static void sort(int[] a,int lo,int hi) {
		if(hi<=lo)
			return;
		int mid=(lo+(hi-lo)/2);
		sort(a,lo,mid);
		sort(a,mid+1,hi);
		merge(a,lo,mid,hi);
	}
}

public class Merge{
	public static void main(String[] args) {
		int a[]={8,2,1,4,6,9};
		Merge_.sort(a);
		for(int i:a) {
			StdOut.print(i+",");
		}
	}
}




