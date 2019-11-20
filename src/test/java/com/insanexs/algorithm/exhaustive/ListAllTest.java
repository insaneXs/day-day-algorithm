package com.insanexs.algorithm.exhaustive;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xieshang
 * @Description:
 * @Date: Create at 2019-11-19
 */
public class ListAllTest {

    public static void main(String[] args){
        List<Integer> candidates = new ArrayList<>();
        long time1 = System.currentTimeMillis();

        candidates.add(1);
        candidates.add(2);
        candidates.add(3);
        candidates.add(4);
        candidates.add(5);
        candidates.add(6);
        candidates.add(7);
        candidates.add(8);
        candidates.add(9);
        candidates.add(10);

        ListAll.listAll(candidates);

        System.out.println("total time takes " + (System.currentTimeMillis() - time1));
    }
}
