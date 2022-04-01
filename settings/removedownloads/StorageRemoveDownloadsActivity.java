package com.spotify.music.features.settings.removedownloads;

import android.os.Bundle;
import com.spotify.music.R;
import p015p.C6567tj;
import p015p.bd2;
import p015p.cz7;
import p015p.f4x;
import p015p.ggi;
import p015p.hiu;
import p015p.la5;
import p015p.lau;
import p015p.mau;
import p015p.nau;
import p015p.oka;
import p015p.s90;
import p015p.u2s;
import p015p.v0k;
import p015p.yau;
import p015p.ybh;
import p015p.yhc;
import p015p.zau;

public class StorageRemoveDownloadsActivity extends u2s {

    /* renamed from: W */
    public static final /* synthetic */ int f51230W = 0;

    /* renamed from: S */
    public v0k f51231S;

    /* renamed from: T */
    public hiu f51232T;

    /* renamed from: U */
    public final ggi f51233U = new ggi();

    /* renamed from: V */
    public final la5 f51234V = new C3964a();

    /* renamed from: com.spotify.music.features.settings.removedownloads.StorageRemoveDownloadsActivity$a */
    public class C3964a implements la5 {
        public C3964a() {
        }

        /* renamed from: a */
        public void mo42201a() {
            StorageRemoveDownloadsActivity storageRemoveDownloadsActivity = StorageRemoveDownloadsActivity.this;
            hiu hiu = storageRemoveDownloadsActivity.f51232T;
            ggi.C6366a.C6368b b = storageRemoveDownloadsActivity.f51233U.mo61785h().mo61787b();
            mau g = b.f91714a.mo63600g();
            ybh.m62727a("remove_downloads_confirmation_dialog", g);
            Boolean bool = Boolean.FALSE;
            g.f95783j = bool;
            mau g2 = g.mo63320b().mo63600g();
            ybh.m62727a("remove_downloads_cancel_button", g2);
            g2.f95783j = bool;
            nau b2 = g2.mo63320b();
            yau a = zau.m63063a();
            a.mo61737e(b2);
            a.f91606b = ggi.this.f91709b;
            f4x b3 = lau.m57003b();
            b3.mo15447k("ui_select");
            b3.f9817e = 1;
            b3.mo15444h("hit");
            a.f104871d = b3.mo15437a();
            ((oka) hiu).mo63913b((zau) a.mo61735c());
            StorageRemoveDownloadsActivity.this.finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        la5 la5 = this.f51234V;
        yhc e = s90.m46669e(this, getString(R.string.settings_storage_dialog_remove_downloads_title), getString(R.string.settings_storage_dialog_remove_downloads_text));
        String string = getString(R.string.two_button_dialog_button_remove_downloads);
        C6567tj tjVar = new C6567tj(la5);
        e.f48442a = string;
        e.f48444c = tjVar;
        String string2 = getString(R.string.settings_dialog_cancel_button);
        bd2 bd2 = new bd2(la5);
        e.f48443b = string2;
        e.f48445d = bd2;
        e.f48446e = true;
        e.f48447f = new cz7(la5);
        e.mo40049a().mo32190b();
    }
}
