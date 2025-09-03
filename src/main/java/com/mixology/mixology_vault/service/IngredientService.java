package com.mixology.mixology_vault.service;

import com.mixology.mixology_vault.model.Ingredient;
import com.mixology.mixology_vault.repository.IngredientRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class IngredientService {
  private final IngredientRepository repo;
  public IngredientService(IngredientRepository repo) { this.repo = repo; }
  public List<Ingredient> findAll() { return repo.findAll(); }
  public Ingredient create(Ingredient i) { return repo.save(i); }
  public void delete(Long id) { repo.deleteById(id); }
}
