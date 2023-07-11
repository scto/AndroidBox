package com.dark.androidbox.builder.NodeType;

import com.dark.androidbox.Editor.Codes;
import com.dark.androidbox.builder.LogicBuilder;
import com.gyso.treeview.model.NodeModel;

public class MethodNode extends BaseNode {

    LogicBuilder nodeBuilder;

    public MethodNode(String code) {
        super(code);
        nodeBuilder = new LogicBuilder(code);
    }

    @Override
    public NodeModel<Codes> buildNode(int i) {
        if (size() != 0)
            baseNode = new NodeModel<>(new Codes(3, i + 1, nodeBuilder.getMethods().get(i).toString(), nodeBuilder.getMethodsCode().get(i)));
        return baseNode;
    }

    @Override
    public int size() {
        return nodeBuilder.getMethods().size();
    }
}
