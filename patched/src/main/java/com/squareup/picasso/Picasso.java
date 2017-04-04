package com.squareup.picasso;

import android.graphics.Color;

import gk.android.investigator.Investigator;
import lanchon.dexpatcher.annotation.*;


@DexEdit(defaultAction = DexAction.IGNORE)
public class Picasso {

    public Picasso() {}

    /** Describes where the image was loaded from.
     *
     */
    /*
    @DexIgnore
    public enum LoadedFrom {
        MEMORY(Color.GREEN),
        DISK(Color.BLUE),
        NETWORK(Color.RED);

        final int debugColor;

        private LoadedFrom(int debugColor) {
            this.debugColor = debugColor;
        }
    }
    */

}
