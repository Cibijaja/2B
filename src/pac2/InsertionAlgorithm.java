package pac2;

import java.sql.Timestamp;
import java.util.*;
import java.util.stream.IntStream;

import pac1.ClassA;
import pac1.Interfac;
import pac1.Interfac2;

public class InsertionAlgorithm {
	public static void main(String[] args) {
		Random ran = new Random();
		int[] n = new int[1000000];
		for (int i = 0; i < n.length; i++) {
			n[i] = ran.nextInt(100);

		}
	
		//System.out.println(Arrays.toString(n));
		Date d = new Date();
		Timestamp t = new Timestamp(d.getTime());
		System.out.println(t);
		int j = 1;
		while(j<n.length) {
			int temp = n[j];
			int i = j;
			while(i>=1&&temp<n[i-1]) {
				n[i] = n[i-1];      
					i--;
				}
			n[i] = temp;
			j++;
		}
		Date d1 = new Date();
		Timestamp t1 = new Timestamp(d1.getTime());
		
		System.out.println(t1);
		//System.out.println(Arrays.toString(n));
	}



}
