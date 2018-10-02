package com.example.tritran.shrimpology;

public class Aquarium {

    private String name;
    private String volume; //change to int
    private String lighting;
    private String filtration;
    private String co2; //change to boolean
    private String substrate;
    private String inhabitants;
    public Aquarium(String name, String volume, String lighting, String filtration, String co2, String substrate, String inhabitants) {
        this.name = name;
        this.volume = volume;
        this.lighting = lighting;
        this.filtration = filtration;
        this.co2 = co2;
        this.substrate = substrate;
        this.inhabitants = inhabitants;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public void setLighting(String lighting) {
        this.lighting = lighting;
    }

    public void setFiltration(String filtration) {
        this.filtration = filtration;
    }

    public void setCo2(String co2) {
        this.co2 = co2;
    }

    public void setSubstrate(String substrate) {
        this.substrate = substrate;
    }

    public String getName() {

        return name;
    }

    public String getVolume() {
        return volume;
    }

    public String getInhabitants() {
        return inhabitants;
    }

    public void setInhabitants(String inhabitants) {
        this.inhabitants = inhabitants;
    }

    public String getLighting() {
        return lighting;
    }

    public String getFiltration() {
        return filtration;
    }

    public String getCo2() {
        return co2;
    }

    public String getSubstrate() {
        return substrate;
    }
}
