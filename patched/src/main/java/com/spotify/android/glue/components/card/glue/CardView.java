package com.spotify.android.glue.components.card.glue;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.makeramen.roundedimageview.RoundedImageView;
import com.shotskydiver.spotify.R;
import com.spotify.android.paste.widget.SquareImageView;
import com.spotify.android.paste.widget.internal.PasteLinearLayout;


import gk.android.investigator.Investigator;
import lanchon.dexpatcher.annotation.*;


@DexEdit(defaultAction = DexAction.IGNORE)
public class CardView extends PasteLinearLayout {

    public ImageView a;
    public TextView b;
    public TextView c;

    @DexIgnore
    public CardView(Context var1, AttributeSet var2, int var3) {
        super(var1, var2, var3);
    }

    @DexEdit(target = "onLayout")
    protected void onLayout2(boolean var1, int var2, int var3, int var4, int var5) {}
    @DexAdd
    protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
        //Log.i("SPOTIFY_TEST", "CardView: onlayout");
        //Investigator.log(this, 3);
        //this.setElevation(6.0f);
        //Drawable albumImage = ((ImageView)this.getChildAt(0)).getDrawable();
        //Log.i("SPOTIFY_TEST", "CardView: drawable: " + albumImage.getIntrinsicWidth() + " x " + albumImage.getIntrinsicHeight());

        /*if (this.getChildAt(0) instanceof SquareImageView) {
            Log.i("SPOTIFY_TEST", "CardView: child is SquareImageView");
            SquareImageView albumart = (SquareImageView) this.getChildAt(0);
        }
        */
        //this.setClipChildren(false);
        //this.setClipToPadding(false);
        this.setBackground(getResources().getDrawable(R.drawable.bg_white_card_vert));

        //

        //albumart.setElevation(6.0f);

        this.setElevation(18.0f);
        //RoundedImageView albumart = (RoundedImageView) this.getChildAt(0);


        onLayout2(var1, var2, var3, var4, var5);


    }

    @DexReplace(target = "a")
    private static int a(TextView var0) {
        MarginLayoutParams var3 = (MarginLayoutParams)var0.getLayoutParams();
        int var1 = var0.getMeasuredHeight();
        int var2 = var3.topMargin;
        return var3.bottomMargin + var1 + var2;
    }

    @DexReplace(target = "onMeasure")
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //Log.i("SPOTIFY_TEST", "CardView: onMeasure");
        widthMeasureSpec = MeasureSpec.makeMeasureSpec(430, MeasureSpec.EXACTLY);
        heightMeasureSpec = MeasureSpec.makeMeasureSpec(430, MeasureSpec.AT_MOST);
        int heightMeasureSpecImg = MeasureSpec.makeMeasureSpec(430, MeasureSpec.EXACTLY);
        int zeroMeasureSpec = MeasureSpec.makeMeasureSpec(0, MeasureSpec.AT_MOST);

        /* String search = "followers";
        if ((this.c.getText().toString().toLowerCase().contains(search.toLowerCase())) || (this.c.getText().toString().length() == 0)) {
            Log.i("SPOTIFY_TEST", "CardView: this card is not an album");

            this.a.measure(widthMeasureSpec, heightMeasureSpecImg);
            this.b.measure(zeroMeasureSpec, zeroMeasureSpec);
            this.c.measure(zeroMeasureSpec, zeroMeasureSpec);

            this.setMeasuredDimension(this.a.getMeasuredWidth(), this.a.getMeasuredHeight() + a(this.b));

        } else { */
            Log.i("SPOTIFY_TEST", "CardView: this card IS an album");

            this.a.measure(widthMeasureSpec, heightMeasureSpecImg); // measuring card image
            this.b.measure(widthMeasureSpec, heightMeasureSpec); // measuring card title textview
            //this.c.measure(widthMeasureSpec, heightMeasureSpec);
            this.c.measure(zeroMeasureSpec, zeroMeasureSpec); // measuring unwanted card subtitle textview

            //this.setMeasuredDimension(this.a.getMeasuredWidth(), this.a.getMeasuredHeight() + a(this.b) + a(this.c));

            this.setMeasuredDimension(this.a.getMeasuredWidth(), this.a.getMeasuredHeight() + a(this.b));
        //}


       //int heightMeasureSpec2 = MeasureSpec.makeMeasureSpec(520, MeasureSpec.EXACTLY);


    }



    /*
    protected void onMeasure(int var1, int var2) {
        boolean height_UNDEFINED = true;
        boolean width_UNDEFINED;
        if(MeasureSpec.getMode(var1) == 0) {
            width_UNDEFINED = true;
        } else {
            width_UNDEFINED = false;
        }

        if(MeasureSpec.getMode(var2) != 0) {
            height_UNDEFINED = false;
        }

        if(width_UNDEFINED == height_UNDEFINED) {
            super.onMeasure(var1, var2);
        } else {
            if(height_UNDEFINED) {
                var2 = MeasureSpec.makeMeasureSpec(0, 0);
                this.b.measure(var1, var2);
                this.c.measure(var1, var2);
                this.a.measure(var1, var2);
            } else {
                var1 = MeasureSpec.makeMeasureSpec(0, 0);
                int var5 = a(this.b, abb.a(this.b));
                int var6 = a(this.c, abb.a(this.c));
                var2 = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(var2) - var5 - var6, 1073741824);
                this.b.measure(var2, var1);
                this.c.measure(var2, var1);
                this.a.measure(var2, var1);
            }

            this.setMeasuredDimension(this.a.getMeasuredWidth(), this.a.getMeasuredHeight() + a(this.b) + a(this.c));
        }
    }
     */
}
