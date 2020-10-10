package com.insanexs.algorithm.sort;

import java.util.Arrays;

/**
 * @ClassName BubbleSort
 * @Description 冒泡排序:比较相邻的两个数，让小的数上浮，并依次比较
 * @Author xieshang
 * @Date 2020/10/9
 */
public class BubbleSort {

    public static void sort(int[] nums){
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] > nums[j]){
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args){
        BubbleSort.sort(new int[]{3,7,1,8,3,2,9,4});
    }
}
