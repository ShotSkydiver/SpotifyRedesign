package android.support.v7.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.shotskydiver.spotify.R;
import com.spotify.android.glue.components.card.glue.*;
import com.spotify.android.glue.components.card.glue.CardView;
import com.spotify.android.paste.widget.SquareImageView;
import com.spotify.android.paste.widget.internal.PasteLinearLayout;
import com.spotify.android.paste.widget.internal.PasteRelativeLayout;

import com.makeramen.roundedimageview.*;
//import com.spotify.mobile.android.spotlets.startpage.porcelain.view.StartPageBackgroundView;
import com.android.common.view.StartPageBackgroundView;

import java.util.Random;

import gk.android.investigator.Investigator;
import lanchon.dexpatcher.annotation.*;


@DexEdit(onlyEditMembers = true)
public class RecyclerView extends ViewGroup {

    @DexIgnore
    public boolean i; // mHasFixedSize
    //public akt f; // mLayout

    @DexIgnore
    public RecyclerView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    /**
     * RecyclerView can perform several optimizations if it can know in advance that RecyclerView's
     * size is not affected by the adapter contents. RecyclerView can still change its size based
     * on other factors (e.g. its parent's size) but this size calculation cannot depend on the
     * size of its children or contents of its adapter (except the number of items in the adapter).
     * <p>
     * If your use of RecyclerView falls into this category, set this to {@code true}. It will allow
     * RecyclerView to avoid invalidating the whole layout when its adapter contents change.
     *
     * @param hasFixedSize true if adapter changes cannot affect the size of the RecyclerView.
     */


    /**
     * @return true if the app has specified that changes in adapter content cannot change
     * the size of the RecyclerView itself.
     */



    @DexEdit(target = "drawChild")
    public boolean drawChild2(Canvas canvas, View child, long drawingTime) {
        return super.drawChild(canvas, child, drawingTime);
    }
    @DexAdd
    public boolean drawChild(Canvas canvas, View child, long drawingTime) {

        //Log.i("SPOTIFY_TEST", "RecyclerView: drawChild: " + this.getClass().toString() + " child: " + child.getClass().toString());
        //int thisRecyclerID = this.getId();
        //if (thisRecyclerID == 2131887613) {






        /*
        else if (thisRecyclerID == 2131886243) {
            //Log.i("SPOTIFY_TEST", "RecyclerView found legacy_header_sticky_inner_recycler id");
            this.setBackground(getResources().getDrawable(R.drawable.bg_gradient_white));
        }
        */

        /*
        if (child instanceof com.spotify.android.glue.components.card.glue.CardView) {
            CardView cardd = (CardView) child;
            TextView cardTitle = (TextView) cardd.getChildAt(1);
            if (cardd.getTag() == null) {
                String tagText = cardTitle.getText().toString();
                String tagNew = tagText.replace(' ', '_');
                Log.i("SPOTIFY_TEST", "RecyclerView: found untagged cardview: " + tagNew);
                cardd.setTag(tagNew);

                RoundedImageView cardImage = (RoundedImageView) cardd.getChildAt(0);
                cardImage.setBackground(getResources().getDrawable(R.drawable.bg_white_rounded_rect));
                cardImage.setElevation(10.0f);
                LayoutParams cardParms = cardd.getLayoutParams();
                //cardParms.width = 350; // 350
                //cardParms.height = 425; // 425
                //cardTitle.setLetterSpacing(0.06f);
                //cardd.setBackground(getResources().getDrawable(R.drawable.bg_white_rounded_rect));
                //cardd.setElevation(10.0f);
                cardd.setGravity(Gravity.CENTER_VERTICAL);
                //cardd.setBottom(175);


            }

        }
        else if (child instanceof LinearLayout) {
            //Log.i("SPOTIFY_TEST", "RecyclerView: found PasteLinearLayout");
            LinearLayout headerView = (LinearLayout) child;
            if ((headerView.getChildCount() > 0) && (headerView.getChildAt(0) instanceof TextView)) {
                TextView headerText = (TextView) headerView.getChildAt(0);
                //TextView subHeaderText = (TextView) headerView.getChildAt(1);
                if (headerView.getTag() == null) {
                    String tagText = headerText.getText().toString();
                    String tagNew = tagText.replace(' ', '_');
                    Log.i("SPOTIFY_TEST", "RecyclerView: found untagged linearlayout: " + tagNew);
                    headerView.setTag(tagNew);
                    headerText.setLetterSpacing(0.06f);
                    //subHeaderText.setText("Continue listening where you left off.");
                    //headerView.setBackground(getResources().getDrawable(R.drawable.cat_navigation_list_divider));
                }
            }

        }

        else if (child instanceof RelativeLayout) {
            //Log.i("SPOTIFY_TEST", "RecyclerView: found RelativeLayout");
            RelativeLayout cardRecyclerLayout = (RelativeLayout) child;
            if ((cardRecyclerLayout.getChildCount() > 0) && (cardRecyclerLayout.getChildAt(0) instanceof StartPageBackgroundView)) {
                if (cardRecyclerLayout.getTag() == null) {
                    //String tagText = headerText.getText().toString();
                    //String tagNew = tagText.replace(' ', '_');
                    cardRecyclerLayout.setTag("featured_cardd");
                    Log.i("SPOTIFY_TEST", "RecyclerView: found untagged relativelayout: " + cardRecyclerLayout.getChildCount());
                    if (cardRecyclerLayout.getChildAt(1) instanceof RelativeLayout) {
                        RelativeLayout featuredCard = (RelativeLayout) cardRecyclerLayout.getChildAt(1);
                        //Log.i("SPOTIFY_TEST", "RecyclerView featured relativelayout child 1 id: " + featuredCard.getId());

                    }
                }

            }
        }
        */

        if (this.getId() == R.id.content) {
                if (child instanceof com.spotify.android.glue.components.card.glue.CardView) {

                    CardView cardd = (CardView) child;

                    //TextView cardTitle = (TextView) cardd.getChildAt(1);
                    //if (cardd.getTag() == null) {
                        //String tagText = cardTitle.getText().toString();
                        //String tagNew = tagText.replace(' ', '_');
                        //Log.i("SPOTIFY_TEST", "RecyclerView: found untagged cardview: " + tagNew);
                        //cardd.setTag(tagNew);

                        //RoundedImageView cardImage = (RoundedImageView) cardd.getChildAt(0);
                        //cardImage.setBackground(getResources().getDrawable(R.drawable.bg_albumart_shadow));
                        //cardImage.setElevation(10.0f);
                        //LayoutParams cardImageParams = cardImage.getLayoutParams();
                        //cardImageParams.width = 350; // 350
                        //cardImageParams.height = 350; // 425


                        //LayoutParams cardParms = cardd.getLayoutParams();
                        //cardParms.width = 380; // 350
                        //cardParms.height = 440; // 425

                    //}
                }
            }
        return drawChild2(canvas, child, drawingTime);


    }

