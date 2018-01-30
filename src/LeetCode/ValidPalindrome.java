package LeetCode;

/**
 * Created by Administrator on 2018/1/28.
 */
public class ValidPalindrome {
    public static void main(String[] args){
        String s = "abba";
        System.out.println(isPalindromeOnRecurrence(s));
    }

    private static boolean isPalindromeOnRecurrence(String s) {
        if(s.equals("")) return true;
        if(Character.isLetterOrDigit(s.charAt(0))){
            if (Character.isLetterOrDigit(s.charAt(s.length()-1))){
                if (Character.toLowerCase(s.charAt(0)) == Character.toLowerCase(s.charAt(s.length()-1))){
                    return isPalindromeOnRecurrence(s.substring(1,s.length()-1));
                }
            }else{
                return isPalindromeOnRecurrence(s.substring(0,s.length()-1));
            }
        }else{
            return isPalindromeOnRecurrence(s.substring(1,s.length()-1));
        }
        return false;
    }

    private static boolean isPalindrome(String s) {
        if(s.equals("")) return true;
        for(int i = 0,j=s.length()-1;i<j;){
            if(Character.isLetterOrDigit(s.charAt(i))) {
                if (Character.isLetterOrDigit(s.charAt(j))) {
                    if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
                        return false;
                    i++;
                    j--;
                } else {
                    j--;
                }
            }
            else{
                i++;
            }
        }
        return true;
    }
}
