package com.example.ktgt_taoapptonghop;

public class Player {
    private String name;
    private String club;
    private String country;
    private int image;

    public Player(String name, String club, String country, int image) {
        this.name = name;
        this.club = club;
        this.country = country;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
