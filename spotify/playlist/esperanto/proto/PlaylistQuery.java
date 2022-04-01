package spotify.playlist.esperanto.proto;

import com.google.protobuf.C1075c;
import java.util.Objects;
import p015p.C1424f4;
import p015p.knh;
import p015p.nqk;
import p015p.yve;
import p015p.zse;

public final class PlaylistQuery extends C1075c implements knh {
    public static final int ALWAYS_SHOW_WINDOWED_FIELD_NUMBER = 9;
    public static final int BOOL_PREDICATES_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final PlaylistQuery DEFAULT_INSTANCE;
    public static final int GROUP_FIELD_NUMBER = 6;
    public static final int LOAD_RECOMMENDATIONS_FIELD_NUMBER = 10;
    private static volatile nqk<PlaylistQuery> PARSER = null;
    public static final int RANGE_FIELD_NUMBER = 4;
    public static final int SHOW_UNAVAILABLE_FIELD_NUMBER = 8;
    public static final int SORT_BY_FIELD_NUMBER = 3;
    public static final int SOURCE_RESTRICTION_FIELD_NUMBER = 7;
    public static final int TEXT_FILTER_FIELD_NUMBER = 2;
    public static final int UPDATE_THROTTLING_MS_FIELD_NUMBER = 5;
    private static final yve.C1778f.C1779a<Integer, C6752b> boolPredicates_converter_ = new C6751a();
    private boolean alwaysShowWindowed_;
    private int boolPredicatesMemoizedSerializedSize;
    private yve.C1777e boolPredicates_ = C1075c.emptyIntList();
    private boolean group_;
    private boolean loadRecommendations_;
    private PlaylistRange range_;
    private boolean showUnavailable_;
    private int sortBy_;
    private int sourceRestriction_;
    private String textFilter_ = "";
    private int updateThrottlingMs_;

    /* renamed from: spotify.playlist.esperanto.proto.PlaylistQuery$a */
    public static class C6751a implements yve.C1778f.C1779a {
        public Object convert(Object obj) {
            C6752b a = C6752b.m63611a(((Integer) obj).intValue());
            if (a == null) {
                a = C6752b.UNRECOGNIZED;
            }
            return a;
        }
    }

    /* renamed from: spotify.playlist.esperanto.proto.PlaylistQuery$b */
    public enum C6752b implements yve.C1774b {
        NO_FILTER(0),
        AVAILABLE(1),
        AVAILABLE_OFFLINE(2),
        ARTIST_NOT_BANNED(3),
        NOT_BANNED(4),
        NOT_EXPLICIT(5),
        NOT_EPISODE(6),
        UNRECOGNIZED(-1);
        

        /* renamed from: a */
        public final int f106222a;

        /* access modifiers changed from: public */
        C6752b(int i) {
            this.f106222a = i;
        }

