package com.mixology.mixology_vault.controller;

import com.mixology.mixology_vault.model.Cocktail;
import com.mixology.mixology_vault.service.CocktailService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cocktails")
@CrossOrigin
public class CocktailController {

    private final CocktailService service;

    public CocktailController(CocktailService service) {
        this.service = service;
    }

    @GetMapping
    public List<Cocktail> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Cocktail getOne(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Cocktail create(@RequestBody Cocktail cocktail) {
        return service.save(cocktail);
    }

    @PutMapping("/{id}")
    public Cocktail update(@PathVariable Long id, @RequestBody Cocktail cocktail) {
        cocktail.setId(id);
        return service.save(cocktail);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    // --- Relationship endpoints ---

    // Many-to-many: add/remove an Ingredient to a Cocktail
    @PostMapping("/{id}/ingredients/{ingredientId}")
    public Cocktail addIngredient(@PathVariable Long id, @PathVariable Long ingredientId) {
        return service.addIngredient(id, ingredientId);
    }

    @DeleteMapping("/{id}/ingredients/{ingredientId}")
    public Cocktail removeIngredient(@PathVariable Long id, @PathVariable Long ingredientId) {
        return service.removeIngredient(id, ingredientId);
    }

    // One-to-many: assign a Category to a Cocktail
    @PutMapping("/{id}/category/{categoryId}")
    public Cocktail assignCategory(@PathVariable Long id, @PathVariable Long categoryId) {
        return service.assignCategory(id, categoryId);
    }
}
