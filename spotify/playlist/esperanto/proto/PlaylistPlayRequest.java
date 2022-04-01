package spotify.playlist.esperanto.proto;

import com.google.protobuf.C1075c;
import com.spotify.player.esperanto.proto.EsContext$Context;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import com.spotify.player.esperanto.proto.EsPlayOptions$PlayOptions;
import com.spotify.player.esperanto.proto.EsPlayOrigin$PlayOrigin;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions$PreparePlayOptions;
import java.util.Objects;
import p015p.knh;
import p015p.nqk;

public final class PlaylistPlayRequest extends C1075c implements knh {
    public static final int CONTEXT_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final PlaylistPlayRequest DEFAULT_INSTANCE;
    public static final int LOGGING_PARAMS_FIELD_NUMBER = 4;
    private static volatile nqk<PlaylistPlayRequest> PARSER = null;
    public static final int PLAYLIST_QUERY_FIELD_NUMBER = 1;
    public static final int PLAY_OPTIONS_FIELD_NUMBER = 3;
    public static final int PLAY_ORIGIN_FIELD_NUMBER = 6;
    public static final int PREPARE_PLAY_OPTIONS_FIELD_NUMBER = 5;
    private EsContext$Context context_;
    private EsLoggingParams$LoggingParams loggingParams_;
    private EsPlayOptions$PlayOptions playOptions_;
    private EsPlayOrigin$PlayOrigin playOrigin_;
    private PlaylistQuery playlistQuery_;
    private EsPreparePlayOptions$PreparePlayOptions preparePlayOptions_;

    /* renamed from: spotify.playlist.esperanto.proto.PlaylistPlayRequest$b */
    public static final class C6748b extends C1075c.C1076a implements knh {
        public C6748b(C6747a aVar) {
            super(PlaylistPlayRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        PlaylistPlayRequest playlistPlayRequest = new PlaylistPlayRequest();
        DEFAULT_INSTANCE = playlistPlayRequest;
        Class<PlaylistPlayRequest> cls = PlaylistPlayRequest.class;
        C1075c.registerDefaultInstance(PlaylistPlayRequest.class, playlistPlayRequest);
    }

    /* renamed from: o */
    public static void m63590o(PlaylistPlayRequest playlistPlayRequest, PlaylistQuery playlistQuery) {
        Objects.requireNonNull(playlistPlayRequest);
        Objects.requireNonNull(playlistQuery);
        playlistPlayRequest.playlistQuery_ = playlistQuery;
    }

    /* renamed from: p */
    public static void m63591p(PlaylistPlayRequest playlistPlayRequest, EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
        Objects.requireNonNull(playlistPlayRequest);
        Objects.requireNonNull(esLoggingParams$LoggingParams);
        playlistPlayRequest.loggingParams_ = esLoggingParams$LoggingParams;
    }

    public static nqk parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* renamed from: q */
    public static void m63592q(PlaylistPlayRequest playlistPlayRequest, EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions) {
        Objects.requireNonNull(playlistPlayRequest);
        Objects.requireNonNull(esPreparePlayOptions$PreparePlayOptions);
        playlistPlayRequest.preparePlayOptions_ = esPreparePlayOptions$PreparePlayOptions;
    }

    /* renamed from: r */
    public static void m63593r(PlaylistPlayRequest playlistPlayRequest, EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin) {
        Objects.requireNonNull(playlistPlayRequest);
        Objects.requireNonNull(esPlayOrigin$PlayOrigin);
        playlistPlayRequest.playOrigin_ = esPlayOrigin$PlayOrigin;
    }

    /* renamed from: s */
    public static void m63594s(PlaylistPlayRequest playlistPlayRequest, EsContext$Context esContext$Context) {
        Objects.requireNonNull(playlistPlayRequest);
        Objects.requireNonNull(esContext$Context);
        playlistPlayRequest.context_ = esContext$Context;
    }

    /* renamed from: t */
    public static void m63595t(PlaylistPlayRequest playlistPlayRequest, EsPlayOptions$PlayOptions esPlayOptions$PlayOptions) {
        Objects.requireNonNull(playlistPlayRequest);
        Objects.requireNonNull(esPlayOptions$PlayOptions);
        playlistPlayRequest.playOptions_ = esPlayOptions$PlayOptions;
    }

    /* renamed from: u */
    public static C6748b m63596u() {
        return (C6748b) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: finally extract failed */
    public final Object dynamicMethod(C1075c.C1080e eVar, Object obj, Object obj2) {
        boolean z = true;
        switch (eVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t", new Object[]{"playlistQuery_", "context_", "playOptions_", "loggingParams_", "preparePlayOptions_", "playOrigin_"});
            case 3:
                return new PlaylistPlayRequest();
            case 4:
                return new C6748b((C6747a) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<PlaylistPlayRequest> nqk = PARSER;
                if (nqk == null) {
                    Class<PlaylistPlayRequest> cls = PlaylistPlayRequest.class;
                    synchronized (PlaylistPlayRequest.class) {
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
