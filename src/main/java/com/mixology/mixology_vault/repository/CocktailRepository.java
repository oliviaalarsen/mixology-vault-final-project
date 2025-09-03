package com.mixology.mixology_vault.repository;

import com.mixology.mixology_vault.model.Cocktail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CocktailRepository extends JpaRepository<Cocktail, Long> { 
    
}
