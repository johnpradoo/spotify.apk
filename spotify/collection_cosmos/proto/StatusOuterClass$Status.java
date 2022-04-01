package spotify.collection_cosmos.proto;

import com.google.protobuf.C1075c;
import p015p.knh;
import p015p.nqk;
import p015p.xds;

public final class StatusOuterClass$Status extends C1075c implements knh {
    public static final int CODE_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final StatusOuterClass$Status DEFAULT_INSTANCE;
    private static volatile nqk<StatusOuterClass$Status> PARSER = null;
    public static final int REASON_FIELD_NUMBER = 2;
    private int code_;
    private String reason_ = "";

    /* renamed from: spotify.collection_cosmos.proto.StatusOuterClass$Status$a */
    public static final class C6724a extends C1075c.C1076a implements knh {
        public C6724a(xds xds) {
            super(StatusOuterClass$Status.DEFAULT_INSTANCE);
        }
    }

    static {
        StatusOuterClass$Status statusOuterClass$Status = new StatusOuterClass$Status();
        DEFAULT_INSTANCE = statusOuterClass$Status;
        Class<StatusOuterClass$Status> cls = StatusOuterClass$Status.class;
        C1075c.registerDefaultInstance(StatusOuterClass$Status.class, statusOuterClass$Status);
    }

    /* renamed from: o */
    public static StatusOuterClass$Status m63546o() {
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
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002Ȉ", new Object[]{"code_", "reason_"});
            case 3:
                return new StatusOuterClass$Status();
            case 4:
                return new C6724a((xds) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<StatusOuterClass$Status> nqk = PARSER;
                if (nqk == null) {
                    Class<StatusOuterClass$Status> cls = StatusOuterClass$Status.class;
                    synchronized (StatusOuterClass$Status.class) {
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

    public int getCode() {
        return this.code_;
    }
}
