package com.insanexs.algorithm.graph.kruskal;

import java.util.Arrays;

/**
 * @Author: xieshang
 * @Description:
 * @Date: Create at 2019-11-12
 */
public class Kruskal {

    public static void generateMinTree(int[][] graph){
        if(graph == null || graph.length <=0)
            throw new IllegalArgumentException();

        int minSum = 0;
        int[][] visited = new int[graph.length][graph.length];

        int[] nodeHierarchy = new int[graph.length];
        for(int i=0; i<nodeHierarchy.length; i++){
            nodeHierarchy[i] = i;
        }

        int n = 0;
        while(n < graph.length -1){
            int minVal = Integer.MAX_VALUE;
            int iIndex = 0;
            int jIndex = 0;

            for(int i=0; i<graph.length; i++){
                for(int j=i+1; j<graph[i].length; j++){
                    if(graph[i][j] != Integer.MAX_VALUE && visited[i][j] == 0 && graph[i][j] < minVal){
                        iIndex = i;
                        jIndex = j;
                        minVal = graph[i][j];
                    }
                }
            }
            visited[iIndex][jIndex] = 1;

            if(findFather(nodeHierarchy, iIndex) != findFather(nodeHierarchy, jIndex)){
                System.out.println(n + " Round min value path: " + minVal + " from " + iIndex + " to " + jIndex);
                minSum += graph[iIndex][jIndex];
                updateHierarchy(nodeHierarchy, iIndex, jIndex);
                n++;
            }
            System.out.println("node hierarchy:" + Arrays.toString(nodeHierarchy));


        }

        System.out.println("min tree path sum:" + minSum);
        System.out.println("node hierarchy:" + Arrays.toString(nodeHierarchy));


    }
    
    private static int findFather(int[] nodeHierarchy, int idx){

        if(nodeHierarchy[idx] == idx)
            return idx;

        return findFather(nodeHierarchy, nodeHierarchy[idx]);

    }

    private static void updateHierarchy(int[] nodeHierarchy, int from, int to){
        if(nodeHierarchy[from] != from)
            updateHierarchy(nodeHierarchy, nodeHierarchy[from], from);
        nodeHierarchy[from] = to;
    }

}
