package com.spotify.music.features.profile.proto;

import com.google.protobuf.C1075c;
import p015p.ae1;
import p015p.knh;
import p015p.nqk;

public final class ArtistlistResponse$Artist extends C1075c implements knh {
    /* access modifiers changed from: private */
    public static final ArtistlistResponse$Artist DEFAULT_INSTANCE;
    public static final int FOLLOWERS_COUNT_FIELD_NUMBER = 4;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    public static final int IS_FOLLOWING_FIELD_NUMBER = 5;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile nqk<ArtistlistResponse$Artist> PARSER = null;
    public static final int URI_FIELD_NUMBER = 1;
    private int followersCount_;
    private String imageUrl_ = "";
    private boolean isFollowing_;
    private String name_ = "";
    private String uri_ = "";

    /* renamed from: com.spotify.music.features.profile.proto.ArtistlistResponse$Artist$a */
    public static final class C3934a extends C1075c.C1076a implements knh {
        public C3934a(ae1 ae1) {
            super(ArtistlistResponse$Artist.DEFAULT_INSTANCE);
        }
    }

    static {
        ArtistlistResponse$Artist artistlistResponse$Artist = new ArtistlistResponse$Artist();
        DEFAULT_INSTANCE = artistlistResponse$Artist;
        C1075c.registerDefaultInstance(ArtistlistResponse$Artist.class, artistlistResponse$Artist);
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
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0004\u0005\u0007", new Object[]{"uri_", "name_", "imageUrl_", "followersCount_", "isFollowing_"});
            case 3:
                return new ArtistlistResponse$Artist();
            case 4:
                return new C3934a((ae1) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<ArtistlistResponse$Artist> nqk = PARSER;
                if (nqk == null) {
                    Class<ArtistlistResponse$Artist> cls = ArtistlistResponse$Artist.class;
                    synchronized (ArtistlistResponse$Artist.class) {
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

    public String getName() {
        return this.name_;
    }

    public String getUri() {
        return this.uri_;
    }

    /* renamed from: o */
    public int mo42030o() {
        return this.followersCount_;
    }

    /* renamed from: p */
    public String mo42031p() {
        return this.imageUrl_;
    }
}
