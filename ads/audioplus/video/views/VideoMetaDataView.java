package com.spotify.music.features.ads.audioplus.video.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.R;
import com.spotify.music.features.ads.audioplus.video.views.C3726a;
import p015p.C6524rd;
import p015p.fd7;
import p015p.zqn;

public class VideoMetaDataView extends ConstraintLayout implements C3726a {

    /* renamed from: P */
    public final TextView f49968P = ((TextView) findViewById(R.id.tv_advertiser_video));

    /* renamed from: Q */
    public final TextView f49969Q = ((TextView) findViewById(R.id.tv_tagline_video));

    /* renamed from: R */
    public final Button f49970R = ((Button) findViewById(R.id.button_ctr_video));

    /* renamed from: S */
    public C3726a.C3727a f49971S;

    public VideoMetaDataView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ViewGroup.inflate(getContext(), R.layout.video_metadata_layout, this);
    }

    public void setAdvertiser(String str) {
        if (str.isEmpty()) {
            this.f49968P.setVisibility(8);
        } else {
            this.f49968P.setVisibility(0);
            this.f49968P.setText(str);
            this.f49969Q.setOnClickListener(new fd7(this));
        }
    }

    public void setButton(String str) {
        this.f49970R.setText(str);
        this.f49970R.setOnClickListener(new zqn(this));
    }

    public void setListener(C3726a.C3727a aVar) {
        this.f49971S = aVar;
    }

    public void setTagline(String str) {
        if (str.isEmpty()) {
            this.f49969Q.setVisibility(8);
        } else {
            this.f49969Q.setVisibility(0);
            this.f49969Q.setText(str);
            this.f49969Q.setOnClickListener(new C6524rd(this));
        }
    }
}
