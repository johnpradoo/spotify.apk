package com.spotify.music.features.settings.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import p015p.naf;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OfflineResources implements naf {
    @JsonProperty("resources")
    public List<OfflineResource> mResources;
}
