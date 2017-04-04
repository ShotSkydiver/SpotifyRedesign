import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.support.v7.graphics.Palette;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.makeramen.roundedimageview.RoundedImageView;
import com.shotskydiver.spotify.R;
import com.squareup.picasso.Picasso$LoadedFrom;

import gk.android.investigator.Investigator;
import lanchon.dexpatcher.annotation.*;


@DexEdit(onlyEditMembers = true)
final class mjb extends BitmapDrawable {
    @DexIgnore
    public mjb() {}
    /*
    @DexIgnore
    private kwz(Context var1, Bitmap var2, Drawable var3, Picasso.LoadedFrom var4, boolean var5, boolean var6) {
        //super(var1.getResources(), var2);
    }
    */

    @DexEdit(target = "a")
    static void a32(ImageView var0, Context var1, Bitmap var2, Picasso$LoadedFrom var3, boolean var4, boolean var5) {}
    @DexAdd
    static void a(ImageView var0, Context var1, Bitmap var2, Picasso$LoadedFrom var3, boolean var4, boolean var5) {
        //Log.i("SPOTIFY_TEST", "Picasso: bitmap get");
        a32(var0, var1, var2, var3, var4, var5);
        /*
        Palette.PaletteAsyncListener paletteListener = new Palette.PaletteAsyncListener() {
            public void onGenerated(Palette palette) {
                //Palette.Swatch swatch = palette.getVibrantSwatch();
                Investigator.log(this, "palette generated", palette);
            }
        };
        Palette.from(var2).generate(paletteListener);
        */
        Palette pall = Palette.from(var2).generate();

        if (var0 instanceof RoundedImageView) {
            //Log.i("SPOTIFY_TEST", "Picasso: rounded imageview");
            //var0.setElevation(18.0f);

            TextView textView = null;
            ViewGroup card = (ViewGroup) var0.getParent();
            card.setElevation(18.0f);
            for (int itemPos = 0; itemPos < card.getChildCount(); itemPos++) {
                View view = card.getChildAt(itemPos);
                if (view instanceof TextView) {
                    //Log.i("SPOTIFY_TEST", "Picasso: found textview");
                    textView = (TextView) view; //Found it!
                    break;
                }
            }
            if (textView != null) {
                //Log.i("SPOTIFY_TEST", "Picasso: textview not null");
                if (textView.getId() == R.id.title) {
                    //Log.i("SPOTIFY_TEST", "Picasso: textview is the title");
                    Drawable background = textView.getBackground();

                    int paletteColor = Color.CYAN;
                    int textColor = Color.YELLOW;

                    if ((pall.getVibrantSwatch() != null)) {
                        paletteColor = pall.getVibrantColor(var1.getResources().getColor(R.color.solitude));
                        if (pall.getLightVibrantSwatch() != null) {
                            textColor = pall.getLightVibrantColor(var1.getResources().getColor(R.color.solitude));
                        }
                        else if (pall.getDarkVibrantSwatch() != null) {
                            textColor = pall.getDarkVibrantColor(var1.getResources().getColor(R.color.solitude));
                        }
                        else if (pall.getLightMutedSwatch() != null) {
                            textColor = pall.getLightMutedColor(var1.getResources().getColor(R.color.solitude));
                        }
                        else {
                            textColor = pall.getVibrantSwatch().getTitleTextColor();
                        }
                    }

                    else if ((pall.getDarkVibrantSwatch() != null)) {
                        paletteColor = pall.getDarkVibrantColor(var1.getResources().getColor(R.color.solitude));
                        if (pall.getLightVibrantSwatch() != null) {
                            textColor = pall.getLightVibrantColor(var1.getResources().getColor(R.color.solitude));
                        }
                        else if (pall.getLightMutedSwatch() != null) {
                            textColor = pall.getLightMutedColor(var1.getResources().getColor(R.color.solitude));
                        }
                        else if (pall.getMutedSwatch() != null) {
                            textColor = pall.getMutedColor(var1.getResources().getColor(R.color.solitude));
                        }
                        else {
                            textColor = pall.getDarkVibrantSwatch().getTitleTextColor();
                        }
                    }

                    else if ((pall.getLightVibrantSwatch() != null)) {
                        paletteColor = pall.getLightVibrantColor(var1.getResources().getColor(R.color.solitude));
                        if (pall.getMutedSwatch() != null) {
                            textColor = pall.getMutedColor(var1.getResources().getColor(R.color.solitude));
                        }
                        else if (pall.getLightMutedSwatch() != null) {
                            textColor = pall.getLightMutedColor(var1.getResources().getColor(R.color.solitude));
                        }
                        else if (pall.getDarkMutedSwatch() != null) {
                            textColor = pall.getDarkMutedColor(var1.getResources().getColor(R.color.solitude));
                        }
                        else {
                            textColor = pall.getLightVibrantSwatch().getTitleTextColor();
                        }
                    }

                    else if ((pall.getMutedSwatch() != null)) {
                        paletteColor = pall.getMutedColor(var1.getResources().getColor(R.color.solitude));
                        if (pall.getLightMutedSwatch() != null) {
                            textColor = pall.getLightMutedColor(var1.getResources().getColor(R.color.solitude));
                        }
                        else if (pall.getDarkMutedSwatch() != null) {
                            textColor = pall.getDarkMutedColor(var1.getResources().getColor(R.color.solitude));
                        }
                        else {
                            textColor = pall.getMutedSwatch().getTitleTextColor();
                        }
                    }
                    /*
                    else if ((pall.getVibrantSwatch() != null) && (pall.getDarkVibrantSwatch() != null)) {
                        paletteColor = pall.getDarkVibrantColor(var1.getResources().getColor(R.color.solitude));
                        textColor = pall.getVibrantColor(var1.getResources().getColor(R.color.solitude));
                    }
                    else if ((pall.getLightVibrantSwatch() != null) && (pall.getDarkVibrantSwatch() != null)) {
                        paletteColor = pall.getDarkVibrantColor(var1.getResources().getColor(R.color.solitude));
                        textColor = pall.getLightVibrantColor(var1.getResources().getColor(R.color.solitude));
                    }
                    else if ((pall.getLightVibrantSwatch() != null) && (pall.getMutedSwatch() != null)) {
                        paletteColor = pall.getMutedColor(var1.getResources().getColor(R.color.solitude));
                        textColor = pall.getLightVibrantColor(var1.getResources().getColor(R.color.solitude));
                    }
                    else if ((pall.getVibrantSwatch() != null) || (pall.getLightVibrantSwatch() != null) || (pall.getDarkVibrantSwatch() != null)) {
                        paletteColor = pall.getVibrantColor(pall.getDarkVibrantColor(pall.getLightVibrantColor(Color.MAGENTA)));
                        textColor = pall.getLightVibrantColor(pall.getVibrantColor(pall.getDarkVibrantColor(Color.MAGENTA)));
                    }
                    */

                    if (background instanceof ShapeDrawable) {
                        // cast to 'ShapeDrawable'
                        ShapeDrawable shapeDrawable = (ShapeDrawable) background;
                        shapeDrawable.getPaint().setColor(paletteColor);
                    } else if (background instanceof GradientDrawable) {
                        // cast to 'GradientDrawable'
                        GradientDrawable gradientDrawable = (GradientDrawable) background;
                        gradientDrawable.setColor(paletteColor);
                    } else if (background instanceof ColorDrawable) {
                        // alpha value may need to be set again after this call
                        ColorDrawable colorDrawable = (ColorDrawable) background;
                        colorDrawable.setColor(paletteColor);
                    }

                    textView.setTextColor(textColor);


                }
            }
        }
    }

}
