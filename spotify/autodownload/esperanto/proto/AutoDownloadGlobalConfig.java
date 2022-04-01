package spotify.autodownload.esperanto.proto;

import com.google.protobuf.C1075c;
import java.util.Objects;
import p015p.knh;
import p015p.nqk;
import p015p.yve;

public final class AutoDownloadGlobalConfig extends C1075c implements knh {
    /* access modifiers changed from: private */
    public static final AutoDownloadGlobalConfig DEFAULT_INSTANCE;
    public static final int EPISODE_LIMIT_FIELD_NUMBER = 1;
    public static final int EPISODE_NUMBER_LIMIT_FIELD_NUMBER = 2;
    private static volatile nqk<AutoDownloadGlobalConfig> PARSER;
    private int oneOfCase_ = 0;
    private Object oneOf_;

    /* renamed from: spotify.autodownload.esperanto.proto.AutoDownloadGlobalConfig$b */
    public static final class C6690b extends C1075c.C1076a implements knh {
        public C6690b(C6689a aVar) {
            super(AutoDownloadGlobalConfig.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: spotify.autodownload.esperanto.proto.AutoDownloadGlobalConfig$c */
    public enum C6691c implements yve.C1774b {
        NO_LIMIT(0),
        UNRECOGNIZED(-1);
        

        /* renamed from: a */
        public final int f106212a;

        /* access modifiers changed from: public */
        C6691c(int i) {
            this.f106212a = i;
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f106212a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        AutoDownloadGlobalConfig autoDownloadGlobalConfig = new AutoDownloadGlobalConfig();
        DEFAULT_INSTANCE = autoDownloadGlobalConfig;
        Class<AutoDownloadGlobalConfig> cls = AutoDownloadGlobalConfig.class;
        C1075c.registerDefaultInstance(AutoDownloadGlobalConfig.class, autoDownloadGlobalConfig);
    }

    /* renamed from: o */
    public static void m63495o(AutoDownloadGlobalConfig autoDownloadGlobalConfig, C6691c cVar) {
        Objects.requireNonNull(autoDownloadGlobalConfig);
        autoDownloadGlobalConfig.oneOf_ = Integer.valueOf(cVar.getNumber());
        autoDownloadGlobalConfig.oneOfCase_ = 1;
    }

    /* renamed from: p */
    public static void m63496p(AutoDownloadGlobalConfig autoDownloadGlobalConfig, int i) {
        autoDownloadGlobalConfig.oneOfCase_ = 2;
        autoDownloadGlobalConfig.oneOf_ = Integer.valueOf(i);
    }

    public static nqk parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* renamed from: q */
    public static AutoDownloadGlobalConfig m63497q() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: v */
    public static C6690b m63498v() {
        return (C6690b) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: finally extract failed */
    public final Object dynamicMethod(C1075c.C1080e eVar, Object obj, Object obj2) {
        switch (eVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001?\u0000\u00027\u0000", new Object[]{"oneOf_", "oneOfCase_"});
            case 3:
                return new AutoDownloadGlobalConfig();
            case 4:
                return new C6690b((C6689a) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<AutoDownloadGlobalConfig> nqk = PARSER;
                if (nqk == null) {
                    synchronized (AutoDownloadGlobalConfig.class) {
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

    /* renamed from: r */
    public C6691c mo66810r() {
        C6691c cVar = C6691c.NO_LIMIT;
        if (this.oneOfCase_ != 1) {
            return cVar;
        }
        if (((Integer) this.oneOf_).intValue() != 0) {
            cVar = null;
        }
        return cVar == null ? C6691c.UNRECOGNIZED : cVar;
    }

    /* renamed from: s */
    public int mo66811s() {
        if (this.oneOfCase_ == 2) {
            return ((Integer) this.oneOf_).intValue();
        }
        return 0;
    }

    /* renamed from: t */
    public boolean mo66812t() {
        boolean z = true;
        if (this.oneOfCase_ != 1) {
            z = false;
        }
        return z;
    }

    /* renamed from: u */
    public boolean mo66813u() {
        return this.oneOfCase_ == 2;
    }
}
