package strings;

public class CreationOfObjectClassOfStringClass 
{
	public static void main(String[] args) 
	{
		String s1 = new String ("Hi");
		String s2 = new String ("Hello");
		String s3 = new String ("Hi");
		
		System.out.println(s1==s3); //false
		System.out.println(s1.equals(s3)); //true

		//Printing the attribute because the toString method is already overridden in String Class
		System.out.println(s1);
		System.out.println(s1.toString());
		
		System.out.println(s1.hashCode()); 
		System.out.println(s3.hashCode()); 
	}
}
