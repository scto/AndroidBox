package com.dark.androidbox.builder.NodeType;

import com.dark.androidbox.Editor.Codes;
import com.dark.androidbox.builder.LogicBuilder;
import com.gyso.treeview.model.NodeModel;

public class ClassNode extends BaseNode {

    LogicBuilder nodeBuilder;

    public ClassNode(String code) {
        super(code);
        nodeBuilder = new LogicBuilder(code);
    }

    @Override
    public NodeModel<Codes> buildNode(int i) {
        if (size() != 0)
            baseNode = new NodeModel<>(new Codes(1, i + 1, nodeBuilder.getClasses().get(i), new StringBuilder(nodeBuilder.getClassCode().get(i))));
        return baseNode;
    }

    @Override
    public int size() {
        return nodeBuilder.getClasses().size();
    }
}
