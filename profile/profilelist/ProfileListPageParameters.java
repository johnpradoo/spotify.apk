package com.spotify.music.features.profile.profilelist;

import android.os.Parcel;
import android.os.Parcelable;

public final class ProfileListPageParameters implements Parcelable {
    public static final Parcelable.Creator<ProfileListPageParameters> CREATOR = new C3933a();

    /* renamed from: a */
    public final String f51139a;

    /* renamed from: b */
    public final String f51140b;

    /* renamed from: com.spotify.music.features.profile.profilelist.ProfileListPageParameters$a */
    public static final class C3933a implements Parcelable.Creator {
        public Object createFromParcel(Parcel parcel) {
            return new ProfileListPageParameters(parcel.readString(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new ProfileListPageParameters[i];
        }
    }

    public ProfileListPageParameters(String str, String str2) {
        this.f51139a = str;
        this.f51140b = str2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f51139a);
        parcel.writeString(this.f51140b);
    }
}
