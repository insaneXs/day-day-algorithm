package com.insanexs.algorithm.graph.kuskal;

import com.insanexs.algorithm.graph.kruskal.Kruskal;

/**
 * @Author: xieshang
 * @Description:
 * @Date: Create at 2019-11-12
 */
public class KruskalTest {

    public static void main(String[] args){
        int[][] graph = {
                {0, 8, Integer.MAX_VALUE, 5, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {8, 0, 9, Integer.MAX_VALUE, 6, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, 9, 0, 7, Integer.MAX_VALUE, Integer.MAX_VALUE, 8},
                {5, Integer.MAX_VALUE, 7, 0, Integer.MAX_VALUE, 13, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, 6, Integer.MAX_VALUE, Integer.MAX_VALUE, 0, Integer.MAX_VALUE, 10},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 13, Integer.MAX_VALUE, 0, 11},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, 8, Integer.MAX_VALUE, 10, 11, 0}
        };

        Kruskal.generateMinTree(graph);
    }
}
