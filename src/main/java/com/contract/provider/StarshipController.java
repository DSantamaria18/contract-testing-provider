package com.contract.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
public class StarshipController {

    private static final Logger logger = LoggerFactory.getLogger(ProviderApplication.class);
    private static final String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36";

    @GetMapping("/ship")
    public StarshipPojo getShip(@RequestParam(value = "id") Long id) {

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("user-agent", USER_AGENT);
        HttpEntity request = new HttpEntity(headers);

        final RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<StarshipPojo> starshipPojo = restTemplate.exchange("https://swapi.co/api/starships/" + id.toString(), HttpMethod.GET, request, StarshipPojo.class);

        Integer numPilotos = starshipPojo.getBody().getPilots().size();
        logger.info("   :: NUMERO DE PILOTOS: " + numPilotos.toString());

        ArrayList<String> pilotos = new ArrayList<>();
        if(numPilotos > 0) {
            logger.info("   :: Buscando los nombres de los pilotos...");
            for(int i = 0; i < numPilotos; i++){
                String nombrePiloto = getPilotName(starshipPojo.getBody().getPilots().get(i));
                pilotos.add(nombrePiloto);
                logger.info("   :: Añadido " + nombrePiloto + " a la lista de pilotos");
            }
        }

        Integer numPeliculas = starshipPojo.getBody().getFilms().size();
        logger.info("   :: NUMERO DE PELICULAS: " + numPeliculas.toString());

        ArrayList<String> peliculas = new ArrayList<>();
        if(numPeliculas > 0) {
            logger.info("   :: Buscando los títulos de las películas...");
            for(int j = 0; j < numPeliculas; j++){
                String titulo = getFilmTitle(starshipPojo.getBody().getFilms().get(j));
                peliculas.add(titulo);
                logger.info("   :: Añadido " + titulo + " a la lista de películas");
            }
        }

        return starshipPojo.getBody();
    }

     private String getPilotName(final String url){

         HttpHeaders headers = new HttpHeaders();
         headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
         headers.add("user-agent", USER_AGENT);
         HttpEntity request = new HttpEntity(headers);

         final RestTemplate restTemplate = new RestTemplate();
         ResponseEntity<PilotPojo> pilotPojoResponseEntity = restTemplate.exchange(url , HttpMethod.GET, request, PilotPojo.class);

         return pilotPojoResponseEntity.getBody().getName();

     }

     private String getFilmTitle(final String url){
         HttpHeaders headers = new HttpHeaders();
         headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
         headers.add("user-agent", USER_AGENT);
         HttpEntity request = new HttpEntity(headers);

         final RestTemplate restTemplate = new RestTemplate();
         ResponseEntity<FilmPojo> filmPojoResponseEntity = restTemplate.exchange(url , HttpMethod.GET, request, FilmPojo.class);

         return filmPojoResponseEntity.getBody().getTitle();
    }




}
