package strings;

public class LongestRepeatingSubstring {

    public static void main(String[] args) {
        String s = "abudabca";
        String sub = "abc";
        System.out.println(ans(s, sub));
    }

    public static String ans(String s1, String s2) 
    {
        int max = 0;
        String ans = "";

        for (int i = 0; i < s1.length(); i++) 
        {
            int k = i;
            String temp = "";

            for (int j = 0; j < s2.length() && k < s1.length(); j++) 
            {
                if (s1.charAt(k) == s2.charAt(j)) 
                {
                    temp += s1.charAt(k);
                    k++;
                }
                else 
                {
                    if (temp.length()>0 && temp.length() > max) 
                    {
                        max = temp.length();
                        ans = temp;
                    }
                    temp = "";
                    k = i;
                }
            }

            if (temp.length()>0 && temp.length() > max) 
            {
                max = temp.length();
                ans = temp;
            }
        }
        return ans;
    }
}
