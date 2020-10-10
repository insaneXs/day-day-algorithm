package com.insanexs.algorithm.sort;

import java.util.Arrays;

/**
 * @ClassName ChooseSort
 * @Description 选择排序:每次在剩下的数中找到最小的数，放在剩下的最前
 * @Author xieshang
 * @Date 2020/10/9
 */
public class ChooseSort {

    public static void sort(int[] nums){
        for(int i=0; i<nums.length; i++){
            int min = nums[i];
            int idx = i;
            for(int j=i+1; j<nums.length; j++){
                if(nums[j] < min){
                    min = nums[j];
                    idx = j;
                }
            }
            nums[idx] = nums[i];
            nums[i] = min;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        ChooseSort.sort(new int[]{4,6,8,2,7,4,7,4,3,2,9,0});
    }
}
