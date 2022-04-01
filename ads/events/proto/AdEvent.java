package com.spotify.music.features.ads.events.proto;

import com.google.protobuf.C1075c;
import java.util.Objects;
import p015p.knh;
import p015p.nqk;

public final class AdEvent extends C1075c implements knh {
    public static final int AD_ID_FIELD_NUMBER = 3;
    public static final int APP_STARTUP_ID_FIELD_NUMBER = 2;
    public static final int CREATIVE_ID_FIELD_NUMBER = 5;
    /* access modifiers changed from: private */
    public static final AdEvent DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 15;
    public static final int EVENT_FIELD_NUMBER = 10;
    public static final int EVENT_REASON_FIELD_NUMBER = 12;
    public static final int EVENT_SEQUENCE_NUM_FIELD_NUMBER = 13;
    public static final int EVENT_SOURCE_FIELD_NUMBER = 11;
    public static final int FORMAT_FIELD_NUMBER = 7;
    public static final int IN_FOCUS_FIELD_NUMBER = 16;
    public static final int LINEITEM_ID_FIELD_NUMBER = 4;
    private static volatile nqk<AdEvent> PARSER = null;
    public static final int POSITION_FIELD_NUMBER = 14;
    public static final int PRODUCT_NAME_FIELD_NUMBER = 18;
    public static final int REQUEST_ID_FIELD_NUMBER = 1;
    public static final int SKIPPABLE_FIELD_NUMBER = 9;
    public static final int SLOT_FIELD_NUMBER = 6;
    public static final int TYPE_FIELD_NUMBER = 8;
    public static final int VOLUME_FIELD_NUMBER = 17;
    private String adId_ = "";
    private String appStartupId_ = "";
    private int bitField0_;
    private String creativeId_ = "";
    private int duration_;
    private String eventReason_ = "";
    private int eventSequenceNum_;
    private String eventSource_ = "";
    private String event_ = "";
    private String format_ = "";
    private boolean inFocus_;
    private String lineitemId_ = "";
    private int position_;
    private String productName_ = "";
    private String requestId_ = "";
    private boolean skippable_;
    private String slot_ = "";
    private String type_ = "";
    private float volume_;

    /* renamed from: com.spotify.music.features.ads.events.proto.AdEvent$b */
    public static final class C3729b extends C1075c.C1076a implements knh {
        public C3729b(C3728a aVar) {
            super(AdEvent.DEFAULT_INSTANCE);
        }
    }

    static {
        AdEvent adEvent = new AdEvent();
        DEFAULT_INSTANCE = adEvent;
        Class<AdEvent> cls = AdEvent.class;
        C1075c.registerDefaultInstance(AdEvent.class, adEvent);
    }

    /* renamed from: o */
    public static void m33571o(AdEvent adEvent, String str) {
        Objects.requireNonNull(adEvent);
        Objects.requireNonNull(str);
        adEvent.bitField0_ |= 8;
        adEvent.lineitemId_ = str;
    }

    /* renamed from: p */
    public static void m33572p(AdEvent adEvent, String str) {
        Objects.requireNonNull(adEvent);
        Objects.requireNonNull(str);
        adEvent.bitField0_ |= 16;
        adEvent.creativeId_ = str;
    }

    public static nqk parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* renamed from: q */
    public static void m33573q(AdEvent adEvent, String str) {
        Objects.requireNonNull(adEvent);
        Objects.requireNonNull(str);
        adEvent.bitField0_ |= 32;
        adEvent.slot_ = str;
    }

    /* renamed from: r */
    public static void m33574r(AdEvent adEvent, String str) {
        Objects.requireNonNull(adEvent);
        Objects.requireNonNull(str);
        adEvent.bitField0_ |= 64;
        adEvent.format_ = str;
    }

    /* renamed from: s */
    public static void m33575s(AdEvent adEvent, String str) {
        Objects.requireNonNull(adEvent);
        Objects.requireNonNull(str);
        adEvent.bitField0_ |= 512;
        adEvent.event_ = str;
    }

    /* renamed from: t */
    public static void m33576t(AdEvent adEvent, String str) {
        Objects.requireNonNull(adEvent);
        Objects.requireNonNull(str);
        adEvent.bitField0_ |= 2048;
        adEvent.eventReason_ = str;
    }

    /* renamed from: u */
    public static C3729b m33577u() {
        return (C3729b) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: finally extract failed */
    public final Object dynamicMethod(C1075c.C1080e eVar, Object obj, Object obj2) {
        boolean z = true & false;
        switch (eVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0012\u0000\u0001\u0001\u0012\u0012\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဇ\b\nဈ\t\u000bဈ\n\fဈ\u000b\rင\f\u000eင\r\u000fင\u000e\u0010ဇ\u000f\u0011ခ\u0010\u0012ဈ\u0011", new Object[]{"bitField0_", "requestId_", "appStartupId_", "adId_", "lineitemId_", "creativeId_", "slot_", "format_", "type_", "skippable_", "event_", "eventSource_", "eventReason_", "eventSequenceNum_", "position_", "duration_", "inFocus_", "volume_", "productName_"});
            case 3:
                return new AdEvent();
            case 4:
                return new C3729b((C3728a) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<AdEvent> nqk = PARSER;
                if (nqk == null) {
                    Class<AdEvent> cls = AdEvent.class;
                    synchronized (AdEvent.class) {
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
