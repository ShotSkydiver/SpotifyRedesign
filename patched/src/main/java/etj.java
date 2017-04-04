import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.makeramen.roundedimageview.RoundedImageView;
import com.shotskydiver.spotify.R;
import com.spotify.android.glue.components.toolbar.GlueToolbarLayout;
import com.spotify.android.glue.patterns.prettylist.PrettyHeaderView;
import com.spotify.android.glue.patterns.prettylist.PrettyHeaderView$HeaderInternalImageView;
import com.squareup.picasso.Picasso$LoadedFrom;

import gk.android.investigator.Investigator;
import lanchon.dexpatcher.annotation.*;


@DexEdit(onlyEditMembers = true)
public final class etj extends eth {

    @DexIgnore
    private final etg t;
    @DexIgnore
    private float u = -1.0F;
    @DexIgnore
    private final int v;
    @DexIgnore
    private int w;

    @DexIgnore
    public etj(PrettyHeaderView var1, ImageView var2, View var3, int var4, euc var5) {
        super(var1, var2, var3, var4);
        Log.i("SPOTIFY_TEST", "In etj");
        this.p = var5;
        this.t = new etg(this.b);
        this.v = eyb.b(var2.getContext(), 16842836);
    }


    @DexReplace(target = "g")
    private InsetDrawable g(int var1) {
        Log.i("SPOTIFY_TEST", "etj: in insetdrawable g, var1 int is: " + var1);
        boolean var3 = this.f instanceof Button;
        int var2;
        if(this.f != null) {
            var2 = this.f.getMeasuredHeight();
        } else {
            var2 = 0;
        }

        GradientDrawable var4 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{this.v, var1});
        if(var3) {
            var1 = this.l;
        } else {
            var1 = var2;
        }

        return new InsetDrawable(var4, 0, 0, 0, 75);
    }

    @DexReplace(target = "b")
    public final void b(int var1) {
        Log.i("SPOTIFY_TEST", "etj: in internalimageview b");
        PrettyHeaderView$HeaderInternalImageView var2 = (PrettyHeaderView$HeaderInternalImageView)this.b;

        if(var2.a && this.w != var1) {
            this.w = var1;
            var1 = ewo.a(var1);
            if(vg.H(this.a) && Build.VERSION.SDK_INT >= 19) {
                Log.i("SPOTIFY_TEST", "etj b: doing a thing: int is" + this.v);
                TransitionDrawable var3 = new TransitionDrawable(new Drawable[]{new ColorDrawable(this.v), this.g(var1)});
                var2.a(var3);
                var3.startTransition(600);

                //Context phv = this.a.getContext();

            } else {
                var2.a(this.g(var1));
            }
        }
    }

    @DexIgnore
    public final int i() {
        return 1;
    }
    @DexIgnore
    public final void b(int var1, int var2) {}
    @DexIgnore
    public final void a(int var1, int var2) {}
    @DexIgnore
    public final void a(int var1, float var2) {}
    @DexIgnore
    public final boolean j() {
        return true;
    }
    @DexIgnore
    public final void a(int var1) {}
    @DexIgnore
    public final void a(boolean var1) {}
    @DexIgnore
    public final ImageView c() { return null; }
    @DexIgnore
    public final void c(int var1) {}
    @DexIgnore
    public final void d(int var1) {}
    @DexIgnore
    public final void e(int var1) {}
}
