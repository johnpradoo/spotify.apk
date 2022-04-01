package com.spotify.music.features.profile.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.C0960e;
import com.spotify.music.features.profile.model.ProfileListData;
import java.util.ArrayList;
import p015p.kdn;

public final class AutoValue_ProfileListData extends C$AutoValue_ProfileListData {
    public static final Parcelable.Creator<AutoValue_ProfileListData> CREATOR = new C3927a();

    /* renamed from: d */
    public static final ProfileListData.C3929a f51115d = new ProfileListData.C3929a();

    /* renamed from: com.spotify.music.features.profile.model.AutoValue_ProfileListData$a */
    public class C3927a implements Parcelable.Creator<AutoValue_ProfileListData> {
        public Object createFromParcel(Parcel parcel) {
            Class<C3932a> cls = C3932a.class;
            ProfileListData.C3929a aVar = AutoValue_ProfileListData.f51115d;
            ProfileListData.C3929a aVar2 = AutoValue_ProfileListData.f51115d;
            ArrayList arrayList = new ArrayList();
            parcel.readTypedList(arrayList, new kdn());
            return new AutoValue_ProfileListData((C3932a) Enum.valueOf(C3932a.class, parcel.readString()), C0960e.m4019s(arrayList));
        }

        public Object[] newArray(int i) {
            return new AutoValue_ProfileListData[i];
        }
    }

    public AutoValue_ProfileListData(C3932a aVar, C0960e eVar) {
        super(aVar, eVar);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f51095b.name());
        parcel.writeTypedList(this.f51096c);
    }
}
