package spotify.playlist.esperanto.proto;

import com.google.protobuf.C1075c;
import com.spotify.playlist.proto.SetBasePermissionRequest;
import java.util.Objects;
import p015p.knh;
import p015p.nqk;

public final class PlaylistSetBasePermissionRequest extends C1075c implements knh {
    /* access modifiers changed from: private */
    public static final PlaylistSetBasePermissionRequest DEFAULT_INSTANCE;
    private static volatile nqk<PlaylistSetBasePermissionRequest> PARSER = null;
    public static final int REQUEST_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private SetBasePermissionRequest request_;
    private String uri_ = "";

    /* renamed from: spotify.playlist.esperanto.proto.PlaylistSetBasePermissionRequest$b */
    public static final class C6760b extends C1075c.C1076a implements knh {
        public C6760b(C6759a aVar) {
            super(PlaylistSetBasePermissionRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        PlaylistSetBasePermissionRequest playlistSetBasePermissionRequest = new PlaylistSetBasePermissionRequest();
        DEFAULT_INSTANCE = playlistSetBasePermissionRequest;
        Class<PlaylistSetBasePermissionRequest> cls = PlaylistSetBasePermissionRequest.class;
        C1075c.registerDefaultInstance(PlaylistSetBasePermissionRequest.class, playlistSetBasePermissionRequest);
    }

    /* renamed from: o */
    public static void m63620o(PlaylistSetBasePermissionRequest playlistSetBasePermissionRequest, String str) {
        Objects.requireNonNull(playlistSetBasePermissionRequest);
        Objects.requireNonNull(str);
        playlistSetBasePermissionRequest.uri_ = str;
    }

    /* renamed from: p */
    public static void m63621p(PlaylistSetBasePermissionRequest playlistSetBasePermissionRequest, SetBasePermissionRequest setBasePermissionRequest) {
        Objects.requireNonNull(playlistSetBasePermissionRequest);
        Objects.requireNonNull(setBasePermissionRequest);
        playlistSetBasePermissionRequest.request_ = setBasePermissionRequest;
    }

    public static nqk parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* renamed from: q */
    public static C6760b m63622q() {
        return (C6760b) DEFAULT_INSTANCE.createBuilder();
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
                return new PlaylistSetBasePermissionRequest();
            case 4:
                return new C6760b((C6759a) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<PlaylistSetBasePermissionRequest> nqk = PARSER;
                if (nqk == null) {
                    synchronized (PlaylistSetBasePermissionRequest.class) {
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
