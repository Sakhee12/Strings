package strings;

public class SortGivenString {

	public static void main(String[] args) {
		String s="ssspss";
		System.out.println(sort("jfehfuer"));
		System.out.println(s.contains("sspss"));
	}
	
	public static String sort(String s)
	{
		char str [] = s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length()-1;j++)
			{
				if(str[i]>str[j])
				{
					char temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		return new String(str);
	}
}
