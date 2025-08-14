package strings;

public class LongestRepetingEle {

	public static void main(String[] args) {
		
		String s = "nnchudfeuffbejidj";
		
		System.out.println(repeat(s));
	}
	
	public static char repeat(String s)
	{
		int currentMax=1,maxCount=1;
		char currentChar = s.charAt(0), maxChar = s.charAt(0);
		for(int i=1;i<s.length();i++)
		{
			if(s.charAt(i)==currentChar)
			{
				currentMax++;
			}
			else
			{
				currentChar=s.charAt(i);
				currentMax=1;
			}
			
			if(maxCount<currentMax)
			{
				maxChar=currentChar;
				maxCount=currentMax;
			}

		}
		return maxChar;
	}
}
