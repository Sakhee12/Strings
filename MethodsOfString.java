package strings;

import java.util.Arrays;

public class MethodsOfString {

	public static void main(String[] args) {
		
		String s = "pneumonoultramicroscopicsilicovolcanoconiosis";
		
		char ar[] = s.toCharArray();
		System.out.println(Arrays.toString(ar));
		
		//PRINTS ASCII VALUE
		byte [] ar1 = s.getBytes();
		System.out.println(Arrays.toString(ar1));
		
		System.out.println(s.charAt(5));
		System.out.println(s.codePointAt(19));
		System.out.println(s.codePointBefore(9));
		
		System.out.println(s.codePointCount(0, 9));
		
		System.out.println("vijay".compareTo("Vinay"));
		
		System.out.println("vijay".compareToIgnoreCase("Vinay"));
		
		System.out.println("Sakshi".concat("Dhayatadak"));
		
		System.out.println(s.contains("volcano"));
		
		System.out.println("Hi".contentEquals("Hi"));
		
		System.out.println(s.endsWith("s"));
		
		System.out.println(s.startsWith("pn"));
		
		System.out.println(s.indent(10));
		
		System.out.println(s.indexOf("e"));
		
		System.out.println(s.indexOf('s', 5));
		
		System.out.println(s.indexOf("bvdufhr", 0));
		
		System.out.println("".isBlank());
		
		System.out.println(s.lastIndexOf('o'));
		
		System.out.println(s.length());
		
		System.out.println("ABC".repeat(5));
		
		System.out.println(s.replace('a', '@'));
		
		System.out.println(s.replace("volcano", "sakshi"));
		
		String s2 = "I love India";
		
		String [] words = s2.split("o");
		
		System.out.println(Arrays.toString(words));
		
		System.out.println("       sjd        ".strip());
		
		System.out.println(s.substring(1));
		
		System.out.println(s.substring(5, 6));
		
		char ch[] = s.toCharArray();
		
		System.out.println(Arrays.toString(ch));
		
		System.out.println(s.toUpperCase());
		
		System.out.println(s.toLowerCase());
		
		System.out.println(s.toLowerCase(null));
		
		
		
		
		
		
		
	}
}
