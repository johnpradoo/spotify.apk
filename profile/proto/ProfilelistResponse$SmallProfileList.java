package com.spotify.music.features.profile.proto;

import com.google.protobuf.C1075c;
import java.util.List;
import p015p.knh;
import p015p.nqk;
import p015p.qfn;
import p015p.yve;

public final class ProfilelistResponse$SmallProfileList extends C1075c implements knh {
    /* access modifiers changed from: private */
    public static final ProfilelistResponse$SmallProfileList DEFAULT_INSTANCE;
    private static volatile nqk<ProfilelistResponse$SmallProfileList> PARSER = null;
    public static final int PROFILES_FIELD_NUMBER = 1;
    private yve.C1781h profiles_ = C1075c.emptyProtobufList();

    /* renamed from: com.spotify.music.features.profile.proto.ProfilelistResponse$SmallProfileList$a */
    public static final class C3939a extends C1075c.C1076a implements knh {
        public C3939a(qfn qfn) {
            super(ProfilelistResponse$SmallProfileList.DEFAULT_INSTANCE);
        }
    }

    static {
        ProfilelistResponse$SmallProfileList profilelistResponse$SmallProfileList = new ProfilelistResponse$SmallProfileList();
        DEFAULT_INSTANCE = profilelistResponse$SmallProfileList;
        Class<ProfilelistResponse$SmallProfileList> cls = ProfilelistResponse$SmallProfileList.class;
        C1075c.registerDefaultInstance(ProfilelistResponse$SmallProfileList.class, profilelistResponse$SmallProfileList);
    }

    /* renamed from: o */
    public static ProfilelistResponse$SmallProfileList m34035o() {
        return DEFAULT_INSTANCE;
    }

    public static nqk parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: finally extract failed */
    public final Object dynamicMethod(C1075c.C1080e eVar, Object obj, Object obj2) {
        switch (eVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Class<ProfilelistResponse$SmallProfile> cls = ProfilelistResponse$SmallProfile.class;
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"profiles_", ProfilelistResponse$SmallProfile.class});
            case 3:
                return new ProfilelistResponse$SmallProfileList();
            case 4:
                return new C3939a((qfn) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<ProfilelistResponse$SmallProfileList> nqk = PARSER;
                if (nqk == null) {
                    synchronized (ProfilelistResponse$SmallProfileList.class) {
                        try {
                            nqk = PARSER;
                            if (nqk == null) {
                                nqk = new C1075c.C1077b(DEFAULT_INSTANCE);
                                PARSER = nqk;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return nqk;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: p */
    public List mo42044p() {
        return this.profiles_;
    }
}
