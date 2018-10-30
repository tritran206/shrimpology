package com.example.tritran.shrimpology;

import android.os.Parcelable;

import java.io.Serializable;

public class Shrimp implements Serializable {

    private String Name;
    private String Genus;
    private String Parameters;
    private int Picture;

    public Shrimp() {

    }

    public Shrimp(String name, String genus, String parameter, int thumbnail) {
        this.Name = name;
        this.Genus = genus;
        this.Parameters = parameter;
        this.Picture = thumbnail;
    }

    public String getName() {
        return Name;
    }

    public String getGenus() {
        return Genus;
    }

    public String getParameters() {
        return Parameters;
    }

    public int getPicture() {
        return Picture;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setGenus(String genus) {
        Genus = genus;
    }

    public void setParameters(String parameters) {
        Parameters = parameters;
    }

    public void setThumbnail(int Picture) {
        this.Picture = Picture;
    }


}
