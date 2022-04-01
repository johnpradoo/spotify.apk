package com.spotify.music.features.profile.model;

import com.google.common.collect.C0960e;
import java.util.Objects;
import p015p.umw;

/* renamed from: com.spotify.music.features.profile.model.$AutoValue_ProfileListData  reason: invalid class name */
public abstract class C$AutoValue_ProfileListData extends ProfileListData {

    /* renamed from: b */
    public final C3932a f51095b;

    /* renamed from: c */
    public final C0960e f51096c;

    public C$AutoValue_ProfileListData(C3932a aVar, C0960e eVar) {
        Objects.requireNonNull(aVar, "Null loadingState");
        this.f51095b = aVar;
        Objects.requireNonNull(eVar, "Null items");
        this.f51096c = eVar;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileListData)) {
            return false;
        }
        ProfileListData profileListData = (ProfileListData) obj;
        ProfileListData profileListData2 = profileListData;
        if (!this.f51095b.equals(((C$AutoValue_ProfileListData) profileListData).f51095b) || !this.f51096c.equals(((C$AutoValue_ProfileListData) profileListData).f51096c)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.f51095b.hashCode() ^ 1000003) * 1000003) ^ this.f51096c.hashCode();
    }

    public String toString() {
        StringBuilder a = umw.m61161a("ProfileListData{loadingState=");
        a.append(this.f51095b);
        a.append(", items=");
        a.append(this.f51096c);
        a.append("}");
        return a.toString();
    }
}
