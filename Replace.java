package strings;

public class Replace {

	public static void main(String[] args) {
		
		replace("sakshi", 'k', 'a');
		
		System.out.println(firstOcc("sakkshi", '@', 's'));
	}
	
	
	public static String replace(String s,char naya,char old)
	{
		String ans="";
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(old==ch )
			{
				ans+=naya;
			}
		}
		return ans;
	}
	
	public static String firstOcc(String s,char naya,char old)
	{
		System.out.println("Start");
		String ans="";
		int i=0,ct=0;
		while(i<s.length()-1)
		{
			System.out.println("while");
			if(s.charAt(i)==old && ct==0)
			{
				ans+=naya;
				i++;
				ct++;
			}
			else 
			{
				ans+=s.charAt(i);
				i++;
			}
			
			
		}
		return ans;
	}
}
