import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import lanchon.dexpatcher.annotation.*;

@DexEdit(onlyEditMembers = true)
public final class ijv {

    @DexIgnore
    public ijv() {}
    /*
    @DexEdit(target = "a")
    protected final fjm<?> a2(fit var1) {
        return null;
    }
    @DexAdd
    protected final fjm<?> a(fit var1) {
        fjm finall = a2(var1);
        return finall;
    }
    */
    /*
    @DexEdit(target = "a")
    public final View a3(LayoutInflater var1, ViewGroup var2, Bundle var3) {
        return null;
    }
    @DexAdd
    public final View a(LayoutInflater var1, ViewGroup var2, Bundle var3) {
        return a3(var1, var2, var3);
    }
    */
    /*
    @DexReplace
    public final void X_() {
        ((StickyRecyclerView)((fog)super.ac).b).b.c(0);
    }
    */
}
