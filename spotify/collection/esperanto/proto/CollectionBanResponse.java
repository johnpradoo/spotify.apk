package spotify.collection.esperanto.proto;

import com.google.protobuf.C1075c;
import p015p.knh;
import p015p.nqk;
import p015p.yve;
import spotify.collection_cosmos.proto.StatusOuterClass$Status;

public final class CollectionBanResponse extends C1075c implements knh {
    /* access modifiers changed from: private */
    public static final CollectionBanResponse DEFAULT_INSTANCE;
    private static volatile nqk<CollectionBanResponse> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int SUCCESS_FIELD_NUMBER = 2;
    private StatusOuterClass$Status status_;
    private int successMemoizedSerializedSize = -1;
    private yve.C1773a success_ = C1075c.emptyBooleanList();

    /* renamed from: spotify.collection.esperanto.proto.CollectionBanResponse$b */
    public static final class C6713b extends C1075c.C1076a implements knh {
        public C6713b(C6712a aVar) {
            super(CollectionBanResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        CollectionBanResponse collectionBanResponse = new CollectionBanResponse();
        DEFAULT_INSTANCE = collectionBanResponse;
        Class<CollectionBanResponse> cls = CollectionBanResponse.class;
        C1075c.registerDefaultInstance(CollectionBanResponse.class, collectionBanResponse);
    }

    /* renamed from: p */
    public static CollectionBanResponse m63529p(byte[] bArr) {
        return (CollectionBanResponse) C1075c.parseFrom(DEFAULT_INSTANCE, bArr);
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
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\t\u0002*", new Object[]{"status_", "success_"});
            case 3:
                return new CollectionBanResponse();
            case 4:
                return new C6713b((C6712a) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<CollectionBanResponse> nqk = PARSER;
                if (nqk == null) {
                    Class<CollectionBanResponse> cls = CollectionBanResponse.class;
                    synchronized (CollectionBanResponse.class) {
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
    public StatusOuterClass$Status mo66818o() {
        StatusOuterClass$Status statusOuterClass$Status = this.status_;
        if (statusOuterClass$Status == null) {
            statusOuterClass$Status = StatusOuterClass$Status.m63546o();
        }
        return statusOuterClass$Status;
    }
}
