package com.contract.provider.converter;

import com.contract.provider.entity.Starship;
import com.contract.provider.model.MStarship;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("converter")
public class Converter {
    public List<MStarship> convertList(List<Starship> starships){
        List<MStarship> mStarships = new ArrayList<>();
        for(Starship starship : starships){
            mStarships.add(new MStarship(starship));
        }
        return mStarships;
    }
}
