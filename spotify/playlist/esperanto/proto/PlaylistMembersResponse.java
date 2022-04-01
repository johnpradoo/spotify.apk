package spotify.playlist.esperanto.proto;

import com.google.protobuf.C1075c;
import p015p.knh;
import p015p.nqk;

public final class PlaylistMembersResponse extends C1075c implements knh {
    /* access modifiers changed from: private */
    public static final PlaylistMembersResponse DEFAULT_INSTANCE;
    private static volatile nqk<PlaylistMembersResponse> PARSER = null;
    public static final int RESPONSE_FIELD_NUMBER = 2;
    public static final int STATUS_FIELD_NUMBER = 1;
    private com.spotify.playlist.proto.PlaylistMembersResponse response_;
    private ResponseStatus status_;

    /* renamed from: spotify.playlist.esperanto.proto.PlaylistMembersResponse$b */
    public static final class C6738b extends C1075c.C1076a implements knh {
        public C6738b(C6737a aVar) {
            super(PlaylistMembersResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        PlaylistMembersResponse playlistMembersResponse = new PlaylistMembersResponse();
        DEFAULT_INSTANCE = playlistMembersResponse;
        Class<PlaylistMembersResponse> cls = PlaylistMembersResponse.class;
        C1075c.registerDefaultInstance(PlaylistMembersResponse.class, playlistMembersResponse);
    }

    public static nqk parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* renamed from: q */
    public static PlaylistMembersResponse m63571q(byte[] bArr) {
        return (PlaylistMembersResponse) C1075c.parseFrom(DEFAULT_INSTANCE, bArr);
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
                return new PlaylistMembersResponse();
            case 4:
                return new C6738b((C6737a) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<PlaylistMembersResponse> nqk = PARSER;
                if (nqk == null) {
                    Class<PlaylistMembersResponse> cls = PlaylistMembersResponse.class;
                    synchronized (PlaylistMembersResponse.class) {
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
    public com.spotify.playlist.proto.PlaylistMembersResponse mo66828o() {
        com.spotify.playlist.proto.PlaylistMembersResponse playlistMembersResponse = this.response_;
        if (playlistMembersResponse == null) {
            playlistMembersResponse = com.spotify.playlist.proto.PlaylistMembersResponse.m36108q();
        }
        return playlistMembersResponse;
    }

    /* renamed from: p */
    public ResponseStatus mo66829p() {
        ResponseStatus responseStatus = this.status_;
        if (responseStatus == null) {
            responseStatus = ResponseStatus.m63637o();
        }
        return responseStatus;
    }
}
