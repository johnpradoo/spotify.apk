package spotify.playlist.esperanto.proto;

import com.google.protobuf.C1075c;
import p015p.knh;
import p015p.nqk;

public final class PlaylistModificationResponse extends C1075c implements knh {
    /* access modifiers changed from: private */
    public static final PlaylistModificationResponse DEFAULT_INSTANCE;
    private static volatile nqk<PlaylistModificationResponse> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private ResponseStatus status_;

    /* renamed from: spotify.playlist.esperanto.proto.PlaylistModificationResponse$b */
    public static final class C6742b extends C1075c.C1076a implements knh {
        public C6742b(C6741a aVar) {
            super(PlaylistModificationResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        PlaylistModificationResponse playlistModificationResponse = new PlaylistModificationResponse();
        DEFAULT_INSTANCE = playlistModificationResponse;
        Class<PlaylistModificationResponse> cls = PlaylistModificationResponse.class;
        C1075c.registerDefaultInstance(PlaylistModificationResponse.class, playlistModificationResponse);
    }

    /* renamed from: p */
    public static PlaylistModificationResponse m63579p(byte[] bArr) {
        return (PlaylistModificationResponse) C1075c.parseFrom(DEFAULT_INSTANCE, bArr);
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
                return new PlaylistModificationResponse();
            case 4:
                return new C6742b((C6741a) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<PlaylistModificationResponse> nqk = PARSER;
                if (nqk == null) {
                    Class<PlaylistModificationResponse> cls = PlaylistModificationResponse.class;
                    synchronized (PlaylistModificationResponse.class) {
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
    public ResponseStatus mo66830o() {
        ResponseStatus responseStatus = this.status_;
        if (responseStatus == null) {
            responseStatus = ResponseStatus.m63637o();
        }
        return responseStatus;
    }
}
