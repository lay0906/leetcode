package io.github.ray.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/3/23.
 *
 * @see https://leetcode.com/problems/two-sum/#/description
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> hash = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hash.put(nums[i], i);
        }
        for(int i=0;i<nums.length;i++){
            Integer j = hash.get(target-nums[i]);
            if(j != null && j != i){
                result[0] = i;
                result[1] = j;
                break;
            }
        }
        return result;
    }
}
