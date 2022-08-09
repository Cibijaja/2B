package pac1;


import java.sql.Timestamp;
import java.util.Date;
import java.util.Random;

import pac2.ClassC;

public class ClassA {

	public static void main(String[] args)  {

		Random ran = new Random();
		int[] n = new int[1000000];
		for (int i = 0; i < n.length; i++) {
			n[i] = ran.nextInt(1000);

		}
		Date d = new Date();
		Timestamp t = new Timestamp(d.getTime());
		
		System.out.println(t);
		boolean swapped = true;
		while (swapped) {
			swapped = false;
			for (int i = 0; i < n.length-1; i++) {
				if (n[i] > n[i + 1]) {
					int temp = n[i];
					n[i] = n[i + 1];
					n[i + 1] = temp;
					swapped = true;
				}

			}

		}

		Date d1 = new Date();
		Timestamp t1 = new Timestamp(d1.getTime());
		
		System.out.println(t1);
//		for (int i : n) {
//			System.out.println(i);
//		}

	}

}
