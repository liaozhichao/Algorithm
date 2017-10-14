package array;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

 You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */

import org.junit.Test;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given nums = [2, 7, 11, 15], target = 9,

 Because nums[0] + nums[1] = 2 + 7 = 9,
 return [0, 1].
 */
public class TwoSum {
    //解法一:使用暴力双重for循环的方法,复杂度O(n2)
    public static int[] twoSum(int[] nums,int target){
        boolean flag = false;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++ ){
            for(int j=i+1;j<nums.length;j++){
                if((target-nums[i])==nums[j]){
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("no two sum solution");
    }

    //解法二:使用HashMap来解决,复杂度O(n)
    public static int[] twoSum2(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        boolean flag = false;
        for(int i = 0;i<nums.length;i++) {
            if (map.containsKey(target - nums[i])) {
                flag = true;
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("no two sum solution");
    }

    @Test
    public  void testTwoSum(){
        int nums[] =  {3, 2,4};
        int target = 6;
        int result[] = TwoSum.twoSum(nums,target);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void testTwoSum1(){
        int nums[] =  {3, 2,4};
        int target = 6;
        int result[] = TwoSum.twoSum2(nums,target);
        System.out.println(Arrays.toString(result));
    }
}
