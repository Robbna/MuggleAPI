package app.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PotionDTO {
    @JsonProperty("name")
    public String name;
    @JsonProperty("description")
    public String description;

}
