package com.rosemberg.springboot.app.springbootcrud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rosemberg.springboot.app.springbootcrud.models.Beer;
import com.rosemberg.springboot.app.springbootcrud.repositories.BeerRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@CrossOrigin(originPatterns = "*")
public class BeerController {

    @Autowired
    private BeerRepository beerRepository;

    @GetMapping("/api/beers")
    public List<Beer> getAllBeers() {
        return beerRepository.findAll();
    }

    @GetMapping("/api/createBeers")
    public void createBeer() {
        Beer beer = new Beer();
        beer.setBeerName("Cortacorriente");
        beer.setBeerStyle("Hazy IPA");
        beer.setBeerBrewerie("Tamango Brebajes");
        beer.setBeerAlcohol(6);
        beer.setBeerIbu(0);
        beer.setBeerPrice(4000);
        beer.setBeerDescription("Hazy IPA con lúpulos Citra, Mosaic y Simcoe. Aromas a frutas tropicales, cítricos y un toque a pino. Cuerpo medio, amargor medio y final seco.");
        beer.setBeerRate(5);
        beerRepository.save(beer);
    }

    @PostMapping("/api/beers/add")
    public ResponseEntity<Beer> saveBeer(@RequestBody Beer beer) {
        if (beer.getId() != null) {
            return ResponseEntity.badRequest().build();
        }
        beerRepository.save(beer);
        return ResponseEntity.ok(beer);
    }


}