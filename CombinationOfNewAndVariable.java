package strings;

public class CombinationOfNewAndVariable {

	public static void main(String[] args) {
		
		String s = "Bye";
		String s1 = new String("Bye");
		String s2 = "Bye";
		
		System.out.println(s==s2);
		System.out.println(s==s1);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s.hashCode());
	}
}
