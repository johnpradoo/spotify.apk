package com.spotify.music.features.profile.profilelist;

import com.spotify.music.features.profile.model.ProfileListData;
import com.spotify.navigation.constants.FeatureIdentifiers;
import com.spotify.navigation.identifier.ViewUri;
import com.spotify.tome.pageloader.C5936c;
import java.util.Objects;
import p015p.C6349f9;
import p015p.bkk;
import p015p.dub;
import p015p.f4g;
import p015p.fae;
import p015p.fdc;
import p015p.fl5;
import p015p.ft9;
import p015p.g4g;
import p015p.i9u;
import p015p.j9u;
import p015p.khf;
import p015p.mrj;
import p015p.p6l;
import p015p.pdn;
import p015p.pmk;
import p015p.rkk;
import p015p.t4g;
import p015p.v0t;
import p015p.w4g;
import p015p.wcn;
import p015p.x4g;
import p015p.xdn;
import p015p.xmo;
import p015p.yct;
import p015p.yfd;
import p015p.yjk;
import p015p.zuj;

public final class ProfileListPage implements yjk {

    /* renamed from: a */
    public final t4g f51135a;

    /* renamed from: b */
    public final wcn f51136b;

    /* renamed from: c */
    public final xdn f51137c;

    /* renamed from: d */
    public final pmk f51138d;

    public static final class FailLoadingProfileListException extends RuntimeException {
        public FailLoadingProfileListException() {
            super("Failed loading profile list");
        }
    }

    public ProfileListPage(t4g t4g, wcn wcn, ProfileListPageParameters profileListPageParameters, xdn xdn, pdn pdn) {
        this.f51135a = t4g;
        this.f51136b = wcn;
        this.f51137c = xdn;
        this.f51138d = new pmk(new yct(new xmo(((Number) pdn.f72627e.getValue()).intValue())), new fae((rkk) pdn.f72626d.getValue(), (ViewUri) pdn.f72625c.getValue()), new khf(FeatureIdentifiers.f53869n1), new v0t(profileListPageParameters.f51139a));
    }

    /* renamed from: a */
    public pmk mo17109a() {
        return this.f51138d;
    }

    public bkk content() {
        t4g t4g = this.f51135a;
        mrj a = ((dub) this.f51136b).mo48526a(ProfileListData.f51116a);
        yfd yfd = new yfd(this);
        fl5 fl5 = fdc.f90862d;
        C6349f9 f9Var = fdc.f90861c;
        f4g b = zuj.m63317b(a.mo63423F(yfd, fl5, f9Var, f9Var).mo63430J(new ft9(this)), (C5936c) null, 2);
        g4g g4g = r2;
        g4g g4g2 = new g4g(this.f51137c, (p6l) null, (i9u) null, (j9u) null, false, 30);
        x4g x4g = (x4g) t4g;
        Objects.requireNonNull(x4g);
        return new w4g(x4g, b, g4g2);
    }
}
