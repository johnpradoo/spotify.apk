package com.spotify.music.features.settings.events.proto;

import com.google.protobuf.C1075c;
import com.google.protobuf.C1088k;
import java.util.Objects;
import p015p.fyg;
import p015p.knh;
import p015p.nqk;
import p015p.zxg;

public final class CanvasPreference extends C1075c implements knh {
    /* access modifiers changed from: private */
    public static final CanvasPreference DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 4;
    public static final int IDENTIFIER_FIELD_NUMBER = 1;
    private static volatile nqk<CanvasPreference> PARSER = null;
    public static final int SOURCE_FIELD_NUMBER = 3;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int bitField0_;
    private fyg details_ = fyg.f10397b;
    private String identifier_ = "";
    private String source_ = "";
    private String value_ = "";

    /* renamed from: com.spotify.music.features.settings.events.proto.CanvasPreference$b */
    public static final class C3962b extends C1075c.C1076a implements knh {
        public C3962b(C3961a aVar) {
            super(CanvasPreference.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.spotify.music.features.settings.events.proto.CanvasPreference$c */
    public static final class C3963c {

        /* renamed from: a */
        public static final zxg f51229a;

        static {
            C1088k kVar = C1088k.STRING;
            f51229a = new zxg(kVar, "", kVar, "");
        }
    }

    static {
        CanvasPreference canvasPreference = new CanvasPreference();
        DEFAULT_INSTANCE = canvasPreference;
        Class<CanvasPreference> cls = CanvasPreference.class;
        C1075c.registerDefaultInstance(CanvasPreference.class, canvasPreference);
    }

    /* renamed from: o */
    public static void m34073o(CanvasPreference canvasPreference, String str) {
        Objects.requireNonNull(canvasPreference);
        Objects.requireNonNull(str);
        canvasPreference.bitField0_ |= 1;
        canvasPreference.identifier_ = str;
    }

    /* renamed from: p */
    public static void m34074p(CanvasPreference canvasPreference, String str) {
        Objects.requireNonNull(canvasPreference);
        Objects.requireNonNull(str);
        canvasPreference.bitField0_ |= 2;
        canvasPreference.value_ = str;
    }

    public static nqk parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* renamed from: q */
    public static void m34075q(CanvasPreference canvasPreference, String str) {
        Objects.requireNonNull(canvasPreference);
        Objects.requireNonNull(str);
        canvasPreference.bitField0_ |= 4;
        canvasPreference.source_ = str;
    }

    /* renamed from: r */
    public static C3962b m34076r() {
        return (C3962b) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: finally extract failed */
    public final Object dynamicMethod(C1075c.C1080e eVar, Object obj, Object obj2) {
        switch (eVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u00042", new Object[]{"bitField0_", "identifier_", "value_", "source_", "details_", C3963c.f51229a});
            case 3:
                return new CanvasPreference();
            case 4:
                return new C3962b((C3961a) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<CanvasPreference> nqk = PARSER;
                if (nqk == null) {
                    Class<CanvasPreference> cls = CanvasPreference.class;
                    synchronized (CanvasPreference.class) {
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
}
