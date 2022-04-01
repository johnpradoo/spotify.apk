package com.spotify.music.features.profile.model;

import com.spotify.music.features.profile.entity.utils.UserInfo;
import com.spotify.music.features.profile.follow.FollowState;
import com.spotify.music.features.profile.model.ProfileListItem;
import java.util.Objects;
import p015p.tff;
import p015p.umw;

/* renamed from: com.spotify.music.features.profile.model.$AutoValue_ProfileListItem  reason: invalid class name */
public abstract class C$AutoValue_ProfileListItem extends ProfileListItem {

    /* renamed from: C */
    public final FollowState f51097C;

    /* renamed from: D */
    public final String f51098D;

    /* renamed from: E */
    public final Long f51099E;

    /* renamed from: F */
    public final UserInfo f51100F;

    /* renamed from: a */
    public final ProfileListItem.C3931b f51101a;

    /* renamed from: b */
    public final String f51102b;

    /* renamed from: c */
    public final String f51103c;

    /* renamed from: d */
    public final String f51104d;

    /* renamed from: t */
    public final String f51105t;

    /* renamed from: com.spotify.music.features.profile.model.$AutoValue_ProfileListItem$b */
    public static final class C3926b extends ProfileListItem.C3930a {

        /* renamed from: a */
        public ProfileListItem.C3931b f51106a;

        /* renamed from: b */
        public String f51107b;

        /* renamed from: c */
        public String f51108c;

        /* renamed from: d */
        public String f51109d;

        /* renamed from: e */
        public String f51110e;

        /* renamed from: f */
        public FollowState f51111f;

        /* renamed from: g */
        public String f51112g;

        /* renamed from: h */
        public Long f51113h;

        /* renamed from: i */
        public UserInfo f51114i;

        public C3926b() {
        }

        /* renamed from: a */
        public ProfileListItem mo42009a() {
            String str = this.f51106a == null ? " type" : "";
            if (this.f51107b == null) {
                str = tff.m60686a(str, " uri");
            }
            if (this.f51108c == null) {
                str = tff.m60686a(str, " title");
            }
            if (this.f51109d == null) {
                str = tff.m60686a(str, " subtitle");
            }
            if (this.f51111f == null) {
                str = tff.m60686a(str, " followState");
            }
            if (str.isEmpty()) {
                return new AutoValue_ProfileListItem(this.f51106a, this.f51107b, this.f51108c, this.f51109d, this.f51110e, this.f51111f, this.f51112g, this.f51113h, this.f51114i);
            }
            throw new IllegalStateException(tff.m60686a("Missing required properties:", str));
        }

        /* renamed from: b */
        public ProfileListItem.C3930a mo42010b(String str) {
            Objects.requireNonNull(str, "Null subtitle");
            this.f51109d = str;
            return this;
        }

        /* renamed from: c */
        public ProfileListItem.C3930a mo42011c(String str) {
            Objects.requireNonNull(str, "Null title");
            this.f51108c = str;
            return this;
        }

        /* renamed from: d */
        public ProfileListItem.C3930a mo42012d(String str) {
            Objects.requireNonNull(str, "Null uri");
            this.f51107b = str;
            return this;
        }

        /* renamed from: e */
        public ProfileListItem.C3930a mo42013e(FollowState followState) {
            Objects.requireNonNull(followState, "Null followState");
            this.f51111f = followState;
            return this;
        }

        /* renamed from: f */
        public ProfileListItem.C3930a mo42014f(ProfileListItem.C3931b bVar) {
            this.f51106a = bVar;
            return this;
        }

        public C3926b(ProfileListItem profileListItem, C3925a aVar) {
            C$AutoValue_ProfileListItem _autovalue_profilelistitem = (C$AutoValue_ProfileListItem) profileListItem;
            this.f51106a = _autovalue_profilelistitem.f51101a;
            this.f51107b = _autovalue_profilelistitem.f51102b;
            this.f51108c = _autovalue_profilelistitem.f51103c;
            this.f51109d = _autovalue_profilelistitem.f51104d;
            this.f51110e = _autovalue_profilelistitem.f51105t;
            this.f51111f = _autovalue_profilelistitem.f51097C;
            this.f51112g = _autovalue_profilelistitem.f51098D;
            this.f51113h = _autovalue_profilelistitem.f51099E;
            this.f51114i = _autovalue_profilelistitem.f51100F;
        }
    }

