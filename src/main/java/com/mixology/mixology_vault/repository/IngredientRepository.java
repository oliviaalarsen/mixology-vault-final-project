package com.mixology.mixology_vault.repository;

import com.mixology.mixology_vault.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> { }
