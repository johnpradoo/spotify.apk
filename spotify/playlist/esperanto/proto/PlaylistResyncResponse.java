package spotify.playlist.esperanto.proto;

import com.google.protobuf.C1075c;
import p015p.knh;
import p015p.nqk;

public final class PlaylistResyncResponse extends C1075c implements knh {
    /* access modifiers changed from: private */
    public static final PlaylistResyncResponse DEFAULT_INSTANCE;
    private static volatile nqk<PlaylistResyncResponse> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private ResponseStatus status_;

    /* renamed from: spotify.playlist.esperanto.proto.PlaylistResyncResponse$b */
    public static final class C6758b extends C1075c.C1076a implements knh {
        public C6758b(C6757a aVar) {
            super(PlaylistResyncResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        PlaylistResyncResponse playlistResyncResponse = new PlaylistResyncResponse();
        DEFAULT_INSTANCE = playlistResyncResponse;
        Class<PlaylistResyncResponse> cls = PlaylistResyncResponse.class;
        C1075c.registerDefaultInstance(PlaylistResyncResponse.class, playlistResyncResponse);
    }

    /* renamed from: p */
    public static PlaylistResyncResponse m63617p(byte[] bArr) {
        return (PlaylistResyncResponse) C1075c.parseFrom(DEFAULT_INSTANCE, bArr);
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
                return new PlaylistResyncResponse();
            case 4:
                return new C6758b((C6757a) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<PlaylistResyncResponse> nqk = PARSER;
                if (nqk == null) {
                    Class<PlaylistResyncResponse> cls = PlaylistResyncResponse.class;
                    synchronized (PlaylistResyncResponse.class) {
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
    public ResponseStatus mo66833o() {
        ResponseStatus responseStatus = this.status_;
        if (responseStatus == null) {
            responseStatus = ResponseStatus.m63637o();
        }
        return responseStatus;
    }
}