    @DexEdit(target = "onMeasure")
    public void onMeasureReal(int i, int i1) {}
    @DexAdd
    public void onMeasure(int widthSpec, int heightSpec) {
        //mHasFixedSize = true;
        int newHeightSpec = heightSpec;
        if (this.getId() == R.id.content) {
            //newHeightSpec = MeasureSpec.makeMeasureSpec(535, MeasureSpec.EXACTLY);
        }

        onMeasureReal(widthSpec, newHeightSpec);
    }

    @DexEdit(target = "onLayout")
    protected void onLayout2(boolean b, int i, int i1, int i2, int i3) {}
    @DexAdd
    protected void onLayout(boolean b, int i, int i1, int i2, int i3) {
        onLayout2(b, i, i1, i2, i3);
        //Log.i("SPOTIFY_TEST", "RecyclerView: onLayout");
        //Investigator.log(this, "onlayout hasfixedsize", mHasFixedSize);

    }

    @DexEdit(target = "onDraw")
    public void onDraw2(Canvas canvas) {}
    @DexAdd
    @Override public void onDraw(Canvas canvas) {


        if (this.getId() == R.id.content) {
            if (this.getTag() == null) {
                //Log.i("SPOTIFY_TEST", "RecyclerView: found content id");
                //LayoutParams thisParams = this.getLayoutParams();
                //thisParams.height = 480;
                //thisParams.height = LayoutParams.WRAP_CONTENT;
                //this.setLayoutParams(thisParams);
                //this.setBackgroundColor(getResources().getColor(R.color.cat_grayscale_12));
                //this.setPadding(5, 10, 0, 10);
                //this.setTag("content_modified");
               //Log.i("SPOTIFY_TEST", "RecyclerView: after content set layoutparams and padding");

            }
        }

        onDraw2(canvas);
        //Log.i("SPOTIFY_TEST", "RecyclerView: onDraw");


    }
}