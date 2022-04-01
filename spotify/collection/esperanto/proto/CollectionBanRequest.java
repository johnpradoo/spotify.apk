package spotify.collection.esperanto.proto;

import com.google.protobuf.C1075c;
import p015p.C1424f4;
import p015p.C1638r3;
import p015p.knh;
import p015p.nqk;
import p015p.yve;

public final class CollectionBanRequest extends C1075c implements knh {
    public static final int CONTEXT_SOURCE_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final CollectionBanRequest DEFAULT_INSTANCE;
    private static volatile nqk<CollectionBanRequest> PARSER = null;
    public static final int URI_FIELD_NUMBER = 2;
    private String contextSource_ = "";
    private yve.C1781h uri_ = C1075c.emptyProtobufList();

    /* renamed from: spotify.collection.esperanto.proto.CollectionBanRequest$b */
    public static final class C6711b extends C1075c.C1076a implements knh {
        public C6711b(C6710a aVar) {
            super(CollectionBanRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        CollectionBanRequest collectionBanRequest = new CollectionBanRequest();
        DEFAULT_INSTANCE = collectionBanRequest;
        Class<CollectionBanRequest> cls = CollectionBanRequest.class;
        C1075c.registerDefaultInstance(CollectionBanRequest.class, collectionBanRequest);
    }

    /* renamed from: o */
    public static void m63526o(CollectionBanRequest collectionBanRequest, Iterable iterable) {
        yve.C1781h hVar = collectionBanRequest.uri_;
        if (!((C1424f4) hVar).f9794a) {
            collectionBanRequest.uri_ = C1075c.mutableCopy(hVar);
        }
        C1638r3.addAll(iterable, collectionBanRequest.uri_);
    }

    /* renamed from: p */
    public static C6711b m63527p() {
        return (C6711b) DEFAULT_INSTANCE.createBuilder();
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
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"contextSource_", "uri_"});
            case 3:
                return new CollectionBanRequest();
            case 4:
                return new C6711b((C6710a) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<CollectionBanRequest> nqk = PARSER;
                if (nqk == null) {
                    Class<CollectionBanRequest> cls = CollectionBanRequest.class;
                    synchronized (CollectionBanRequest.class) {
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
