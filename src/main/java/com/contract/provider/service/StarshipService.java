package com.contract.provider.service;


import com.contract.provider.converter.Converter;
import com.contract.provider.entity.Starship;
import com.contract.provider.model.MStarship;
import com.contract.provider.repository.StarshipRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("starshipService")
public class StarshipService {

    @Autowired
    @Qualifier("starshipRepository")
    private StarshipRepository starshipRepository;

    @Autowired
    @Qualifier("converter")
    private Converter converter;

    private static final Log logger = LogFactory.getLog(StarshipService.class);

    public boolean createStarship(Starship starship) {
       logger.info("Adding Starship");
       try{
           starshipRepository.save(starship);
           logger.info("Starship added");
           return true;
       } catch (Exception e){
           logger.error(e.getMessage());
           return false;
       }
    }

    public boolean updateStarship(Starship starship) {
        logger.info("Updating Starship");
        try {
            starshipRepository.save(starship);
            logger.info("Starship updated");
            return true;
        } catch (Exception e){
            logger.error(e.getMessage());
            return false;
        }
    }

    public boolean deleteStarship(int id) {
        logger.info("Deleting Starship");
        try {
            Starship starship = starshipRepository.findById(id);
            starshipRepository.delete(starship);
            logger.info("Starship deleted");
            return true;
        } catch (Exception e){
            logger.error(e.getMessage());
            return false;
        }
    }

    public MStarship getStarship(int id) {
        return new MStarship(starshipRepository.findById(id));
    }

    public List<MStarship> getStarships(){
        return converter.convertList(starshipRepository.findAll());
    }


}
