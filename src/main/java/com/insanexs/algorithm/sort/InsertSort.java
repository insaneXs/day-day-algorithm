package com.insanexs.algorithm.sort;

import java.util.Arrays;

/**
 * @ClassName InsertSort
 * @Description 插入排序:参考扑克牌的行为，将后面的数插在前面序列的合适位置，维持前面的数依旧有序
 * @Author xieshang
 * @Date 2020/10/9
 */
public class InsertSort {

    public static void sort(int[] nums){
        for(int i=1; i<nums.length; i++){
            int j = i - 1;
            int tmp = nums[i];
            while(j > 0 && nums[j] > tmp){
                nums[j+1] = nums[j];
                j--;
            }
            if(j < i -1){
                nums[j + 1] = tmp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        InsertSort.sort(new int[]{0,4,3,2,1,4,6,7,8,9,89,2});
    }
}
