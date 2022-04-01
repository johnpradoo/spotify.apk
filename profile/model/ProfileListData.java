package com.spotify.music.features.profile.model;

import android.os.Parcelable;
import com.google.common.collect.C0960e;
import java.util.Objects;
import p015p.C1788z2;
import p015p.obo;

public abstract class ProfileListData implements Parcelable {

    /* renamed from: a */
    public static final ProfileListData f51116a;

    /* renamed from: com.spotify.music.features.profile.model.ProfileListData$a */
    public static class C3929a {
    }

    static {
        C3932a aVar = C3932a.NOT_LOADED;
        Objects.requireNonNull(aVar, "Null loadingState");
        C1788z2 z2Var = C0960e.f5857b;
        C0960e eVar = obo.f15534t;
        Objects.requireNonNull(eVar, "Null items");
        f51116a = new AutoValue_ProfileListData(aVar, eVar);
    }
}
