package com.spotify.music.features.ads.sponsorship.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p015p.lat;
import p015p.naf;
import p015p.szs;
import p015p.umw;
import p015p.vh9;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class Sponsorships implements naf {
    public static final C3731a Companion = new C3731a((DefaultConstructorMarker) null);
    public static final int DEFAULT_TTL_SECONDS = 1800;
    private final List<Sponsorship> sponsorships;
    private long tTLSeconds = 1800;

    /* renamed from: com.spotify.music.features.ads.sponsorship.model.Sponsorships$a */
    public static final class C3731a {
        public C3731a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @JsonCreator
    public Sponsorships(@JsonProperty("sponsorships") List<Sponsorship> list) {
        this.sponsorships = list;
    }

    public static /* synthetic */ Sponsorships copy$default(Sponsorships sponsorships2, List<Sponsorship> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = sponsorships2.sponsorships;
        }
        return sponsorships2.copy(list);
    }

    private final Map<String, Sponsorship> createSponsorshipMap(List<Sponsorship> list) {
        HashMap hashMap = new HashMap();
        for (Sponsorship next : list) {
            hashMap.put(next.getUri(), next);
        }
        return hashMap;
    }

    public final List<Sponsorship> component1() {
        return this.sponsorships;
    }

    public final Sponsorships copy(@JsonProperty("sponsorships") List<Sponsorship> list) {
        return new Sponsorships(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sponsorships)) {
            return false;
        }
        return lat.m42680e(this.sponsorships, ((Sponsorships) obj).sponsorships);
    }

    public final Sponsorship getSponsorship(String str) {
        Object obj;
        Iterable iterable = this.sponsorships;
        if (iterable == null) {
            iterable = vh9.f102730a;
        }
        Iterator it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Object obj2 = obj;
            if (((Sponsorship) obj).isEqual(str)) {
                break;
            }
        }
        return (Sponsorship) obj;
    }

    public final List<Sponsorship> getSponsorships() {
        return this.sponsorships;
    }

    public final long getTTLSeconds() {
        return this.tTLSeconds;
    }

    public int hashCode() {
        List<Sponsorship> list = this.sponsorships;
        return list == null ? 0 : list.hashCode();
    }

    public final void preserveDisplayState(Sponsorships sponsorships2) {
        if (sponsorships2 != null) {
            List<Sponsorship> list = sponsorships2.sponsorships;
            List<Sponsorship> list2 = this.sponsorships;
            if (!(list == null || list2 == null)) {
                Map<String, Sponsorship> createSponsorshipMap = createSponsorshipMap(list);
                for (Map.Entry next : createSponsorshipMap(list2).entrySet()) {
                    Sponsorship sponsorship = (Sponsorship) next.getValue();
                    Sponsorship sponsorship2 = createSponsorshipMap.get((String) next.getKey());
                    if (sponsorship2 != null && sponsorship2.wasDisplayedDuringSession()) {
                        sponsorship.displayedDuringSession();
                    }
                }
            }
        }
    }

    public final void setTTLSeconds(long j) {
        this.tTLSeconds = j;
    }

    public String toString() {
        return szs.m60520a(umw.m61161a("Sponsorships(sponsorships="), this.sponsorships, ')');
    }
}
