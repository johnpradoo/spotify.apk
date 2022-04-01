package spotify.playlist.esperanto.proto;

import com.google.protobuf.C1075c;
import com.spotify.playlist.proto.ContainsRequest;
import java.util.Objects;
import p015p.knh;
import p015p.nqk;

public final class PlaylistContainsRequest extends C1075c implements knh {
    /* access modifiers changed from: private */
    public static final PlaylistContainsRequest DEFAULT_INSTANCE;
    private static volatile nqk<PlaylistContainsRequest> PARSER = null;
    public static final int REQUEST_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private ContainsRequest request_;
    private String uri_ = "";

    /* renamed from: spotify.playlist.esperanto.proto.PlaylistContainsRequest$b */
    public static final class C6730b extends C1075c.C1076a implements knh {
        public C6730b(C6729a aVar) {
            super(PlaylistContainsRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        PlaylistContainsRequest playlistContainsRequest = new PlaylistContainsRequest();
        DEFAULT_INSTANCE = playlistContainsRequest;
        Class<PlaylistContainsRequest> cls = PlaylistContainsRequest.class;
        C1075c.registerDefaultInstance(PlaylistContainsRequest.class, playlistContainsRequest);
    }

    /* renamed from: o */
    public static void m63554o(PlaylistContainsRequest playlistContainsRequest, String str) {
        Objects.requireNonNull(playlistContainsRequest);
        Objects.requireNonNull(str);
        playlistContainsRequest.uri_ = str;
    }

    /* renamed from: p */
    public static void m63555p(PlaylistContainsRequest playlistContainsRequest, ContainsRequest containsRequest) {
        Objects.requireNonNull(playlistContainsRequest);
        Objects.requireNonNull(containsRequest);
        playlistContainsRequest.request_ = containsRequest;
    }

    public static nqk parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* renamed from: q */
    public static C6730b m63556q() {
        return (C6730b) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: finally extract failed */
    public final Object dynamicMethod(C1075c.C1080e eVar, Object obj, Object obj2) {
        switch (eVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"uri_", "request_"});
            case 3:
                return new PlaylistContainsRequest();
            case 4:
                return new C6730b((C6729a) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<PlaylistContainsRequest> nqk = PARSER;
                if (nqk == null) {
                    Class<PlaylistContainsRequest> cls = PlaylistContainsRequest.class;
                    synchronized (PlaylistContainsRequest.class) {
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
