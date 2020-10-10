package com.insanexs.algorithm.sort;

import java.util.Arrays;

/**
 * @ClassName MergeSort
 * @Description 归并排序 递归实现 先拆分成小的分区 在对相邻的分区合并 保证有序
 * @Author xieshang
 * @Date 2020/10/9
 */
public class MergeSort {

    public static void main(String[] args){
        MergeSort.sort(new int[]{2,4,6,7,2,5,6,3,1,5,67,4,42,5});
    }
    public static void sort(int[] nums){
        int[] space = new int[nums.length];
        sortHelper(nums, 0, space.length - 1, space);
        System.out.println(Arrays.toString(nums));
    }

    private static void sortHelper(int[] nums, int left, int right, int[] space){
        if(left >= right){
            return;
        }
        int mid = (right - left) / 2 + left;
        int left1 = left, right1 = mid;
        int left2 = mid+1, right2 = right;
        sortHelper(nums, left1, right1, space);
        sortHelper(nums, left2, right2, space);
        int k = left;
        while(left1 <= right1 && left2 <= right2){
            space[k++]  = nums[left1] < nums[left2] ? nums[left1++] : nums[left2++];
        }

        while(left1 <= right1){
            space[k++] = nums[left1++];
        }

        while(left2 <= right2){
            space[k++] = nums[left2++];
        }

        for(int i=left; i<=right; i++){
            nums[i] = space[i];
        }
    }
}
