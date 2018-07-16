package com.contract.provider;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;


public class SWApiService {

    private static final String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36";

    public StarshipPojo getSWApiStarship(final Long id) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("user-agent", USER_AGENT);
        HttpEntity request = new HttpEntity(headers);

        final RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<StarshipPojo> starshipPojoResponseEntity = restTemplate.exchange("https://swapi.co/api/starships/" + id.toString(), HttpMethod.GET, request, StarshipPojo.class);

        return starshipPojoResponseEntity.getBody();
    }

    public PilotPojo getSWApiPilot(final String url) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("user-agent", USER_AGENT);
        HttpEntity request = new HttpEntity(headers);

        final RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<PilotPojo> pilotPojoResponseEntity = restTemplate.exchange(url, HttpMethod.GET, request, PilotPojo.class);

        return pilotPojoResponseEntity.getBody();
    }

    public FilmPojo getSWApiFilm(final String url) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("user-agent", USER_AGENT);
        HttpEntity request = new HttpEntity(headers);

        final RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<FilmPojo> filmPojoResponseEntity = restTemplate.exchange(url, HttpMethod.GET, request, FilmPojo.class);

        return filmPojoResponseEntity.getBody();
    }
}
