package app.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CharacterDTO implements Serializable {
    @JsonProperty("name")
    public String name;
    @JsonProperty("gender")
    public String gender;
    @JsonProperty("born")
    public String born;
    @JsonProperty("died")
    public Object died;
    @JsonProperty("species")
    public String species;
    @JsonProperty("height")
    public Object height;
    @JsonProperty("weight")
    public Object weight;
    @JsonProperty("hair_color")
    public String hairColor;
    @JsonProperty("eye_color")
    public String eyeColor;
    @JsonProperty("skin_color")
    public String skinColor;
    @JsonProperty("blood_status")
    public String bloodStatus;
    @JsonProperty("marital_status")
    public String maritalStatus;
    @JsonProperty("nationality")
    public String nationality;
    @JsonProperty("animagus")
    public Object animagus;
    @JsonProperty("boggart")
    public String boggart;
    @JsonProperty("house")
    public String house;
    @JsonProperty("patronus")
    public String patronus;
    @JsonProperty("alias_names")
    public String[] aliasNames;
    @JsonProperty("jobs")
    public String[] jobs;
    @JsonProperty("titles")
    public String[] titles;
    @JsonProperty("family_members")
    public String[] familyMembers;
    @JsonProperty("romances")
    public String[] romances;
    @JsonProperty("wands")
    public String[] wands;
    @JsonProperty("image")
    public String image;
    @JsonProperty("wiki")
    public String wiki;
}
