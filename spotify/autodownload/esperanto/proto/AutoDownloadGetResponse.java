package spotify.autodownload.esperanto.proto;

import com.google.protobuf.C1075c;
import java.util.List;
import p015p.knh;
import p015p.nqk;
import p015p.yve;

public final class AutoDownloadGetResponse extends C1075c implements knh {
    /* access modifiers changed from: private */
    public static final AutoDownloadGetResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 99;
    public static final int GLOBAL_FIELD_NUMBER = 1;
    private static volatile nqk<AutoDownloadGetResponse> PARSER = null;
    public static final int SHOW_FIELD_NUMBER = 2;
    private String error_ = "";
    private AutoDownloadGlobalConfig global_;
    private yve.C1781h show_ = C1075c.emptyProtobufList();

    /* renamed from: spotify.autodownload.esperanto.proto.AutoDownloadGetResponse$b */
    public static final class C6688b extends C1075c.C1076a implements knh {
        public C6688b(C6687a aVar) {
            super(AutoDownloadGetResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        AutoDownloadGetResponse autoDownloadGetResponse = new AutoDownloadGetResponse();
        DEFAULT_INSTANCE = autoDownloadGetResponse;
        Class<AutoDownloadGetResponse> cls = AutoDownloadGetResponse.class;
        C1075c.registerDefaultInstance(AutoDownloadGetResponse.class, autoDownloadGetResponse);
    }

    public static nqk parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* renamed from: r */
    public static AutoDownloadGetResponse m63490r(byte[] bArr) {
        return (AutoDownloadGetResponse) C1075c.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    /* JADX INFO: finally extract failed */
    public final Object dynamicMethod(C1075c.C1080e eVar, Object obj, Object obj2) {
        switch (eVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Class<AutoDownloadShowConfig> cls = AutoDownloadShowConfig.class;
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001c\u0003\u0000\u0001\u0000\u0001\t\u0002\u001bcȈ", new Object[]{"global_", "show_", AutoDownloadShowConfig.class, "error_"});
            case 3:
                return new AutoDownloadGetResponse();
            case 4:
                return new C6688b((C6687a) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<AutoDownloadGetResponse> nqk = PARSER;
                if (nqk == null) {
                    Class<AutoDownloadGetResponse> cls2 = AutoDownloadGetResponse.class;
                    synchronized (AutoDownloadGetResponse.class) {
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
    public String mo66807o() {
        return this.error_;
    }

    /* renamed from: p */
    public AutoDownloadGlobalConfig mo66808p() {
        AutoDownloadGlobalConfig autoDownloadGlobalConfig = this.global_;
        if (autoDownloadGlobalConfig == null) {
            autoDownloadGlobalConfig = AutoDownloadGlobalConfig.m63497q();
        }
        return autoDownloadGlobalConfig;
    }

    /* renamed from: q */
    public List mo66809q() {
        return this.show_;
    }
}
