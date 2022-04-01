package com.spotify.music.features.profile.entity.utils;

import android.os.Parcel;
import android.os.Parcelable;
import p015p.lat;
import p015p.ppe;
import p015p.umw;

public final class UserInfo implements Parcelable {
    public static final Parcelable.Creator<UserInfo> CREATOR = new C3920a();

    /* renamed from: a */
    public final String f51083a;

    /* renamed from: b */
    public final String f51084b;

    /* renamed from: c */
    public final int f51085c;

    /* renamed from: com.spotify.music.features.profile.entity.utils.UserInfo$a */
    public static final class C3920a implements Parcelable.Creator {
        public Object createFromParcel(Parcel parcel) {
            return new UserInfo(parcel.readString(), parcel.readString(), parcel.readInt());
        }

        public Object[] newArray(int i) {
            return new UserInfo[i];
        }
    }

    public UserInfo(String str, String str2, int i) {
        this.f51083a = str;
        this.f51084b = str2;
        this.f51085c = i;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserInfo)) {
            return false;
        }
        UserInfo userInfo = (UserInfo) obj;
        if (!lat.m42680e(this.f51083a, userInfo.f51083a)) {
            return false;
        }
        if (!lat.m42680e(this.f51084b, userInfo.f51084b)) {
            return false;
        }
        return this.f51085c == userInfo.f51085c;
    }

    public int hashCode() {
        int hashCode = this.f51083a.hashCode() * 31;
        String str = this.f51084b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f51085c;
    }

    public String toString() {
        StringBuilder a = umw.m61161a("UserInfo(initials=");
        a.append(this.f51083a);
        a.append(", imageUrl=");
        a.append(this.f51084b);
        a.append(", color=");
        return ppe.m58988a(a, this.f51085c, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f51083a);
        parcel.writeString(this.f51084b);
        parcel.writeInt(this.f51085c);
    }
}
