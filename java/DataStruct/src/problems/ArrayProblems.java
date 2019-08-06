/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;

/**
 *
 * @author JOSALAZA
 */
public class ArrayProblems {

    public int removeDuplicates(int[] nums) {
        //Check for empty array
        if (nums.length == 0) {
            return 0;
        }

        int idx = 1;
        int head = 0;
        for (; idx < nums.length; idx++) {
            if (nums[head] != nums[idx] && ((head + 1) < nums.length)) {
                head++;
                nums[head] = nums[idx];
            }
        }
        return ++head;
    }

    public boolean hasDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return false;
        }

        boolean res = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    res = true;
                    break;
                }
            }
            if (res) {
                break;
            }
        }
        return res;
    }

    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        for (int i = 1; i < nums.length; i++) {
            System.out.println("" + nums[0] + "\t" + nums[i] + "\t" + (nums[0] ^ nums[i]));
            nums[0] ^= nums[i];
        }
        return nums[0];
    }

    public static void main(String[] args) {
        ArrayProblems x = new ArrayProblems();
        int[] nums = new int[]{1, 1, 2};
        int[] nums0 = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(x.removeDuplicates(nums));
        System.out.println(x.removeDuplicates(nums0));

        int[] nums1 = new int[]{1, 2, 3, 1};
        int[] nums2 = new int[]{1, 2, 3, 4};
        int[] nums3 = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(x.hasDuplicates(nums1));
        System.out.println(x.hasDuplicates(nums2));
        System.out.println(x.hasDuplicates(nums3));

        int[] nums4 = new int[]{2, 2, 1};
        int[] nums5 = new int[]{4, 1, 2, 4, 16, 1, 2};
        System.out.println(x.singleNumber(nums4));
        System.out.println(x.singleNumber(nums5));

    }
}
