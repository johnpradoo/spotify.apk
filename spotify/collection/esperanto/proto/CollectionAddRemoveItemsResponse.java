package spotify.collection.esperanto.proto;

import com.google.protobuf.C1075c;
import p015p.knh;
import p015p.nqk;
import spotify.collection_cosmos.proto.StatusOuterClass$Status;

public final class CollectionAddRemoveItemsResponse extends C1075c implements knh {
    /* access modifiers changed from: private */
    public static final CollectionAddRemoveItemsResponse DEFAULT_INSTANCE;
    private static volatile nqk<CollectionAddRemoveItemsResponse> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private StatusOuterClass$Status status_;

    /* renamed from: spotify.collection.esperanto.proto.CollectionAddRemoveItemsResponse$b */
    public static final class C6701b extends C1075c.C1076a implements knh {
        public C6701b(C6700a aVar) {
            super(CollectionAddRemoveItemsResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        CollectionAddRemoveItemsResponse collectionAddRemoveItemsResponse = new CollectionAddRemoveItemsResponse();
        DEFAULT_INSTANCE = collectionAddRemoveItemsResponse;
        Class<CollectionAddRemoveItemsResponse> cls = CollectionAddRemoveItemsResponse.class;
        C1075c.registerDefaultInstance(CollectionAddRemoveItemsResponse.class, collectionAddRemoveItemsResponse);
    }

    /* renamed from: p */
    public static CollectionAddRemoveItemsResponse m63519p(byte[] bArr) {
        return (CollectionAddRemoveItemsResponse) C1075c.parseFrom(DEFAULT_INSTANCE, bArr);
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
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"status_"});
            case 3:
                return new CollectionAddRemoveItemsResponse();
            case 4:
                return new C6701b((C6700a) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<CollectionAddRemoveItemsResponse> nqk = PARSER;
                if (nqk == null) {
                    Class<CollectionAddRemoveItemsResponse> cls = CollectionAddRemoveItemsResponse.class;
                    synchronized (CollectionAddRemoveItemsResponse.class) {
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
    public StatusOuterClass$Status mo66817o() {
        StatusOuterClass$Status statusOuterClass$Status = this.status_;
        if (statusOuterClass$Status == null) {
            statusOuterClass$Status = StatusOuterClass$Status.m63546o();
        }
        return statusOuterClass$Status;
    }
}
