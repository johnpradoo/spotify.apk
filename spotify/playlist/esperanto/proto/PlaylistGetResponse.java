package spotify.playlist.esperanto.proto;

import com.google.protobuf.C1075c;
import com.spotify.playlist.proto.PlaylistRequest$Response;
import p015p.knh;
import p015p.nqk;

public final class PlaylistGetResponse extends C1075c implements knh {
    public static final int DATA_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final PlaylistGetResponse DEFAULT_INSTANCE;
    private static volatile nqk<PlaylistGetResponse> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private PlaylistRequest$Response data_;
    private ResponseStatus status_;

    /* renamed from: spotify.playlist.esperanto.proto.PlaylistGetResponse$b */
    public static final class C6736b extends C1075c.C1076a implements knh {
        public C6736b(C6735a aVar) {
            super(PlaylistGetResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        PlaylistGetResponse playlistGetResponse = new PlaylistGetResponse();
        DEFAULT_INSTANCE = playlistGetResponse;
        Class<PlaylistGetResponse> cls = PlaylistGetResponse.class;
        C1075c.registerDefaultInstance(PlaylistGetResponse.class, playlistGetResponse);
    }

    public static nqk parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* renamed from: q */
    public static PlaylistGetResponse m63567q(byte[] bArr) {
        return (PlaylistGetResponse) C1075c.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    /* JADX INFO: finally extract failed */
    public final Object dynamicMethod(C1075c.C1080e eVar, Object obj, Object obj2) {
        switch (eVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"status_", "data_"});
            case 3:
                return new PlaylistGetResponse();
            case 4:
                return new C6736b((C6735a) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<PlaylistGetResponse> nqk = PARSER;
                if (nqk == null) {
                    Class<PlaylistGetResponse> cls = PlaylistGetResponse.class;
                    synchronized (PlaylistGetResponse.class) {
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
    public PlaylistRequest$Response mo66826o() {
        PlaylistRequest$Response playlistRequest$Response = this.data_;
        if (playlistRequest$Response == null) {
            playlistRequest$Response = PlaylistRequest$Response.m36185t();
        }
        return playlistRequest$Response;
    }

    /* renamed from: p */
    public ResponseStatus mo66827p() {
        ResponseStatus responseStatus = this.status_;
        if (responseStatus == null) {
            responseStatus = ResponseStatus.m63637o();
        }
        return responseStatus;
    }
}
