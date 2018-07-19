package com.contract.provider.model;


import com.contract.provider.entity.Starship;

public class MStarship {

    private int id;
    private String name;
    private String model;
    private String manufacturer;
    private int cost_in_credits;
    private float length;
    private int max_atmosphering_speed;
    private int crew;
    private int passengers;
    private int cargo_capacity;
    private String starship_class;

    public MStarship(){

    }

    public MStarship(Starship starship){
        this.id = starship.getId();
        this.name = starship.getName();
        this.model = starship.getModel();
        this.manufacturer = starship.getManufacturer();
        this.cost_in_credits = starship.getCost_in_credits();
        this.length = starship.getLength();
        this.max_atmosphering_speed = starship.getMax_atmosphering_speed();
        this.crew = starship.getCrew();
        this.passengers = starship.getPassengers();
        this.cargo_capacity = starship.getCargo_capacity();
        this.starship_class = starship.getStarship_class();
    }

    public MStarship(int id, String name, String model, String manufacturer, int cost_in_credits, float length, int max_atmosphering_speed, int crew, int passengers, int cargo_capacity, String starship_class) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.manufacturer = manufacturer;
        this.cost_in_credits = cost_in_credits;
        this.length = length;
        this.max_atmosphering_speed = max_atmosphering_speed;
        this.crew = crew;
        this.passengers = passengers;
        this.cargo_capacity = cargo_capacity;
        this.starship_class = starship_class;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getCost_in_credits() {
        return cost_in_credits;
    }

    public void setCost_in_credits(int cost_in_credits) {
        this.cost_in_credits = cost_in_credits;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public int getMax_atmosphering_speed() {
        return max_atmosphering_speed;
    }

    public void setMax_atmosphering_speed(int max_atmosphering_speed) {
        this.max_atmosphering_speed = max_atmosphering_speed;
    }

    public int getCrew() {
        return crew;
    }

    public void setCrew(int crew) {
        this.crew = crew;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getCargo_capacity() {
        return cargo_capacity;
    }

    public void setCargo_capacity(int cargo_capacity) {
        this.cargo_capacity = cargo_capacity;
    }

    public String getStarship_class() {
        return starship_class;
    }

    public void setStarship_class(String starship_class) {
        this.starship_class = starship_class;
    }
}
