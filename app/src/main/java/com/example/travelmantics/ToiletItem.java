package com.example.travelmantics;

import java.io.Serializable;

public class ToiletItem implements Serializable {
    private String id;
    private String locationDescription;
    private String dateLastCleaned;
    private int visitsLastCleaned;
    private double creditsForCleaning;
    private String imageUrl;
    private String imageName;

    public ToiletItem() {}

    public ToiletItem(String locationDescription, String dateLastCleaned, int visitsLastCleaned, double creditsForCleaning, String imageUrl, String imageName) {
        this.locationDescription = locationDescription;
        this.dateLastCleaned = dateLastCleaned;
        this.visitsLastCleaned = visitsLastCleaned;
        this.creditsForCleaning = creditsForCleaning;
        this.imageUrl = imageUrl;
        this.imageName = imageName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }

    public String getDateLastCleaned() {
        return dateLastCleaned;
    }

    public void setDateLastCleaned(String dateLastCleaned) {
        this.dateLastCleaned = dateLastCleaned;
    }

    public int getVisitsLastCleaned() {
        return visitsLastCleaned;
    }

    public void setVisitsLastCleaned(int visitsLastCleaned) {
        this.visitsLastCleaned = visitsLastCleaned;
    }

    public double getCreditsForCleaning() {
        return creditsForCleaning;
    }

    public void setCreditsForCleaning(double creditsForCleaning) {
        this.creditsForCleaning = creditsForCleaning;
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
