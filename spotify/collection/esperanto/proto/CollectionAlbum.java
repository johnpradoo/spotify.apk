package spotify.collection.esperanto.proto;

import com.google.protobuf.C1075c;
import com.spotify.cosmos.util.proto.AlbumCollectionState;
import com.spotify.cosmos.util.proto.AlbumMetadata;
import com.spotify.cosmos.util.proto.AlbumSyncState;
import p015p.knh;
import p015p.nqk;
import p015p.yve;

public final class CollectionAlbum extends C1075c implements knh {
    public static final int ADD_TIME_FIELD_NUMBER = 1;
    public static final int ALBUM_COLLECTION_STATE_FIELD_NUMBER = 3;
    public static final int ALBUM_METADATA_FIELD_NUMBER = 2;
    public static final int ALBUM_SYNC_STATE_FIELD_NUMBER = 4;
    public static final int ALBUM_TYPE_FIELD_NUMBER = 6;
    public static final int DECORATED_FIELD_NUMBER = 5;
    /* access modifiers changed from: private */
    public static final CollectionAlbum DEFAULT_INSTANCE;
    public static final int LINK_FIELD_NUMBER = 11;
    private static volatile nqk<CollectionAlbum> PARSER = null;
    public static final int TRACK_FIELD_NUMBER = 7;
    private int addTime_;
    private AlbumCollectionState albumCollectionState_;
    private AlbumMetadata albumMetadata_;
    private AlbumSyncState albumSyncState_;
    private String albumType_ = "";
    private boolean decorated_;
    private String link_ = "";
    private yve.C1781h track_ = C1075c.emptyProtobufList();

    /* renamed from: spotify.collection.esperanto.proto.CollectionAlbum$b */
    public static final class C6703b extends C1075c.C1076a implements knh {
        public C6703b(C6702a aVar) {
            super(CollectionAlbum.DEFAULT_INSTANCE);
        }
    }

    static {
        CollectionAlbum collectionAlbum = new CollectionAlbum();
        DEFAULT_INSTANCE = collectionAlbum;
        C1075c.registerDefaultInstance(CollectionAlbum.class, collectionAlbum);
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
                Class<CollectionTrack> cls = CollectionTrack.class;
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\u000b\b\u0000\u0001\u0000\u0001\u000b\u0002\t\u0003\t\u0004\t\u0005\u0007\u0006Ȉ\u0007\u001b\u000bȈ", new Object[]{"addTime_", "albumMetadata_", "albumCollectionState_", "albumSyncState_", "decorated_", "albumType_", "track_", CollectionTrack.class, "link_"});
            case 3:
                return new CollectionAlbum();
            case 4:
                return new C6703b((C6702a) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<CollectionAlbum> nqk = PARSER;
                if (nqk == null) {
                    Class<CollectionAlbum> cls2 = CollectionAlbum.class;
                    synchronized (CollectionAlbum.class) {
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
