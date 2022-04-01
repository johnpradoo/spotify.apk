package spotify.playlist.esperanto.proto;

import com.google.protobuf.C1075c;
import java.util.Objects;
import p015p.knh;
import p015p.nqk;

public final class PlaylistClearTokenRequest extends C1075c implements knh {
    /* access modifiers changed from: private */
    public static final PlaylistClearTokenRequest DEFAULT_INSTANCE;
    private static volatile nqk<PlaylistClearTokenRequest> PARSER = null;
    public static final int URI_FIELD_NUMBER = 1;
    private String uri_ = "";

    /* renamed from: spotify.playlist.esperanto.proto.PlaylistClearTokenRequest$b */
    public static final class C6726b extends C1075c.C1076a implements knh {
        public C6726b(C6725a aVar) {
            super(PlaylistClearTokenRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        PlaylistClearTokenRequest playlistClearTokenRequest = new PlaylistClearTokenRequest();
        DEFAULT_INSTANCE = playlistClearTokenRequest;
        Class<PlaylistClearTokenRequest> cls = PlaylistClearTokenRequest.class;
        C1075c.registerDefaultInstance(PlaylistClearTokenRequest.class, playlistClearTokenRequest);
    }

    /* renamed from: o */
    public static void m63548o(PlaylistClearTokenRequest playlistClearTokenRequest, String str) {
        Objects.requireNonNull(playlistClearTokenRequest);
        Objects.requireNonNull(str);
        playlistClearTokenRequest.uri_ = str;
    }

    /* renamed from: p */
    public static C6726b m63549p() {
        return (C6726b) DEFAULT_INSTANCE.createBuilder();
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
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"uri_"});
            case 3:
                return new PlaylistClearTokenRequest();
            case 4:
                return new C6726b((C6725a) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<PlaylistClearTokenRequest> nqk = PARSER;
                if (nqk == null) {
                    Class<PlaylistClearTokenRequest> cls = PlaylistClearTokenRequest.class;
                    synchronized (PlaylistClearTokenRequest.class) {
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
