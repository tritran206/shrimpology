package com.example.tritran.shrimpology;

public class Shrimp {

    private String Name;
    private String Genus;
    private String Parameters;
    private int Thumbnail;

    public Shrimp() {

    }

    public Shrimp(String name, String genus, String parameter, int thumbnail) {
        Name = name;
        Genus = genus;
        Parameters = parameter;
        Thumbnail = thumbnail;
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

    public int getThumbnail() {
        return Thumbnail;
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

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }


}
