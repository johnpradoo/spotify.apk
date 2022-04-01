package spotify.playlist.esperanto.proto;

import p015p.yve;

/* renamed from: spotify.playlist.esperanto.proto.a */
public enum C6771a implements yve.C1774b {
    NONE(0),
    SET_AS_AVAILABLE_OFFLINE(1),
    REMOVE_AS_AVAILABLE_OFFLINE(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: a */
    public final int f106246a;

    /* access modifiers changed from: public */
    C6771a(int i) {
        this.f106246a = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f106246a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
