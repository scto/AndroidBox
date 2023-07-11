package com.dark.androidbox.builder.NodeType;

import com.dark.androidbox.Editor.Codes;
import com.dark.androidbox.builder.LogicBuilder;
import com.gyso.treeview.model.NodeModel;

import java.util.ArrayList;

public class VariableNode extends BaseNode {

    LogicBuilder nodeBuilder;

    public VariableNode(String code) {
        super(code);
        nodeBuilder = new LogicBuilder(code);
    }

    @Override
    public NodeModel<Codes> buildNode(int i) {
        if (size() != 0) {

            ArrayList<StringBuilder> variables = nodeBuilder.getVariables();
            ArrayList<StringBuilder> variableCodes = nodeBuilder.getVariablesCode();
            if (i < variableCodes.size()) {
                baseNode = new NodeModel<>(new Codes(4, i + 1, variables.get(i).toString(), variableCodes.get(i)));
            }
        }
        return baseNode;
    }

    @Override
    public int size() {
        return nodeBuilder.getVariables().size();
    }
}
