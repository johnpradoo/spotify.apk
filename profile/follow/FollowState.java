package com.spotify.music.features.profile.follow;

import android.os.Parcelable;
import com.spotify.music.features.profile.follow.C$AutoValue_FollowState;

public abstract class FollowState implements Parcelable {

    /* renamed from: a */
    public static final FollowState f51094a;

    /* renamed from: com.spotify.music.features.profile.follow.FollowState$a */
    public static abstract class C3924a {
        /* renamed from: a */
        public abstract FollowState mo41994a();

        /* renamed from: b */
        public abstract C3924a mo41995b(boolean z);

        /* renamed from: c */
        public abstract C3924a mo41996c(int i);

        /* renamed from: d */
        public abstract C3924a mo41997d(boolean z);

        /* renamed from: e */
        public abstract C3924a mo41998e(int i);
    }

    static {
        C$AutoValue_FollowState.C3922b bVar = new C$AutoValue_FollowState.C3922b();
        bVar.mo41997d(false);
        bVar.mo41995b(false);
        bVar.mo41996c(0);
        bVar.mo41998e(0);
        f51094a = bVar.mo41994a();
    }

    /* renamed from: a */
    public abstract C3924a mo41990a();
}
