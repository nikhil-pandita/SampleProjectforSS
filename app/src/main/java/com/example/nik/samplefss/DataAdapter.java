package com.example.nik.samplefss;

/**
 * Created by Nik on 6/3/2018.
 */


public class DataAdapter
{
    private String name;
    private String event_text;
    private String profile_url;
    private String event_url;

    public String getName() {
        return name;
    }

    public String getEvent_text() {
        return event_text;
    }

    public String getProfile_url() {
        return profile_url;
    }

    public String getEvent_url() {
        return event_url;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEvent_text(String event_text) {
        this.event_text = event_text;
    }

    public void setProfile_url(String profile_url) {
        this.profile_url = profile_url;
    }

    public void setEvent_url(String event_url) {
        this.event_url = event_url;
    }

    /*public String ImageURL;
    public String ImageTitle;

    public String getImageUrl() {

        return ImageURL;
    }

    public void setImageUrl(String imageServerUrl) {

        this.ImageURL = imageServerUrl;
    }

    public String getImageTitle() {

        return ImageTitle;
    }

    public void setImageTitle(String Imagetitlename) {

        this.ImageTitle = Imagetitlename;
    }*/

}