package spotify.playlist.esperanto.proto;

import com.google.protobuf.C1075c;
import com.spotify.playlist.proto.ContainsResponse;
import p015p.knh;
import p015p.nqk;

public final class PlaylistContainsResponse extends C1075c implements knh {
    /* access modifiers changed from: private */
    public static final PlaylistContainsResponse DEFAULT_INSTANCE;
    private static volatile nqk<PlaylistContainsResponse> PARSER = null;
    public static final int RESPONSE_FIELD_NUMBER = 2;
    public static final int STATUS_FIELD_NUMBER = 1;
    private ContainsResponse response_;
    private ResponseStatus status_;

    /* renamed from: spotify.playlist.esperanto.proto.PlaylistContainsResponse$b */
    public static final class C6732b extends C1075c.C1076a implements knh {
        public C6732b(C6731a aVar) {
            super(PlaylistContainsResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        PlaylistContainsResponse playlistContainsResponse = new PlaylistContainsResponse();
        DEFAULT_INSTANCE = playlistContainsResponse;
        C1075c.registerDefaultInstance(PlaylistContainsResponse.class, playlistContainsResponse);
    }

    public static nqk parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* renamed from: q */
    public static PlaylistContainsResponse m63558q(byte[] bArr) {
        return (PlaylistContainsResponse) C1075c.parseFrom(DEFAULT_INSTANCE, bArr);
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
                return new PlaylistContainsResponse();
            case 4:
                return new C6732b((C6731a) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<PlaylistContainsResponse> nqk = PARSER;
                if (nqk == null) {
                    synchronized (PlaylistContainsResponse.class) {
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
    public ContainsResponse mo66824o() {
        ContainsResponse containsResponse = this.response_;
        if (containsResponse == null) {
            containsResponse = ContainsResponse.m36037o();
        }
        return containsResponse;
    }

    /* renamed from: p */
    public ResponseStatus mo66825p() {
        ResponseStatus responseStatus = this.status_;
        if (responseStatus == null) {
            responseStatus = ResponseStatus.m63637o();
        }
        return responseStatus;
    }
}
