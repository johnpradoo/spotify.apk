package com.spotify.music.features.profile.proto;

import com.google.protobuf.C1075c;
import p015p.knh;
import p015p.nqk;
import p015p.qfn;

public final class ProfilelistResponse$SmallProfile extends C1075c implements knh {
    /* access modifiers changed from: private */
    public static final ProfilelistResponse$SmallProfile DEFAULT_INSTANCE;
    public static final int FOLLOWERS_COUNT_FIELD_NUMBER = 4;
    public static final int FOLLOWING_COUNT_FIELD_NUMBER = 5;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    public static final int IS_DISMISSED_FIELD_NUMBER = 8;
    public static final int IS_FOLLOWED_FIELD_NUMBER = 6;
    public static final int IS_FOLLOWING_FIELD_NUMBER = 7;
    public static final int IS_VERIFIED_FIELD_NUMBER = 9;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile nqk<ProfilelistResponse$SmallProfile> PARSER = null;
    public static final int URI_FIELD_NUMBER = 1;
    private int followersCount_;
    private int followingCount_;
    private String imageUrl_ = "";
    private boolean isDismissed_;
    private boolean isFollowed_;
    private boolean isFollowing_;
    private boolean isVerified_;
    private String name_ = "";
    private String uri_ = "";

    /* renamed from: com.spotify.music.features.profile.proto.ProfilelistResponse$SmallProfile$a */
    public static final class C3938a extends C1075c.C1076a implements knh {
        public C3938a(qfn qfn) {
            super(ProfilelistResponse$SmallProfile.DEFAULT_INSTANCE);
        }
    }

    static {
        ProfilelistResponse$SmallProfile profilelistResponse$SmallProfile = new ProfilelistResponse$SmallProfile();
        DEFAULT_INSTANCE = profilelistResponse$SmallProfile;
        Class<ProfilelistResponse$SmallProfile> cls = ProfilelistResponse$SmallProfile.class;
        C1075c.registerDefaultInstance(ProfilelistResponse$SmallProfile.class, profilelistResponse$SmallProfile);
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
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0004\u0005\u0004\u0006\u0007\u0007\u0007\b\u0007\t\u0007", new Object[]{"uri_", "name_", "imageUrl_", "followersCount_", "followingCount_", "isFollowed_", "isFollowing_", "isDismissed_", "isVerified_"});
            case 3:
                return new ProfilelistResponse$SmallProfile();
            case 4:
                return new C3938a((qfn) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<ProfilelistResponse$SmallProfile> nqk = PARSER;
                if (nqk == null) {
                    Class<ProfilelistResponse$SmallProfile> cls = ProfilelistResponse$SmallProfile.class;
                    synchronized (ProfilelistResponse$SmallProfile.class) {
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
    public int mo42040o() {
        return this.followersCount_;
    }

    /* renamed from: p */
    public int mo42041p() {
        return this.followingCount_;
    }

    /* renamed from: q */
    public String mo42042q() {
        return this.imageUrl_;
    }

    /* renamed from: r */
    public boolean mo42043r() {
        return this.isFollowing_;
    }
}
