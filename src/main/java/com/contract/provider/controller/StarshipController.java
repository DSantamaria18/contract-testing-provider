package com.contract.provider.controller;

import com.contract.provider.entity.Starship;
import com.contract.provider.model.MStarship;
import com.contract.provider.service.StarshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StarshipController {

    @Autowired
    @Qualifier("starshipService")
    StarshipService starshipService;

    @GetMapping("/starships")
    public List<MStarship> getStarships(){
        return starshipService.getStarships();
    }

    @GetMapping("/starship/{id}")
    public MStarship getStarship(@PathVariable("id") int id) {
        return starshipService.getStarship(id);
    }

    @PutMapping("/starship")
    public boolean addStarship(@RequestBody @Valid Starship starship){
        return starshipService.createStarship(starship);
    }

    @PostMapping("/starship")
    public boolean updateStarship(@RequestBody @Valid Starship starship){
        return starshipService.updateStarship(starship);
    }

    @DeleteMapping("/starship/{id}")
    public boolean deleteStarship(@PathVariable int id){
        return starshipService.deleteStarship(id);
    }


}
