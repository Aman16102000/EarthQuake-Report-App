package com.example.android.quakereport;

public class earthquake {
    // magnitude of the earthquake
private  String nMagnitude;

// location of the earthquake
    private String nLocation;

    //date of the earthquake
    private  String nDate;

    // constructor
    public earthquake(String Magnitude,String Location,String Date)
    {
    nMagnitude=Magnitude;
    nLocation=Location;
    nDate=Date;
    }

    public String getnMagnitude() {
        return nMagnitude;
    }

    public String getnLocation() {
        return nLocation;
    }

    public String getnDate() {
        return nDate;
    }
}
