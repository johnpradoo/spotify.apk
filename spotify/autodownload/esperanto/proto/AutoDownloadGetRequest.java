package spotify.autodownload.esperanto.proto;

import com.google.protobuf.C1075c;
import java.util.Objects;
import p015p.C1424f4;
import p015p.knh;
import p015p.nqk;
import p015p.yve;

public final class AutoDownloadGetRequest extends C1075c implements knh {
    /* access modifiers changed from: private */
    public static final AutoDownloadGetRequest DEFAULT_INSTANCE;
    private static volatile nqk<AutoDownloadGetRequest> PARSER = null;
    public static final int URI_FIELD_NUMBER = 1;
    private yve.C1781h uri_ = C1075c.emptyProtobufList();

    /* renamed from: spotify.autodownload.esperanto.proto.AutoDownloadGetRequest$b */
    public static final class C6686b extends C1075c.C1076a implements knh {
        public C6686b(C6685a aVar) {
            super(AutoDownloadGetRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        AutoDownloadGetRequest autoDownloadGetRequest = new AutoDownloadGetRequest();
        DEFAULT_INSTANCE = autoDownloadGetRequest;
        Class<AutoDownloadGetRequest> cls = AutoDownloadGetRequest.class;
        C1075c.registerDefaultInstance(AutoDownloadGetRequest.class, autoDownloadGetRequest);
    }

    /* renamed from: o */
    public static void m63486o(AutoDownloadGetRequest autoDownloadGetRequest, String str) {
        Objects.requireNonNull(autoDownloadGetRequest);
        Objects.requireNonNull(str);
        yve.C1781h hVar = autoDownloadGetRequest.uri_;
        yve.C1781h hVar2 = hVar;
        if (!((C1424f4) hVar).f9794a) {
            autoDownloadGetRequest.uri_ = C1075c.mutableCopy(hVar);
        }
        autoDownloadGetRequest.uri_.add(str);
    }

    /* renamed from: p */
    public static AutoDownloadGetRequest m63487p() {
        return DEFAULT_INSTANCE;
    }

    public static nqk parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* renamed from: q */
    public static C6686b m63488q() {
        return (C6686b) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: finally extract failed */
    public final Object dynamicMethod(C1075c.C1080e eVar, Object obj, Object obj2) {
        switch (eVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"uri_"});
            case 3:
                return new AutoDownloadGetRequest();
            case 4:
                return new C6686b((C6685a) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<AutoDownloadGetRequest> nqk = PARSER;
                if (nqk == null) {
                    Class<AutoDownloadGetRequest> cls = AutoDownloadGetRequest.class;
                    synchronized (AutoDownloadGetRequest.class) {
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
