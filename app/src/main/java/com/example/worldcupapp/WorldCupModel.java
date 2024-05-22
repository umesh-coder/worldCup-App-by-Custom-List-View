package com.example.worldcupapp;

public class WorldCupModel {
    private String countryName,cupWins;
    private int countryImg;

    public WorldCupModel(String countryName, String cupWins, int countryImg) {
        this.countryName = countryName;
        this.cupWins = cupWins;
        this.countryImg = countryImg;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCupWins() {
        return cupWins;
    }

    public void setCupWins(String cupWins) {
        this.cupWins = cupWins;
    }

    public int getCountryImg() {
        return countryImg;
    }

    public void setCountryImg(int countryImg) {
        this.countryImg = countryImg;
    }
}
