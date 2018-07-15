package com.contract.provider;

import java.util.List;

public class Ship {

    private String name;
    private String model;
    private String manufacturer;
    private Float lenght;
    private Integer crew;
    private Integer passengers;
    private Integer cargo_capacity;
    private String starship_class;
    private List<Pilot> pilots;

    public Ship(String name, String model, String manufacturer, Float lenght, Integer crew, Integer passengers, Integer cargo_capacity, String starship_class, Pilots pilots) {
        this.name = name;
        this.model = model;
        this.manufacturer = manufacturer;
        this.lenght = lenght;
        this.crew = crew;
        this.passengers = passengers;
        this.cargo_capacity = cargo_capacity;
        this.starship_class = starship_class;
        this.pilots = pilots;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Float getLenght() {
        return lenght;
    }

    public void setLenght(Float lenght) {
        this.lenght = lenght;
    }

    public Integer getCrew() {
        return crew;
    }

    public void setCrew(Integer crew) {
        this.crew = crew;
    }

    public Integer getPassengers() {
        return passengers;
    }

    public void setPassengers(Integer passengers) {
        this.passengers = passengers;
    }

    public Integer getCargo_capacity() {
        return cargo_capacity;
    }

    public void setCargo_capacity(Integer cargo_capacity) {
        this.cargo_capacity = cargo_capacity;
    }

    public String getStarship_class() {
        return starship_class;
    }

    public void setStarship_class(String starship_class) {
        this.starship_class = starship_class;
    }

    public List<Pilot> getPilots() {
        return pilots;
    }

    public void setPilots(List<Pilot> pilots) {
        this.pilots = pilots;
    }
}
