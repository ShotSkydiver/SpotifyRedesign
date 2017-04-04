package com.spotify.mobile.android.service;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

import com.shotskydiver.spotify.R;

import gk.android.investigator.Investigator;
import lanchon.dexpatcher.annotation.*;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

@DexEdit(onlyEditMembers = true)
public class LoginActivity extends Activity {

    @DexIgnore
    public LoginActivity() {}

    @DexEdit(target = "onCreate")
    protected void onCreateOriginal(Bundle bundle) {}
    @SuppressLint("MissingSuperCall")
    @DexAdd
    protected void onCreate(Bundle bundle) {
        Log.i("SPOTIFY_TEST", "before login onCreate");
        onCreateOriginal(bundle);
        Log.i("SPOTIFY_TEST", "after login onCreate");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Log.i("SPOTIFY_TEST", "login: Setting status and nav bar colors");
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            //window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_SECURE);

            window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

            window.setBackgroundDrawable(getResources().getDrawable(R.drawable.bg_gradient_white));

            window.getDecorView().setSystemUiVisibility(0);

            // window.setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

            //window.setStatusBarColor(getResources().getColor(R.color.solitude));
            //window.setStatusBarColor(Color.TRANSPARENT);

            Log.i("SPOTIFY_TEST", "login: Success setting system bar colors");
        }
    }

}
