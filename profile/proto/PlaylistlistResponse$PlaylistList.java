package com.spotify.music.features.profile.proto;

import com.google.protobuf.C1075c;
import java.util.List;
import p015p.knh;
import p015p.nqk;
import p015p.s2m;
import p015p.yve;

public final class PlaylistlistResponse$PlaylistList extends C1075c implements knh {
    /* access modifiers changed from: private */
    public static final PlaylistlistResponse$PlaylistList DEFAULT_INSTANCE;
    private static volatile nqk<PlaylistlistResponse$PlaylistList> PARSER = null;
    public static final int PLAYLISTS_FIELD_NUMBER = 1;
    public static final int TOTAL_PUBLIC_PLAYLISTS_COUNT_FIELD_NUMBER = 2;
    private yve.C1781h playlists_ = C1075c.emptyProtobufList();
    private int totalPublicPlaylistsCount_;

    /* renamed from: com.spotify.music.features.profile.proto.PlaylistlistResponse$PlaylistList$a */
    public static final class C3937a extends C1075c.C1076a implements knh {
        public C3937a(s2m s2m) {
            super(PlaylistlistResponse$PlaylistList.DEFAULT_INSTANCE);
        }
    }

    static {
        PlaylistlistResponse$PlaylistList playlistlistResponse$PlaylistList = new PlaylistlistResponse$PlaylistList();
        DEFAULT_INSTANCE = playlistlistResponse$PlaylistList;
        Class<PlaylistlistResponse$PlaylistList> cls = PlaylistlistResponse$PlaylistList.class;
        C1075c.registerDefaultInstance(PlaylistlistResponse$PlaylistList.class, playlistlistResponse$PlaylistList);
    }

    /* renamed from: o */
    public static PlaylistlistResponse$PlaylistList m34027o() {
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
                Class<PlaylistlistResponse$Playlist> cls = PlaylistlistResponse$Playlist.class;
                return C1075c.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0004", new Object[]{"playlists_", PlaylistlistResponse$Playlist.class, "totalPublicPlaylistsCount_"});
            case 3:
                return new PlaylistlistResponse$PlaylistList();
            case 4:
                return new C3937a((s2m) null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nqk<PlaylistlistResponse$PlaylistList> nqk = PARSER;
                if (nqk == null) {
                    Class<PlaylistlistResponse$PlaylistList> cls2 = PlaylistlistResponse$PlaylistList.class;
                    synchronized (PlaylistlistResponse$PlaylistList.class) {
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

    /* renamed from: p */
    public List mo42037p() {
        return this.playlists_;
    }
}
