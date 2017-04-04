package com.spotify.music;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import android.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;

import com.dynamitechetan.flowinggradient.FlowingGradientClass;
import com.shotskydiver.spotify.R;


//import jwf.debugport.DebugPortService;
import gk.android.investigator.Investigator;
import lanchon.dexpatcher.annotation.*;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

@DexEdit(onlyEditMembers = true)
public class MainActivity extends Activity {


    @DexIgnore
    public MainActivity() {}

    @DexEdit(target = "onCreate")
    protected void onCreateOriginal(Bundle bundle) {}
    @SuppressLint("MissingSuperCall")
    @DexAdd
    protected void onCreate(Bundle bundle) {
        Log.i("SPOTIFY_TEST", "before onCreate");
        onCreateOriginal(bundle);
        Log.i("SPOTIFY_TEST", "after onCreate");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Log.i("SPOTIFY_TEST", "Setting status and nav bar colors");
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            //window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

            window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

           // window.setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

            //window.setStatusBarColor(getResources().getColor(R.color.solitude));
            //window.setStatusBarColor(Color.TRANSPARENT);

            Log.i("SPOTIFY_TEST", "Success setting system bar colors");
        }
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Calibri/Regular.otf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
        /* ***************** NEW TOOLBAR STUFF
        Toolbar tb = (Toolbar) this.findViewById(R.id.toolbar_new);
        this.setActionBar(tb);
        Log.i("SPOTIFY_TEST", "About to do actionbar things");
        final ActionBar ab = this.getActionBar();
        ab.setDisplayShowCustomEnabled(true);
        ab.setDisplayShowTitleEnabled(false);
        Log.i("SPOTIFY_TEST", "Successfully did actionbar things");
        ********************** */
    }

    @DexEdit(target = "onPostCreate")
    protected void onPostCreateOriginal(Bundle bundle) {}

    @SuppressLint("MissingSuperCall")
    @DexAdd
    protected void onPostCreate(Bundle bundle) {
        Log.i("SPOTIFY_TEST", "before onPostCreate");
        onPostCreateOriginal(bundle);
        Log.i("SPOTIFY_TEST", "after onPostCreate");
    }

    @DexAdd
    @Override protected void attachBaseContext(Context newBase) {
        Log.i("SPOTIFY_TEST", "before attachbasecontext");
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
        Log.i("SPOTIFY_TEST", "after attachbasecontext");
    }


    @DexEdit(target = "a")
    public final void aOrig(Fragment var1, String var2) {}
    @DexAdd
    public final void a(Fragment fra, String str) {
        Investigator.log(this, "fragment", fra.getClass().toString());
        aOrig(fra, str);

        //CoordinatorLayout coor = (CoordinatorLayout) this.findViewById(R.id.coordLayout);
        //coor.dispatchApplyWindowInsets()
        /*
        TextView tb_tv = (TextView) this.findViewById(R.id.toolbar_title);
        tb_tv.setText(str);
        */
    }
}