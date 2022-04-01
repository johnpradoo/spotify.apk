package com.spotify.music.features.profile.entity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.navigation.constants.FeatureIdentifiers;
import com.spotify.navigation.identifier.FeatureIdentifier;
import com.spotify.navigation.identifier.ViewUri;
import com.spotify.tome.pageloader.C5936c;
import com.spotify.tome.pageloader.DefaultPageLoaderView;
import p015p.C6349f9;
import p015p.C6474nm;
import p015p.a35;
import p015p.a4w;
import p015p.ddp;
import p015p.dpp;
import p015p.dxb;
import p015p.f4g;
import p015p.fdc;
import p015p.fl5;
import p015p.fui;
import p015p.g1s;
import p015p.gtk;
import p015p.gun;
import p015p.jui;
import p015p.kvs;
import p015p.lat;
import p015p.lvs;
import p015p.m28;
import p015p.mrj;
import p015p.nfn;
import p015p.qnk;
import p015p.ran;
import p015p.rkk;
import p015p.sgr;
import p015p.skk;
import p015p.tkk;
import p015p.uqm;
import p015p.uzo;
import p015p.wa6;
import p015p.wet;
import p015p.wi0;
import p015p.wxb;
import p015p.x0v;
import p015p.x3s;
import p015p.xxb;
import p015p.ztg;
import p015p.zuj;

public final class ProfileEntityFragment extends Fragment implements xxb, skk, wet.C3673c, wet.C3674d, ViewUri.C4470b, nfn {

    /* renamed from: F0 */
    public static final gtk f51064F0 = new gtk(0);

    /* renamed from: A0 */
    public ddp f51065A0;

    /* renamed from: B0 */
    public uzo f51066B0;

    /* renamed from: C0 */
    public ran f51067C0;

    /* renamed from: D0 */
    public final kvs f51068D0 = dpp.m38575e(new ztg(this));

    /* renamed from: E0 */
    public final FeatureIdentifier f51069E0 = FeatureIdentifiers.f53866m1;

    /* renamed from: v0 */
    public final wi0 f51070v0;

    /* renamed from: w0 */
    public fui f51071w0;

    /* renamed from: x0 */
    public jui f51072x0;

    /* renamed from: y0 */
    public a35 f51073y0;

    /* renamed from: z0 */
    public a4w f51074z0;

    public static final class FailLoadingProfileEntityException extends RuntimeException {
        public FailLoadingProfileEntityException() {
            super("Failed loading profile entity");
        }
    }

    public ProfileEntityFragment(wi0 wi0) {
        this.f51070v0 = wi0;
    }

    /* renamed from: K */
    public String mo23393K() {
        return mo29106e().f53907a;
    }

    /* renamed from: K0 */
    public void mo1954K0(Context context) {
        super.mo1954K0(context);
        this.f51070v0.mo32256a(this);
    }

    /* renamed from: O0 */
    public View mo1958O0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String r = x3s.m49211x(mo1987l1().getString("key_profile_uri")).mo56171r();
        String string = mo1987l1().getString("key_current_username");
        a35 a35 = this.f51073y0;
        if (a35 != null) {
            x0v x0v = new x0v((lvs) new wa6(a35, r, string));
            ddp ddp = this.f51065A0;
            if (ddp != null) {
                mrj i0 = x0v.mo63461i0(ddp);
                g1s g1s = g1s.f91387E;
                fl5 fl5 = fdc.f90862d;
                C6349f9 f9Var = fdc.f90861c;
                f4g b = zuj.m63317b(i0.mo63423F(g1s, fl5, f9Var, f9Var).mo63430J(sgr.f100043H), (C5936c) null, 2);
                fui fui = this.f51071w0;
                if (fui != null) {
                    this.f51066B0 = fui.mo49323a(b);
                    jui jui = this.f51072x0;
                    if (jui != null) {
                        m28 m28 = (m28) jui.mo50905a(mo29106e(), mo23394R());
                        m28.f95606a.f86286b = new C6474nm(this);
                        DefaultPageLoaderView defaultPageLoaderView = (DefaultPageLoaderView) m28.mo63224a(layoutInflater.getContext());
                        defaultPageLoaderView.mo57993H(mo1946C0(), this.f51066B0);
                        return defaultPageLoaderView;
                    }
                    lat.m42674A("profileEntityViewBuilderFactory");
                    throw null;
                }
                lat.m42674A("profileEntityPageLoaderFactory");
                throw null;
            }
            lat.m42674A("mainThreadScheduler");
            throw null;
        }
        lat.m42674A("profileEntityDataLoader");
        throw null;
    }

    /* renamed from: R */
    public qnk mo23394R() {
        return qnk.m59486b(tkk.PROFILE, (String) null);
    }

    /* renamed from: U0 */
    public void mo1964U0() {
        this.f1239b0 = true;
        this.f51066B0.mo65446d();
    }

    /* renamed from: V */
    public String mo41975V() {
        String string = mo1987l1().getString("key_profile_uri");
        int i = uqm.f19620a;
        return string;
    }

    /* renamed from: V0 */
    public void mo1965V0(Menu menu) {
        ran ran = this.f51067C0;
        if (ran != null) {
            dxb k1 = mo1985k1();
            menu.clear();
            ran.mo47103d0(gun.m40140a(k1, menu, ran.mo29106e()));
        }
    }

    /* renamed from: Y0 */
    public void mo1968Y0() {
        this.f1239b0 = true;
        this.f51066B0.mo65444b();
    }

    /* renamed from: Z */
    public String mo23395Z(Context context) {
        return "";
    }

    /* renamed from: e */
    public ViewUri mo29106e() {
        return (ViewUri) this.f51068D0.get();
    }

    /* renamed from: m */
    public rkk mo29107m() {
        return tkk.PROFILE;
    }

    /* renamed from: s */
    public /* synthetic */ Fragment mo23396s() {
        return wxb.m49117a(this);
    }

    /* renamed from: t */
    public FeatureIdentifier mo23397t() {
        return this.f51069E0;
    }
}
