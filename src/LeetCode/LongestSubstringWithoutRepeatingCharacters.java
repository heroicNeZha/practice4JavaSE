package LeetCode;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Administrator on 2017/8/7.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Queue<Character> longestSubString = new LinkedList<>();
        int length= 0;
        for(char ch :s.toCharArray()){
            if(longestSubString.contains(ch))
            {
                while(!longestSubString.poll().equals(ch));
            }
            longestSubString.offer(ch);
            if(longestSubString.size()>length)
            {
                length = longestSubString.size();
            }
        }
        return length;
    }
}
