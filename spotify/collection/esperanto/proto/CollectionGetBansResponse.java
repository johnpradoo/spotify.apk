package spotify.collection.esperanto.proto;

import com.google.protobuf.C1075c;
import java.util.List;
import p015p.knh;
import p015p.nqk;
import p015p.yve;
import spotify.collection_cosmos.proto.StatusOuterClass$Status;

public final class CollectionGetBansResponse extends C1075c implements knh {
    /* access modifiers changed from: private */
    public static final CollectionGetBansResponse DEFAULT_INSTANCE;
    public static final int ITEM_FIELD_NUMBER = 2;
    private static volatile nqk<CollectionGetBansResponse> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private yve.C1781h item_ = C1075c.emptyProtobufList();
    private StatusOuterClass$Status status_;

    /* renamed from: spotify.collection.esperanto.proto.CollectionGetBansResponse$b */
    public static final class C6717b extends C1075c.C1076a implements knh {
        public C6717b(C6716a aVar) {
            super(CollectionGetBansResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        CollectionGetBansResponse collectionGetBansResponse = new CollectionGetBansResponse();
        DEFAULT_INSTANCE = collectionGetBansResponse;
        C1075c.registerDefaultInstance(CollectionGetBansResponse.class, collectionGetBansResponse);
    }

    /* renamed from: p */
    public static CollectionGetBansResponse m63535p(byte[] bArr) {
        return (CollectionGetBansResponse) C1075c.parseFrom(DEFAULT_INSTANCE, bArr);
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
                Class<Item> cls = Item.class;
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\t\u0002\u001b", new Object[]{"status_", "item_", Item.class});
            case 3:
                return new CollectionGetBansResponse();
            case 4:
                return new C6717b((C6716a) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<CollectionGetBansResponse> nqk = PARSER;
                if (nqk == null) {
                    Class<CollectionGetBansResponse> cls2 = CollectionGetBansResponse.class;
                    synchronized (CollectionGetBansResponse.class) {
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
    public List mo66819o() {
        return this.item_;
    }
}
