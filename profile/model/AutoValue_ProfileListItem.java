package com.spotify.music.features.profile.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.music.features.profile.entity.utils.UserInfo;
import com.spotify.music.features.profile.follow.FollowState;
import com.spotify.music.features.profile.model.ProfileListItem;

public final class AutoValue_ProfileListItem extends C$AutoValue_ProfileListItem {
    public static final Parcelable.Creator<AutoValue_ProfileListItem> CREATOR = new C3928a();

    /* renamed from: com.spotify.music.features.profile.model.AutoValue_ProfileListItem$a */
    public class C3928a implements Parcelable.Creator<AutoValue_ProfileListItem> {
        public Object createFromParcel(Parcel parcel) {
            String str;
            String str2;
            Long l;
            Class<ProfileListItem.C3931b> cls = ProfileListItem.C3931b.class;
            Enum valueOf = Enum.valueOf(ProfileListItem.C3931b.class, parcel.readString());
            Enum enumR = valueOf;
            ProfileListItem.C3931b bVar = (ProfileListItem.C3931b) valueOf;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                String readString4 = parcel.readString();
                String str3 = readString4;
                str = readString4;
            } else {
                str = null;
            }
            Class<ProfileListItem> cls2 = ProfileListItem.class;
            Parcelable readParcelable = parcel.readParcelable(ProfileListItem.class.getClassLoader());
            Parcelable parcelable = readParcelable;
            FollowState followState = (FollowState) readParcelable;
            if (parcel.readInt() == 0) {
                String readString5 = parcel.readString();
                String str4 = readString5;
                str2 = readString5;
            } else {
                str2 = null;
            }
            if (parcel.readInt() == 0) {
                Long valueOf2 = Long.valueOf(parcel.readLong());
                Long l2 = valueOf2;
                l = valueOf2;
            } else {
                l = null;
            }
            Class<ProfileListItem> cls3 = ProfileListItem.class;
            UserInfo userInfo = (UserInfo) parcel.readParcelable(ProfileListItem.class.getClassLoader());
            AutoValue_ProfileListItem autoValue_ProfileListItem = r0;
            String str5 = str;
            String str6 = str;
            FollowState followState2 = followState;
            FollowState followState3 = followState;
            String str7 = str2;
            Long l3 = l;
            Long l4 = l;
            UserInfo userInfo2 = userInfo;
            AutoValue_ProfileListItem autoValue_ProfileListItem2 = new AutoValue_ProfileListItem(bVar, readString, readString2, readString3, str6, followState3, str7, l4, userInfo);
            return autoValue_ProfileListItem2;
        }

        public Object[] newArray(int i) {
            return new AutoValue_ProfileListItem[i];
        }
    }

    public AutoValue_ProfileListItem(ProfileListItem.C3931b bVar, String str, String str2, String str3, String str4, FollowState followState, String str5, Long l, UserInfo userInfo) {
        super(bVar, str, str2, str3, str4, followState, str5, l, userInfo);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f51101a.name());
        parcel.writeString(this.f51102b);
        parcel.writeString(this.f51103c);
        parcel.writeString(this.f51104d);
        if (this.f51105t == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.f51105t);
        }
        parcel.writeParcelable(this.f51097C, i);
        if (this.f51098D == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.f51098D);
        }
        if (this.f51099E == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeLong(this.f51099E.longValue());
        }
        parcel.writeParcelable(this.f51100F, i);
    }
}
