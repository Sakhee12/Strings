package strings;

import java.util.Arrays;

public class PasswordVerification {

	public static void main(String[] args) {
		
		String s[] = {"Password","Happylife","SADLIFE","ABC"};
		
		String dic[] = {"happy","sad","coffee"};

		System.out.println(Arrays.toString(checkCond2(s,dic)));

	}
	
	public static boolean checkCond1(String s)
	{
		
		int upper=0;
		int lower=0;
		if (s.length() > 6) 
		{
		   for (int j = 0; j < s.length(); j++)
		   {
		       char ch = s.charAt(j); 
		           if (ch >= 'a' && ch <= 'z') 
		               lower++;
		         
		           else if (ch >= 'A' && ch <= 'Z') 
			            upper++;
			                    
		   }
			            
		   if (lower == s.length() || upper == s.length()) 
			   return false;
		   else 
			   return true;
			               
		} 
		else 
			return false;
	}		
			        	
	public static String[] checkCond2(String s[],String dic[])
	{
		String [] ans = new String[s.length];
		for(int i=0;i<s.length;i++)
		{
			String extract = s[i];
			if(checkCond1(extract) && hasNoDicWord(extract,dic))
			{
				ans[i]="Strong";
			}
			else
				ans[i]="Weak";
		}
		return ans;
	}
	
	public static boolean hasNoDicWord(String s,String [] dic)
	{
		String toLower = s.toLowerCase();
		for(int i=0;i<dic.length;i++)
		{
			String word = dic[i];
			if(isSubString(toLower,word.toLowerCase()))
			{
				return false;
			}
		}
		return true;
	}
	
	public static boolean isSubString(String s,String dicWord)
	{
		if(dicWord.length()>s.length())
			return false;
		
		for(int i=0;i<=s.length()-dicWord.length();i++)
		{
			int j;
			for(j=0;j<dicWord.length();j++)
			{
				if(s.charAt(i+j)!=dicWord.charAt(j))
					break;
			}
			if(j==dicWord.length())
				return true;
		}
		return false;
	}
}
