package spotify.collection.esperanto.proto;

import com.google.protobuf.C1075c;
import com.spotify.cosmos.util.proto.TrackCollectionState;
import com.spotify.cosmos.util.proto.TrackMetadata;
import com.spotify.cosmos.util.proto.TrackPlayState;
import com.spotify.cosmos.util.proto.TrackSyncState;
import p015p.knh;
import p015p.nqk;

public final class CollectionTrack extends C1075c implements knh {
    public static final int ADD_TIME_FIELD_NUMBER = 2;
    public static final int ALBUM_FIELD_NUMBER = 8;
    public static final int COVER_FIELD_NUMBER = 9;
    public static final int DECORATED_FIELD_NUMBER = 7;
    /* access modifiers changed from: private */
    public static final CollectionTrack DEFAULT_INSTANCE;
    public static final int INDEX_FIELD_NUMBER = 1;
    public static final int LINK_FIELD_NUMBER = 10;
    private static volatile nqk<CollectionTrack> PARSER = null;
    public static final int TRACK_COLLECTION_STATE_FIELD_NUMBER = 4;
    public static final int TRACK_METADATA_FIELD_NUMBER = 3;
    public static final int TRACK_PLAY_STATE_FIELD_NUMBER = 5;
    public static final int TRACK_SYNC_STATE_FIELD_NUMBER = 6;
    private int addTime_;
    private CollectionAlbum album_;
    private String cover_ = "";
    private boolean decorated_;
    private int index_;
    private String link_ = "";
    private TrackCollectionState trackCollectionState_;
    private TrackMetadata trackMetadata_;
    private TrackPlayState trackPlayState_;
    private TrackSyncState trackSyncState_;

    /* renamed from: spotify.collection.esperanto.proto.CollectionTrack$b */
    public static final class C6719b extends C1075c.C1076a implements knh {
        public C6719b(C6718a aVar) {
            super(CollectionTrack.DEFAULT_INSTANCE);
        }
    }

    static {
        CollectionTrack collectionTrack = new CollectionTrack();
        DEFAULT_INSTANCE = collectionTrack;
        Class<CollectionTrack> cls = CollectionTrack.class;
        C1075c.registerDefaultInstance(CollectionTrack.class, collectionTrack);
    }

    /* renamed from: o */
    public static CollectionTrack m63538o() {
        return DEFAULT_INSTANCE;
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
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\t\u0004\t\u0005\t\u0006\t\u0007\u0007\b\t\tȈ\nȈ", new Object[]{"index_", "addTime_", "trackMetadata_", "trackCollectionState_", "trackPlayState_", "trackSyncState_", "decorated_", "album_", "cover_", "link_"});
            case 3:
                return new CollectionTrack();
            case 4:
                return new C6719b((C6718a) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<CollectionTrack> nqk = PARSER;
                if (nqk == null) {
                    Class<CollectionTrack> cls = CollectionTrack.class;
                    synchronized (CollectionTrack.class) {
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

    /* renamed from: p */
    public TrackMetadata mo66820p() {
        TrackMetadata trackMetadata = this.trackMetadata_;
        if (trackMetadata == null) {
            trackMetadata = TrackMetadata.getDefaultInstance();
        }
        return trackMetadata;
    }
}
