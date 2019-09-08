package _02_gotta_catchem_all;

public class ExceptionMethods {
	static double divide(double a, double b) {
		if(b == 0.0) {
			throw new IllegalArgumentException();
		}
		return a/b;
	}
	
	
	static String reverseString(String s) {
		if(s=="") {
			throw new IllegalStateException();
		}
		String s2 = "";
		for (int i = s.length()-1; i > -1; i--) {
			s2+= s.charAt(i);
		}
		
		return s2;
		
	}
}