package strings;

public class SplitBy {

	public static void main(String[] args) {
		
		System.out.println(split("Hi Hello Namaste!"));	
	}
	
	public static String split(String s)
	{ 
		String ans = "";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				continue;
			}
			ans+=s.charAt(i);
		}
		return ans;
	}

}
