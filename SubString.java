package strings;

public class SubString {

	public static void main(String[] args) {
		
		System.out.println(subString("bcedufier", 5, 8));

	}
	
	public static String subString(String s,int start, int end)
	{
		if(start<end)
		{
			String ans ="";
			for(int i=start;i<end;i++)
			{
				ans+=s.charAt(i);
			}
			return ans;
		}
		return s;
	}

}
