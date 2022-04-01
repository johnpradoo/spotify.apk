package com.spotify.music.features.profile.proto;

import com.google.protobuf.C1075c;
import java.util.List;
import p015p.ae1;
import p015p.knh;
import p015p.nqk;
import p015p.yve;

public final class ArtistlistResponse$ArtistList extends C1075c implements knh {
    public static final int ARTISTS_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final ArtistlistResponse$ArtistList DEFAULT_INSTANCE;
    private static volatile nqk<ArtistlistResponse$ArtistList> PARSER;
    private yve.C1781h artists_ = C1075c.emptyProtobufList();

    /* renamed from: com.spotify.music.features.profile.proto.ArtistlistResponse$ArtistList$a */
    public static final class C3935a extends C1075c.C1076a implements knh {
        public C3935a(ae1 ae1) {
            super(ArtistlistResponse$ArtistList.DEFAULT_INSTANCE);
        }
    }

    static {
        ArtistlistResponse$ArtistList artistlistResponse$ArtistList = new ArtistlistResponse$ArtistList();
        DEFAULT_INSTANCE = artistlistResponse$ArtistList;
        Class<ArtistlistResponse$ArtistList> cls = ArtistlistResponse$ArtistList.class;
        C1075c.registerDefaultInstance(ArtistlistResponse$ArtistList.class, artistlistResponse$ArtistList);
    }

    /* renamed from: o */
    public static ArtistlistResponse$ArtistList m34022o() {
        return DEFAULT_INSTANCE;
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
                Class<ArtistlistResponse$Artist> cls = ArtistlistResponse$Artist.class;
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"artists_", ArtistlistResponse$Artist.class});
            case 3:
                return new ArtistlistResponse$ArtistList();
            case 4:
                return new C3935a((ae1) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<ArtistlistResponse$ArtistList> nqk = PARSER;
                if (nqk == null) {
                    Class<ArtistlistResponse$ArtistList> cls2 = ArtistlistResponse$ArtistList.class;
                    synchronized (ArtistlistResponse$ArtistList.class) {
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

    public List getArtistsList() {
        return this.artists_;
    }
}
