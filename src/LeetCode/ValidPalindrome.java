package LeetCode;

/**
 * Created by Administrator on 2018/1/28.
 */
public class ValidPalindrome {
    public static void main(String[] args){
        String s = "ab2a";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
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
