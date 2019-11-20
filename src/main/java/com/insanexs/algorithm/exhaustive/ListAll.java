package com.insanexs.algorithm.exhaustive;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author: xieshang
 * @Description: 输入一个集合（不含重复的元素），输出其所有可能的排序
 * @Date: Create at 2019-11-19
 */
public class ListAll {

    public static List<List<Integer>> listAll(List<Integer> candidates){
        List<List<Integer>> res = new ArrayList<>();

        Stack<Integer> stack = new Stack<>();

        doListAll(candidates, res, stack);

        System.out.println(res);
        System.out.println(res.size());
        return res;
    }

    private static void doListAll(List<Integer> candidates, List<List<Integer>> res, Stack<Integer> stack){

        for(int i=0; i<candidates.size(); i++){
            int val = candidates.get(i);
            if(stack.contains(val)){
                continue;
            }else{
                stack.push(val);
                if(stack.size() == candidates.size()){
                    res.add((Stack)stack.clone());
                }else{
                    doListAll(candidates, res, stack);
                }

                stack.pop();
            }

        }
    }
}
