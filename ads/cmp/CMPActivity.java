package com.spotify.music.features.ads.cmp;

import android.os.Bundle;
import com.spotify.music.R;
import p015p.fc2;
import p015p.m73;
import p015p.u2s;

public class CMPActivity extends u2s {

    /* renamed from: S */
    public static final /* synthetic */ int f49975S = 0;

    public void onBackPressed() {
        m73 m73 = (m73) mo14864h0().mo2049G("one_trust_fragment");
        if (m73 == null || !m73.mo48596c()) {
            this.f272D.mo463b();
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_one_trust);
        if (!(((m73) mo14864h0().mo2049G("one_trust_fragment")) != null)) {
            fc2 fc2 = new fc2(mo14864h0());
            fc2.mo2152k(R.id.one_trust_layout, new m73(), "one_trust_fragment", 1);
            fc2.mo2147f();
        }
    }
}
