package com.spotify.music.features.profile.follow;

import android.os.Parcel;
import android.os.Parcelable;

public final class AutoValue_FollowState extends C$AutoValue_FollowState {
    public static final Parcelable.Creator<AutoValue_FollowState> CREATOR = new C3923a();

    /* renamed from: com.spotify.music.features.profile.follow.AutoValue_FollowState$a */
    public class C3923a implements Parcelable.Creator<AutoValue_FollowState> {
        public Object createFromParcel(Parcel parcel) {
            boolean z = false;
            boolean z2 = parcel.readInt() == 1;
            if (parcel.readInt() == 1) {
                z = true;
            }
            return new AutoValue_FollowState(z2, z, parcel.readInt(), parcel.readInt());
        }

        public Object[] newArray(int i) {
            return new AutoValue_FollowState[i];
        }
    }

    public AutoValue_FollowState(boolean z, boolean z2, int i, int i2) {
        super(z, z2, i, i2);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f51086b ? 1 : 0);
        parcel.writeInt(this.f51087c ? 1 : 0);
        parcel.writeInt(this.f51088d);
        parcel.writeInt(this.f51089t);
    }
}
