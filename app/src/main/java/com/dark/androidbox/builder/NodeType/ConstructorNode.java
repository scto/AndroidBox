package com.dark.androidbox.builder.NodeType;

import com.dark.androidbox.Editor.Codes;
import com.dark.androidbox.builder.LogicBuilder;
import com.gyso.treeview.model.NodeModel;

public class ConstructorNode extends BaseNode {

    LogicBuilder nodeBuilder;

    public ConstructorNode(String code) {
        super(code);
        nodeBuilder = new LogicBuilder(code);
    }

    @Override
    public NodeModel<Codes> buildNode(int i) {
        if (size() != 0)
            baseNode = new NodeModel<>(new Codes(2, i + 1, nodeBuilder.getConstructors().get(i).toString(), nodeBuilder.getConstructorCode().get(i)));
        return baseNode;
    }

    @Override
    public int size() {
        return nodeBuilder.getConstructors().size();
    }
}
