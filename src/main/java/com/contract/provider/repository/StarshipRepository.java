package com.contract.provider.repository;

import com.contract.provider.entity.Starship;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface StarshipRepository extends JpaRepository<Starship, Serializable> {

    public abstract Starship findById(int id);
    public abstract Starship findByName(String name);
}
