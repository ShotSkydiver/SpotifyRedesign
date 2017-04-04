package com.spotify.android.glue.components.toolbar;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.common.collect.Maps;
import com.shotskydiver.spotify.R;

import java.util.Iterator;
import java.util.Map;

import lanchon.dexpatcher.annotation.*;

@DexEdit(defaultAction = DexAction.IGNORE)
public class GlueToolbarLayout extends ViewGroup {

    @DexIgnore
    public final TextView c;

    @DexIgnore
    public GlueToolbarLayout(Context var1, AttributeSet var2, int var3) {
        super(var1, var2, var3);
        this.c = new TextView(var1);
    }

    @DexEdit(target = "onLayout")
    protected void onLayoutOriginal(boolean var1, int var2, int var3, int var4, int var5) {}
    @DexAdd
    protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) { // boolean changed, int left, int top, int right, int bottom
        //Log.i("SPOTIFY_TEST", "GlueToolbarLayout: onLayout");
        onLayoutOriginal(var1, var2, var3, var4, var5);

        /*
        this.c.setTextColor(getResources().getColor(R.color.cat_grayscale_8));
        this.c.setLetterSpacing(0.06f);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            this.c.setTextAppearance(R.style.TitleBarFont);
        }
        this.c.setAllCaps(true);
        this.c.setGravity(Gravity.CENTER);
        //this.c.setGravity(3);
        LayoutParams textParams = this.c.getLayoutParams();
        textParams.width = 350;
        //textParams.height = LayoutParams.WRAP_CONTENT;
        //this.c.setLayoutParams(textParams);

        */

    }

    @DexEdit(target = "onMeasure")
    protected void onMeasure2(int var1, int var2) {}
    @DexAdd
    protected void onMeasure(int var1, int var2) {
        //Log.i("SPOTIFY_TEST", "GlueToolbarLayout: onMeasure");

        LayoutParams textParams = this.c.getLayoutParams();
        //textParams.width = 350;
        textParams.height = LayoutParams.MATCH_PARENT;
        this.c.setLayoutParams(textParams);
        this.c.setGravity(Gravity.TOP);

        onMeasure2(var1, var2);

    }

}
