package com.spotify.music.features.profile.entity;

import com.spotify.navigation.constants.FeatureIdentifiers;
import com.spotify.navigation.identifier.ViewUri;
import com.spotify.tome.pageloader.C5936c;
import java.util.Objects;
import p015p.C6349f9;
import p015p.a35;
import p015p.abj;
import p015p.aft;
import p015p.bkk;
import p015p.ddp;
import p015p.f4g;
import p015p.fae;
import p015p.fdc;
import p015p.fgt;
import p015p.fl5;
import p015p.g4g;
import p015p.ggt;
import p015p.i9u;
import p015p.icp;
import p015p.it9;
import p015p.j9u;
import p015p.khf;
import p015p.lcn;
import p015p.lvs;
import p015p.mft;
import p015p.mrj;
import p015p.oan;
import p015p.oft;
import p015p.p6l;
import p015p.pmk;
import p015p.s89;
import p015p.t4g;
import p015p.tkk;
import p015p.v0t;
import p015p.van;
import p015p.w4g;
import p015p.wa6;
import p015p.wan;
import p015p.x0v;
import p015p.x3s;
import p015p.x4g;
import p015p.xlq;
import p015p.ybn;
import p015p.yct;
import p015p.yjk;
import p015p.yos;
import p015p.ytu;
import p015p.zuj;

public final class ProfileEntityPage implements yjk {

    /* renamed from: a */
    public final t4g f51075a;

    /* renamed from: b */
    public final ddp f51076b;

    /* renamed from: c */
    public final a35 f51077c;

    /* renamed from: d */
    public final ProfileEntityPageParameters f51078d;

    /* renamed from: e */
    public final wan f51079e;

    /* renamed from: f */
    public final pmk f51080f;

    public static final class FailLoadingProfileEntityException extends RuntimeException {
        public FailLoadingProfileEntityException() {
            super("Failed loading profile entity");
        }
    }

    public ProfileEntityPage(t4g t4g, ddp ddp, a35 a35, ProfileEntityPageParameters profileEntityPageParameters, wan wan) {
        this.f51075a = t4g;
        this.f51076b = ddp;
        this.f51077c = a35;
        this.f51078d = profileEntityPageParameters;
        this.f51079e = wan;
        this.f51080f = new pmk(new yct(new yos("")), new fae(tkk.PROFILE, new ViewUri(profileEntityPageParameters.f51081a)), new ggt(fgt.TRANSPARENT), new khf(FeatureIdentifiers.f53866m1), new aft(new mft[0]), new v0t(profileEntityPageParameters.f51081a));
    }

    /* renamed from: a */
    public pmk mo17109a() {
        return this.f51080f;
    }

    public bkk content() {
        t4g t4g = this.f51075a;
        a35 a35 = this.f51077c;
        String r = x3s.m49211x(this.f51078d.f51081a).mo56171r();
        if (r != null) {
            String str = this.f51078d.f51082b;
            Objects.requireNonNull(a35);
            mrj i0 = new x0v((lvs) new wa6(a35, r, str)).mo63461i0(this.f51076b);
            s89 s89 = new s89(this);
            fl5 fl5 = fdc.f90862d;
            C6349f9 f9Var = fdc.f90861c;
            f4g b = zuj.m63317b(i0.mo63423F(s89, fl5, f9Var, f9Var).mo63430J(new ytu(this)), (C5936c) null, 2);
            wan wan = this.f51079e;
            pmk pmk = this.f51080f;
            it9 it9 = wan.f81539a;
            Object obj = it9.f33016a.get();
            Object obj2 = obj;
            Object obj3 = it9.f33017b.get();
            Object obj4 = obj3;
            Object obj5 = it9.f33018c.get();
            Object obj6 = obj5;
            Object obj7 = it9.f33019d.get();
            Object obj8 = obj7;
            Object obj9 = it9.f33021f.get();
            Object obj10 = obj9;
            Object obj11 = it9.f33022g.get();
            Object obj12 = obj11;
            Object obj13 = it9.f33023h.get();
            Object obj14 = obj13;
            van van = r11;
            pmk pmk2 = pmk;
            van van2 = new van((ybn) obj, (lcn) obj3, (icp) obj5, (xlq) obj7, (abj) it9.f33020e.get(), (oan) obj9, pmk, (oft) obj11, (ViewUri.C4470b) obj13);
            g4g g4g = r3;
            van van3 = van2;
            g4g g4g2 = new g4g(van2, (p6l) null, (i9u) null, (j9u) null, false, 30);
            x4g x4g = (x4g) t4g;
            Objects.requireNonNull(x4g);
            return new w4g(x4g, b, g4g2);
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
