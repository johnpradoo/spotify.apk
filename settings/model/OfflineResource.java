package com.spotify.music.features.settings.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import p015p.naf;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OfflineResource implements naf {
    @JsonProperty("offline_availabilty")
    public String mOfflineAvailability;
    @JsonProperty("uri")
    public String mUri;
}
