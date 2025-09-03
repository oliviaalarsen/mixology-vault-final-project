package com.mixology.mixology_vault.service;

import com.mixology.mixology_vault.model.Category;
import com.mixology.mixology_vault.model.Cocktail;
import com.mixology.mixology_vault.model.Ingredient;
import com.mixology.mixology_vault.repository.CategoryRepository;
import com.mixology.mixology_vault.repository.CocktailRepository;
import com.mixology.mixology_vault.repository.IngredientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CocktailService {
  private final CocktailRepository repo;
  private final IngredientRepository ingredientRepo;
  private final CategoryRepository categoryRepo;

  public CocktailService(CocktailRepository repo,
                         IngredientRepository ingredientRepo,
                         CategoryRepository categoryRepo) {
    this.repo = repo;
    this.ingredientRepo = ingredientRepo;
    this.categoryRepo = categoryRepo;
  }

  public List<Cocktail> findAll() { 
    return repo.findAll(); 
    }

  public Cocktail findById(Long id) { 
    return repo.findById(id).orElse(null); 
    }

  public Cocktail save(Cocktail cocktail) { 
    return repo.save(cocktail); 
    }

  public void delete(Long id) { 
    repo.deleteById(id); 
    }

  public Cocktail addIngredient(Long cocktailId, Long ingredientId) {
    Cocktail c = repo.findById(cocktailId).orElseThrow();
    Ingredient i = ingredientRepo.findById(ingredientId).orElseThrow();
    c.getIngredients().add(i);
    return repo.save(c);
  }

  public Cocktail removeIngredient(Long cocktailId, Long ingredientId) {
    Cocktail c = repo.findById(cocktailId).orElseThrow();
    Ingredient i = ingredientRepo.findById(ingredientId).orElseThrow();
    c.getIngredients().remove(i);
    return repo.save(c);
  }

  public Cocktail assignCategory(Long cocktailId, Long categoryId) {
    Cocktail c = repo.findById(cocktailId).orElseThrow();
    Category cat = categoryRepo.findById(categoryId).orElseThrow();
    c.setCategory(cat);
    return repo.save(c);
  }
}
