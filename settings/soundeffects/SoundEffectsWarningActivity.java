package com.spotify.music.features.settings.soundeffects;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.widget.TextView;
import com.spotify.music.R;
import p015p.ha5;
import p015p.ivr;
import p015p.ltq;
import p015p.mqa;
import p015p.n3v;
import p015p.nur;
import p015p.pjc;
import p015p.u2s;
import p015p.uqm;
import p015p.vte;
import p015p.yhc;

public class SoundEffectsWarningActivity extends u2s {

    /* renamed from: X */
    public static final ivr.C6395b f51236X = ivr.C6395b.m56004d("sound_effect_dialog_disabled");

    /* renamed from: S */
    public ltq f51237S;

    /* renamed from: T */
    public n3v f51238T;

    /* renamed from: U */
    public String f51239U;

    /* renamed from: V */
    public String f51240V;

    /* renamed from: W */
    public final nur f51241W = new C3966a();

    /* renamed from: com.spotify.music.features.settings.soundeffects.SoundEffectsWarningActivity$a */
    public class C3966a implements nur {
        public C3966a() {
        }
    }

    /* renamed from: com.spotify.music.features.settings.soundeffects.SoundEffectsWarningActivity$b */
    public interface C3967b {
        /* renamed from: b */
        ComponentName mo14045b(Intent intent);

        /* renamed from: e */
        n3v mo14051e();

        Context getContext();

        /* renamed from: i */
        String mo14061i();

        /* renamed from: j */
        String mo14062j();

        void startActivityForResult(Intent intent, int i);
    }

    /* renamed from: s0 */
    public static void m34078s0(final C3967b bVar) {
        int i = uqm.f19620a;
        C39653 r0 = new ResultReceiver(new Handler()) {
            public void onReceiveResult(int i, Bundle bundle) {
                Intent intent = new Intent("android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL");
                intent.putExtra("android.media.extra.CONTENT_TYPE", 0);
                intent.putExtra("android.media.extra.AUDIO_SESSION", bundle.getInt("audio_session_id"));
                bVar.startActivityForResult(intent, 0);
            }
        };
        Intent b = new vte(bVar.mo14051e(), bVar.mo14061i(), bVar.mo14062j()).mo55761b(bVar.getContext(), "com.spotify.mobile.android.service.action.player.REQUEST_AUDIO_SESSION");
        b.putExtra("callback", r0);
        bVar.mo14045b(b);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        nur nur = this.f51241W;
        pjc pjc = new pjc();
        String string = getString(R.string.dialog_sound_effects_title);
        pjc.f72783d = string;
        TextView textView = pjc.f72780a;
        if (textView != null) {
            textView.setText(string);
        }
        String string2 = getString(R.string.dialog_sound_effects_message);
        pjc.f72784e = string2;
        TextView textView2 = pjc.f72781b;
        if (textView2 != null) {
            textView2.setText(string2);
        }
        String string3 = getString(R.string.dialog_generic_dont_show_again);
        pjc.f72785f = string3;
        if (pjc.f72781b != null) {
            pjc.f72782c.setText(string3);
        }
        yhc yhc = new yhc(this, pjc);
        String string4 = getString(R.string.two_button_dialog_button_ok);
        mqa mqa = new mqa(nur, pjc);
        yhc.f48442a = string4;
        yhc.f48444c = mqa;
        yhc.f48446e = true;
        yhc.f48447f = new ha5(nur);
        yhc.mo40049a().mo32190b();
    }
}
