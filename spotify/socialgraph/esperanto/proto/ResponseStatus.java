package spotify.socialgraph.esperanto.proto;

import com.google.protobuf.C1075c;
import p015p.knh;
import p015p.nqk;

public final class ResponseStatus extends C1075c implements knh {
    /* access modifiers changed from: private */
    public static final ResponseStatus DEFAULT_INSTANCE;
    private static volatile nqk<ResponseStatus> PARSER = null;
    public static final int REASON_FIELD_NUMBER = 2;
    public static final int STATUS_CODE_FIELD_NUMBER = 1;
    private String reason_ = "";
    private int statusCode_;

    /* renamed from: spotify.socialgraph.esperanto.proto.ResponseStatus$b */
    public static final class C6782b extends C1075c.C1076a implements knh {
        public C6782b(C6781a aVar) {
            super(ResponseStatus.DEFAULT_INSTANCE);
        }
    }

    static {
        ResponseStatus responseStatus = new ResponseStatus();
        DEFAULT_INSTANCE = responseStatus;
        Class<ResponseStatus> cls = ResponseStatus.class;
        C1075c.registerDefaultInstance(ResponseStatus.class, responseStatus);
    }

    /* renamed from: o */
    public static ResponseStatus m63655o() {
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
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002Ȉ", new Object[]{"statusCode_", "reason_"});
            case 3:
                return new ResponseStatus();
            case 4:
                return new C6782b((C6781a) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<ResponseStatus> nqk = PARSER;
                if (nqk == null) {
                    Class<ResponseStatus> cls = ResponseStatus.class;
                    synchronized (ResponseStatus.class) {
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
    public String mo66842p() {
        return this.reason_;
    }

    /* renamed from: q */
    public int mo66843q() {
        return this.statusCode_;
    }
}
