package pac2;

import java.sql.Timestamp;
import java.util.*;
import java.util.stream.IntStream;

import pac1.ClassA;
import pac1.Interfac;
import pac1.Interfac2;

public class QuickSort2 {
	public static void main(String[] args) {
		Random ran = new Random();
		int[] n = new int[100000];
		for (int i = 0; i < n.length; i++) {
			n[i] = ran.nextInt(100);

		}
		// int[] n = { 28, 19, 84, 39, 81, 2, 11, 78, 20, 25 };

		// System.out.println(Arrays.toString(n));
		Date d = new Date();
		Timestamp t = new Timestamp(d.getTime());
		System.out.println(t);

		quickSort(n, 0, n.length - 1);

		Date d1 = new Date();
		Timestamp t1 = new Timestamp(d1.getTime());

		System.out.println(t1);
		// System.out.println(Arrays.toString(n));
	}

	private static void quickSort(int[] n, int lowIndex, int highIndex) {
		if(lowIndex>=highIndex) {
			return;
		}
		int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
		swap(n,pivotIndex,highIndex);
		
		
		int leftPointer = partition(n, lowIndex, highIndex);
		quickSort(n, lowIndex, leftPointer-1);
		quickSort(n, leftPointer+1, highIndex);
		
		

	}
	
	
	private static int partition(int[] n,int lowIndex,int highIndex) {
		int pivot = highIndex;
		int leftPointer = lowIndex;
		int rightPointer = highIndex;

		while (leftPointer < rightPointer) {
			while (n[leftPointer] <= n[pivot] && leftPointer < rightPointer) {
				leftPointer++;
			}

			while (n[rightPointer] >= n[pivot] && leftPointer < rightPointer) {
				rightPointer--;
			}

			swap(n, leftPointer, rightPointer);
		}
		
		swap(n,leftPointer,highIndex);
		return leftPointer;
	}
	
	
	
	
	
	

	private static void swap(int[] n, int leftPointer, int rightPointer) {
		int temp = n[leftPointer];
		n[leftPointer] = n[rightPointer];
		n[rightPointer] = temp;
	}

}
