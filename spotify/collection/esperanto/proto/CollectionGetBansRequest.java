package spotify.collection.esperanto.proto;

import com.google.protobuf.C1075c;
import java.util.Objects;
import p015p.knh;
import p015p.nqk;

public final class CollectionGetBansRequest extends C1075c implements knh {
    public static final int ARTIST_POLICY_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final CollectionGetBansRequest DEFAULT_INSTANCE;
    private static volatile nqk<CollectionGetBansRequest> PARSER = null;
    public static final int SORT_FIELD_NUMBER = 3;
    public static final int TIMESTAMP_FIELD_NUMBER = 4;
    public static final int TRACK_POLICY_FIELD_NUMBER = 1;
    public static final int UPDATE_THROTTLING_FIELD_NUMBER = 5;
    private CollectionArtistDecorationPolicy artistPolicy_;
    private String sort_ = "";
    private boolean timestamp_;
    private CollectionTrackDecorationPolicy trackPolicy_;
    private int updateThrottling_;

    /* renamed from: spotify.collection.esperanto.proto.CollectionGetBansRequest$b */
    public static final class C6715b extends C1075c.C1076a implements knh {
        public C6715b(C6714a aVar) {
            super(CollectionGetBansRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        CollectionGetBansRequest collectionGetBansRequest = new CollectionGetBansRequest();
        DEFAULT_INSTANCE = collectionGetBansRequest;
        Class<CollectionGetBansRequest> cls = CollectionGetBansRequest.class;
        C1075c.registerDefaultInstance(CollectionGetBansRequest.class, collectionGetBansRequest);
    }

    /* renamed from: o */
    public static void m63532o(CollectionGetBansRequest collectionGetBansRequest, CollectionTrackDecorationPolicy collectionTrackDecorationPolicy) {
        Objects.requireNonNull(collectionGetBansRequest);
        Objects.requireNonNull(collectionTrackDecorationPolicy);
        collectionGetBansRequest.trackPolicy_ = collectionTrackDecorationPolicy;
    }

    /* renamed from: p */
    public static C6715b m63533p() {
        return (C6715b) DEFAULT_INSTANCE.createBuilder();
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
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0002\t\u0003Ȉ\u0004\u0007\u0005\u000b", new Object[]{"trackPolicy_", "artistPolicy_", "sort_", "timestamp_", "updateThrottling_"});
            case 3:
                return new CollectionGetBansRequest();
            case 4:
                return new C6715b((C6714a) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<CollectionGetBansRequest> nqk = PARSER;
                if (nqk == null) {
                    Class<CollectionGetBansRequest> cls = CollectionGetBansRequest.class;
                    synchronized (CollectionGetBansRequest.class) {
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
