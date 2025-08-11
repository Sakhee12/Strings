package strings;

public class ImmutableString {

	public static void main(String[] args) {
		
		String s1 = "Qspiders";
		String s2 = s1+"Deccan";
		String s3 = s2+"Pune";
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	}
}
