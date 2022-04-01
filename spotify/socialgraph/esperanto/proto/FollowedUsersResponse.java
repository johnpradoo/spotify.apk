package spotify.socialgraph.esperanto.proto;

import com.google.protobuf.C1075c;
import java.util.List;
import p015p.knh;
import p015p.nqk;
import p015p.yve;

public final class FollowedUsersResponse extends C1075c implements knh {
    /* access modifiers changed from: private */
    public static final FollowedUsersResponse DEFAULT_INSTANCE;
    private static volatile nqk<FollowedUsersResponse> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int USERS_FIELD_NUMBER = 2;
    private ResponseStatus status_;
    private yve.C1781h users_ = C1075c.emptyProtobufList();

    /* renamed from: spotify.socialgraph.esperanto.proto.FollowedUsersResponse$b */
    public static final class C6780b extends C1075c.C1076a implements knh {
        public C6780b(C6779a aVar) {
            super(FollowedUsersResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        FollowedUsersResponse followedUsersResponse = new FollowedUsersResponse();
        DEFAULT_INSTANCE = followedUsersResponse;
        Class<FollowedUsersResponse> cls = FollowedUsersResponse.class;
        C1075c.registerDefaultInstance(FollowedUsersResponse.class, followedUsersResponse);
    }

    public static nqk parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* renamed from: q */
    public static FollowedUsersResponse m63651q(byte[] bArr) {
        return (FollowedUsersResponse) C1075c.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    /* JADX INFO: finally extract failed */
    public final Object dynamicMethod(C1075c.C1080e eVar, Object obj, Object obj2) {
        switch (eVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\t\u0002Ț", new Object[]{"status_", "users_"});
            case 3:
                return new FollowedUsersResponse();
            case 4:
                return new C6780b((C6779a) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<FollowedUsersResponse> nqk = PARSER;
                if (nqk == null) {
                    Class<FollowedUsersResponse> cls = FollowedUsersResponse.class;
                    synchronized (FollowedUsersResponse.class) {
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

    /* renamed from: o */
    public ResponseStatus mo66840o() {
        ResponseStatus responseStatus = this.status_;
        if (responseStatus == null) {
            responseStatus = ResponseStatus.m63655o();
        }
        return responseStatus;
    }

    /* renamed from: p */
    public List mo66841p() {
        return this.users_;
    }
}
