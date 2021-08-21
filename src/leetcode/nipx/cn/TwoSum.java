package leetcode.nipx.cn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author NipGeihou
 * @create 2021-08-21 11:13
 */
public class TwoSum {

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();

        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = twoSum.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        
        // 构建哈希表
        for (int i = 0; i < nums.length; i++) {
            // 值：索引
            map.put(nums[i], i);
        }

        for (int num1Index = 0; num1Index < nums.length; num1Index++) {
            Integer num2Index = map.get(target - nums[num1Index]);
            if (num2Index == null || num2Index.equals(num1Index)) {
                continue;
            } else {
                result[0] = num1Index;
                result[1] = num2Index;
                break;
            }
        }


        return result;
    }
}
