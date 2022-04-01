package spotify.playlist.esperanto.proto;

import com.google.protobuf.C1075c;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.util.Objects;
import p015p.knh;
import p015p.nqk;

public final class PlaylistGetRequest extends C1075c implements knh {
    /* access modifiers changed from: private */
    public static final PlaylistGetRequest DEFAULT_INSTANCE;
    private static volatile nqk<PlaylistGetRequest> PARSER = null;
    public static final int POLICY_FIELD_NUMBER = 3;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private PlaylistRequestDecorationPolicy policy_;
    private PlaylistQuery query_;
    private String uri_ = "";

    /* renamed from: spotify.playlist.esperanto.proto.PlaylistGetRequest$b */
    public static final class C6734b extends C1075c.C1076a implements knh {
        public C6734b(C6733a aVar) {
            super(PlaylistGetRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        PlaylistGetRequest playlistGetRequest = new PlaylistGetRequest();
        DEFAULT_INSTANCE = playlistGetRequest;
        Class<PlaylistGetRequest> cls = PlaylistGetRequest.class;
        C1075c.registerDefaultInstance(PlaylistGetRequest.class, playlistGetRequest);
    }

    /* renamed from: o */
    public static void m63562o(PlaylistGetRequest playlistGetRequest, String str) {
        Objects.requireNonNull(playlistGetRequest);
        Objects.requireNonNull(str);
        playlistGetRequest.uri_ = str;
    }

    /* renamed from: p */
    public static void m63563p(PlaylistGetRequest playlistGetRequest, PlaylistQuery playlistQuery) {
        Objects.requireNonNull(playlistGetRequest);
        Objects.requireNonNull(playlistQuery);
        playlistGetRequest.query_ = playlistQuery;
    }

    public static nqk parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* renamed from: q */
    public static void m63564q(PlaylistGetRequest playlistGetRequest, PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy) {
        Objects.requireNonNull(playlistGetRequest);
        Objects.requireNonNull(playlistRequestDecorationPolicy);
        playlistGetRequest.policy_ = playlistRequestDecorationPolicy;
    }

    /* renamed from: r */
    public static C6734b m63565r() {
        return (C6734b) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: finally extract failed */
    public final Object dynamicMethod(C1075c.C1080e eVar, Object obj, Object obj2) {
        switch (eVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\t", new Object[]{"uri_", "query_", "policy_"});
            case 3:
                return new PlaylistGetRequest();
            case 4:
                return new C6734b((C6733a) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<PlaylistGetRequest> nqk = PARSER;
                if (nqk == null) {
                    Class<PlaylistGetRequest> cls = PlaylistGetRequest.class;
                    synchronized (PlaylistGetRequest.class) {
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
