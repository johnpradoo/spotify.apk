package spotify.autodownload.esperanto.proto;

import com.google.protobuf.C1075c;
import java.util.Objects;
import p015p.knh;
import p015p.nqk;

public final class AutoDownloadShowConfig extends C1075c implements knh {
    public static final int ACTIVE_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final AutoDownloadShowConfig DEFAULT_INSTANCE;
    private static volatile nqk<AutoDownloadShowConfig> PARSER = null;
    public static final int URI_FIELD_NUMBER = 1;
    private boolean active_;
    private String uri_ = "";

    /* renamed from: spotify.autodownload.esperanto.proto.AutoDownloadShowConfig$b */
    public static final class C6697b extends C1075c.C1076a implements knh {
        public C6697b(C6696a aVar) {
            super(AutoDownloadShowConfig.DEFAULT_INSTANCE);
        }
    }

    static {
        AutoDownloadShowConfig autoDownloadShowConfig = new AutoDownloadShowConfig();
        DEFAULT_INSTANCE = autoDownloadShowConfig;
        Class<AutoDownloadShowConfig> cls = AutoDownloadShowConfig.class;
        C1075c.registerDefaultInstance(AutoDownloadShowConfig.class, autoDownloadShowConfig);
    }

    /* renamed from: o */
    public static void m63511o(AutoDownloadShowConfig autoDownloadShowConfig, String str) {
        Objects.requireNonNull(autoDownloadShowConfig);
        Objects.requireNonNull(str);
        autoDownloadShowConfig.uri_ = str;
    }

    /* renamed from: p */
    public static void m63512p(AutoDownloadShowConfig autoDownloadShowConfig, boolean z) {
        autoDownloadShowConfig.active_ = z;
    }

    public static nqk parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* renamed from: r */
    public static C6697b m63513r() {
        return (C6697b) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: finally extract failed */
    public final Object dynamicMethod(C1075c.C1080e eVar, Object obj, Object obj2) {
        switch (eVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"uri_", "active_"});
            case 3:
                return new AutoDownloadShowConfig();
            case 4:
                return new C6697b((C6696a) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<AutoDownloadShowConfig> nqk = PARSER;
                if (nqk == null) {
                    Class<AutoDownloadShowConfig> cls = AutoDownloadShowConfig.class;
                    synchronized (AutoDownloadShowConfig.class) {
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

    public String getUri() {
        return this.uri_;
    }

    /* renamed from: q */
    public boolean mo66816q() {
        return this.active_;
    }
}
