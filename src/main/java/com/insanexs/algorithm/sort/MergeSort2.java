package com.insanexs.algorithm.sort;

import java.util.Arrays;

/**
 * @ClassName MergeSort2
 * @Description 归并排序 动归实现
 * @Author xieshang
 * @Date 2020/10/9
 */
public class MergeSort2 {

    //有点不好理解 分区的确定
    public static void sort(int[] nums){
        int len = nums.length;
        int[] result = new int[len];
        int block, start;

        // 原版代码的迭代次数少了一次，没有考虑到奇数列数组的情况
        for(block = 1; block < len*2; block *= 2) {
            for(start = 0; start <len; start += 2 * block) {
                int low = start;
                int mid = (start + block) < len ? (start + block) : len;
                int high = (start + 2 * block) < len ? (start + 2 * block) : len;
                //两个块的起始下标及结束下标
                int start1 = low, end1 = mid;
                int start2 = mid, end2 = high;
                //开始对两个block进行归并排序
                while (start1 < end1 && start2 < end2) {
                    result[low++] = nums[start1] < nums[start2] ? nums[start1++] : nums[start2++];
                }
                while(start1 < end1) {
                    result[low++] = nums[start1++];
                }
                while(start2 < end2) {
                    result[low++] = nums[start2++];
                }
            }
            int[] temp = nums;
            nums = result;
            result = temp;
        }
        nums = result;
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        MergeSort2.sort(new int[]{4,2,7,4,2,1,4,6,8,9,6,4,3,2,5,6,4,2});
    }

}
