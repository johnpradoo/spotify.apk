package spotify.playlist.esperanto.proto;

import com.google.protobuf.C1075c;
import java.util.Objects;
import p015p.knh;
import p015p.nqk;

public final class PlaylistOfflineRequest extends C1075c implements knh {
    public static final int ACTION_FIELD_NUMBER = 3;
    /* access modifiers changed from: private */
    public static final PlaylistOfflineRequest DEFAULT_INSTANCE;
    private static volatile nqk<PlaylistOfflineRequest> PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private int action_;
    private PlaylistQuery query_;
    private String uri_ = "";

    /* renamed from: spotify.playlist.esperanto.proto.PlaylistOfflineRequest$b */
    public static final class C6744b extends C1075c.C1076a implements knh {
        public C6744b(C6743a aVar) {
            super(PlaylistOfflineRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        PlaylistOfflineRequest playlistOfflineRequest = new PlaylistOfflineRequest();
        DEFAULT_INSTANCE = playlistOfflineRequest;
        C1075c.registerDefaultInstance(PlaylistOfflineRequest.class, playlistOfflineRequest);
    }

    /* renamed from: o */
    public static void m63582o(PlaylistOfflineRequest playlistOfflineRequest, String str) {
        Objects.requireNonNull(playlistOfflineRequest);
        Objects.requireNonNull(str);
        playlistOfflineRequest.uri_ = str;
    }

    /* renamed from: p */
    public static void m63583p(PlaylistOfflineRequest playlistOfflineRequest, PlaylistQuery playlistQuery) {
        Objects.requireNonNull(playlistOfflineRequest);
        Objects.requireNonNull(playlistQuery);
        playlistOfflineRequest.query_ = playlistQuery;
    }

    public static nqk parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* renamed from: q */
    public static void m63584q(PlaylistOfflineRequest playlistOfflineRequest, C6771a aVar) {
        Objects.requireNonNull(playlistOfflineRequest);
        playlistOfflineRequest.action_ = aVar.getNumber();
    }

    /* renamed from: r */
    public static C6744b m63585r() {
        return (C6744b) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: finally extract failed */
    public final Object dynamicMethod(C1075c.C1080e eVar, Object obj, Object obj2) {
        switch (eVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\f", new Object[]{"uri_", "query_", "action_"});
            case 3:
                return new PlaylistOfflineRequest();
            case 4:
                return new C6744b((C6743a) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<PlaylistOfflineRequest> nqk = PARSER;
                if (nqk == null) {
                    Class<PlaylistOfflineRequest> cls = PlaylistOfflineRequest.class;
                    synchronized (PlaylistOfflineRequest.class) {
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
