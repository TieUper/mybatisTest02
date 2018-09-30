package com.tie.model;

public class Airport {

    private int id;
    private String portname;
    private String cityname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProtName() {
        return portname;
    }

    public void setProtName(String protName) {
        this.portname = protName;
    }

    public String getCityName() {
        return cityname;
    }

    public void setCityName(String cityName) {
        this.cityname = cityName;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "id=" + id +
                ", portname='" + portname + '\'' +
                ", cityname='" + cityname + '\'' +
                '}';
    }
}
