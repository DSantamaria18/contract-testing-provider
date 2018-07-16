package com.contract.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;

@RestController
public class StarshipController {

    private static final Logger logger = LoggerFactory.getLogger(ProviderApplication.class);
    private final SWApiService swApiService = new SWApiService();

    @GetMapping("/starship")
    public Starship getShip(@RequestParam(value = "id") Long id) {

        StarshipPojo starshipPojo = swApiService.getSWApiStarship(id);
        ArrayList<String> pilotos = getPilotsList(starshipPojo);
        ArrayList<String> peliculas = getFilmsList(starshipPojo);

        return  buildStarship(starshipPojo, pilotos, peliculas);
    }

    private ArrayList<String> getFilmsList(StarshipPojo starshipPojo) {
        int numPeliculas = starshipPojo.getFilms().size();
        ArrayList<String> peliculas = new ArrayList<>();
        if (numPeliculas > 0) {
            logger.info("   :: Buscando los títulos de las películas...");
            for (int j = 0; j < numPeliculas; j++) {
                String titulo = getFilmTitle(starshipPojo.getFilms().get(j));
                peliculas.add(titulo);
                logger.info("   :: Añadido " + titulo + " a la lista de películas");
            }
        } else {
            logger.info("   :: ESTA NAVE NO SALE EN NINGUNA PELICULA!!!");
        }
        return peliculas;
    }

    private ArrayList<String> getPilotsList(StarshipPojo starshipPojo) {
        int numPilotos = starshipPojo.getPilots().size();
        ArrayList<String> pilotos = new ArrayList<>();
        if (numPilotos > 0) {
            logger.info("   :: Buscando los nombres de los pilotos...");
            for (int i = 0; i < numPilotos; i++) {
                String nombrePiloto = getPilotName(starshipPojo.getPilots().get(i));
                pilotos.add(nombrePiloto);
                logger.info("   :: Añadido " + nombrePiloto + " a la lista de pilotos");
            }
        } else {
            logger.info("   ::  NO HAY PILOTOS PARA ESTA NAVE!!!");
        }
        return pilotos;
    }

    private String getPilotName(final String url) {
        PilotPojo pilotPojo = swApiService.getSWApiPilot(url);
        return pilotPojo.getName();
    }

    private String getFilmTitle(final String url) {
        FilmPojo filmPojo = swApiService.getSWApiFilm(url);
        return filmPojo.getTitle();
    }

    private Starship buildStarship(final StarshipPojo starshipPojo, final ArrayList<String> pilots, ArrayList<String> films) {
        Starship starship = new Starship();
        starship.setName(starshipPojo.getName());
        starship.setModel(starshipPojo.getModel());
        starship.setManufacturer(starshipPojo.getManufacturer());
        starship.setCost_in_credits(starshipPojo.getCost_in_credits());
        starship.setLength(starshipPojo.getLength());
        starship.setMax_atmosphering_speed(starshipPojo.getMax_atmosphering_speed());
        starship.setCrew(starshipPojo.getCrew());
        starship.setPassengers(starshipPojo.getPassengers());
        starship.setCargo_capacity(starshipPojo.getCargo_capacity());
        starship.setStarship_class(starshipPojo.getStarship_class());
        starship.setPilots(pilots);
        starship.setFilms(films);

        return starship;
    }


}
