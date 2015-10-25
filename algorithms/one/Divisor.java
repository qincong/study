package aaaaaaaaaa;

import edu.princeton.cs.algs4.*;
import java.io.*;
import java.util.*;

public class Divisor {
	public static void main(String args[]) {
		StdOut.println(CommomDivisor(8,4));
	}
	public static int CommomDivisor(int x,int y) {
		if(x==1||y==1) {
			StdOut.println("x="+x+"y="+y);
			return 1;
		}
		if(x<y) {
			int temp=x;
			x=y;
			y=temp;
		}
		StdOut.println("x="+x+"y="+y);
		if(x%y==0) {
			return y;
		}
		else {
			x=x%y;
			StdOut.println("x="+x);
			return CommomDivisor(x,y);
		}
	}
}