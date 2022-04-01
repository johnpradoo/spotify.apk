package com.spotify.music.features.profile.entity;

import android.os.Parcel;
import android.os.Parcelable;
import p015p.lat;
import p015p.qur;
import p015p.umw;

public final class ProfileEntityPageParameters implements Parcelable {
    public static final Parcelable.Creator<ProfileEntityPageParameters> CREATOR = new C3919a();

    /* renamed from: a */
    public final String f51081a;

    /* renamed from: b */
    public final String f51082b;

    /* renamed from: com.spotify.music.features.profile.entity.ProfileEntityPageParameters$a */
    public static final class C3919a implements Parcelable.Creator {
        public Object createFromParcel(Parcel parcel) {
            return new ProfileEntityPageParameters(parcel.readString(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new ProfileEntityPageParameters[i];
        }
    }

    public ProfileEntityPageParameters(String str, String str2) {
        this.f51081a = str;
        this.f51082b = str2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileEntityPageParameters)) {
            return false;
        }
        ProfileEntityPageParameters profileEntityPageParameters = (ProfileEntityPageParameters) obj;
        if (!lat.m42680e(this.f51081a, profileEntityPageParameters.f51081a)) {
            return false;
        }
        return lat.m42680e(this.f51082b, profileEntityPageParameters.f51082b);
    }

    public int hashCode() {
        return this.f51082b.hashCode() + (this.f51081a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder a = umw.m61161a("ProfileEntityPageParameters(profileUri=");
        a.append(this.f51081a);
        a.append(", currentUserUsername=");
        return qur.m59591a(a, this.f51082b, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f51081a);
        parcel.writeString(this.f51082b);
    }
}
