package com.dark.androidbox.Managers;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.dark.androidbox.Adpaters.ListNodeAdapter;
import com.dark.androidbox.R;

import java.util.ArrayList;

public class NodeBuilderDialog {

    private Context context;

    public ViewGroup hostView;

    public NodeBuilderDialog(Context context, ViewGroup hostView) {
        this.context = context;
        this.hostView = hostView;
    }

    public void castNodeBuilder(int sp) {

        ArrayList<String> data = new ArrayList<>();

        LayoutInflater inflater = LayoutInflater.from(context);
        View root = inflater.inflate(R.layout.nodebuilder_layout, hostView, false);

        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int screenWidth = displayMetrics.widthPixels;
        int screenHeight = displayMetrics.heightPixels;
        int spacingInDp = (int) (sp * displayMetrics.density);
        int newX = screenWidth - dpToPx(root.getContext(), 280f);
        int newY = screenHeight - dpToPx(root.getContext(), 430f);

        root.setX(newX);
        root.setY(newY);

        LinearLayout rootLayout = root.findViewById(R.id.nodebuilder_layout_root);

        ListView list_node = root.findViewById(R.id.list_nodes);


        data.add("");
        data.add("");
        data.add("");
        data.add("");
        data.add("");
        data.add("");
        data.add("");
        data.add("");

        list_node.setAdapter(new ListNodeAdapter(data));

        list_node.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                dismissNodeBuilder();
            }
        });

        hostView.addView(root);
    }

    public void dismissNodeBuilder() {
        if (hostView != null) {
            View root = hostView.findViewById(R.id.nodebuilder_layout_root);
            if (root != null) {
                hostView.removeView(root);
            }
        }
    }

    public int dpToPx(Context context, float dp) {
        float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dp * scale + 0.5f);
    }

}

