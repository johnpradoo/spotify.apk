package com.spotify.music.features.ads.sponsorship.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.ads.model.C1162Ad;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import p015p.lat;
import p015p.naf;
import p015p.qur;
import p015p.rzs;
import p015p.umw;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class SponsorshipAdData implements naf {
    /* access modifiers changed from: private */
    public static final Pattern CREATIVE_JSON_PATTERN = Pattern.compile("<span data-template=\"sponsored\\-playlist\">(.+)?</span>", 32);
    public static final C3730a Companion = new C3730a((DefaultConstructorMarker) null);
    private final String advertiserName;
    private final String clickThroughUrl;
    private final String clickTrackingUrl;
    private final String creativeId;
    private final String impression;
    private final String lineItemId;
    private final String logoUrl;
    private final String thirdPartyImpression;

    /* renamed from: com.spotify.music.features.ads.sponsorship.model.SponsorshipAdData$a */
    public static final class C3730a {
        public C3730a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* renamed from: a */
        public final SponsorshipAdData mo40760a(C1162Ad ad) {
            int i;
            if (ad.isSponsorship()) {
                String media = ad.getDisplays().get(0).getMedia();
                String str = "";
                if (media == null) {
                    String str2 = str;
                    media = str;
                }
                Matcher matcher = SponsorshipAdData.CREATIVE_JSON_PATTERN.matcher(media);
                if (matcher.find()) {
                    String group = matcher.group(1);
                    if (group != null) {
                        String str3 = group;
                        str = group;
                    }
                    int length = str.length() - 1;
                    int i2 = 0;
                    boolean z = false;
                    while (i2 <= length) {
                        if (!z) {
                            int i3 = i2;
                            i = i2;
                        } else {
                            int i4 = length;
                            i = length;
                        }
                        boolean z2 = lat.m42682g(str.charAt(i), 32) <= 0;
                        if (!z) {
                            if (!z2) {
                                z = true;
                            } else {
                                i2++;
                            }
                        } else if (!z2) {
                            break;
                        } else {
                            length--;
                        }
                    }
                    JSONObject jSONObject = new JSONObject(str.subSequence(i2, length + 1).toString()).getJSONObject("sponsoredPlaylist");
                    SponsorshipAdData sponsorshipAdData = r0;
                    SponsorshipAdData sponsorshipAdData2 = new SponsorshipAdData(jSONObject.getString("thirdPartyTracking"), jSONObject.getString("creativeId"), jSONObject.getString("lineItemId"), "", jSONObject.getString("logo"), jSONObject.getString("clickThrough"), jSONObject.getString("clickTracking"), jSONObject.getString("advertiserName"));
                    return sponsorshipAdData2;
                }
                throw new JSONException("Can't find JSON in creative html");
            }
            throw new IllegalStateException("Unable to extract sponsorship data from non sponsorship ad".toString());
        }
    }

    @JsonCreator
    public SponsorshipAdData(@JsonProperty("thirdPartyImpression") String str, @JsonProperty("creativeId") String str2, @JsonProperty("lineItemId") String str3, @JsonProperty("impression") String str4, @JsonProperty("logoUrl") String str5, @JsonProperty("clickThrough") String str6, @JsonProperty("clickTracking") String str7, @JsonProperty("advertiserName") String str8) {
        this.thirdPartyImpression = str;
        this.creativeId = str2;
        this.lineItemId = str3;
        this.impression = str4;
        this.logoUrl = str5;
        this.clickThroughUrl = str6;
        this.clickTrackingUrl = str7;
        this.advertiserName = str8;
    }

    public static /* synthetic */ SponsorshipAdData copy$default(SponsorshipAdData sponsorshipAdData, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        SponsorshipAdData sponsorshipAdData2 = sponsorshipAdData;
        SponsorshipAdData sponsorshipAdData3 = sponsorshipAdData;
        int i2 = i;
        int i3 = i;
        if ((i3 & 1) != 0) {
            str9 = sponsorshipAdData3.thirdPartyImpression;
        } else {
            String str16 = str;
            str9 = str;
        }
        if ((i3 & 2) != 0) {
            str10 = sponsorshipAdData3.creativeId;
        } else {
            String str17 = str2;
            str10 = str2;
        }
        if ((i3 & 4) != 0) {
            str11 = sponsorshipAdData3.lineItemId;
        } else {
            String str18 = str3;
            str11 = str3;
        }
        if ((i3 & 8) != 0) {
            str12 = sponsorshipAdData3.impression;
        } else {
            String str19 = str4;
            str12 = str4;
        }
        if ((i3 & 16) != 0) {
            str13 = sponsorshipAdData3.logoUrl;
        } else {
            String str20 = str5;
            str13 = str5;
        }
        String str21 = (i3 & 32) != 0 ? sponsorshipAdData3.clickThroughUrl : str6;
        if ((i3 & 64) != 0) {
            str14 = sponsorshipAdData3.clickTrackingUrl;
        } else {
            String str22 = str7;
            str14 = str7;
        }
        if ((i3 & 128) != 0) {
            str15 = sponsorshipAdData3.advertiserName;
        } else {
            String str23 = str8;
            str15 = str8;
        }
        String str24 = str10;
        String str25 = str11;
        String str26 = str13;
        String str27 = str21;
        String str28 = str14;
        String str29 = str15;
        return sponsorshipAdData.copy(str9, str10, str11, str12, str13, str21, str14, str15);
    }

    public static final SponsorshipAdData fromPreviewAd(C1162Ad ad) {
        return Companion.mo40760a(ad);
    }

    public final String component1() {
        return this.thirdPartyImpression;
    }

    public final String component2() {
        return this.creativeId;
    }

    public final String component3() {
        return this.lineItemId;
    }

    public final String component4() {
        return this.impression;
    }

    public final String component5() {
        return this.logoUrl;
    }

    public final String component6() {
        return this.clickThroughUrl;
    }

    public final String component7() {
        return this.clickTrackingUrl;
    }

    public final String component8() {
        return this.advertiserName;
    }

    public final SponsorshipAdData copy(@JsonProperty("thirdPartyImpression") String str, @JsonProperty("creativeId") String str2, @JsonProperty("lineItemId") String str3, @JsonProperty("impression") String str4, @JsonProperty("logoUrl") String str5, @JsonProperty("clickThrough") String str6, @JsonProperty("clickTracking") String str7, @JsonProperty("advertiserName") String str8) {
        SponsorshipAdData sponsorshipAdData = r0;
        String str9 = str;
        String str10 = str2;
        String str11 = str4;
        String str12 = str5;
        String str13 = str6;
        String str14 = str7;
        String str15 = str8;
        SponsorshipAdData sponsorshipAdData2 = new SponsorshipAdData(str, str2, str3, str4, str5, str6, str7, str8);
        return sponsorshipAdData2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SponsorshipAdData)) {
            return false;
        }
        SponsorshipAdData sponsorshipAdData = (SponsorshipAdData) obj;
        if (!lat.m42680e(this.thirdPartyImpression, sponsorshipAdData.thirdPartyImpression)) {
            return false;
        }
        if (!lat.m42680e(this.creativeId, sponsorshipAdData.creativeId)) {
            return false;
        }
        if (!lat.m42680e(this.lineItemId, sponsorshipAdData.lineItemId)) {
            return false;
        }
        if (!lat.m42680e(this.impression, sponsorshipAdData.impression)) {
            return false;
        }
        if (!lat.m42680e(this.logoUrl, sponsorshipAdData.logoUrl)) {
            return false;
        }
        if (!lat.m42680e(this.clickThroughUrl, sponsorshipAdData.clickThroughUrl)) {
            return false;
        }
        if (!lat.m42680e(this.clickTrackingUrl, sponsorshipAdData.clickTrackingUrl)) {
            return false;
        }
        return lat.m42680e(this.advertiserName, sponsorshipAdData.advertiserName);
    }

    public final String getAdvertiserName() {
        return this.advertiserName;
    }

    public final String getClickThroughUrl() {
        return this.clickThroughUrl;
    }

    public final String getClickTrackingUrl() {
        return this.clickTrackingUrl;
    }

    public final String getCreativeId() {
        return this.creativeId;
    }

    public final String getImpression() {
        return this.impression;
    }

    public final String getLineItemId() {
        return this.lineItemId;
    }

    public final String getLogoUrl() {
        return this.logoUrl;
    }

    public final String getThirdPartyImpression() {
        return this.thirdPartyImpression;
    }

    public int hashCode() {
        return this.advertiserName.hashCode() + rzs.m60074a(this.clickTrackingUrl, rzs.m60074a(this.clickThroughUrl, rzs.m60074a(this.logoUrl, rzs.m60074a(this.impression, rzs.m60074a(this.lineItemId, rzs.m60074a(this.creativeId, this.thirdPartyImpression.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder a = umw.m61161a("SponsorshipAdData(thirdPartyImpression=");
        a.append(this.thirdPartyImpression);
        a.append(", creativeId=");
        a.append(this.creativeId);
        a.append(", lineItemId=");
        a.append(this.lineItemId);
        a.append(", impression=");
        a.append(this.impression);
        a.append(", logoUrl=");
        a.append(this.logoUrl);
        a.append(", clickThroughUrl=");
        a.append(this.clickThroughUrl);
        a.append(", clickTrackingUrl=");
        a.append(this.clickTrackingUrl);
        a.append(", advertiserName=");
        return qur.m59591a(a, this.advertiserName, ')');
    }
}
