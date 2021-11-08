package com.example.travelmantics;

import java.io.Serializable;
import java.util.ArrayList;

public class CompanyItem implements Serializable {
    private String id;
    private String name;
    private String address;
    private ArrayList<ToiletItem> toiletItemArrayList;
    private String imageUrl;
    private String imageName;

    public CompanyItem() {}

    public CompanyItem(String name, String address, ArrayList<ToiletItem> toiletItemArrayList, String imageUrl, String imageName) {
        this.name = name;
        this.address = address;
        this.toiletItemArrayList = toiletItemArrayList;
        this.imageUrl = imageUrl;
        this.imageName = imageName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<ToiletItem> getToiletItemArrayList() {
        return toiletItemArrayList;
    }

    public void setToiletItemArrayList(ArrayList<ToiletItem> toiletItemArrayList) {
        this.toiletItemArrayList = toiletItemArrayList;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}
