package spotify.playlist.esperanto.proto;

import com.google.protobuf.C1075c;
import p015p.knh;
import p015p.nqk;

public final class PlaylistRange extends C1075c implements knh {
    /* access modifiers changed from: private */
    public static final PlaylistRange DEFAULT_INSTANCE;
    public static final int LENGTH_FIELD_NUMBER = 2;
    private static volatile nqk<PlaylistRange> PARSER = null;
    public static final int START_FIELD_NUMBER = 1;
    private int length_;
    private int start_;

    /* renamed from: spotify.playlist.esperanto.proto.PlaylistRange$b */
    public static final class C6756b extends C1075c.C1076a implements knh {
        public C6756b(C6755a aVar) {
            super(PlaylistRange.DEFAULT_INSTANCE);
        }
    }

    static {
        PlaylistRange playlistRange = new PlaylistRange();
        DEFAULT_INSTANCE = playlistRange;
        Class<PlaylistRange> cls = PlaylistRange.class;
        C1075c.registerDefaultInstance(PlaylistRange.class, playlistRange);
    }

    /* renamed from: o */
    public static void m63613o(PlaylistRange playlistRange, int i) {
        playlistRange.start_ = i;
    }

    /* renamed from: p */
    public static void m63614p(PlaylistRange playlistRange, int i) {
        playlistRange.length_ = i;
    }

    public static nqk parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* renamed from: q */
    public static C6756b m63615q() {
        return (C6756b) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: finally extract failed */
    public final Object dynamicMethod(C1075c.C1080e eVar, Object obj, Object obj2) {
        switch (eVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"start_", "length_"});
            case 3:
                return new PlaylistRange();
            case 4:
                return new C6756b((C6755a) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<PlaylistRange> nqk = PARSER;
                if (nqk == null) {
                    Class<PlaylistRange> cls = PlaylistRange.class;
                    synchronized (PlaylistRange.class) {
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
