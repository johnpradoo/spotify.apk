package com.spotify.music.features.ads.p044ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.spotify.music.R;
import java.util.WeakHashMap;
import p015p.d1v;
import p015p.fy5;
import p015p.v1v;

/* renamed from: com.spotify.music.features.ads.ui.OverlayBackgroundView */
public class OverlayBackgroundView extends FrameLayout {

    /* renamed from: a */
    public final GradientDrawable f49976a;

    public OverlayBackgroundView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f49976a = gradientDrawable;
        gradientDrawable.setColor(fy5.m8714b(context, R.color.modal_overlay_background));
        WeakHashMap weakHashMap = v1v.f19764a;
        d1v.m6841q(this, gradientDrawable);
    }

    public void setColor(int i) {
        this.f49976a.setColorFilter(i, PorterDuff.Mode.DST_OVER);
    }

    public void setRadius(float f) {
        this.f49976a.setCornerRadius(f);
    }
}
