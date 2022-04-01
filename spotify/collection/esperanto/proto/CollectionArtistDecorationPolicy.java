package spotify.collection.esperanto.proto;

import com.google.protobuf.C1075c;
import com.spotify.cosmos.util.policy.proto.ArtistCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ArtistSyncDecorationPolicy;
import p015p.knh;
import p015p.nqk;

public final class CollectionArtistDecorationPolicy extends C1075c implements knh {
    public static final int ARTIST_POLICY_FIELD_NUMBER = 3;
    public static final int COLLECTION_POLICY_FIELD_NUMBER = 1;
    public static final int DECORATED_FIELD_NUMBER = 4;
    /* access modifiers changed from: private */
    public static final CollectionArtistDecorationPolicy DEFAULT_INSTANCE;
    private static volatile nqk<CollectionArtistDecorationPolicy> PARSER = null;
    public static final int SYNC_POLICY_FIELD_NUMBER = 2;
    private ArtistDecorationPolicy artistPolicy_;
    private ArtistCollectionDecorationPolicy collectionPolicy_;
    private boolean decorated_;
    private ArtistSyncDecorationPolicy syncPolicy_;

    /* renamed from: spotify.collection.esperanto.proto.CollectionArtistDecorationPolicy$b */
    public static final class C6709b extends C1075c.C1076a implements knh {
        public C6709b(C6708a aVar) {
            super(CollectionArtistDecorationPolicy.DEFAULT_INSTANCE);
        }
    }

    static {
        CollectionArtistDecorationPolicy collectionArtistDecorationPolicy = new CollectionArtistDecorationPolicy();
        DEFAULT_INSTANCE = collectionArtistDecorationPolicy;
        Class<CollectionArtistDecorationPolicy> cls = CollectionArtistDecorationPolicy.class;
        C1075c.registerDefaultInstance(CollectionArtistDecorationPolicy.class, collectionArtistDecorationPolicy);
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
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\u0007", new Object[]{"collectionPolicy_", "syncPolicy_", "artistPolicy_", "decorated_"});
            case 3:
                return new CollectionArtistDecorationPolicy();
            case 4:
                return new C6709b((C6708a) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<CollectionArtistDecorationPolicy> nqk = PARSER;
                if (nqk == null) {
                    Class<CollectionArtistDecorationPolicy> cls = CollectionArtistDecorationPolicy.class;
                    synchronized (CollectionArtistDecorationPolicy.class) {
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
