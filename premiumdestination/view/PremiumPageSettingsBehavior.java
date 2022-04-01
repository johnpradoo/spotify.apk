package com.spotify.music.features.premiumdestination.view;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.R;
import p015p.rcl;
import p015p.sw3;

public class PremiumPageSettingsBehavior extends CoordinatorLayout.C0156c {
    /* renamed from: l */
    public void mo1810l(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5) {
        if (view2 instanceof RecyclerView) {
            View view3 = view2;
            int computeVerticalScrollOffset = ((RecyclerView) view2).computeVerticalScrollOffset();
            int d = (sw3.m30692d(view2.getContext(), R.attr.actionBarSize) / 2) + rcl.m29913g(view2.getContext());
            view.setAlpha(1.0f - (((float) Math.min(computeVerticalScrollOffset, d)) / ((float) d)));
        }
    }

    /* renamed from: q */
    public boolean mo1815q(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return view3 instanceof RecyclerView;
    }
}
