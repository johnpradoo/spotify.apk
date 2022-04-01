package com.spotify.music.features.ads.audioplus.video;

import java.util.Objects;
import p015p.umw;
import p015p.wz0;

/* renamed from: com.spotify.music.features.ads.audioplus.video.$AutoValue_VideoConfiguration  reason: invalid class name */
public abstract class C$AutoValue_VideoConfiguration extends VideoConfiguration {

    /* renamed from: a */
    public final String f49965a;

    /* renamed from: b */
    public final String f49966b;

    /* renamed from: c */
    public final int f49967c;

    public C$AutoValue_VideoConfiguration(String str, String str2, int i) {
        Objects.requireNonNull(str, "Null manifestUrlTemplate");
        this.f49965a = str;
        Objects.requireNonNull(str2, "Null licenseUrl");
        this.f49966b = str2;
        this.f49967c = i;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoConfiguration)) {
            return false;
        }
        VideoConfiguration videoConfiguration = (VideoConfiguration) obj;
        VideoConfiguration videoConfiguration2 = videoConfiguration;
        if (this.f49965a.equals(((C$AutoValue_VideoConfiguration) videoConfiguration).f49965a)) {
            C$AutoValue_VideoConfiguration _autovalue_videoconfiguration = (C$AutoValue_VideoConfiguration) videoConfiguration;
            if (this.f49966b.equals(_autovalue_videoconfiguration.f49966b) && this.f49967c == _autovalue_videoconfiguration.f49967c) {
                return z;
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        return ((((this.f49965a.hashCode() ^ 1000003) * 1000003) ^ this.f49966b.hashCode()) * 1000003) ^ this.f49967c;
    }

    public String toString() {
        StringBuilder a = umw.m61161a("VideoConfiguration{manifestUrlTemplate=");
        a.append(this.f49965a);
        a.append(", licenseUrl=");
        a.append(this.f49966b);
        a.append(", videoCdnSampling=");
        return wz0.m62153a(a, this.f49967c, "}");
    }
}
