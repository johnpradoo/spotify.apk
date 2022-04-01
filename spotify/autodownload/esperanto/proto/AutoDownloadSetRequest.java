package spotify.autodownload.esperanto.proto;

import com.google.protobuf.C1075c;
import java.util.Objects;
import p015p.knh;
import p015p.nqk;

public final class AutoDownloadSetRequest extends C1075c implements knh {
    /* access modifiers changed from: private */
    public static final AutoDownloadSetRequest DEFAULT_INSTANCE;
    public static final int GLOBAL_FIELD_NUMBER = 1;
    private static volatile nqk<AutoDownloadSetRequest> PARSER = null;
    public static final int SHOW_FIELD_NUMBER = 2;
    private int configCase_ = 0;
    private Object config_;

    /* renamed from: spotify.autodownload.esperanto.proto.AutoDownloadSetRequest$b */
    public static final class C6693b extends C1075c.C1076a implements knh {
        public C6693b(C6692a aVar) {
            super(AutoDownloadSetRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        AutoDownloadSetRequest autoDownloadSetRequest = new AutoDownloadSetRequest();
        DEFAULT_INSTANCE = autoDownloadSetRequest;
        Class<AutoDownloadSetRequest> cls = AutoDownloadSetRequest.class;
        C1075c.registerDefaultInstance(AutoDownloadSetRequest.class, autoDownloadSetRequest);
    }

    /* renamed from: o */
    public static void m63504o(AutoDownloadSetRequest autoDownloadSetRequest, AutoDownloadGlobalConfig autoDownloadGlobalConfig) {
        Objects.requireNonNull(autoDownloadSetRequest);
        Objects.requireNonNull(autoDownloadGlobalConfig);
        autoDownloadSetRequest.config_ = autoDownloadGlobalConfig;
        autoDownloadSetRequest.configCase_ = 1;
    }

    /* renamed from: p */
    public static void m63505p(AutoDownloadSetRequest autoDownloadSetRequest, AutoDownloadShowConfig autoDownloadShowConfig) {
        Objects.requireNonNull(autoDownloadSetRequest);
        Objects.requireNonNull(autoDownloadShowConfig);
        autoDownloadSetRequest.config_ = autoDownloadShowConfig;
        boolean z = true | true;
        autoDownloadSetRequest.configCase_ = 2;
    }

    public static nqk parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* renamed from: q */
    public static C6693b m63506q() {
        return (C6693b) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: finally extract failed */
    public final Object dynamicMethod(C1075c.C1080e eVar, Object obj, Object obj2) {
        switch (eVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Class<AutoDownloadGlobalConfig> cls = AutoDownloadGlobalConfig.class;
                Class<AutoDownloadShowConfig> cls2 = AutoDownloadShowConfig.class;
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"config_", "configCase_", AutoDownloadGlobalConfig.class, AutoDownloadShowConfig.class});
            case 3:
                return new AutoDownloadSetRequest();
            case 4:
                return new C6693b((C6692a) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<AutoDownloadSetRequest> nqk = PARSER;
                if (nqk == null) {
                    synchronized (AutoDownloadSetRequest.class) {
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
