package com.dark.androidbox.Adpaters;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Color;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;

import com.dark.androidbox.Editor.Codes;
import com.dark.androidbox.Fragments.EditorFragment;
import com.dark.androidbox.R;
import com.dark.androidbox.System.NodeEvents;
import com.dark.androidbox.builder.LogicBuilder;
import com.dark.androidbox.databinding.CodeNodesBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.gyso.treeview.TreeViewEditor;
import com.gyso.treeview.adapter.DrawInfo;
import com.gyso.treeview.adapter.TreeViewAdapter;
import com.gyso.treeview.adapter.TreeViewHolder;
import com.gyso.treeview.line.BaseLine;
import com.gyso.treeview.model.NodeModel;

import java.util.ArrayList;

public class CodeAdapter extends TreeViewAdapter<Codes> {


    public Activity ctx;
    NodeEvents events;

    FragmentManager manager;

    TreeViewEditor editor;

    public CodeAdapter(FragmentManager manager, Activity activity, NodeEvents events, TreeViewEditor editor) {
        this.ctx = activity;
        this.events = events;
        this.manager = manager;
        this.editor = editor;
    }

    @Override
    public TreeViewHolder<Codes> onCreateViewHolder(@NonNull ViewGroup viewGroup, NodeModel<Codes> model) {
        CodeNodesBinding nodeBinding = CodeNodesBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        return new TreeViewHolder<>(nodeBinding.getRoot(), model);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull TreeViewHolder<Codes> holder) {
        View items = holder.getView();

        LinearLayout head_node = items.findViewById(R.id.head_node);

        RelativeLayout cardInfo = items.findViewById(R.id.card_info);

        TextView label = items.findViewById(R.id.label_codeBlock);

        TextView txt_info = items.findViewById(R.id.txt_info);

        MaterialTextView node_id = items.findViewById(R.id.node_id);

        MaterialButton delNode = items.findViewById(R.id.delNode);

        MaterialButton codeNode = items.findViewById(R.id.btn_code);

        NodeModel<Codes> nodeObj = holder.getNode();

        final Codes blockData = nodeObj.value;

        cardInfo.setVisibility(View.GONE);

        items.setOnClickListener(view -> events.NodeOnClick(blockData.itemId));

        head_node.setOnLongClickListener(v -> {
            cardInfo.setVisibility(!(cardInfo.getVisibility() == View.VISIBLE) ? View.VISIBLE : View.GONE);

            return false;
        });

        delNode.setOnClickListener(view -> editor.removeNode(holder.getNode()));

        codeNode.setOnClickListener(view -> {

        });

        label.setText(blockData.label);

        if (blockData.itemId == 0) {
            String data = String.valueOf(setUpClassInfo(new LogicBuilder(EditorFragment.sampleCode())));

            SpannableStringBuilder colorant = new SpannableStringBuilder(data);

            SetUpColor(colorant, data, "Type", "#8EBBFF");
            SetUpColor(colorant, data, "Returns", "#8EBBFF");
            SetUpColor(colorant, data, "Extends", "#8EBBFF");
            SetUpColor(colorant, data, "Interface", "#8EBBFF");
            SetUpColor(colorant, data, "Null", "#FF8E8E");
            SetUpColor(colorant, data, "Class", "#BBB0FF");

            txt_info.setText(colorant);

        } else {
            if (blockData.itemId == 1) {
                txt_info.setText("Click Here To Add Var");
                txt_info.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            } else {
                if (blockData.itemId == 2) {
                    txt_info.setText("Click Here To Add Methods");
                    txt_info.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                }
            }
        }

        node_id.setText("" + blockData.type);

        Log.d("System Info", String.valueOf(new LogicBuilder(EditorFragment.sampleCode())));
    }
    public StringBuilder setUpClassInfo(LogicBuilder builder) {

        StringBuilder Type, Returns, Inputs = new StringBuilder(""), data = new StringBuilder("");


        ArrayList<StringBuilder> Interfaces = builder.getClassImplementation();
        StringBuilder Extends = builder.getClassExtends().get(0);

        if (Extends.length() != 0) {
            Inputs = new StringBuilder("Extends : ".concat(Extends.toString()));
            if (Interfaces.size() != 0) {
                Inputs.append("\nInterface : ".concat(String.join(", ", Interfaces)));
            }
        }
        Type = new StringBuilder("Type : Class \n");
        Returns = new StringBuilder("Returns : Null \n");

        data.append(Type).append(Returns).append(Inputs);

        return data;
    }
    @Override
    public BaseLine onDrawLine(DrawInfo drawInfo) {
        return null;
    }

    public void SetUpColor(SpannableStringBuilder colorant, String data, String word, String color) {
        ForegroundColorSpan txtColor1 = new ForegroundColorSpan(Color.parseColor(color));

        int start1 = data.indexOf(word);
        if (start1 != -1) {
            int end1 = start1 + word.length();
            colorant.setSpan(txtColor1, start1, end1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        }
    }
}
