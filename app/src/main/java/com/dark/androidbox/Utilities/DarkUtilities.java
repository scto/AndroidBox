package com.dark.androidbox.Utilities;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.Toast;

public class DarkUtilities {


    public static void ShowMessage(Context ctx, StringBuilder txt) {
        Toast.makeText(ctx, txt, Toast.LENGTH_SHORT).show();
    }

}
