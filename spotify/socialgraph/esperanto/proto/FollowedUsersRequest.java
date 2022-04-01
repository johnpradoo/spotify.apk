package spotify.socialgraph.esperanto.proto;

import com.google.protobuf.C1075c;
import p015p.knh;
import p015p.nqk;

public final class FollowedUsersRequest extends C1075c implements knh {
    /* access modifiers changed from: private */
    public static final FollowedUsersRequest DEFAULT_INSTANCE;
    public static final int FORCE_RELOAD_FIELD_NUMBER = 1;
    private static volatile nqk<FollowedUsersRequest> PARSER;
    private boolean forceReload_;

    /* renamed from: spotify.socialgraph.esperanto.proto.FollowedUsersRequest$b */
    public static final class C6778b extends C1075c.C1076a implements knh {
        public C6778b(C6777a aVar) {
            super(FollowedUsersRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        FollowedUsersRequest followedUsersRequest = new FollowedUsersRequest();
        DEFAULT_INSTANCE = followedUsersRequest;
        C1075c.registerDefaultInstance(FollowedUsersRequest.class, followedUsersRequest);
    }

    /* renamed from: o */
    public static void m63648o(FollowedUsersRequest followedUsersRequest, boolean z) {
        followedUsersRequest.forceReload_ = z;
    }

    /* renamed from: p */
    public static C6778b m63649p() {
        return (C6778b) DEFAULT_INSTANCE.createBuilder();
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
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"forceReload_"});
            case 3:
                return new FollowedUsersRequest();
            case 4:
                return new C6778b((C6777a) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<FollowedUsersRequest> nqk = PARSER;
                if (nqk == null) {
                    Class<FollowedUsersRequest> cls = FollowedUsersRequest.class;
                    synchronized (FollowedUsersRequest.class) {
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
