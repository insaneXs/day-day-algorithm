package com.insanexs.algorithm.graph;

/**
 * @Author: xieshang
 * @Description:
 * @Date: Create at 2019-11-06
 */
public class GraphPath {

    private GraphNode start;

    private GraphNode end;

    private int length;

    public GraphNode getStart() {
        return start;
    }

    public void setStart(GraphNode start) {
        this.start = start;
    }

    public GraphNode getEnd() {
        return end;
    }

    public void setEnd(GraphNode end) {
        this.end = end;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
