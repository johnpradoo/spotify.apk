package spotify.collection.esperanto.proto;

import com.google.protobuf.C1075c;
import com.spotify.cosmos.util.policy.proto.AlbumCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.AlbumDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.AlbumSyncDecorationPolicy;
import p015p.knh;
import p015p.nqk;

public final class CollectionAlbumDecorationPolicy extends C1075c implements knh {
    public static final int ALBUM_POLICY_FIELD_NUMBER = 7;
    public static final int ALBUM_TYPE_FIELD_NUMBER = 2;
    public static final int ARTISTS_POLICY_FIELD_NUMBER = 4;
    public static final int ARTIST_POLICY_FIELD_NUMBER = 3;
    public static final int COLLECTION_POLICY_FIELD_NUMBER = 5;
    public static final int DECORATED_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final CollectionAlbumDecorationPolicy DEFAULT_INSTANCE;
    private static volatile nqk<CollectionAlbumDecorationPolicy> PARSER = null;
    public static final int SYNC_POLICY_FIELD_NUMBER = 6;
    private AlbumDecorationPolicy albumPolicy_;
    private boolean albumType_;
    private CollectionArtistDecorationPolicy artistPolicy_;
    private CollectionArtistDecorationPolicy artistsPolicy_;
    private AlbumCollectionDecorationPolicy collectionPolicy_;
    private boolean decorated_;
    private AlbumSyncDecorationPolicy syncPolicy_;

    /* renamed from: spotify.collection.esperanto.proto.CollectionAlbumDecorationPolicy$b */
    public static final class C6705b extends C1075c.C1076a implements knh {
        public C6705b(C6704a aVar) {
            super(CollectionAlbumDecorationPolicy.DEFAULT_INSTANCE);
        }
    }

    static {
        CollectionAlbumDecorationPolicy collectionAlbumDecorationPolicy = new CollectionAlbumDecorationPolicy();
        DEFAULT_INSTANCE = collectionAlbumDecorationPolicy;
        Class<CollectionAlbumDecorationPolicy> cls = CollectionAlbumDecorationPolicy.class;
        C1075c.registerDefaultInstance(CollectionAlbumDecorationPolicy.class, collectionAlbumDecorationPolicy);
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
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t", new Object[]{"decorated_", "albumType_", "artistPolicy_", "artistsPolicy_", "collectionPolicy_", "syncPolicy_", "albumPolicy_"});
            case 3:
                return new CollectionAlbumDecorationPolicy();
            case 4:
                return new C6705b((C6704a) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<CollectionAlbumDecorationPolicy> nqk = PARSER;
                if (nqk == null) {
                    Class<CollectionAlbumDecorationPolicy> cls = CollectionAlbumDecorationPolicy.class;
                    synchronized (CollectionAlbumDecorationPolicy.class) {
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
