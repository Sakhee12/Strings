package strings;

public class IndexOf {

	public static void main(String[] args) {
		
		String s = "Hellod Wolrd";
		System.out.println(index('d', s));
	}
	
	public static int index(char ch,String s)
	{
		char ch1 [] = new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			ch1[i]=s.charAt(i);
			if(ch==ch1[i])
			{
				return i;
			}
		}
		return -1;
	}
}
