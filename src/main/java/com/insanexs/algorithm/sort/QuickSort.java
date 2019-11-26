package com.insanexs.algorithm.sort;

import java.util.Arrays;

/**
 * @Author: xieshang
 * @Description: 快速排序：挖坑填数+分治
 * @Date: Create at 2019-11-26
 */
public class QuickSort {

    public static void quickSort(int[] arr){
        if(arr == null || arr.length <= 1){
            return;
        }

        doQuickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }



    /**
     * 选一个数，调整位置，让该数的左边小于该数，数的右边大于该数
     * @param arr
     * @param start
     * @param end
     */
    protected static void doQuickSort(int[] arr, int start, int end){
        if(start >= end){
            return;
        }

        int tmp = arr[start];
        int i= start;
        int j = end;

        for(; i<j; ){

            //先从右侧开始找，填一次坑后，交换到左侧
            for( ; i<j; ){
                if(arr[j] < tmp){
                    //右侧发现比它小的数，填到左边的坑
                    arr[i] = arr[j];
                    break;
                }
                j--;
            }

            //交换到左侧开始找
            for( ; i<j; ){
                //左侧发现比它大的数，填到右边刚空出来的坑
                if(arr[i] > tmp){
                    arr[j] = arr[i];
                    break;
                }
                i++;
            }

        }

        arr[i] = tmp;
        doQuickSort(arr, start, i -1);
        doQuickSort(arr, i + 1, end);
    }
}
