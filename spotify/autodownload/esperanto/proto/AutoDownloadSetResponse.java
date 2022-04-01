package spotify.autodownload.esperanto.proto;

import com.google.protobuf.C1075c;
import p015p.knh;
import p015p.nqk;

public final class AutoDownloadSetResponse extends C1075c implements knh {
    /* access modifiers changed from: private */
    public static final AutoDownloadSetResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 99;
    private static volatile nqk<AutoDownloadSetResponse> PARSER;
    private String error_ = "";

    /* renamed from: spotify.autodownload.esperanto.proto.AutoDownloadSetResponse$b */
    public static final class C6695b extends C1075c.C1076a implements knh {
        public C6695b(C6694a aVar) {
            super(AutoDownloadSetResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        AutoDownloadSetResponse autoDownloadSetResponse = new AutoDownloadSetResponse();
        DEFAULT_INSTANCE = autoDownloadSetResponse;
        Class<AutoDownloadSetResponse> cls = AutoDownloadSetResponse.class;
        C1075c.registerDefaultInstance(AutoDownloadSetResponse.class, autoDownloadSetResponse);
    }

    /* renamed from: p */
    public static AutoDownloadSetResponse m63508p(byte[] bArr) {
        return (AutoDownloadSetResponse) C1075c.parseFrom(DEFAULT_INSTANCE, bArr);
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
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000cc\u0001\u0000\u0000\u0000cȈ", new Object[]{"error_"});
            case 3:
                return new AutoDownloadSetResponse();
            case 4:
                return new C6695b((C6694a) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<AutoDownloadSetResponse> nqk = PARSER;
                if (nqk == null) {
                    Class<AutoDownloadSetResponse> cls = AutoDownloadSetResponse.class;
                    synchronized (AutoDownloadSetResponse.class) {
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
    public String mo66814o() {
        return this.error_;
    }
}
