package spotify.collection.esperanto.proto;

import com.google.protobuf.C1075c;
import com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackPlayedStateDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackSyncDecorationPolicy;
import java.util.Objects;
import p015p.knh;
import p015p.nqk;

public final class CollectionTrackDecorationPolicy extends C1075c implements knh {
    public static final int ALBUM_POLICY_FIELD_NUMBER = 5;
    public static final int ARTIST_POLICY_FIELD_NUMBER = 6;
    public static final int COLLECTION_POLICY_FIELD_NUMBER = 1;
    public static final int DECORATED_FIELD_NUMBER = 7;
    /* access modifiers changed from: private */
    public static final CollectionTrackDecorationPolicy DEFAULT_INSTANCE;
    private static volatile nqk<CollectionTrackDecorationPolicy> PARSER = null;
    public static final int PLAYED_STATE_POLICY_FIELD_NUMBER = 4;
    public static final int SYNC_POLICY_FIELD_NUMBER = 2;
    public static final int TRACK_POLICY_FIELD_NUMBER = 3;
    private CollectionAlbumDecorationPolicy albumPolicy_;
    private ArtistDecorationPolicy artistPolicy_;
    private TrackCollectionDecorationPolicy collectionPolicy_;
    private boolean decorated_;
    private TrackPlayedStateDecorationPolicy playedStatePolicy_;
    private TrackSyncDecorationPolicy syncPolicy_;
    private TrackDecorationPolicy trackPolicy_;

    /* renamed from: spotify.collection.esperanto.proto.CollectionTrackDecorationPolicy$b */
    public static final class C6721b extends C1075c.C1076a implements knh {
        public C6721b(C6720a aVar) {
            super(CollectionTrackDecorationPolicy.DEFAULT_INSTANCE);
        }
    }

    static {
        CollectionTrackDecorationPolicy collectionTrackDecorationPolicy = new CollectionTrackDecorationPolicy();
        DEFAULT_INSTANCE = collectionTrackDecorationPolicy;
        Class<CollectionTrackDecorationPolicy> cls = CollectionTrackDecorationPolicy.class;
        C1075c.registerDefaultInstance(CollectionTrackDecorationPolicy.class, collectionTrackDecorationPolicy);
    }

    /* renamed from: o */
    public static void m63541o(CollectionTrackDecorationPolicy collectionTrackDecorationPolicy, TrackDecorationPolicy trackDecorationPolicy) {
        Objects.requireNonNull(collectionTrackDecorationPolicy);
        Objects.requireNonNull(trackDecorationPolicy);
        collectionTrackDecorationPolicy.trackPolicy_ = trackDecorationPolicy;
    }

    /* renamed from: p */
    public static C6721b m63542p() {
        return (C6721b) DEFAULT_INSTANCE.createBuilder();
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
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\u0007", new Object[]{"collectionPolicy_", "syncPolicy_", "trackPolicy_", "playedStatePolicy_", "albumPolicy_", "artistPolicy_", "decorated_"});
            case 3:
                return new CollectionTrackDecorationPolicy();
            case 4:
                return new C6721b((C6720a) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<CollectionTrackDecorationPolicy> nqk = PARSER;
                if (nqk == null) {
                    synchronized (CollectionTrackDecorationPolicy.class) {
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
