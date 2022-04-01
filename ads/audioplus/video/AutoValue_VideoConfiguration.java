package com.spotify.music.features.ads.audioplus.video;

import android.os.Parcel;
import android.os.Parcelable;

public final class AutoValue_VideoConfiguration extends C$AutoValue_VideoConfiguration {
    public static final Parcelable.Creator<AutoValue_VideoConfiguration> CREATOR = new C3724a();

    /* renamed from: com.spotify.music.features.ads.audioplus.video.AutoValue_VideoConfiguration$a */
    public class C3724a implements Parcelable.Creator<AutoValue_VideoConfiguration> {
        public Object createFromParcel(Parcel parcel) {
            return new AutoValue_VideoConfiguration(parcel.readString(), parcel.readString(), parcel.readInt());
        }

        public Object[] newArray(int i) {
            return new AutoValue_VideoConfiguration[i];
        }
    }

    public AutoValue_VideoConfiguration(String str, String str2, int i) {
        super(str, str2, i);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f49965a);
        parcel.writeString(this.f49966b);
        parcel.writeInt(this.f49967c);
    }
}
