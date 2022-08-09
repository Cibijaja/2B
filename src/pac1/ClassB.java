package pac1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ClassB {
	static List<Integer> l = new ArrayList<Integer>();

	public static void main(String[] arg) {
		String s = "   a b c d e f g h i   ";
		
		int frontCount = 0;
		int backCount = 0;
		boolean firstBlood = false;
		boolean bloodCheck = false;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (!firstBlood) {
				if (Character.isWhitespace(c)) {
					frontCount++;
					continue;
				} else {
					firstBlood = true;
				}

			}

			if (Character.isWhitespace(c)) {
				backCount++;
				continue;
			}
			else {
				backCount = 0;
			}
		}
		System.out.println(frontCount  +"  "+backCount);
		String s1 = s.substring(frontCount,s.length() -1- backCount);
		System.out.println(s1+s1);

	}

	private static List<Integer> fibonacci(int a, int b) {
		int c = a + b;
		l.add(c);

		a = b;
		b = c;

		if (c < 100) {
			fibonacci(a, b);
		}

		return l;

	}

}
