package com.example.realestate.Domain;

import java.io.Serializable;

public class ItemDomain implements Serializable {
    private String title;
    private String address;
    private String descriptions;
    private
    int bed;
    private int path;
    private int price;
    private String pic;
    private boolean wifi;

    public ItemDomain(String title, String address, String descriptions, int bed, int path, int price, String pic, boolean wifi) {
        this.title = title;
        this.address = address;
        this.descriptions = descriptions;
        this.bed = bed;
        this.path = path;
        this.price = price;
        this.pic = pic;
        this.wifi = wifi;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public int getBed() {
        return bed;
    }

    public void setBed(int bed) {
        this.bed = bed;
    }

    public int getPath() {
        return path;
    }

    public void setPath(int path) {
        this.path = path;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }
}
