package com.contract.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@RestController
public class StarshipController {

    private static final Logger logger = LoggerFactory.getLogger(ProviderApplication.class);

    @GetMapping("/ship")
    public StarshipPojo getShip(@RequestParam(value = "id") Long id) {
        final RestTemplate restTemplate = new RestTemplate();
        final String url = "https://swapi.co/api/starships/" + id.toString();

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
        HttpEntity request = new HttpEntity(headers);
        ResponseEntity<StarshipPojo> starshipPojo = restTemplate.exchange("https://swapi.co/api/starships/" + id.toString(), HttpMethod.GET, request, StarshipPojo.class);

        return starshipPojo.getBody();
    }

    // private ArrayList<String> getPilots(){}

    // private ArrayList<String> getFilms(){}




}
