package spotify.collection.esperanto.proto;

import com.google.protobuf.C1075c;
import com.spotify.cosmos.util.proto.ArtistCollectionState;
import com.spotify.cosmos.util.proto.ArtistMetadata;
import com.spotify.cosmos.util.proto.ArtistSyncState;
import p015p.knh;
import p015p.nqk;
import p015p.yve;

public final class CollectionArtist extends C1075c implements knh {
    public static final int ALBUM_FIELD_NUMBER = 5;
    public static final int ARTIST_COLLECTION_STATE_FIELD_NUMBER = 2;
    public static final int ARTIST_METADATA_FIELD_NUMBER = 1;
    public static final int ARTIST_SYNC_STATE_FIELD_NUMBER = 3;
    public static final int DECORATED_FIELD_NUMBER = 4;
    /* access modifiers changed from: private */
    public static final CollectionArtist DEFAULT_INSTANCE;
    public static final int LINK_FIELD_NUMBER = 6;
    private static volatile nqk<CollectionArtist> PARSER;
    private yve.C1781h album_ = C1075c.emptyProtobufList();
    private ArtistCollectionState artistCollectionState_;
    private ArtistMetadata artistMetadata_;
    private ArtistSyncState artistSyncState_;
    private boolean decorated_;
    private String link_ = "";

    /* renamed from: spotify.collection.esperanto.proto.CollectionArtist$b */
    public static final class C6707b extends C1075c.C1076a implements knh {
        public C6707b(C6706a aVar) {
            super(CollectionArtist.DEFAULT_INSTANCE);
        }
    }

    static {
        CollectionArtist collectionArtist = new CollectionArtist();
        DEFAULT_INSTANCE = collectionArtist;
        Class<CollectionArtist> cls = CollectionArtist.class;
        C1075c.registerDefaultInstance(CollectionArtist.class, collectionArtist);
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
                Class<CollectionAlbum> cls = CollectionAlbum.class;
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\t\u0002\t\u0003\t\u0004\u0007\u0005\u001b\u0006Ȉ", new Object[]{"artistMetadata_", "artistCollectionState_", "artistSyncState_", "decorated_", "album_", CollectionAlbum.class, "link_"});
            case 3:
                return new CollectionArtist();
            case 4:
                return new C6707b((C6706a) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<CollectionArtist> nqk = PARSER;
                if (nqk == null) {
                    Class<CollectionArtist> cls2 = CollectionArtist.class;
                    synchronized (CollectionArtist.class) {
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
