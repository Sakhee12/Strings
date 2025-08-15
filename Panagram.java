package strings;

public class Panagram {

	public static void main(String[] args) {
		
		System.out.println(panagram("The quick brown fox jumps over the lazy dog"));
	}
	
	public static boolean panagram(String s)
	{
		int []ct = new int [26];
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z')
				ct[ch-97]++;
			else if(ch>='A' && ch<='Z')
				ct[ch-65]++;
		}
		for(int  i=0;i<ct.length;i++)
		{
			if(ct[i]==0)
				return true;
		}
		return false;
	}
}
