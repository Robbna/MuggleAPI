package app.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

class BookCoverVO implements Serializable {
    @JsonProperty("id")
    public Integer id;
    @JsonProperty("country")
    public String country;
    @JsonProperty("edition")
    public String edition;
    @JsonProperty("artist")
    public String artist;
    @JsonProperty("URL")
    public String url;
}

public class BookDTO implements Serializable {

    @JsonProperty("id")
    public Integer id;
    @JsonProperty("title")
    public String title;
    @JsonProperty("author")
    public String author;
    @JsonProperty("publish_date")
    public Map<String, String>[] publishDate;
    @JsonProperty("plot_take_place_years")
    public String[] plotTakePlaceYears;
    @JsonProperty("book_covers")
    public BookCoverVO[] bookCovers;
    @JsonProperty("characters")
    public Integer[] characters;
}