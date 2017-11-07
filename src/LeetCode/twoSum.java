package LeetCode;
/**
 * Created by Administrator on 2017/8/4.
 */
public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int a = target - nums[i];
            for (int j = i + 1; j < length; j++) {
                if (nums[j] == a) {
                    return new int[]{
                            i, j
                    };
                }
            }
        }
        return new int[]{};
    }
}
