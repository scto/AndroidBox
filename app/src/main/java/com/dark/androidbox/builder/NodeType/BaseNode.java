package com.dark.androidbox.builder.NodeType;


import com.dark.androidbox.Editor.Codes;
import com.dark.androidbox.builder.LogicBuilder;
import com.gyso.treeview.model.NodeModel;

public class BaseNode {
    NodeModel<Codes> baseNode = null;

    LogicBuilder nodeBuilder;

    public BaseNode(String code) {
        nodeBuilder = new LogicBuilder(code);
    }

    public NodeModel<Codes> buildNode(int i) {
        return baseNode = new NodeModel<>(new Codes(0, 0, "Base Node", null));
    }

    public int size() {
        return 0;
    }

}
