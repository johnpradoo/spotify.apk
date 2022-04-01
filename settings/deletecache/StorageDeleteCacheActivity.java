package com.spotify.music.features.settings.deletecache;

import android.os.Bundle;
import com.spotify.music.R;
import p015p.C6529rj;
import p015p.f4x;
import p015p.ggi;
import p015p.ha5;
import p015p.hiu;
import p015p.ia5;
import p015p.lau;
import p015p.mau;
import p015p.nau;
import p015p.oka;
import p015p.r0b;
import p015p.s90;
import p015p.u2s;
import p015p.yau;
import p015p.ybh;
import p015p.yhc;
import p015p.zau;
import p015p.zes;

public class StorageDeleteCacheActivity extends u2s {

    /* renamed from: W */
    public static final /* synthetic */ int f51223W = 0;

    /* renamed from: S */
    public zes f51224S;

    /* renamed from: T */
    public hiu f51225T;

    /* renamed from: U */
    public final ggi f51226U = new ggi();

    /* renamed from: V */
    public final ia5 f51227V = new C3960a();

    /* renamed from: com.spotify.music.features.settings.deletecache.StorageDeleteCacheActivity$a */
    public class C3960a implements ia5 {
        public C3960a() {
        }

        /* renamed from: a */
        public void mo42200a() {
            StorageDeleteCacheActivity storageDeleteCacheActivity = StorageDeleteCacheActivity.this;
            hiu hiu = storageDeleteCacheActivity.f51225T;
            ggi.C6366a.C6367a a = storageDeleteCacheActivity.f51226U.mo61785h().mo61786a();
            mau g = a.f91712a.mo63600g();
            ybh.m62727a("delete_cache_confirmation_dialog", g);
            Boolean bool = Boolean.FALSE;
            g.f95783j = bool;
            mau g2 = g.mo63320b().mo63600g();
            ybh.m62727a("delete_cache_cancel_button", g2);
            g2.f95783j = bool;
            nau b = g2.mo63320b();
            yau a2 = zau.m63063a();
            a2.mo61737e(b);
            a2.f91606b = ggi.this.f91709b;
            f4x b2 = lau.m57003b();
            b2.mo15447k("ui_select");
            b2.f9817e = 1;
            b2.mo15444h("hit");
            a2.f104871d = b2.mo15437a();
            ((oka) hiu).mo63913b((zau) a2.mo61735c());
            StorageDeleteCacheActivity.this.finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ia5 ia5 = this.f51227V;
        yhc e = s90.m46669e(this, getString(R.string.settings_storage_dialog_delete_cache_title), getString(R.string.settings_storage_dialog_delete_cache_text));
        String string = getString(R.string.two_button_dialog_button_delete_cache);
        r0b r0b = new r0b(ia5);
        e.f48442a = string;
        e.f48444c = r0b;
        String string2 = getString(R.string.settings_dialog_cancel_button);
        C6529rj rjVar = new C6529rj(ia5);
        e.f48443b = string2;
        e.f48445d = rjVar;
        e.f48446e = true;
        e.f48447f = new ha5(ia5);
        e.mo40049a().mo32190b();
    }
}
