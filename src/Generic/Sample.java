package Generic;

import java.util.ArrayList;

public class Sample {

	static int count = 0;

	public static void main(String[] args) {
		String s = "hi heelo how are you";
		String s1="";
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			
			if(i>0) {
				if(Character.isWhitespace(s.charAt(i-1))) {
					c = Character.toUpperCase(c);
				}
				
				
			}
			else {
				c = Character.toUpperCase(c);
				
			}
			
			
			s1 = s1+c;
		}
		System.out.println(s1);
		

	}

}
