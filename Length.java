package strings;

public class Length {

	public static void main(String[] args) {
		
		System.out.println(length("dsdniiuer"));
	}
	
	public static int length(String s)
	{
		int ct=0;
		for(int i = 0; ;i++)
		{
			try
			{
				s.charAt(i);
				ct++;
			}
			catch(StringIndexOutOfBoundsException ref)
			{
				return ct;
			}
		}
		
	}
	
	
}