    public C$AutoValue_ProfileListItem(ProfileListItem.C3931b bVar, String str, String str2, String str3, String str4, FollowState followState, String str5, Long l, UserInfo userInfo) {
        Objects.requireNonNull(bVar, "Null type");
        this.f51101a = bVar;
        Objects.requireNonNull(str, "Null uri");
        this.f51102b = str;
        Objects.requireNonNull(str2, "Null title");
        this.f51103c = str2;
        Objects.requireNonNull(str3, "Null subtitle");
        this.f51104d = str3;
        this.f51105t = str4;
        Objects.requireNonNull(followState, "Null followState");
        this.f51097C = followState;
        this.f51098D = str5;
        this.f51099E = l;
        this.f51100F = userInfo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0068, code lost:
        if (r1.equals(r6.f51105t) != false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008e, code lost:
        if (r1.equals(r6.f51098D) != false) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a6, code lost:
        if (r1.equals(r6.f51099E) != false) goto L_0x00a8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r4 = "  ~@~@~@~@~@~@~@~@~@~@~   Smob - Mod obfuscation tool v1.4 by Kirlif'   ~@~@~@~@~@~@~@~@~@~@~  "
            r0 = 1
            r4 = 6
            if (r6 != r5) goto L_0x0008
            r4 = 5
            return r0
        L_0x0008:
            r4 = 7
            boolean r1 = r6 instanceof com.spotify.music.features.profile.model.ProfileListItem
            r4 = 2
            r2 = 0
            r4 = 4
            if (r1 == 0) goto L_0x00c6
            com.spotify.music.features.profile.model.ProfileListItem r6 = (com.spotify.music.features.profile.model.ProfileListItem) r6
            r4 = 2
            com.spotify.music.features.profile.model.ProfileListItem$b r1 = r5.f51101a
            r3 = r6
            r3 = r6
            r4 = 1
            com.spotify.music.features.profile.model.$AutoValue_ProfileListItem r3 = (com.spotify.music.features.profile.model.C$AutoValue_ProfileListItem) r3
            r4 = 5
            com.spotify.music.features.profile.model.ProfileListItem$b r3 = r3.f51101a
            r4 = 4
            boolean r1 = r1.equals(r3)
            r4 = 7
            if (r1 == 0) goto L_0x00c2
            r4 = 7
            java.lang.String r1 = r5.f51102b
            r4 = 2
            com.spotify.music.features.profile.model.$AutoValue_ProfileListItem r6 = (com.spotify.music.features.profile.model.C$AutoValue_ProfileListItem) r6
            r4 = 2
            java.lang.String r3 = r6.f51102b
            r4 = 1
            boolean r1 = r1.equals(r3)
            r4 = 4
            if (r1 == 0) goto L_0x00c2
            r4 = 7
            java.lang.String r1 = r5.f51103c
            r4 = 3
            java.lang.String r3 = r6.f51103c
            boolean r1 = r1.equals(r3)
            r4 = 7
            if (r1 == 0) goto L_0x00c2
            r4 = 2
            java.lang.String r1 = r5.f51104d
            r4 = 4
            java.lang.String r3 = r6.f51104d
            r4 = 1
            boolean r1 = r1.equals(r3)
            r4 = 5
            if (r1 == 0) goto L_0x00c2
            r4 = 2
            java.lang.String r1 = r5.f51105t
            r4 = 1
            if (r1 != 0) goto L_0x005f
            r4 = 7
            java.lang.String r1 = r6.f51105t
            r4 = 5
            if (r1 != 0) goto L_0x00c2
            r4 = 1
            goto L_0x006a
        L_0x005f:
            r4 = 7
            java.lang.String r3 = r6.f51105t
            r4 = 2
            boolean r1 = r1.equals(r3)
            r4 = 3
            if (r1 == 0) goto L_0x00c2
        L_0x006a:
            r4 = 4
            com.spotify.music.features.profile.follow.FollowState r1 = r5.f51097C
            r4 = 0
            com.spotify.music.features.profile.follow.FollowState r3 = r6.f51097C
            r4 = 5
            boolean r1 = r1.equals(r3)
            r4 = 6
            if (r1 == 0) goto L_0x00c2
            r4 = 7
            java.lang.String r1 = r5.f51098D
            r4 = 5
            if (r1 != 0) goto L_0x0086
            r4 = 2
            java.lang.String r1 = r6.f51098D
            r4 = 6
            if (r1 != 0) goto L_0x00c2
            r4 = 6
            goto L_0x0090
        L_0x0086:
            java.lang.String r3 = r6.f51098D
            r4 = 0
            boolean r1 = r1.equals(r3)
            r4 = 6
            if (r1 == 0) goto L_0x00c2
        L_0x0090:
            java.lang.Long r1 = r5.f51099E
            r4 = 4
            if (r1 != 0) goto L_0x009d
            r4 = 3
            java.lang.Long r1 = r6.f51099E
            r4 = 6
            if (r1 != 0) goto L_0x00c2
            r4 = 6
            goto L_0x00a8
        L_0x009d:
            r4 = 0
            java.lang.Long r3 = r6.f51099E
            r4 = 1
            boolean r1 = r1.equals(r3)
            r4 = 1
            if (r1 == 0) goto L_0x00c2
        L_0x00a8:
            r4 = 7
            com.spotify.music.features.profile.entity.utils.UserInfo r1 = r5.f51100F
            if (r1 != 0) goto L_0x00b5
            r4 = 2
            com.spotify.music.features.profile.entity.utils.UserInfo r6 = r6.f51100F
            r4 = 5
            if (r6 != 0) goto L_0x00c2
            r4 = 7
            goto L_0x00c4
        L_0x00b5:
            r4 = 5
            com.spotify.music.features.profile.entity.utils.UserInfo r6 = r6.f51100F
            r4 = 6
            boolean r6 = r1.equals(r6)
            r4 = 2
            if (r6 == 0) goto L_0x00c2
            r4 = 6
            goto L_0x00c4
        L_0x00c2:
            r4 = 7
            r0 = 0
        L_0x00c4:
            r4 = 3
            return r0
        L_0x00c6:
            r4 = 7
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.profile.model.C$AutoValue_ProfileListItem.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int hashCode = (((((((this.f51101a.hashCode() ^ 1000003) * 1000003) ^ this.f51102b.hashCode()) * 1000003) ^ this.f51103c.hashCode()) * 1000003) ^ this.f51104d.hashCode()) * 1000003;
        String str = this.f51105t;
        int i = 0;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f51097C.hashCode()) * 1000003;
        String str2 = this.f51098D;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Long l = this.f51099E;
        int hashCode4 = (hashCode3 ^ (l == null ? 0 : l.hashCode())) * 1000003;
        UserInfo userInfo = this.f51100F;
        if (userInfo != null) {
            i = userInfo.hashCode();
        }
        return hashCode4 ^ i;
    }

    public String toString() {
        StringBuilder a = umw.m61161a("ProfileListItem{type=");
        a.append(this.f51101a);
        a.append(", uri=");
        a.append(this.f51102b);
        a.append(", title=");
        a.append(this.f51103c);
        a.append(", subtitle=");
        a.append(this.f51104d);
        a.append(", imageUri=");
        a.append(this.f51105t);
        a.append(", followState=");
        a.append(this.f51097C);
        a.append(", publishTime=");
        a.append(this.f51098D);
        a.append(", durationMs=");
        a.append(this.f51099E);
        a.append(", userInfo=");
        a.append(this.f51100F);
        a.append("}");
        return a.toString();
    }
}
