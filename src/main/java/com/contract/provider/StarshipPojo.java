package com.contract.provider;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class StarshipPojo implements Serializable {

    private String name;
    private String model;
    private String manufacturer;
    private Integer cost_in_credits;
    private Float length;
    private Integer max_atmosphering_speed;
    private Integer crew;
    private Integer passengers;
    private Integer cargo_capacity;
    private String consumables;
    private Float hyperdrive_rating;
    private Integer MGLT;
    private String starship_class;
    private ArrayList<String> pilots;
    private ArrayList<String> films;
    private Date created;
    private Date edited;
    private String url;

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

    public Integer getCost_in_credits() {
        return cost_in_credits;
    }

    public void setCost_in_credits(Integer cost_in_credits) {
        this.cost_in_credits = cost_in_credits;
    }

    public Float getLength() {
        return length;
    }

    public void setLength(Float length) {
        this.length = length;
    }

    public Integer getMax_atmosphering_speed() {
        return max_atmosphering_speed;
    }

    public void setMax_atmosphering_speed(Integer max_atmosphering_speed) {
        this.max_atmosphering_speed = max_atmosphering_speed;
    }

    public String getConsumables() {
        return consumables;
    }

    public void setConsumables(String consumables) {
        this.consumables = consumables;
    }

    public Float getHyperdrive_rating() {
        return hyperdrive_rating;
    }

    public void setHyperdrive_rating(Float hyperdrive_rating) {
        this.hyperdrive_rating = hyperdrive_rating;
    }

    public Integer getMGLT() {
        return MGLT;
    }

    public void setMGLT(Integer MGLT) {
        this.MGLT = MGLT;
    }

    public ArrayList<String> getPilots() {
        return pilots;
    }

    public void setPilots(ArrayList<String> pilots) {
        this.pilots = pilots;
    }

    public ArrayList<String> getFilms() {
        return films;
    }

    public void setFilms(ArrayList<String> films) {
        this.films = films;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getEdited() {
        return edited;
    }

    public void setEdited(Date edited) {
        this.edited = edited;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
}
