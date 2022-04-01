package com.spotify.music.features.profile.model;

import android.os.Parcelable;

public abstract class ProfileListItem implements Parcelable {

    /* renamed from: com.spotify.music.features.profile.model.ProfileListItem$a */
    public static abstract class C3930a {
        /* renamed from: a */
        public abstract ProfileListItem mo42009a();

        /* renamed from: b */
        public abstract C3930a mo42010b(String str);

        /* renamed from: c */
        public abstract C3930a mo42011c(String str);

        /* renamed from: d */
        public abstract C3930a mo42012d(String str);
    }

    /* renamed from: com.spotify.music.features.profile.model.ProfileListItem$b */
    public enum C3931b {
        PROFILE,
        ARTIST,
        TOP_ARTIST,
        PLAYLIST,
        EPISODE,
        UNKNOWN
    }
}
