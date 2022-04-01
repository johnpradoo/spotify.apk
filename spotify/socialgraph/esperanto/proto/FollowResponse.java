package spotify.socialgraph.esperanto.proto;

import com.google.protobuf.C1075c;
import p015p.knh;
import p015p.nqk;

public final class FollowResponse extends C1075c implements knh {
    /* access modifiers changed from: private */
    public static final FollowResponse DEFAULT_INSTANCE;
    private static volatile nqk<FollowResponse> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private ResponseStatus status_;

    /* renamed from: spotify.socialgraph.esperanto.proto.FollowResponse$b */
    public static final class C6776b extends C1075c.C1076a implements knh {
        public C6776b(C6775a aVar) {
            super(FollowResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        FollowResponse followResponse = new FollowResponse();
        DEFAULT_INSTANCE = followResponse;
        Class<FollowResponse> cls = FollowResponse.class;
        C1075c.registerDefaultInstance(FollowResponse.class, followResponse);
    }

    /* renamed from: p */
    public static FollowResponse m63645p(byte[] bArr) {
        return (FollowResponse) C1075c.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static nqk parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: finally extract failed */
    public final Object dynamicMethod(C1075c.C1080e eVar, Object obj, Object obj2) {
        int i = 3 >> 0;
        switch (eVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"status_"});
            case 3:
                return new FollowResponse();
            case 4:
                return new C6776b((C6775a) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<FollowResponse> nqk = PARSER;
                if (nqk == null) {
                    Class<FollowResponse> cls = FollowResponse.class;
                    synchronized (FollowResponse.class) {
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
    public ResponseStatus mo66839o() {
        ResponseStatus responseStatus = this.status_;
        if (responseStatus == null) {
            responseStatus = ResponseStatus.m63655o();
        }
        return responseStatus;
    }
}
