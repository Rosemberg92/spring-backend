package com.rosemberg.springboot.app.springbootcrud.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "beers_table")
public class Beer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "beerName", length = 50, nullable = false)
    private String beerName;

    @Column (name = "beerStyle", length = 50, nullable = false)
    private String beerStyle;

    @Column (name = "beerBrewerie", length = 50, nullable = false)
    private String beerBrewerie;

    @Column (name = "beerAlcohol", nullable = false)
    private Integer beerAlcohol;

    @Column (name = "beerIbu", nullable = false)
    private Integer beerIbu;

    @Column (name = "beerPrice", nullable = false)
    private Integer beerPrice;

    @Column (name = "beerDescription", length = 255, nullable = false)
    private String beerDescription;

    @Column (name = "beerRate", nullable = false)
    private Integer beerRate;

    //constructor
    public Beer() {
    }

    //getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBeerName() {
        return beerName;
    }

    public void setBeerName(String beerName) {
        this.beerName = beerName;
    }

    public String getBeerStyle() {
        return beerStyle;
    }

    public void setBeerStyle(String beerStyle) {
        this.beerStyle = beerStyle;
    }

    public String getBeerBrewerie() {
        return beerBrewerie;
    }

    public void setBeerBrewerie(String beerBrewerie) {
        this.beerBrewerie = beerBrewerie;
    }

    public Integer getBeerAlcohol() {
        return beerAlcohol;
    }

    public void setBeerAlcohol(Integer beerAlcohol) {
        this.beerAlcohol = beerAlcohol;
    }

    public Integer getBeerIbu() {
        return beerIbu;
    }

    public void setBeerIbu(Integer beerIbu) {
        this.beerIbu = beerIbu;
    }

    public Integer getBeerPrice() {
        return beerPrice;
    }

    public void setBeerPrice(Integer beerPrice) {
        this.beerPrice = beerPrice;
    }

    public String getBeerDescription() {
        return beerDescription;
    }

    public void setBeerDescription(String beerDescription) {
        this.beerDescription = beerDescription;
    }

    public Integer getBeerRate() {
        return beerRate;
    }

    public void setBeerRate(Integer beerRate) {
        this.beerRate = beerRate;
    }

}
