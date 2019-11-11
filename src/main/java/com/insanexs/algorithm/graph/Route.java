package com.insanexs.algorithm.graph;

import java.util.List;

/**
 * @Author: xieshang
 * @Description:
 * @Date: Create at 2019-11-11
 */
public class Route {

    private List<GraphNode> node;

    private List<GraphPath> path;

    private int length;

    public Route() {
    }

    public List<GraphNode> getNode() {
        return node;
    }

    public void setNode(List<GraphNode> node) {
        this.node = node;
    }

    public List<GraphPath> getPath() {
        return path;
    }

    public void setPath(List<GraphPath> path) {
        this.path = path;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }


}
