package com.spotify.music.features.profile.profilelist;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.music.features.profile.model.ProfileListData;
import com.spotify.navigation.constants.FeatureIdentifiers;
import com.spotify.navigation.identifier.FeatureIdentifier;
import com.spotify.navigation.identifier.ViewUri;
import com.spotify.tome.pageloader.C5936c;
import com.spotify.tome.pageloader.DefaultPageLoaderView;
import p015p.C6349f9;
import p015p.cmk;
import p015p.dub;
import p015p.f4g;
import p015p.fdc;
import p015p.fl5;
import p015p.fui;
import p015p.jui;
import p015p.kfp;
import p015p.l27;
import p015p.l3s;
import p015p.lat;
import p015p.m28;
import p015p.mrj;
import p015p.pdn;
import p015p.qdn;
import p015p.qk0;
import p015p.qnk;
import p015p.rkk;
import p015p.skk;
import p015p.uu9;
import p015p.uzo;
import p015p.v28;
import p015p.wxb;
import p015p.xcn;
import p015p.xxb;
import p015p.ydn;
import p015p.zuj;

public final class ProfileListFragment extends l27 implements xxb, skk, ViewUri.C4470b, ydn {

    /* renamed from: B0 */
    public static final /* synthetic */ int f51129B0 = 0;

    /* renamed from: A0 */
    public uzo f51130A0;

    /* renamed from: w0 */
    public xcn f51131w0;

    /* renamed from: x0 */
    public fui f51132x0;

    /* renamed from: y0 */
    public jui f51133y0;

    /* renamed from: z0 */
    public l3s f51134z0;

    public static final class FailLoadingProfileListDataException extends RuntimeException {
        public FailLoadingProfileListDataException() {
            super("Failed loading profile list data");
        }
    }

    /* renamed from: K */
    public String mo23393K() {
        return mo29106e().f53907a;
    }

    /* renamed from: O0 */
    public View mo1958O0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String w = mo42023w();
        xcn xcn = this.f51131w0;
        if (xcn != null) {
            dub dub = (dub) xcn.mo56237a(w);
            mrj a = dub.mo48526a(ProfileListData.f51116a);
            kfp kfp = kfp.f94429I;
            fl5 fl5 = fdc.f90862d;
            C6349f9 f9Var = fdc.f90861c;
            f4g b = zuj.m63317b(a.mo63423F(kfp, fl5, f9Var, f9Var).mo63430J(v28.f102363E), (C5936c) null, 2);
            jui jui = this.f51133y0;
            if (jui != null) {
                m28 m28 = (m28) jui.mo50905a(mo29106e(), mo23394R());
                m28.f95606a.f86286b = new uu9(this, new qdn(dub.mo48527b(), mo1987l1().getString("current-user"), (ProfileListData) null, 4));
                cmk a2 = m28.mo63224a(mo1989m1());
                fui fui = this.f51132x0;
                if (fui != null) {
                    uzo a3 = fui.mo49323a(b);
                    DefaultPageLoaderView defaultPageLoaderView = (DefaultPageLoaderView) a2;
                    defaultPageLoaderView.mo57993H(mo1946C0(), a3);
                    this.f51130A0 = a3;
                    return defaultPageLoaderView;
                }
                lat.m42674A("pageLoaderFactory");
                throw null;
            }
            lat.m42674A("viewBuilderFactory");
            throw null;
        }
        lat.m42674A("profileListDataSourceResolver");
        throw null;
    }

    /* renamed from: R */
    public qnk mo23394R() {
        qk0 qk0 = pdn.f72622f;
        return qk0.mo53673b(qk0.mo53674c(mo42023w()));
    }

    /* renamed from: U0 */
    public void mo1964U0() {
        this.f1239b0 = true;
        this.f51130A0.mo65446d();
    }

    /* renamed from: Y0 */
    public void mo1968Y0() {
        this.f1239b0 = true;
        this.f51130A0.mo65444b();
    }

    /* renamed from: Z */
    public String mo23395Z(Context context) {
        qk0 qk0 = pdn.f72622f;
        return context.getString(qk0.mo53675d(qk0.mo53674c(mo42023w())));
    }

    /* renamed from: e */
    public ViewUri mo29106e() {
        return new ViewUri(mo42023w());
    }

    /* renamed from: m */
    public rkk mo29107m() {
        qk0 qk0 = pdn.f72622f;
        return qk0.mo53672a(qk0.mo53674c(mo42023w()));
    }

    /* renamed from: s */
    public /* synthetic */ Fragment mo23396s() {
        return wxb.m49117a(this);
    }

    /* renamed from: t */
    public FeatureIdentifier mo23397t() {
        return FeatureIdentifiers.f53869n1;
    }

    /* renamed from: w */
    public String mo42023w() {
        return mo1987l1().getString("uri");
    }
}
