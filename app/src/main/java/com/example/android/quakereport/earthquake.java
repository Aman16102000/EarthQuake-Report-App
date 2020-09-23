package com.example.android.quakereport;

public class earthquake {
    // magnitude of the earthquake
private  String nMagnitude;

// location of the earthquake
    private String nLocation;

    //date of the earthquake
    private  String nDate;
    private  String nurl;

    // constructor
    public earthquake(String Magnitude,String Location,String Date ,String url)
    {
    nMagnitude=Magnitude;
    nLocation=Location;
    nDate=Date;
    nurl=url;
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

    public String getNurl() {
        return nurl;
    }
}
