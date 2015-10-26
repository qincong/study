package aaaaaaaaaa;

import edu.princeton.cs.algs4.*;
import java.io.*;
import java.util.*;

public class TestRational {
	public static void main(String[] args) {
		FixedCapacityStack<String> s;
		s=new FixedCapacityStack<String>(100);
		while(!StdIn.isEmpty()) {
			String item=StdIn.readString();
			if(! item.equals("-")) {
				s.push(item);
			}
			else if(! s.isEmpty()) {
				StdOut.println(s.pop()+" ");
			}
		}
	}
}















