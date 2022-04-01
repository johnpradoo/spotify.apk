package com.spotify.music.features.profile.proto;

import com.google.protobuf.C1075c;
import p015p.knh;
import p015p.nqk;
import p015p.s2m;

public final class PlaylistlistResponse$Playlist extends C1075c implements knh {
    /* access modifiers changed from: private */
    public static final PlaylistlistResponse$Playlist DEFAULT_INSTANCE;
    public static final int FOLLOWERS_COUNT_FIELD_NUMBER = 4;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    public static final int IS_FOLLOWING_FIELD_NUMBER = 7;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int OWNER_NAME_FIELD_NUMBER = 5;
    public static final int OWNER_URI_FIELD_NUMBER = 6;
    private static volatile nqk<PlaylistlistResponse$Playlist> PARSER = null;
    public static final int URI_FIELD_NUMBER = 1;
    private int followersCount_;
    private String imageUrl_ = "";
    private boolean isFollowing_;
    private String name_ = "";
    private String ownerName_ = "";
    private String ownerUri_ = "";
    private String uri_ = "";

    /* renamed from: com.spotify.music.features.profile.proto.PlaylistlistResponse$Playlist$a */
    public static final class C3936a extends C1075c.C1076a implements knh {
        public C3936a(s2m s2m) {
            super(PlaylistlistResponse$Playlist.DEFAULT_INSTANCE);
        }
    }

    static {
        PlaylistlistResponse$Playlist playlistlistResponse$Playlist = new PlaylistlistResponse$Playlist();
        DEFAULT_INSTANCE = playlistlistResponse$Playlist;
        Class<PlaylistlistResponse$Playlist> cls = PlaylistlistResponse$Playlist.class;
        C1075c.registerDefaultInstance(PlaylistlistResponse$Playlist.class, playlistlistResponse$Playlist);
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
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0004\u0005Ȉ\u0006Ȉ\u0007\u0007", new Object[]{"uri_", "name_", "imageUrl_", "followersCount_", "ownerName_", "ownerUri_", "isFollowing_"});
            case 3:
                return new PlaylistlistResponse$Playlist();
            case 4:
                return new C3936a((s2m) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<PlaylistlistResponse$Playlist> nqk = PARSER;
                if (nqk == null) {
                    Class<PlaylistlistResponse$Playlist> cls = PlaylistlistResponse$Playlist.class;
                    synchronized (PlaylistlistResponse$Playlist.class) {
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
    public int mo42035o() {
        return this.followersCount_;
    }

    /* renamed from: p */
    public String mo42036p() {
        return this.imageUrl_;
    }
}
