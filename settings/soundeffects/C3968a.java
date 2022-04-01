package com.spotify.music.features.settings.soundeffects;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.spotify.music.features.settings.soundeffects.SoundEffectsWarningActivity;
import p015p.n3v;

/* renamed from: com.spotify.music.features.settings.soundeffects.a */
public class C3968a implements SoundEffectsWarningActivity.C3967b {

    /* renamed from: a */
    public final /* synthetic */ Activity f51244a;

    /* renamed from: b */
    public final /* synthetic */ SoundEffectsWarningActivity f51245b;

    public C3968a(SoundEffectsWarningActivity soundEffectsWarningActivity, Activity activity) {
        this.f51245b = soundEffectsWarningActivity;
        this.f51244a = activity;
    }

    /* renamed from: b */
    public ComponentName mo14045b(Intent intent) {
        return this.f51244a.startService(intent);
    }

    /* renamed from: e */
    public n3v mo14051e() {
        return this.f51245b.f51238T;
    }

    public Context getContext() {
        return this.f51244a;
    }

    /* renamed from: i */
    public String mo14061i() {
        return this.f51245b.f51239U;
    }

    /* renamed from: j */
    public String mo14062j() {
        return this.f51245b.f51240V;
    }

    public void startActivityForResult(Intent intent, int i) {
        this.f51244a.startActivityForResult(intent, i);
    }
}
