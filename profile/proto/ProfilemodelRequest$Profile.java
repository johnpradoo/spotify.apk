package com.spotify.music.features.profile.proto;

import com.google.protobuf.C1075c;
import java.util.List;
import p015p.knh;
import p015p.nqk;
import p015p.sfn;
import p015p.yve;

public final class ProfilemodelRequest$Profile extends C1075c implements knh {
    public static final int COLOR_FIELD_NUMBER = 16;
    /* access modifiers changed from: private */
    public static final ProfilemodelRequest$Profile DEFAULT_INSTANCE;
    public static final int EDIT_PROFILE_DISABLED_FIELD_NUMBER = 12;
    public static final int FOLLOWERS_COUNT_FIELD_NUMBER = 4;
    public static final int FOLLOWING_COUNT_FIELD_NUMBER = 5;
    public static final int HAS_SPOTIFY_IMAGE_FIELD_NUMBER = 15;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    public static final int IS_CURRENT_USER_FIELD_NUMBER = 10;
    public static final int IS_DISMISSED_FIELD_NUMBER = 17;
    public static final int IS_FOLLOWING_FIELD_NUMBER = 6;
    public static final int IS_VERIFIED_FIELD_NUMBER = 11;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile nqk<ProfilemodelRequest$Profile> PARSER = null;
    public static final int PUBLIC_PLAYLISTS_FIELD_NUMBER = 8;
    public static final int RECENTLY_PLAYED_ARTISTS_FIELD_NUMBER = 7;
    public static final int REPORT_ABUSE_DISABLED_FIELD_NUMBER = 13;
    public static final int TOTAL_PUBLIC_PLAYLISTS_COUNT_FIELD_NUMBER = 9;
    public static final int URI_FIELD_NUMBER = 1;
    public static final int USER_CREATED_CONTENT_FIELD_NUMBER = 18;
    private int color_;
    private boolean editProfileDisabled_;
    private int followersCount_;
    private int followingCount_;
    private boolean hasSpotifyImage_;
    private String imageUrl_ = "";
    private boolean isCurrentUser_;
    private boolean isDismissed_;
    private boolean isFollowing_;
    private boolean isVerified_;
    private String name_ = "";
    private yve.C1781h publicPlaylists_ = C1075c.emptyProtobufList();
    private yve.C1781h recentlyPlayedArtists_ = C1075c.emptyProtobufList();
    private boolean reportAbuseDisabled_;
    private int totalPublicPlaylistsCount_;
    private String uri_ = "";
    private yve.C1781h userCreatedContent_ = C1075c.emptyProtobufList();

    /* renamed from: com.spotify.music.features.profile.proto.ProfilemodelRequest$Profile$a */
    public static final class C3940a extends C1075c.C1076a implements knh {
        public C3940a(sfn sfn) {
            super(ProfilemodelRequest$Profile.DEFAULT_INSTANCE);
        }
    }

    static {
        ProfilemodelRequest$Profile profilemodelRequest$Profile = new ProfilemodelRequest$Profile();
        DEFAULT_INSTANCE = profilemodelRequest$Profile;
        Class<ProfilemodelRequest$Profile> cls = ProfilemodelRequest$Profile.class;
        C1075c.registerDefaultInstance(ProfilemodelRequest$Profile.class, profilemodelRequest$Profile);
    }

    public static nqk parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* renamed from: A */
    public List mo42045A() {
        return this.userCreatedContent_;
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
                Class<PlaylistlistResponse$Playlist> cls2 = PlaylistlistResponse$Playlist.class;
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0011\u0000\u0000\u0001\u0012\u0011\u0000\u0003\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0004\u0005\u0004\u0006\u0007\u0007\u001b\b\u001b\t\u0004\n\u0007\u000b\u0007\f\u0007\r\u0007\u000f\u0007\u0010\u0004\u0011\u0007\u0012\u001b", new Object[]{"uri_", "name_", "imageUrl_", "followersCount_", "followingCount_", "isFollowing_", "recentlyPlayedArtists_", ArtistlistResponse$Artist.class, "publicPlaylists_", PlaylistlistResponse$Playlist.class, "totalPublicPlaylistsCount_", "isCurrentUser_", "isVerified_", "editProfileDisabled_", "reportAbuseDisabled_", "hasSpotifyImage_", "color_", "isDismissed_", "userCreatedContent_", UserepisodelistResponse$UserEpisode.class});
            case 3:
                return new ProfilemodelRequest$Profile();
            case 4:
                return new C3940a((sfn) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<ProfilemodelRequest$Profile> nqk = PARSER;
                if (nqk == null) {
                    Class<ProfilemodelRequest$Profile> cls3 = ProfilemodelRequest$Profile.class;
                    synchronized (ProfilemodelRequest$Profile.class) {
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
    public int mo42048o() {
        return this.color_;
    }

    /* renamed from: p */
    public boolean mo42049p() {
        return this.editProfileDisabled_;
    }

    /* renamed from: q */
    public int mo42050q() {
        return this.followersCount_;
    }

    /* renamed from: r */
    public int mo42051r() {
        return this.followingCount_;
    }

    /* renamed from: s */
    public boolean mo42052s() {
        return this.hasSpotifyImage_;
    }

    /* renamed from: t */
    public String mo42053t() {
        return this.imageUrl_;
    }

    /* renamed from: u */
    public boolean mo42054u() {
        return this.isFollowing_;
    }

    /* renamed from: v */
    public boolean mo42055v() {
        return this.isVerified_;
    }

    /* renamed from: w */
    public List mo42056w() {
        return this.publicPlaylists_;
    }

    /* renamed from: x */
    public List mo42057x() {
        return this.recentlyPlayedArtists_;
    }

    /* renamed from: y */
    public boolean mo42058y() {
        return this.reportAbuseDisabled_;
    }

    /* renamed from: z */
    public int mo42059z() {
        return this.totalPublicPlaylistsCount_;
    }
}
