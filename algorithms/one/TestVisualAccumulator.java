package aaaaaaaaaa;

import edu.princeton.cs.algs4.*;
import java.io.*;
import java.util.*;

public class TestVisualAccumulator {
	public static void main(String[] args) {
		int T=1000;
		VisualAccumulator a=new VisualAccumulator(T,1.0);
		for (int t=0;t<T;t++) {
			a.addDataValue(StdRandom.random());
		}
	}
}
class VisualAccumulator {
	private double total;
	private int N;	
	public VisualAccumulator(int trials,double max) {
		StdDraw.setXscale(0,trials);
		StdDraw.setYscale(0,max);
		StdDraw.setPenRadius(.005);
	}
	public void addDataValue(double value) {
		N++;
		total+=value;
		StdDraw.setPenColor(StdDraw.DARK_GRAY);
		StdDraw.point(N, value);
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.point(N, total/N);
	}
}















