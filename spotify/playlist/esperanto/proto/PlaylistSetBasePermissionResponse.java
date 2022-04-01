package spotify.playlist.esperanto.proto;

import com.google.protobuf.C1075c;
import com.spotify.playlist.proto.SetBasePermissionResponse;
import p015p.knh;
import p015p.nqk;

public final class PlaylistSetBasePermissionResponse extends C1075c implements knh {
    /* access modifiers changed from: private */
    public static final PlaylistSetBasePermissionResponse DEFAULT_INSTANCE;
    private static volatile nqk<PlaylistSetBasePermissionResponse> PARSER = null;
    public static final int RESPONSE_FIELD_NUMBER = 2;
    public static final int STATUS_FIELD_NUMBER = 1;
    private SetBasePermissionResponse response_;
    private ResponseStatus status_;

    /* renamed from: spotify.playlist.esperanto.proto.PlaylistSetBasePermissionResponse$b */
    public static final class C6762b extends C1075c.C1076a implements knh {
        public C6762b(C6761a aVar) {
            super(PlaylistSetBasePermissionResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        PlaylistSetBasePermissionResponse playlistSetBasePermissionResponse = new PlaylistSetBasePermissionResponse();
        DEFAULT_INSTANCE = playlistSetBasePermissionResponse;
        C1075c.registerDefaultInstance(PlaylistSetBasePermissionResponse.class, playlistSetBasePermissionResponse);
    }

    /* renamed from: p */
    public static PlaylistSetBasePermissionResponse m63624p(byte[] bArr) {
        return (PlaylistSetBasePermissionResponse) C1075c.parseFrom(DEFAULT_INSTANCE, bArr);
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
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"status_", "response_"});
            case 3:
                return new PlaylistSetBasePermissionResponse();
            case 4:
                return new C6762b((C6761a) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<PlaylistSetBasePermissionResponse> nqk = PARSER;
                if (nqk == null) {
                    Class<PlaylistSetBasePermissionResponse> cls = PlaylistSetBasePermissionResponse.class;
                    synchronized (PlaylistSetBasePermissionResponse.class) {
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
    public ResponseStatus mo66834o() {
        ResponseStatus responseStatus = this.status_;
        if (responseStatus == null) {
            responseStatus = ResponseStatus.m63637o();
        }
        return responseStatus;
    }
}
