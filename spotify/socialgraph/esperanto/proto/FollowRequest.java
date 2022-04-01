package spotify.socialgraph.esperanto.proto;

import com.google.protobuf.C1075c;
import java.util.Objects;
import p015p.C1424f4;
import p015p.knh;
import p015p.nqk;
import p015p.yve;

public final class FollowRequest extends C1075c implements knh {
    /* access modifiers changed from: private */
    public static final FollowRequest DEFAULT_INSTANCE;
    public static final int FOLLOW_FIELD_NUMBER = 2;
    private static volatile nqk<FollowRequest> PARSER = null;
    public static final int USERNAME_FIELD_NUMBER = 1;
    private boolean follow_;
    private yve.C1781h username_ = C1075c.emptyProtobufList();

    /* renamed from: spotify.socialgraph.esperanto.proto.FollowRequest$b */
    public static final class C6774b extends C1075c.C1076a implements knh {
        public C6774b(C6773a aVar) {
            super(FollowRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        FollowRequest followRequest = new FollowRequest();
        DEFAULT_INSTANCE = followRequest;
        Class<FollowRequest> cls = FollowRequest.class;
        C1075c.registerDefaultInstance(FollowRequest.class, followRequest);
    }

    /* renamed from: o */
    public static void m63641o(FollowRequest followRequest, String str) {
        Objects.requireNonNull(followRequest);
        Objects.requireNonNull(str);
        yve.C1781h hVar = followRequest.username_;
        yve.C1781h hVar2 = hVar;
        if (!((C1424f4) hVar).f9794a) {
            followRequest.username_ = C1075c.mutableCopy(hVar);
        }
        followRequest.username_.add(str);
    }

    /* renamed from: p */
    public static void m63642p(FollowRequest followRequest, boolean z) {
        followRequest.follow_ = z;
    }

    public static nqk parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* renamed from: q */
    public static C6774b m63643q() {
        return (C6774b) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: finally extract failed */
    public final Object dynamicMethod(C1075c.C1080e eVar, Object obj, Object obj2) {
        switch (eVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002\u0007", new Object[]{"username_", "follow_"});
            case 3:
                return new FollowRequest();
            case 4:
                return new C6774b((C6773a) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<FollowRequest> nqk = PARSER;
                if (nqk == null) {
                    Class<FollowRequest> cls = FollowRequest.class;
                    synchronized (FollowRequest.class) {
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
}
