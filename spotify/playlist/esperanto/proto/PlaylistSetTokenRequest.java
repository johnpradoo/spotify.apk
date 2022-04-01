package spotify.playlist.esperanto.proto;

import com.google.protobuf.C1075c;
import java.util.Objects;
import p015p.knh;
import p015p.nqk;

public final class PlaylistSetTokenRequest extends C1075c implements knh {
    /* access modifiers changed from: private */
    public static final PlaylistSetTokenRequest DEFAULT_INSTANCE;
    private static volatile nqk<PlaylistSetTokenRequest> PARSER = null;
    public static final int TOKEN_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private String token_ = "";
    private String uri_ = "";

    /* renamed from: spotify.playlist.esperanto.proto.PlaylistSetTokenRequest$b */
    public static final class C6766b extends C1075c.C1076a implements knh {
        public C6766b(C6765a aVar) {
            super(PlaylistSetTokenRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        PlaylistSetTokenRequest playlistSetTokenRequest = new PlaylistSetTokenRequest();
        DEFAULT_INSTANCE = playlistSetTokenRequest;
        Class<PlaylistSetTokenRequest> cls = PlaylistSetTokenRequest.class;
        C1075c.registerDefaultInstance(PlaylistSetTokenRequest.class, playlistSetTokenRequest);
    }

    /* renamed from: o */
    public static void m63630o(PlaylistSetTokenRequest playlistSetTokenRequest, String str) {
        Objects.requireNonNull(playlistSetTokenRequest);
        Objects.requireNonNull(str);
        playlistSetTokenRequest.uri_ = str;
    }

    /* renamed from: p */
    public static void m63631p(PlaylistSetTokenRequest playlistSetTokenRequest, String str) {
        Objects.requireNonNull(playlistSetTokenRequest);
        Objects.requireNonNull(str);
        playlistSetTokenRequest.token_ = str;
    }

    public static nqk parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* renamed from: q */
    public static C6766b m63632q() {
        return (C6766b) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: finally extract failed */
    public final Object dynamicMethod(C1075c.C1080e eVar, Object obj, Object obj2) {
        switch (eVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"uri_", "token_"});
            case 3:
                return new PlaylistSetTokenRequest();
            case 4:
                return new C6766b((C6765a) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<PlaylistSetTokenRequest> nqk = PARSER;
                if (nqk == null) {
                    Class<PlaylistSetTokenRequest> cls = PlaylistSetTokenRequest.class;
                    synchronized (PlaylistSetTokenRequest.class) {
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
