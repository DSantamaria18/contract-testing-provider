package starship;

import com.contract.provider.*;
import org.junit.Before;
import org.junit.runner.RunWith;

import org.mockito.Mockito;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import io.restassured.module.mockmvc.RestAssuredMockMvc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProviderApplication.class)
public class BaseClass {

    @Autowired
    StarshipController starshipController;

    @MockBean
    SWApiService swApiService;

    @Before public void setup(){
        StarshipPojo starshipPojo = mockStarshipPojo();
        PilotPojo pilotPojo =  mockPilotPojo();
        FilmPojo filmPojo = mockFilmPojo();

        RestAssuredMockMvc.standaloneSetup(swApiService);

        Mockito.when(swApiService.getSWApiStarship(Mockito.anyLong())).thenReturn(starshipPojo);
        Mockito.when(swApiService.getSWApiPilot(Mockito.anyString())).thenReturn(pilotPojo);
        Mockito.when(swApiService.getSWApiFilm(Mockito.anyString())).thenReturn(filmPojo);

    }

    private StarshipPojo mockStarshipPojo() {
        StarshipPojo starshipPojo = new StarshipPojo();
        ArrayList<String> pilots = new ArrayList<>(Arrays.asList("https://swapi.co/api/people/13/"));
        ArrayList<String> films = new ArrayList<>(Arrays.asList("https://swapi.co/api/films/2/"));

        starshipPojo.setName("Millennium Falcon");
        starshipPojo.setModel("YT-1300 light freighter");
        starshipPojo.setManufacturer( "Corellian Engineering Corporation");
        starshipPojo.setCost_in_credits(100000);
        starshipPojo.setLength(34.37F);
        starshipPojo.setMax_atmosphering_speed(1050);
        starshipPojo.setCrew(4);
        starshipPojo.setPassengers(6);
        starshipPojo.setCargo_capacity(100000);
        starshipPojo.setConsumables("2 months");
        starshipPojo.setHyperdrive_rating(0.5F);
        starshipPojo.setMGLT(75);
        starshipPojo.setStarship_class("Light freighter");
        starshipPojo.setPilots(pilots);
        starshipPojo.setFilms(films);
        starshipPojo.setCreated(new Date("2014-12-10T16:59:45.094000Z"));
        starshipPojo.setEdited(new Date("2014-12-22T17:35:44.464156Z"));
        starshipPojo.setUrl("https://swapi.co/api/starships/10/");

        return starshipPojo;
    }

    private PilotPojo mockPilotPojo() {
        PilotPojo pilotPojo = new PilotPojo();
        pilotPojo.setName("Han Solo");

        return pilotPojo;
    }

    private FilmPojo mockFilmPojo(){
        FilmPojo filmPojo = new FilmPojo();
        filmPojo.setTitle("The Empire Strikes Back");

        return filmPojo;
    }
}
