package com.example.baiktra1;

public class User {
    private int imgCasi, imgSao;
    private String tvname, tvnghedanh, tvquocgia, tvsao;

    public User(int imgCasi, int imgSao, String tvname, String tvnghedanh, String tvquocgia, String tvsao) {
        this.imgCasi = imgCasi;
        this.imgSao = imgSao;
        this.tvname = tvname;
        this.tvnghedanh = tvnghedanh;
        this.tvquocgia = tvquocgia;
        this.tvsao = tvsao;
    }

    public int getImgCasi() {
        return imgCasi;
    }

    public void setImgCasi(int imgCasi) {
        this.imgCasi = imgCasi;
    }

    public int getImgSao() {
        return imgSao;
    }

    public void setImgSao(int imgSao) {
        this.imgSao = imgSao;
    }

    public String getTvname() {
        return tvname;
    }

    public void setTvname(String tvname) {
        this.tvname = tvname;
    }

    public String getTvnghedanh() {
        return tvnghedanh;
    }

    public void setTvnghedanh(String tvnghedanh) {
        this.tvnghedanh = tvnghedanh;
    }

    public String getTvquocgia() {
        return tvquocgia;
    }

    public void setTvquocgia(String tvquocgia) {
        this.tvquocgia = tvquocgia;
    }

    public String getTvsao() {
        return tvsao;
    }

    public void setTvsao(String tvsao) {
        this.tvsao = tvsao;
    }
}
