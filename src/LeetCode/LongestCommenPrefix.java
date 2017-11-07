package LeetCode;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Administrator on 2017/11/5.
 */
public class LongestCommenPrefix {
    public static void main(String[] args) {
        String[] strs = {"111"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs != null&&strs.length>0) {
            String longestPrefix = strs[0];
            for (String s : strs) {
                while (!s.startsWith(longestPrefix)) {
                    longestPrefix = longestPrefix.substring(0, longestPrefix.length() - 1);
                }
            }
            return longestPrefix;
        }
        return "";
    }
}
