package pac2;

import java.sql.Timestamp;
import java.util.*;
import java.util.stream.IntStream;

import pac1.ClassA;
import pac1.Interfac;
import pac1.Interfac2;

public class QuickSort {
	public static void main(String[] args) {
		 Random ran = new Random();
		 int[] n = new int[1000000];
		 for (int i = 0; i < n.length; i++) {
		 n[i] = ran.nextInt(100);
		
		 }
		//int[] n = { 28, 19, 84, 39, 81, 2, 11, 78, 20, 25 };

		//System.out.println(Arrays.toString(n));
		Date d = new Date();
		Timestamp t = new Timestamp(d.getTime());
		System.out.println(t);

		quickSort(n, 0, n.length - 1);

		Date d1 = new Date();
		Timestamp t1 = new Timestamp(d1.getTime());

		System.out.println(t1);
		//System.out.println(Arrays.toString(n));
	}

	private static void quickSort(int[] n, int lowIndex, int highIndex) {
		if(lowIndex>=highIndex) {
			return;
		}
		
		
		int pivot = n[highIndex];
		int lp = lowIndex;
		int rp = highIndex;

		while (lp < rp) {
			
			while (n[lp] <= pivot && lp<rp) {
				lp++;
			}
			while (n[rp] >= pivot && lp<rp) {
				rp--;
			}
			
			swap(n, lp, rp);
			

		}
		
		swap(n,lp,highIndex);
		
		quickSort(n, lowIndex,lp-1 );
		quickSort(n, lp+1, highIndex);
	}
	
	
	private static void swap(int[] n, int lp, int rp) {
		int temp = n[lp];
		n[lp] = n[rp];
		n[rp] = temp;
	}

	// int dl = 0;
	// System.out.println(highIndex);
	// for (int i = lowIndex; i < highIndex; i++) {
	// int pi = n[highIndex];
	// int check = n[highIndex - 1 - i];
	// if (n[highIndex] < n[highIndex - 1 - i]) {
	// int temp = n[highIndex];
	// int tdl = dl;
	// n[highIndex] = n[highIndex - 1 - i];
	// while (tdl > 0) {
	// n[highIndex - tdl - 1] = n[highIndex - tdl];
	// tdl--;
	// }
	// n[highIndex - 1] = temp;
	// highIndex--;
	// }
	//
	// else {
	// dl++;
	//
	// }
	//
	// }
	// if (highIndex - 1 >= 0) {
	// left(n, lowIndex, highIndex - 1);
	// right(n, lowIndex, highIndex - 1);
	//
	// }
	// }
	//
	// private static void right(int[] n, int extreme, int pivot) {
	// System.out.println(extreme);
	// int end = pivot;
	// int dl = 0;
	// System.out.println(pivot);
	// int k=0;
	// for (int i = pivot; i >=extreme; i--,k++) {
	// int pi = n[pivot];
	// int checkVaue = end-1-k;
	// int check = n[end-1-k];
	// if (n[pivot] < n[end -1-k ]) {
	// int temp = n[pivot];
	// int tdl = dl;
	// n[pivot] = n[end -1-k];
	// while (tdl > 0) {
	// n[pivot - tdl - 1] = n[pivot - tdl];
	// tdl--;
	// }
	// n[pivot - 1] = temp;
	// pivot--;
	// }
	//
	// else {
	// dl++;
	//
	// }
	//
	// }
	// if (pivot - 1 >= 0) {
	// left(n, extreme, pivot - 1);
	// right(n, extreme, pivot - 1);
	// }
	// }

}
