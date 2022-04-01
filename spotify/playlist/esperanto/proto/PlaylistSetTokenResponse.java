package spotify.playlist.esperanto.proto;

import com.google.protobuf.C1075c;
import p015p.knh;
import p015p.nqk;

public final class PlaylistSetTokenResponse extends C1075c implements knh {
    /* access modifiers changed from: private */
    public static final PlaylistSetTokenResponse DEFAULT_INSTANCE;
    private static volatile nqk<PlaylistSetTokenResponse> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private ResponseStatus status_;

    /* renamed from: spotify.playlist.esperanto.proto.PlaylistSetTokenResponse$b */
    public static final class C6768b extends C1075c.C1076a implements knh {
        public C6768b(C6767a aVar) {
            super(PlaylistSetTokenResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        PlaylistSetTokenResponse playlistSetTokenResponse = new PlaylistSetTokenResponse();
        DEFAULT_INSTANCE = playlistSetTokenResponse;
        Class<PlaylistSetTokenResponse> cls = PlaylistSetTokenResponse.class;
        C1075c.registerDefaultInstance(PlaylistSetTokenResponse.class, playlistSetTokenResponse);
    }

    /* renamed from: p */
    public static PlaylistSetTokenResponse m63634p(byte[] bArr) {
        return (PlaylistSetTokenResponse) C1075c.parseFrom(DEFAULT_INSTANCE, bArr);
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
                return new PlaylistSetTokenResponse();
            case 4:
                return new C6768b((C6767a) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<PlaylistSetTokenResponse> nqk = PARSER;
                if (nqk == null) {
                    Class<PlaylistSetTokenResponse> cls = PlaylistSetTokenResponse.class;
                    synchronized (PlaylistSetTokenResponse.class) {
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
    public ResponseStatus mo66836o() {
        ResponseStatus responseStatus = this.status_;
        if (responseStatus == null) {
            responseStatus = ResponseStatus.m63637o();
        }
        return responseStatus;
    }
}
