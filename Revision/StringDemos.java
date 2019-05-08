package Revision;

public class StringDemos {
    public static void main(String[] args) {
        String str1="hello";
        String str2="Gaya";
        System.out.println(str1+" "+str2);
        System.out.println(str1.concat(str2));
        System.out.println(str2.compareTo(str1));
        System.out.println(str1.substring(0));
        printAllSubstrings(str1);
        System.out.println(isPalindrome("lola"));
        System.out.println(countPalindromesubstring(str1));
    }
    public static void printAllSubstrings(String str)
    {
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            for (int j = i+1; j <=str.length() ; j++) {
                count++;
                System.out.print(str.substring(i,j)+" ");
            }
        }
        System.out.println();
        System.out.println(count);
    }
    public static boolean isPalindrome(String str)
    {
        int i=0;
        int j= str.length()-1;
        while (i<=j)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static int countPalindromesubstring(String str)
    {
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            for (int j = i+1; j <=str.length() ; j++) {
                if(isPalindrome(str.substring(i,j))==true)
                {
                    count++;
                }
            }
        }
        return count;
    }

}
