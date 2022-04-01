package spotify.collection.esperanto.proto;

import com.google.protobuf.C1075c;
import p015p.C1424f4;
import p015p.C1638r3;
import p015p.knh;
import p015p.nqk;
import p015p.yve;

public final class CollectionAddRemoveItemsRequest extends C1075c implements knh {
    /* access modifiers changed from: private */
    public static final CollectionAddRemoveItemsRequest DEFAULT_INSTANCE;
    private static volatile nqk<CollectionAddRemoveItemsRequest> PARSER = null;
    public static final int URI_FIELD_NUMBER = 1;
    private yve.C1781h uri_ = C1075c.emptyProtobufList();

    /* renamed from: spotify.collection.esperanto.proto.CollectionAddRemoveItemsRequest$b */
    public static final class C6699b extends C1075c.C1076a implements knh {
        public C6699b(C6698a aVar) {
            super(CollectionAddRemoveItemsRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        CollectionAddRemoveItemsRequest collectionAddRemoveItemsRequest = new CollectionAddRemoveItemsRequest();
        DEFAULT_INSTANCE = collectionAddRemoveItemsRequest;
        Class<CollectionAddRemoveItemsRequest> cls = CollectionAddRemoveItemsRequest.class;
        C1075c.registerDefaultInstance(CollectionAddRemoveItemsRequest.class, collectionAddRemoveItemsRequest);
    }

    /* renamed from: o */
    public static void m63516o(CollectionAddRemoveItemsRequest collectionAddRemoveItemsRequest, Iterable iterable) {
        yve.C1781h hVar = collectionAddRemoveItemsRequest.uri_;
        yve.C1781h hVar2 = hVar;
        if (!((C1424f4) hVar).f9794a) {
            collectionAddRemoveItemsRequest.uri_ = C1075c.mutableCopy(hVar);
        }
        C1638r3.addAll(iterable, collectionAddRemoveItemsRequest.uri_);
    }

    /* renamed from: p */
    public static C6699b m63517p() {
        return (C6699b) DEFAULT_INSTANCE.createBuilder();
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
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"uri_"});
            case 3:
                return new CollectionAddRemoveItemsRequest();
            case 4:
                return new C6699b((C6698a) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<CollectionAddRemoveItemsRequest> nqk = PARSER;
                if (nqk == null) {
                    Class<CollectionAddRemoveItemsRequest> cls = CollectionAddRemoveItemsRequest.class;
                    synchronized (CollectionAddRemoveItemsRequest.class) {
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
