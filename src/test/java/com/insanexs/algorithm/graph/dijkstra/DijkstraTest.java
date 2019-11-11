package com.insanexs.algorithm.graph.dijkstra;

import java.util.Arrays;

/**
 * @Author: xieshang
 * @Description:
 * @Date: Create at 2019-11-11
 */
public class DijkstraTest {

    public static void main(String[] args){
        int[][] graph = {
                {0, 6, 12, 8, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {6, 0, 8, 6, 4, Integer.MAX_VALUE},
                {12, 8, 0, Integer.MAX_VALUE, Integer.MAX_VALUE, 7},
                {8, 6, Integer.MAX_VALUE, 0, 7, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, 4, Integer.MAX_VALUE, 7, 0, 9},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, 7, Integer.MAX_VALUE, 9, 0}
        };

        System.out.println(Arrays.toString(getShortestPath(graph, 0)));
    }

    protected static int[] getShortestPath(int[][]graph, int source){
        return Dijkstra.getShortestPath(graph, 0);
    }
}
