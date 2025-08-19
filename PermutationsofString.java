package strings;

public class PermutationsofString {

    public static void main(String[] args) {
        String s = "abcd";
        createPermutation(s.toCharArray(), 0);
    }

    public static void createPermutation(char[] arr, int refIndex) {
        if (refIndex == arr.length - 1) 
        {
            System.out.println(new String(arr));
            return;
        }
        
        for (int i = refIndex; i < arr.length; i++)
        {
            swap(arr, i, refIndex);
            createPermutation(arr, refIndex + 1);
            swap(arr, i, refIndex); 
        }
    }

    public static void swap(char[] arr, int i, int j) 
    {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
