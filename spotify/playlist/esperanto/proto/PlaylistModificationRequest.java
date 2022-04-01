package spotify.playlist.esperanto.proto;

import com.google.protobuf.C1075c;
import com.spotify.playlist.proto.ModificationRequest;
import java.util.Objects;
import p015p.knh;
import p015p.nqk;

public final class PlaylistModificationRequest extends C1075c implements knh {
    /* access modifiers changed from: private */
    public static final PlaylistModificationRequest DEFAULT_INSTANCE;
    private static volatile nqk<PlaylistModificationRequest> PARSER = null;
    public static final int REQUEST_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private ModificationRequest request_;
    private String uri_ = "";

    /* renamed from: spotify.playlist.esperanto.proto.PlaylistModificationRequest$b */
    public static final class C6740b extends C1075c.C1076a implements knh {
        public C6740b(C6739a aVar) {
            super(PlaylistModificationRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        PlaylistModificationRequest playlistModificationRequest = new PlaylistModificationRequest();
        DEFAULT_INSTANCE = playlistModificationRequest;
        Class<PlaylistModificationRequest> cls = PlaylistModificationRequest.class;
        C1075c.registerDefaultInstance(PlaylistModificationRequest.class, playlistModificationRequest);
    }

    /* renamed from: o */
    public static void m63575o(PlaylistModificationRequest playlistModificationRequest, String str) {
        Objects.requireNonNull(playlistModificationRequest);
        Objects.requireNonNull(str);
        playlistModificationRequest.uri_ = str;
    }

    /* renamed from: p */
    public static void m63576p(PlaylistModificationRequest playlistModificationRequest, ModificationRequest modificationRequest) {
        Objects.requireNonNull(playlistModificationRequest);
        Objects.requireNonNull(modificationRequest);
        playlistModificationRequest.request_ = modificationRequest;
    }

    public static nqk parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* renamed from: q */
    public static C6740b m63577q() {
        return (C6740b) DEFAULT_INSTANCE.createBuilder();
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
                return new PlaylistModificationRequest();
            case 4:
                return new C6740b((C6739a) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<PlaylistModificationRequest> nqk = PARSER;
                if (nqk == null) {
                    Class<PlaylistModificationRequest> cls = PlaylistModificationRequest.class;
                    synchronized (PlaylistModificationRequest.class) {
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
