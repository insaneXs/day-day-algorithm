package com.insanexs.algorithm.sort;

/**
 * @Author: xieshang
 * @Description:
 * @Date: Create at 2019-11-26
 */
public class QuickSortTest {

    public static void main(String[] args){
        int[] arr = new int[]{72,6, 57, 88, 60, 42, 83, 73, 48, 85};

        QuickSort.quickSort(arr);


        int[] duplicatedArr = new int[]{72, 6, 6, 88, 60, 42, 83, 73, 48, 85};
        QuickSort.quickSort(duplicatedArr);

        int[] minValInLeftArr = new int[]{6, 6, 88, 60, 42, 83, 73, 48, 85};
        QuickSort.quickSort(minValInLeftArr);

    }
}
