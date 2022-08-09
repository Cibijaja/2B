package pac2;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Refernce {
	static int a = 650;
	static int count = 0;


	public static void main(String[] args) {
		Random ran = new Random();
		int[] n = new int[10000];
		for (int i = 0; i < n.length; i++) {
			n[i] = ran.nextInt(1000);

		}
		System.out.println(Arrays.toString(n));
		Date d = new Date();
		Timestamp t = new Timestamp(d.getTime());
		System.out.println(t);
		Arrays.sort(n);
		binarySearch(n, 0, n.length-1);
	
		System.out.println(count);

	}

	private static void binarySearch(int[] n, int lowIndex, int highIndex) {
		count++;
		int pivot = (lowIndex + highIndex) / 2;

		if (n[pivot] == a) {
			System.out.println("Found");
			return;
		}

		if (n[pivot] > a) {
			binarySearch(n, lowIndex, pivot);
		}
		if (n[pivot] < a) {
			binarySearch(n, pivot, highIndex);
		}

	}

}
