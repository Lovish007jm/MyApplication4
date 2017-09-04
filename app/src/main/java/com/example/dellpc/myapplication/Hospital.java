package com.example.dellpc.myapplication;

/**
 * Created by DELL PC on 04-Sep-17.
 */

public class Hospital {
    private int hospitalId;
    private String hospitalName;
    private String location;
    private String imageUrl="http://www.tripathihospital.com/images/hospital.jpg";

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }
}
