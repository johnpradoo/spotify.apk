package com.spotify.music.features.profile.follow;

import com.spotify.music.features.profile.follow.FollowState;
import p015p.tff;
import p015p.umw;
import p015p.wz0;

/* renamed from: com.spotify.music.features.profile.follow.$AutoValue_FollowState  reason: invalid class name */
public abstract class C$AutoValue_FollowState extends FollowState {

    /* renamed from: b */
    public final boolean f51086b;

    /* renamed from: c */
    public final boolean f51087c;

    /* renamed from: d */
    public final int f51088d;

    /* renamed from: t */
    public final int f51089t;

    /* renamed from: com.spotify.music.features.profile.follow.$AutoValue_FollowState$b */
    public static final class C3922b extends FollowState.C3924a {

        /* renamed from: a */
        public Boolean f51090a;

        /* renamed from: b */
        public Boolean f51091b;

        /* renamed from: c */
        public Integer f51092c;

        /* renamed from: d */
        public Integer f51093d;

        public C3922b() {
        }

        /* renamed from: a */
        public FollowState mo41994a() {
            String str = this.f51090a == null ? " following" : "";
            if (this.f51091b == null) {
                str = tff.m60686a(str, " dismissed");
            }
            if (this.f51092c == null) {
                str = tff.m60686a(str, " followersCount");
            }
            if (this.f51093d == null) {
                str = tff.m60686a(str, " followingCount");
            }
            if (str.isEmpty()) {
                return new AutoValue_FollowState(this.f51090a.booleanValue(), this.f51091b.booleanValue(), this.f51092c.intValue(), this.f51093d.intValue());
            }
            throw new IllegalStateException(tff.m60686a("Missing required properties:", str));
        }

        /* renamed from: b */
        public FollowState.C3924a mo41995b(boolean z) {
            this.f51091b = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: c */
        public FollowState.C3924a mo41996c(int i) {
            this.f51092c = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public FollowState.C3924a mo41997d(boolean z) {
            this.f51090a = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: e */
        public FollowState.C3924a mo41998e(int i) {
            this.f51093d = Integer.valueOf(i);
            return this;
        }

        public C3922b(FollowState followState, C3921a aVar) {
            C$AutoValue_FollowState _autovalue_followstate = (C$AutoValue_FollowState) followState;
            this.f51090a = Boolean.valueOf(_autovalue_followstate.f51086b);
            this.f51091b = Boolean.valueOf(_autovalue_followstate.f51087c);
            this.f51092c = Integer.valueOf(_autovalue_followstate.f51088d);
            this.f51093d = Integer.valueOf(_autovalue_followstate.f51089t);
        }
    }

    public C$AutoValue_FollowState(boolean z, boolean z2, int i, int i2) {
        this.f51086b = z;
        this.f51087c = z2;
        this.f51088d = i;
        this.f51089t = i2;
    }

    /* renamed from: a */
    public FollowState.C3924a mo41990a() {
        return new C3922b(this, (C3921a) null);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FollowState)) {
            return false;
        }
        FollowState followState = (FollowState) obj;
        FollowState followState2 = followState;
        if (this.f51086b == ((C$AutoValue_FollowState) followState).f51086b) {
            C$AutoValue_FollowState _autovalue_followstate = (C$AutoValue_FollowState) followState;
            if (this.f51087c == _autovalue_followstate.f51087c && this.f51088d == _autovalue_followstate.f51088d && this.f51089t == _autovalue_followstate.f51089t) {
                return z;
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        int i = 1231;
        int i2 = ((this.f51086b ? 1231 : 1237) ^ 1000003) * 1000003;
        if (!this.f51087c) {
            i = 1237;
        }
        return ((((i2 ^ i) * 1000003) ^ this.f51088d) * 1000003) ^ this.f51089t;
    }

    public String toString() {
        StringBuilder a = umw.m61161a("FollowState{following=");
        a.append(this.f51086b);
        a.append(", dismissed=");
        a.append(this.f51087c);
        a.append(", followersCount=");
        a.append(this.f51088d);
        a.append(", followingCount=");
        return wz0.m62153a(a, this.f51089t, "}");
    }
}
