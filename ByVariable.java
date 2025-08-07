package strings;

public class ByVariable 
{
	public static void main(String[] args) 
	{
		String s1 = "Hi";
		String s2 = "Hello";
		String s3 = "Hi";
		
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println(s1.hashCode()==s3.hashCode());
		System.out.println(s1==s2);
	}
}
