import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.makeramen.roundedimageview.RoundedImageView;
import com.shotskydiver.spotify.R;
import com.spotify.android.glue.components.toolbar.GlueToolbarLayout;
import com.squareup.picasso.Picasso$LoadedFrom;

import gk.android.investigator.Investigator;
import lanchon.dexpatcher.annotation.*;


@DexEdit(onlyEditMembers = true)
public class eop {

    @DexIgnore
    private final GlueToolbarLayout a;
    @DexIgnore
    private final TextView b;
    @DexIgnore
    private ColorDrawable c;
    @DexIgnore
    private boolean d;

    @DexIgnore
    public eop(View var1) {
        Log.i("SPOTIFY_TEST", "In eop");
        this.a = (GlueToolbarLayout)var1;
        this.b = this.a.c;
    }


    @DexReplace(target = "a")
    public final void a(int var1) {
        Log.i("SPOTIFY_TEST", "eop: colordrawable before int is: " + var1);
        this.c = new ColorDrawable(Color.parseColor("#ff6c99cd"));
        Log.i("SPOTIFY_TEST", "eop: colordrawable after int is: " + this.c.getColor());
        eyb.a(this.a, this.c);
    }
}
