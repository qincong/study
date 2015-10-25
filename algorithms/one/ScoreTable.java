package aaaaaaaaaa;

import edu.princeton.cs.algs4.*;
import java.io.*;
import java.util.*;

public class ScoreTable {
	public static void main(String args[]) {
		In in=new In();
		int i=0;
		String[] str=in.readAllStrings();
//		while((str[i]=in.readString()) != "null") {
//			StdOut.print(str[i]);
//			if(str[i].equals("null"))
//				break;
//			i++;
//		}
		for(i=0;i<str.length;i=i+3) {
			StdOut.print(str[i]+" "+str[i+1]+" "+str[i+2]);
			double m=Double.parseDouble(str[i+1]);
			double n=Double.parseDouble(str[i+2]);
			double res=m/n;
			StdOut.print(res);
//			StdOut.println();
		}
	}
}