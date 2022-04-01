package com.spotify.music.features.ads.sponsorship.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import p015p.lat;
import p015p.naf;
import p015p.puf;
import p015p.qur;
import p015p.umw;
import p015p.x3s;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class Sponsorship implements naf {
    private final long endTime;
    private final long startTime;
    private final String uri;
    private boolean viewedDuringSession;

    @JsonCreator
    public Sponsorship(@JsonProperty("startTime") long j, @JsonProperty("endTime") long j2, @JsonProperty("spotifyUri") String str) {
        this.startTime = j;
        this.endTime = j2;
        this.uri = str;
    }

    public static /* synthetic */ Sponsorship copy$default(Sponsorship sponsorship, long j, long j2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = sponsorship.startTime;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = sponsorship.endTime;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            str = sponsorship.uri;
        }
        String str2 = str;
        return sponsorship.copy(j3, j4, str);
    }

    public final long component1() {
        return this.startTime;
    }

    public final long component2() {
        return this.endTime;
    }

    public final String component3() {
        return this.uri;
    }

    public final Sponsorship copy(@JsonProperty("startTime") long j, @JsonProperty("endTime") long j2, @JsonProperty("spotifyUri") String str) {
        Sponsorship sponsorship = r0;
        String str2 = str;
        Sponsorship sponsorship2 = new Sponsorship(j, j2, str);
        return sponsorship2;
    }

    public final void displayedDuringSession() {
        this.viewedDuringSession = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sponsorship)) {
            return false;
        }
        Sponsorship sponsorship = (Sponsorship) obj;
        if (this.startTime == sponsorship.startTime && this.endTime == sponsorship.endTime) {
            return lat.m42680e(this.uri, sponsorship.uri);
        }
        return false;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        long j = this.startTime;
        long j2 = this.endTime;
        return this.uri.hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public final boolean isEqual(String str) {
        x3s x = x3s.m49211x(this.uri);
        x3s x2 = x3s.m49211x(str);
        puf puf = x.f82475c;
        puf puf2 = puf.DUMMY;
        boolean z = false;
        if (puf != puf2) {
            puf puf3 = x2.f82475c;
            if (puf3 != puf2) {
                if (puf == puf3 && lat.m42680e(x.mo56166m(), x2.mo56166m())) {
                    z = true;
                }
            }
        }
        return z;
    }

    public String toString() {
        StringBuilder a = umw.m61161a("Sponsorship(startTime=");
        a.append(this.startTime);
        a.append(", endTime=");
        a.append(this.endTime);
        a.append(", uri=");
        return qur.m59591a(a, this.uri, ')');
    }

    public final boolean wasDisplayedDuringSession() {
        return this.viewedDuringSession;
    }
}
