package strings;

import java.util.Arrays;

public class SplitAndRev {

	public static void main(String[] args) {
		
		String s = "I love Bharat";
		System.out.println(Arrays.toString(reverse(split(s))));
		
		System.out.println(reverse(s));
	}
	
	public static String[] reverse(String[]ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			 String rev = "";
	            for (int j = ar[i].length() - 1; j >= 0; j--) {
	                rev += ar[i].charAt(j);
	            }
	            ar[i] = rev;
		}
		return ar;
	}
	
	public static String reverseWords(String s)
	{
		String ans="";
		String temp="";
		
		for(int j=0;j<s.length();j++)
		{
			char ch=s.charAt(j);
			if(ch!=' ')
			{
				temp+=ch;
			}
			else
			{
				String rev=reverse(temp);
				if(rev.length()>0)
				{
					ans=ans+reverse(temp)+" ";
				}
			}
			return ans.trim();
		}
		return ans.trim();
	}
	
	public static String reverse(String s)
	{
		String ans="";
		if(s.length()>0)
		{
			s=s.trim();
			char ch = s.charAt(s.length()-1);
			if(ch>='a'&&ch<='z' || ch>='A'&&ch<='Z' || ch>='0'&&ch<='9')
			{
				for(int i=s.length()-1;i>=0;i--)
				{
					ans+=s.charAt(i);
				}
				return ans;
	
			}
			for(int i=s.length()-2;i>=0;i--)
			{
				ans+=s.charAt(i);
			}
			ans+=ch;
		}
		return ans;
	}
	
	public static String[] split(String s)
	{
		int ct=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
				ct++;
		}
		
		String temp[] = new String [ct+1];
		String ans = "";
			for(int i=0,j=0;i<s.length();i++)
			{
				char ch = s.charAt(i);
				if(ch!=' ')
					ans+=ch;
				else
				{
					temp[j++]=ans;
					ans="";
				}
			}
			temp[temp.length-1]=ans;
		return temp;	
	}
}
