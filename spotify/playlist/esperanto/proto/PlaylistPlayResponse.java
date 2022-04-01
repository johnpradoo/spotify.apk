package spotify.playlist.esperanto.proto;

import com.google.protobuf.C1075c;
import p015p.knh;
import p015p.nqk;

public final class PlaylistPlayResponse extends C1075c implements knh {
    /* access modifiers changed from: private */
    public static final PlaylistPlayResponse DEFAULT_INSTANCE;
    private static volatile nqk<PlaylistPlayResponse> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private ResponseStatus status_;

    /* renamed from: spotify.playlist.esperanto.proto.PlaylistPlayResponse$b */
    public static final class C6750b extends C1075c.C1076a implements knh {
        public C6750b(C6749a aVar) {
            super(PlaylistPlayResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        PlaylistPlayResponse playlistPlayResponse = new PlaylistPlayResponse();
        DEFAULT_INSTANCE = playlistPlayResponse;
        Class<PlaylistPlayResponse> cls = PlaylistPlayResponse.class;
        C1075c.registerDefaultInstance(PlaylistPlayResponse.class, playlistPlayResponse);
    }

    /* renamed from: p */
    public static PlaylistPlayResponse m63598p(byte[] bArr) {
        return (PlaylistPlayResponse) C1075c.parseFrom(DEFAULT_INSTANCE, bArr);
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
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"status_"});
            case 3:
                return new PlaylistPlayResponse();
            case 4:
                return new C6750b((C6749a) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<PlaylistPlayResponse> nqk = PARSER;
                if (nqk == null) {
                    Class<PlaylistPlayResponse> cls = PlaylistPlayResponse.class;
                    synchronized (PlaylistPlayResponse.class) {
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

    /* renamed from: o */
    public ResponseStatus mo66832o() {
        ResponseStatus responseStatus = this.status_;
        if (responseStatus == null) {
            responseStatus = ResponseStatus.m63637o();
        }
        return responseStatus;
    }
}
