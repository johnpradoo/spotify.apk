package com.spotify.music.features.profile.proto;

import com.google.protobuf.C1075c;
import com.google.protobuf.Duration;
import com.google.protobuf.Timestamp;
import java.util.List;
import p015p.dlu;
import p015p.knh;
import p015p.nqk;
import p015p.yve;

public final class UserepisodelistResponse$UserEpisode extends C1075c implements knh {
    /* access modifiers changed from: private */
    public static final UserepisodelistResponse$UserEpisode DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 3;
    public static final int IMAGES_FIELD_NUMBER = 5;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile nqk<UserepisodelistResponse$UserEpisode> PARSER = null;
    public static final int PUBLISH_TIME_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 4;
    private Duration duration_;
    private yve.C1781h images_ = C1075c.emptyProtobufList();
    private String name_ = "";
    private Timestamp publishTime_;
    private String uri_ = "";

    /* renamed from: com.spotify.music.features.profile.proto.UserepisodelistResponse$UserEpisode$a */
    public static final class C3942a extends C1075c.C1076a implements knh {
        public C3942a(dlu dlu) {
            super(UserepisodelistResponse$UserEpisode.DEFAULT_INSTANCE);
        }
    }

    static {
        UserepisodelistResponse$UserEpisode userepisodelistResponse$UserEpisode = new UserepisodelistResponse$UserEpisode();
        DEFAULT_INSTANCE = userepisodelistResponse$UserEpisode;
        Class<UserepisodelistResponse$UserEpisode> cls = UserepisodelistResponse$UserEpisode.class;
        C1075c.registerDefaultInstance(UserepisodelistResponse$UserEpisode.class, userepisodelistResponse$UserEpisode);
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
                Class<UserepisodelistResponse$Image> cls = UserepisodelistResponse$Image.class;
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002\t\u0003\t\u0004Ȉ\u0005\u001b", new Object[]{"name_", "publishTime_", "duration_", "uri_", "images_", UserepisodelistResponse$Image.class});
            case 3:
                return new UserepisodelistResponse$UserEpisode();
            case 4:
                return new C3942a((dlu) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<UserepisodelistResponse$UserEpisode> nqk = PARSER;
                if (nqk == null) {
                    Class<UserepisodelistResponse$UserEpisode> cls2 = UserepisodelistResponse$UserEpisode.class;
                    synchronized (UserepisodelistResponse$UserEpisode.class) {
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
    public Duration mo42064o() {
        Duration duration = this.duration_;
        if (duration == null) {
            duration = Duration.m4490p();
        }
        return duration;
    }

    /* renamed from: p */
    public List mo42065p() {
        return this.images_;
    }

    /* renamed from: q */
    public Timestamp mo42066q() {
        Timestamp timestamp = this.publishTime_;
        if (timestamp == null) {
            timestamp = Timestamp.m4508o();
        }
        return timestamp;
    }
}
