package com.spotify.music.features.profile.proto;

import p015p.yve;

/* renamed from: com.spotify.music.features.profile.proto.a */
public enum C3943a implements yve.C1774b {
    IMAGE_SIZE_UNSPECIFIED(0),
    IMAGE_SIZE_DEFAULT(1),
    IMAGE_SIZE_SMALL(2),
    IMAGE_SIZE_LARGE(3),
    IMAGE_SIZE_XLARGE(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: a */
    public final int f51148a;

    /* access modifiers changed from: public */
    C3943a(int i) {
        this.f51148a = i;
    }

    /* renamed from: a */
    public static C3943a m34058a(int i) {
        if (i == 0) {
            return IMAGE_SIZE_UNSPECIFIED;
        }
        if (i == 1) {
            return IMAGE_SIZE_DEFAULT;
        }
        if (i == 2) {
            return IMAGE_SIZE_SMALL;
        }
        if (i == 3) {
            return IMAGE_SIZE_LARGE;
        }
        if (i != 4) {
            return null;
        }
        return IMAGE_SIZE_XLARGE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f51148a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