        /* renamed from: a */
        public static C6752b m63611a(int i) {
            switch (i) {
                case 0:
                    return NO_FILTER;
                case 1:
                    return AVAILABLE;
                case 2:
                    return AVAILABLE_OFFLINE;
                case 3:
                    return ARTIST_NOT_BANNED;
                case 4:
                    return NOT_BANNED;
                case 5:
                    return NOT_EXPLICIT;
                case 6:
                    return NOT_EPISODE;
                default:
                    return null;
            }
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f106222a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* renamed from: spotify.playlist.esperanto.proto.PlaylistQuery$c */
    public static final class C6753c extends C1075c.C1076a implements knh {
        public C6753c(C6751a aVar) {
            super(PlaylistQuery.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: spotify.playlist.esperanto.proto.PlaylistQuery$d */
    public enum C6754d implements yve.C1774b {
        NO_SORT(0),
        ALBUM_ARTIST_NAME_ASC(1),
        ALBUM_ARTIST_NAME_DESC(2),
        TRACK_NUMBER_ASC(3),
        TRACK_NUMBER_DESC(4),
        DISC_NUMBER_ASC(5),
        DISC_NUMBER_DESC(6),
        ALBUM_NAME_ASC(7),
        ALBUM_NAME_DESC(8),
        ARTIST_NAME_ASC(9),
        ARTIST_NAME_DESC(10),
        NAME_ASC(11),
        NAME_DESC(12),
        ADD_TIME_ASC(13),
        ADD_TIME_DESC(14),
        UNRECOGNIZED(-1);
        

        /* renamed from: a */
        public final int f106240a;

        /* access modifiers changed from: public */
        C6754d(int i) {
            this.f106240a = i;
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f106240a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        PlaylistQuery playlistQuery = new PlaylistQuery();
        DEFAULT_INSTANCE = playlistQuery;
        Class<PlaylistQuery> cls = PlaylistQuery.class;
        C1075c.registerDefaultInstance(PlaylistQuery.class, playlistQuery);
    }

    /* renamed from: o */
    public static void m63601o(PlaylistQuery playlistQuery, C6754d dVar) {
        Objects.requireNonNull(playlistQuery);
        playlistQuery.sortBy_ = dVar.getNumber();
    }

    /* renamed from: p */
    public static void m63602p(PlaylistQuery playlistQuery, PlaylistRange playlistRange) {
        Objects.requireNonNull(playlistQuery);
        Objects.requireNonNull(playlistRange);
        playlistQuery.range_ = playlistRange;
    }

    public static nqk parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* renamed from: q */
    public static void m63603q(PlaylistQuery playlistQuery, int i) {
        playlistQuery.updateThrottlingMs_ = i;
    }

    /* renamed from: r */
    public static void m63604r(PlaylistQuery playlistQuery, C6752b bVar) {
        Objects.requireNonNull(playlistQuery);
        Objects.requireNonNull(bVar);
        yve.C1777e eVar = playlistQuery.boolPredicates_;
        yve.C1777e eVar2 = eVar;
        if (!((C1424f4) eVar).f9794a) {
            playlistQuery.boolPredicates_ = C1075c.mutableCopy(eVar);
        }
        ((zse) playlistQuery.boolPredicates_).mo23767c(bVar.getNumber());
    }

    /* renamed from: s */
    public static void m63605s(PlaylistQuery playlistQuery, C6772b bVar) {
        Objects.requireNonNull(playlistQuery);
        playlistQuery.sourceRestriction_ = bVar.getNumber();
    }

    /* renamed from: t */
    public static void m63606t(PlaylistQuery playlistQuery, boolean z) {
        playlistQuery.showUnavailable_ = z;
    }

    /* renamed from: u */
    public static void m63607u(PlaylistQuery playlistQuery, boolean z) {
        playlistQuery.alwaysShowWindowed_ = z;
    }

    /* renamed from: v */
    public static void m63608v(PlaylistQuery playlistQuery, boolean z) {
        playlistQuery.loadRecommendations_ = z;
    }

    /* renamed from: w */
    public static void m63609w(PlaylistQuery playlistQuery, String str) {
        Objects.requireNonNull(playlistQuery);
        Objects.requireNonNull(str);
        playlistQuery.textFilter_ = str;
    }

    /* renamed from: x */
    public static C6753c m63610x() {
        return (C6753c) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: finally extract failed */
    public final Object dynamicMethod(C1075c.C1080e eVar, Object obj, Object obj2) {
        switch (eVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0001\u0000\u0001,\u0002Ȉ\u0003\f\u0004\t\u0005\u0004\u0006\u0007\u0007\f\b\u0007\t\u0007\n\u0007", new Object[]{"boolPredicates_", "textFilter_", "sortBy_", "range_", "updateThrottlingMs_", "group_", "sourceRestriction_", "showUnavailable_", "alwaysShowWindowed_", "loadRecommendations_"});
            case 3:
                return new PlaylistQuery();
            case 4:
                return new C6753c((C6751a) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<PlaylistQuery> nqk = PARSER;
                if (nqk == null) {
                    Class<PlaylistQuery> cls = PlaylistQuery.class;
                    synchronized (PlaylistQuery.class) {
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
