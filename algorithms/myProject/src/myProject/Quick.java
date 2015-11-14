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
		int j=partition(a,lo,hi);
		sort(a,lo,j-1);
		sort(a,j+1,hi);
	}
	private static int partition(int[] a,int lo,int hi) {
		int i=lo,j=hi+1;
		int v=a[lo];
		while(true) {
			while(a[++i]<v) {
				if(i==hi)
					break;
			}
			while(a[--j]>v) {
				if(j==lo)
					break;
			}
			if(i>=j)
				break;
		}
		tools.exch(a,lo,j);
		return j;
	}
	public static void main(String[] args) {
		int []a={3,5,1,56,34,8,2};
		sort(a);
		tools.printArray(a);
	}
}
