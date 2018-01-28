package LeetCode;

/**
 * Created by Administrator on 2018/1/28.
 */
public class ValidPalindrome {
    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        if(s.equals("")) return false;
        for(int i = 0,j=s.length()-1;i<j;){
            if(Character.isLetter(s.charAt(i))) {
                if (Character.isLetter(s.charAt(j))) {
                    if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
                        return false;
                    i++;
                    j--;
                } else {
                    j++;
                }
            }
            else{
                i++;
            }
        }
        return true;
    }
}
