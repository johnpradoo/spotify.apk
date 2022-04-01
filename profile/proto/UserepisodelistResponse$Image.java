package com.spotify.music.features.profile.proto;

import com.google.protobuf.C1075c;
import p015p.dlu;
import p015p.knh;
import p015p.nqk;

public final class UserepisodelistResponse$Image extends C1075c implements knh {
    /* access modifiers changed from: private */
    public static final UserepisodelistResponse$Image DEFAULT_INSTANCE;
    private static volatile nqk<UserepisodelistResponse$Image> PARSER = null;
    public static final int SIZE_FIELD_NUMBER = 1;
    public static final int URL_FIELD_NUMBER = 2;
    private int size_;
    private String url_ = "";

    /* renamed from: com.spotify.music.features.profile.proto.UserepisodelistResponse$Image$a */
    public static final class C3941a extends C1075c.C1076a implements knh {
        public C3941a(dlu dlu) {
            super(UserepisodelistResponse$Image.DEFAULT_INSTANCE);
        }
    }

    static {
        UserepisodelistResponse$Image userepisodelistResponse$Image = new UserepisodelistResponse$Image();
        DEFAULT_INSTANCE = userepisodelistResponse$Image;
        C1075c.registerDefaultInstance(UserepisodelistResponse$Image.class, userepisodelistResponse$Image);
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
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"size_", "url_"});
            case 3:
                return new UserepisodelistResponse$Image();
            case 4:
                return new C3941a((dlu) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<UserepisodelistResponse$Image> nqk = PARSER;
                if (nqk == null) {
                    Class<UserepisodelistResponse$Image> cls = UserepisodelistResponse$Image.class;
                    synchronized (UserepisodelistResponse$Image.class) {
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
    public C3943a mo42060o() {
        C3943a a = C3943a.m34058a(this.size_);
        if (a == null) {
            a = C3943a.UNRECOGNIZED;
        }
        return a;
    }

    /* renamed from: p */
    public String mo42061p() {
        return this.url_;
    }
}
