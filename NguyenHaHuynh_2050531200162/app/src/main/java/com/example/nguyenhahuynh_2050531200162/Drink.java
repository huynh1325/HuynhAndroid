package com.example.nguyenhahuynh_2050531200162;

public class Drink {
    private int resourceId;
    private String title;
    private String tvprice;

    public Drink(int resourceId, String title, String tvprice) {
        this.resourceId = resourceId;
        this.title = title;
        this.tvprice = tvprice;
    }

    public String getTvprice() {
        return tvprice;
    }

    public void setTvprice(String tvprice) {
        this.tvprice = tvprice;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
