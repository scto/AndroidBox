package com.dark.androidbox.Fragments;

import static com.dark.androidbox.Utilities.DarkUtilities.ShowMessage;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import com.amrdeveloper.codeview.CodeView;
import com.dark.androidbox.Adpaters.CodeAdapter;
import com.dark.androidbox.Adpaters.NodeListAdapter;
import com.dark.androidbox.Editor.Codes;
import com.dark.androidbox.Editor.Editor;
import com.dark.androidbox.Managers.NodeBuilderDialog;
import com.dark.androidbox.R;
import com.dark.androidbox.System.NodeEvents;
import com.dark.androidbox.builder.LogicBuilder;
import com.dark.androidbox.builder.NodeType.BaseNode;
import com.dark.androidbox.builder.NodeType.ClassNode;
import com.dark.androidbox.builder.NodeType.ConstructorNode;
import com.dark.androidbox.builder.NodeType.MethodNode;
import com.dark.androidbox.builder.NodeType.VariableNode;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textview.MaterialTextView;
import com.gyso.treeview.GysoTreeView;
import com.gyso.treeview.TreeViewEditor;
import com.gyso.treeview.adapter.TreeViewHolder;
import com.gyso.treeview.layout.TableRightTreeLayoutManager;
import com.gyso.treeview.layout.TreeLayoutManager;
import com.gyso.treeview.line.BaseLine;
import com.gyso.treeview.line.SmoothLine;
import com.gyso.treeview.listener.TreeViewControlListener;
import com.gyso.treeview.model.NodeModel;
import com.gyso.treeview.model.TreeModel;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EditorFragment extends Fragment implements NodeEvents, TreeViewControlListener {

    public GysoTreeView treeView;
    public TreeViewEditor editor;
    public MaterialButton code, node, focusMid, add;

    public ImageView backBtn;

    public CodeView txtCode;
    public MaterialSwitch dragLock;
    public LogicBuilder builder = new LogicBuilder(sampleCode());

    public MaterialAlertDialogBuilder dialogBuilder;
    public Editor codeEditor;
    public AlertDialog basic_dlgBuilder;
    CodeAdapter adapter;
    NodeListAdapter nodesListAdapter;
    TreeLayoutManager treeLayoutManager;
    TreeModel<Codes> treeModel;
    NodeModel<Codes> rootClass;
    private NodeModel<Codes> parentToRemoveChildren = null;
    private NodeModel<Codes> targetNode;

    NodeBuilderDialog nodeBuilderDialog;

    public EditorFragment() {
    }

    //For Testing Purposes Only
    public static String sampleCode() {
        return "import java.util.ArrayList;\n" +
                "import java.util.regex.Matcher;\n" +
                "import java.util.regex.Pattern;\n" +
                "\n" +
                "public class JavaCodeParser extends Fragment implements NodeEvents, Data, Events {\n" +
                "    private String codeString;\n" +
                "    private ArrayList<String> classes;\n" +
                "    \n" +
                "    public JavaCodeParser(String codeString) {\n" +
                "        this.codeString = codeString;\n" +
                "        this.classes = new ArrayList<String>();\n" +
                "        this.functions = new ArrayList<String>();\n" +
                "        this.variables = new ArrayList<String>();\n" +
                "        \n" +
                "        extractClasses();\n" +
                "        extractFunctions();\n" +
                "        extractVariables();\n" +
                "    }\n" +
                "    public ArrayList<String> getVariables() {\n" +
                "        String var;\n\n " +
                "        return var;\n" +
                "    }\n" +
                "    public class SonarBuilder { \n" +
                "\n" +
                "    }\n" +
                "" +
                "    public class Class2 {\n" +
                "\n" +
                "    }\n" +
                "}";
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_editor, container, false);

        treeView = root.findViewById(R.id.base_tree_view);

        code = root.findViewById(R.id.code);
        node = root.findViewById(R.id.node);
        txtCode = root.findViewById(R.id.codeTxt);

        focusMid = root.findViewById(R.id.focusMid);

        add = root.findViewById(R.id.add);

        dragLock = root.findViewById(R.id.drag);

        backBtn = root.findViewById(R.id.back_btn);

        initNODE();
        Logic();

        dragLock.setChecked(true);

        return root;
    }

    public void Logic() {

        //Setting Up Node Builder ( A Section From Were u can add New Nodes )
        nodeBuilderDialog = new NodeBuilderDialog(getContext(), treeView);

        //Setting Up Text Editor
        codeEditor = new Editor(getContext(), txtCode);
        codeEditor.setUp();
        codeEditor.setDynamicString(new StringBuilder(rootClass.value.label), "#9e9d4c");

        //Setting Up View Logic
        txtCode.setVisibility(View.GONE);
        treeView.setVisibility(View.VISIBLE);

        //On Code Button Click > Node View Should be Invisible
        code.setOnClickListener(v -> {
            txtCode.setText(NodeToCode());
            txtCode.setVisibility(View.VISIBLE);
            treeView.setVisibility(View.GONE);
        });

        //On Node Button Click > Code Editor View Should be Invisible
        node.setOnClickListener(view -> {
            CodeToNode(txtCode.getText().toString());
            txtCode.setVisibility(View.GONE);
            treeView.setVisibility(View.VISIBLE);
        });

        //On FocusMid Button Click > Focus In The Middle OF The Node View
        focusMid.setOnClickListener(view -> {
            editor.focusMidLocation();
        });

        //On Add Button Click > Node Builder Will be Visible
        add.setOnClickListener(view -> nodeBuilderDialog.castNodeBuilder(30));

        backBtn.setOnClickListener(view -> {

        });

    }

    public void NodeList() {
        dialogBuilder = new MaterialAlertDialogBuilder(getActivity());

        ArrayList<String> data = new ArrayList<>();

        data.add("Class");
        data.add("String");
        data.add("Void");
        data.add("int");
        data.add("Enum");
        data.add("Interface");

        nodesListAdapter = new NodeListAdapter(data, this);

        View actionView = LayoutInflater.from(getActivity()).inflate(R.layout.list_view, null);

        ListView action_list = actionView.findViewById(R.id.list_actions);

        action_list.setAdapter(nodesListAdapter);

        dialogBuilder.setView(action_list);

        dialogBuilder.setTitle("Nodes List")
                .setMessage("Choose Nodes From Here")
                .setCancelable(true)
                .setPositiveButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        basic_dlgBuilder.dismiss();
                    }
                });

        basic_dlgBuilder = dialogBuilder.show();
    }

    public void initNODE() {
        adapter = new CodeAdapter(requireActivity().getSupportFragmentManager(), getActivity(), this, treeView.getEditor());

        treeLayoutManager = getTreeLayoutManager();

        treeView.setAdapter(adapter);
        treeView.setTreeLayoutManager(treeLayoutManager);

        CodeToNode(sampleCode());

        editor = treeView.getEditor();

        dragLock.setOnCheckedChangeListener((btn, b) -> editor.requestMoveNodeByDragging(b));

        treeView.setTreeViewControlListener(this);
    }

    private TreeLayoutManager getTreeLayoutManager() {
        int space_50dp = 75;
        int space_20dp = 75;
        BaseLine line = getLine();
        //return new BoxRightTreeLayoutManager(getContext(),space_50dp,space_20dp,line);
        //return new BoxDownTreeLayoutManager(getContext(),space_50dp,space_20dp,line);
        //return new BoxLeftTreeLayoutManager(this,space_50dp,space_20dp,line);
        //return new BoxUpTreeLayoutManager(this,space_50dp,space_20dp,line);
        //return new BoxHorizonLeftAndRightLayoutManager(this,space_50dp,space_20dp,line);
        //return new BoxVerticalUpAndDownLayoutManager(this,space_50dp,space_20dp,line);


        //TODO !!!!! the layoutManagers below are just for test don't use in your projects. Just for test now
        return new TableRightTreeLayoutManager(getContext(), space_50dp, space_20dp, line);
        //return new TableLeftTreeLayoutManager(this,space_50dp,space_20dp,line);
        //return new TableDownTreeLayoutManager(this,space_50dp,space_20dp,line);
        //return new TableUpTreeLayoutManager(this,space_50dp,space_20dp,line);
        //return new TableHorizonLeftAndRightLayoutManager(this,space_50dp,space_20dp,line);
        //return new TableVerticalUpAndDownLayoutManager(this,space_50dp,space_20dp,line);

        //return new CompactRightTreeLayoutManager(getContext(), space_50dp, space_20dp, line);
        //return new CompactLeftTreeLayoutManager(this,space_50dp,space_20dp,line);
        //return new CompactHorizonLeftAndRightLayoutManager(this,space_50dp,space_20dp,line);
        //return new CompactDownTreeLayoutManager(this,space_50dp,space_20dp,line);
        //return new CompactUpTreeLayoutManager(this,space_50dp,space_20dp,line);
        //return new CompactVerticalUpAndDownLayoutManager(this,space_50dp,space_20dp,line);

        //return new CompactRingTreeLayoutManager(this,space_50dp,space_20dp,line);
        //return new ForceDirectedTreeLayoutManager(this,line);
    }

    private BaseLine getLine() {
        return new SmoothLine(Color.parseColor("#8EBBFF"), 2);
        //return new StraightLine(Color.parseColor("#055287"),2);
        //return new DashLine(Color.parseColor("#F1286C"),3);
        //return new AngledLine();
    }
    public void NodeMerge(NodeModel<Codes> target, NodeModel<Codes> released) {

        LogicBuilder targetLogic = new LogicBuilder(target.value.data.toString());
        LogicBuilder releasedLogic = new LogicBuilder(released.value.data.toString());
        LogicBuilder classBuilder = new LogicBuilder(rootClass.value.data.toString());

        StringBuilder targetData = target.value.data;
        StringBuilder releasedData = released.value.data;

        int targetNodeType = target.value.type;
        int releasedNodeType = released.value.type;

        if (targetNodeType == 0 && releasedNodeType == 2)
            AddVariableNode(target, released);

//        if (releasedLogic.isClass()) {
//
//            String classToWrite = releasedLogic.getClasses().get(0);
//
//            if (targetLogic.containsClass(classToWrite)) {
//                String codeToReplace = targetLogic.extractClass(classToWrite);
//
//                target.value.writeData(new StringBuilder(replace(targetData.toString(), codeToReplace, releasedData.toString())));
//
//                Log.e("Mission SuccessFull", target.value.data.toString());
//
//            } else {
//
//                target.value.writeData(new StringBuilder(writeClass(targetData.toString(), releasedData.toString())));
//
//                classToWrite = targetLogic.getClasses().get(0);
//                Log.e("CLass To Write", classToWrite);
//                Log.e("CLass Data", rootClass.value.data.toString());
//
//                if (classBuilder.containsClass(classToWrite)){
//                    String strToReplace = classBuilder.extractClass(classToWrite);
//                    String withReplace = target.value.data.toString();
//
//                    classToWrite = targetLogic.getClasses().get(0);
//
//                    Log.e("CLass To Write With", withReplace);
//
//                    if (classBuilder.containsClass(classToWrite)){
//                        String existingCode = rootClass.value.data.toString();
//
//                        String modifiedClassCode = target.value.data.toString();
//
//                        // Step 3: Find the specific class block within the string
//                        String regex = "(?s)(class\\s+" + classToWrite + "\\s*\\{.*?\\})";
//                        String modifiedCode = existingCode.replaceAll(regex, modifiedClassCode);
//
//                        rootClass.value.writeData(new StringBuilder(modifiedCode));
//                    }
//                }
//
//                Log.e("Mission SuccessFull", target.value.data.toString());
//            }
//        }

    }

    public void AddVariableNode(NodeModel<Codes> target, NodeModel<Codes> released) {
        LogicBuilder targetLogic = new LogicBuilder(target.value.data.toString());
        LogicBuilder releasedLogic = new LogicBuilder(released.value.data.toString());
        LogicBuilder classBuilder = new LogicBuilder(rootClass.value.data.toString());


        int targetNodeType = target.value.type;
        int releasedNodeType = released.value.type;


        if (targetLogic.isClass()) {
            AddCode(target.value.data.toString(), released.value.data.toString());
        }


    }

    public static String AddCode(String codeString, String code) {

        // Regular expression pattern to match the class declaration line
        String classDeclarationPattern = "\\bpublic\\s+class\\s+\\w+\\b";

        // Create a regular expression pattern object
        Pattern pattern = Pattern.compile(classDeclarationPattern);
        Matcher matcher = pattern.matcher(codeString);

        // Find the class declaration line
        if (matcher.find()) {
            String classDeclarationLine = matcher.group();

            // Find the index of the class declaration line
            int classDeclarationIndex = codeString.indexOf(classDeclarationLine);

            // Check if the class declaration line is found
            if (classDeclarationIndex != -1) {
                // Find the index of the closing curly brace
                int closingBraceIndex = codeString.indexOf('}', classDeclarationIndex);

                // Check if the closing brace is found
                if (closingBraceIndex != -1) {
                    // Insert the text after the closing brace

                    return codeString.substring(0, closingBraceIndex) +
                            "\n" + code + "\n" +
                            codeString.substring(closingBraceIndex);
                }
            }
        }
        return codeString;
    }

    public String replace(String input, String codeToReplace, String replacement) {
        if (input == null || codeToReplace == null || replacement == null) {
            throw new IllegalArgumentException("Input, target, and replacement cannot be null");
        }
        return input.replace(codeToReplace, replacement);
    }

    public String writeClass(String targetData, String releasedData) {
        String result = "";

        String[] lines = targetData.split("\\r?\\n");
        int secondLastLineIndex = lines.length - 2; // index of the second last line

        if (secondLastLineIndex >= 0) {
            lines[secondLastLineIndex] = releasedData.toString(); // new string to insert
            result = String.join("\n", lines);
        } else {
            System.out.println("Error: Could not find second last line in the original string.");
        }

        return result;
    }

    public void CodeToNode(String code) {

        //Setting Up The Raw Code
        BaseNode nodeBuilder;
        LogicBuilder classBuilder = new LogicBuilder(code);

        //Setting Up Classes
        if (classBuilder.getClasses().size() != 0) {

            nodeBuilder = new ClassNode(code);

            rootClass = new NodeModel<>(new Codes(0, 0, new LogicBuilder(code).getClasses().get(0), new StringBuilder(code)));
            treeModel = new TreeModel<>(rootClass);

            for (int i = 0; i < nodeBuilder.size(); i++) {
                treeModel.addNode(rootClass, nodeBuilder.buildNode(i));
            }

            treeModel = new TreeModel<>(rootClass);
        }

        //Setting Up Constructors
        if (classBuilder.getConstructors().size() != 0) {
            nodeBuilder = new ConstructorNode(code);
            for (int i = 0; i < classBuilder.getConstructors().size(); i++) {
                treeModel.addNode(rootClass, nodeBuilder.buildNode(i));
            }
        }

        //Setting Up Functions
        if (classBuilder.getMethods().size() != 0) {
            nodeBuilder = new MethodNode(code);
            for (int i = 0; i < classBuilder.getMethods().size(); i++) {
                treeModel.addNode(rootClass, nodeBuilder.buildNode(i));
            }
        }

        //Setting Up Variables
        if (classBuilder.getVariables().size() != 0) {
            nodeBuilder = new VariableNode(code);
            for (int i = 0; i < classBuilder.getVariables().size(); i++) {
                treeModel.addNode(rootClass, nodeBuilder.buildNode(i));
            }
        }

        rootClass.removeChildNode(rootClass.getChildNodes().get(0));

        //Setting The Node Data
        parentToRemoveChildren = rootClass;
        targetNode = rootClass.getChildNodes().get(0);

        //Allotting Data
        adapter.setTreeModel(treeModel);
    }

    public String NodeToCode() {
        return rootClass.value.data.toString();
    }

    @Override
    public void NodeOnClick(int id) {
//        if (id == 0) {
//            StringBuilder data = builder.ObjectGenerator(new ObjManager(new StringBuilder("MyClass"), Types.ObjTypes.Class));
//
//            NodeModel<Codes> classSample2 = new NodeModel<>(new Codes(1, new LogicBuilder(data.toString()).getClasses().get(0), data, Types.ObjTypes.Class.name()));
//
//            treeModel.addNode(rootClass, classSample2);
//            adapter.setTreeModel(treeModel);
//
//        } else {
//            if (id == 1) {
//                StringBuilder data = builder.ObjectGenerator(new DataTypesManager(
//                        new StringBuilder("newString"),
//                        Types.VisibilityTypes.Public,
//                        Types.DataTypes.String));
//
//                ShowMessage(getContext(), data);
//
//                NodeModel<Codes> classSample2 = new NodeModel<>(new Codes(1, new LogicBuilder(data.toString()).getVariables().get(0), data));
//
//                treeModel.addNode(rootClass, classSample2);
//                adapter.setTreeModel(treeModel);
//            }
//        }
    }

    @Override
    public void onScaling(int state, int percent) {
    }

    @Override
    public void onDragMoveNodesHit(@Nullable NodeModel<?> dn, @Nullable NodeModel<?> hn, @Nullable View dv, @Nullable View hv) {
    }

    @Override
    public void onDropNode(View view) {
        NodeModel<Codes> targetHolderNode = null, releasedChildHolderNode = null;

        Object fTag = view.getTag(com.gyso.treeview.R.id.the_hit_target);
        boolean getHit = fTag != null;

        TreeViewHolder<Codes> targetHolder = (TreeViewHolder<Codes>) treeView.treeViewContainer.getTreeViewHolder((NodeModel) fTag);
        TreeViewHolder<Codes> releasedChildHolder = (TreeViewHolder<Codes>) view.getTag(com.gyso.treeview.R.id.item_holder);


        if (targetHolder != null) {
            targetHolderNode = targetHolder.getNode();
        }

        if (targetHolder != null) {
            releasedChildHolderNode = releasedChildHolder.getNode();
        }

        if (getHit) {
            View child = targetHolder.getView();

            for (int i = 0; i < ((ViewGroup) child).getChildCount(); i++) {
                View childView = ((ViewGroup) child).getChildAt(i);
                if (childView instanceof MaterialTextView) {
                    int typeInfoDataText = Integer.parseInt(((TextView) childView).getText().toString());

                    if (typeInfoDataText == 2)
                        //Node Is Not Merge
                        ShowMessage(getContext(), new StringBuilder(releasedChildHolderNode.value.label));
                    else
                        //Node Is Merge
                        NodeMerge(targetHolderNode, releasedChildHolderNode);
                }
            }
        }
    }

    @Override
    public void AddNode(ArrayList<String> data, int i) {
        treeModel = new TreeModel<>(rootClass);

        NodeModel<Codes> funNode = new NodeModel<>(new Codes(1, i, data.get(i), new StringBuilder("public static void getYourName() { \n\n }")));
        treeModel.addNode(rootClass, funNode);

        adapter.setTreeModel(treeModel);

        basic_dlgBuilder.dismiss();
    }

}
