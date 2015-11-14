package myProject;
import com.sun.javafx.scene.control.skin.ToolBarSkin;

import edu.princeton.cs.algs4.*;
public class Quick {
	public static void sort(int[] a) {
		StdRandom.shuffle(a);
		sort(a,0,a.length-1);
	}

	private static void sort(int[] a,int lo,int hi) {
		if(hi<=lo)
			return;
		int lt=lo,i=lo+1,gt=hi;
		int v=a[lo];
		while(i<=gt) {
			if(a[i]<v)
				tools.exch(a, i++, lt++);
			if(a[i]>v)
				tools.exch(a, i, gt--);
			if(a[i]==v)
				i++;
		}
		sort(a,lo,lt-1);
		sort(a,gt+1,hi);
	}
	public static void main(String[] args) {
		int []a={3,5,1,56,34,8,2};
		sort(a);
		tools.printArray(a);
	}
}
