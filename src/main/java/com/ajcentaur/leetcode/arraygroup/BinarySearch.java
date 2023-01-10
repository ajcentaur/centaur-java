package com.ajcentaur.leetcode.arraygroup;

public class BinarySearch {
    public static void main(String[] args) {
//        System.out.println(search704(new int[]{5},5));
//        System.out.println(search704two(new int[]{-1,0,3,5,9,12},13));
//        System.out.println(searchInsert(new int[]{1,3,5,6},4));
        System.out.println(searchRange(new int[]{1,2,2,3,3,3,6},3));
    }

    /**
     * leetcode:704
     * 二分查找区间左闭右闭[left, right]
     * @param nums
     * @param target
     * @return
     */
    public static int search704(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] > target){
                right = mid - 1;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    /**
     * leetcode:704
     * 二分查找区间左闭右开[left, right)
     * @param nums
     * @param target
     * @return
     */
    public static int search704two(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] > target){
                right = mid;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    /**
     * leetcode:35
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] > target){
                right = mid - 1;
            }else if(nums[mid] < target){
                left = mid +1;
            }else{
                return mid;
            }
        }
        return left;
    }

    /**
     * leetcode:34
     * @param nums
     * @param target
     * @return
     */
    public static int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int leftIndex = -1;
        int rightIndex = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] > target){
                right = mid - 1;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else{
                leftIndex = mid;
                rightIndex = mid;
                break;
            }
        }
        if(left > right){
            return new int[]{leftIndex, rightIndex};
        }
        //查找左边界
        while(leftIndex > 0 && nums[leftIndex] == nums[leftIndex - 1]){
            leftIndex--;
        }
        //查找右边界
        while(rightIndex < nums.length - 1 && nums[rightIndex] == nums[rightIndex + 1]){
            rightIndex++;
        }
        return new int[]{leftIndex, rightIndex};
    }

}
