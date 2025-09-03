package com.mixology.mixology_vault.controller;

import com.mixology.mixology_vault.model.Ingredient;
import com.mixology.mixology_vault.service.IngredientService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/ingredients")
@CrossOrigin

public class IngredientController {
  private final IngredientService service;
  public IngredientController(IngredientService service) { 
    this.service = service; 
    }

  @GetMapping 
  public List<Ingredient> list() { 
    return service.findAll(); 
    }

  @PostMapping 
  public Ingredient create(@RequestBody Ingredient i) { 
    return service.create(i); 
    }

  @DeleteMapping("/{id}") 
  public void delete(@PathVariable Long id) { 
    service.delete(id); 
    }
}
