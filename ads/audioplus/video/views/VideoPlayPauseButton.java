package com.spotify.music.features.ads.audioplus.video.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import p015p.q3s;
import p015p.v2v;
import p015p.w3s;

public class VideoPlayPauseButton extends AppCompatImageButton {

    /* renamed from: c */
    public Drawable f49972c = new q3s(getContext(), w3s.PLAY, 48.0f);

    /* renamed from: d */
    public Drawable f49973d = new q3s(getContext(), w3s.PAUSE, 48.0f);

    /* renamed from: t */
    public C3725a f49974t;

    /* renamed from: com.spotify.music.features.ads.audioplus.video.views.VideoPlayPauseButton$a */
    public interface C3725a {
    }

    public VideoPlayPauseButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setVisibility(0);
        setBackgroundDrawable((Drawable) null);
        setImageDrawable(this.f49973d);
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        setOnClickListener(new v2v(this));
    }

    public void setListener(C3725a aVar) {
        this.f49974t = aVar;
    }
}
