package spotify.playlist.esperanto.proto;

import p015p.yve;

/* renamed from: spotify.playlist.esperanto.proto.b */
public enum C6772b implements yve.C1774b {
    NO_RESTRICTION(0),
    RESTRICT_SOURCE_TO_50(1),
    RESTRICT_SOURCE_TO_500(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: a */
    public final int f106252a;

    /* access modifiers changed from: public */
    C6772b(int i) {
        this.f106252a = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f106252a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
