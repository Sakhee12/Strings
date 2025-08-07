package strings;

public class Contains {

	public static void main(String[] args) {
		System.out.println(contains("ssspss", "sspss"));

		System.out.println(contain("aeroplanplanepalteplan", "plan"));
	}
	
	public static boolean contains(String s,String sub)
	{
		int check=0;
		for(int i=0;i<s.length();i++)
		{
			if(check<sub.length() && s.charAt(i)==sub.charAt(check))
			{
				check++;
			}
			else
			{
				if(check==sub.length()||s.charAt(i)==sub.charAt(check))
				{
					return true;
					
				}
				else if(check>0)
				{
					if(s.charAt(i)==sub.charAt(0))
					{
						i--;
					}
					check=0;
				}
			}
		}
		return check==sub.length();
		
	}
	
		public static boolean contain(String s, String sub) {
		    char[] ch = s.toCharArray();
		    int check = 0;

		    for (int i = 0; i < s.length(); i++) {
		    	
		        if (ch[i] == sub.charAt(check)) 
		        {
		            check++;
		            if (check == sub.length()) 
		            {
		                return true; 
		            }
		        } 
		        else 
		        {
		            if (check > 0) 
		            {
		                i = i - check; //ssspss sspss
		            }
		            check = 0;
		        }
		    }

		    return false;
		
	}
}
