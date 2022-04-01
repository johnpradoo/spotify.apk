package com.spotify.music.features.settings.adapter.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import p015p.naf;
import p015p.pet;
import p015p.umw;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class ResyncBitratePreference implements naf {
    private final boolean resyncBitrateV2;

    public ResyncBitratePreference(@JsonProperty("audio.resync_bitrate_v2") boolean z) {
        this.resyncBitrateV2 = z;
    }

    public static /* synthetic */ ResyncBitratePreference copy$default(ResyncBitratePreference resyncBitratePreference, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = resyncBitratePreference.resyncBitrateV2;
        }
        return resyncBitratePreference.copy(z);
    }

    public final boolean component1() {
        return this.resyncBitrateV2;
    }

    public final ResyncBitratePreference copy(@JsonProperty("audio.resync_bitrate_v2") boolean z) {
        return new ResyncBitratePreference(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResyncBitratePreference)) {
            return false;
        }
        return this.resyncBitrateV2 == ((ResyncBitratePreference) obj).resyncBitrateV2;
    }

    public final boolean getResyncBitrateV2() {
        return this.resyncBitrateV2;
    }

    public int hashCode() {
        boolean z = this.resyncBitrateV2;
        if (z) {
            z = true;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return pet.m58898a(umw.m61161a("ResyncBitratePreference(resyncBitrateV2="), this.resyncBitrateV2, ')');
    }
}
