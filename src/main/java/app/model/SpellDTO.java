package app.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SpellDTO {
    @JsonProperty("name")
    public String name;
    @JsonProperty("other_name")
    public String otherName;
    @JsonProperty("pronunciation")
    public String pronunciation;
    @JsonProperty("spell_type")
    public String spellType;
    @JsonProperty("description")
    public String description;
    @JsonProperty("mention")
    public String mention;
    @JsonProperty("etymology")
    public String etymology;
    @JsonProperty("note")
    public String note;

}
