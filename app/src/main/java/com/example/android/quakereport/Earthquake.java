package com.example.android.quakereport;

/**
 * Created by Kshitij on 12/27/2016.
 */
public class Earthquake {
    private double magnitude;
    private String place;
    private long time;
    private String url;

    public Earthquake(double magnitude,String place,long date,String url){
        this.magnitude=magnitude;
        this.time=date;
        this.place=place;
        this.url=url;
    }
    public double getMagnitude(){
        return(magnitude);
       }
    public String getPlace(){return place;}
    public long getDate(){return time;}
    public String getUrl(){return url;}

}
