package com.insanexs.algorithm.graph;

import java.util.List;

/**
 * @Author: xieshang
 * @Description:
 * @Date: Create at 2019-11-06
 */
public class Graph {

    private List<GraphNode> node;

    private List<GraphPath> paths;

    public List<GraphNode> getNode() {
        return node;
    }

    public void setNode(List<GraphNode> node) {
        this.node = node;
    }

    public List<GraphPath> getPaths() {
        return paths;
    }

    public void setPaths(List<GraphPath> paths) {
        this.paths = paths;
    }
}
