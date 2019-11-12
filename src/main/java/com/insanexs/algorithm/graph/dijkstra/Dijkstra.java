package com.insanexs.algorithm.graph.dijkstra;

import java.util.Arrays;

/**
 * @Author: xieshang
 * @Description:
 * @Date: Create at 2019-11-06
 */
public class Dijkstra {

//    public static Route getShortestPath(Graph graph, GraphNode source, GraphNode target){
//        Route route = null;
//
//        if(graph == null)
//            throw new IllegalArgumentException("graph can not be null");
//
//        if(source == null || target == null)
//            throw new IllegalArgumentException("source or target can not be null");
//
//        Map<GraphNode, Map<GraphNode, GraphPath>> nodeRefPath= new HashMap<GraphNode, Map<GraphNode, GraphPath>>();
//
//        Map<GraphNode, Integer> sMap = new HashMap<GraphNode, Integer>();
//        HashMap<GraphNode, Integer> uMap = new HashMap<GraphNode, Integer>();
//
//        if(graph.getPaths() == null || graph.getPaths().size() == 0)
//            return route;
//
//        for(GraphPath path : graph.getPaths()){
//            GraphNode start = path.getStart();
//            GraphNode end = path.getEnd();
//
//            Map<GraphNode, GraphPath> innerMap = nodeRefPath.get(start);
//            if(innerMap == null){
//                innerMap = new HashMap<GraphNode, GraphPath>();
//            }
//
//            innerMap.put(end, path);
//            nodeRefPath.put(start, innerMap);
//
//            if(start == source){
//                uMap.put(end, path.getLength());
//            }
//        }
//
//        return null;
//
//    }

    public static int[] getShortestPath(int[][] graph, int source){
        if(graph == null || graph.length <= source)
            throw new IllegalArgumentException();

        if(graph.length != graph[0].length)
            throw new IllegalArgumentException();

        int n = graph[source].length;
//        String[] route = new String[n];


        //保存结果集
        int[] ret = new int[graph[source].length];
        //保存已确定最短路径的点
        int[] visited = new int[graph[source].length];

        //初始化数据
        Arrays.fill(visited, 0);
        Arrays.fill(ret, Integer.MAX_VALUE);
        ret[source] = 0;

        //进行n次筛选
        for(int i=0; i<n; i++){
            //找出结果集中未visited结果中数据最小的点，为该轮确定的最短路径
            int minValueIndex = findMinValue(ret, visited);
            visited[minValueIndex] = 1;

            //更新通过该点是否有新的最短路径生成
            int[] line = graph[minValueIndex];
            for(int j=0; j<line.length; j++){
                if(visited[j] == 0 &&
                        line[j] != Integer.MAX_VALUE &&
                        line[j] + ret[minValueIndex] <= ret[j]){
                    ret[j] = line[j] + ret[minValueIndex];
                }

            }


        }

        return ret;
    }


    private static int findMinValue(int[] source, int[] visited){
        int ret = 0;
        int minVal = Integer.MAX_VALUE;
        for(int i=0; i<source.length; i++){
            if(visited[i] == 0 && source[i] < minVal){
                ret = i;
                minVal = source[i];
            }

        }
        return ret;
    }

}
