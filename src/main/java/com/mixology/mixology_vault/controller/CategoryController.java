package com.mixology.mixology_vault.controller;

import com.mixology.mixology_vault.model.Category;
import com.mixology.mixology_vault.service.CategoryService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/categories")
@CrossOrigin

public class CategoryController {
  private final CategoryService service;
  public CategoryController(CategoryService service) { this.service = service; }

  @GetMapping public List<Category> list() { return service.findAll(); }
  @PostMapping public Category create(@RequestBody Category c) { return service.create(c); }
  @DeleteMapping("/{id}") public void delete(@PathVariable Long id) { service.delete(id); }
}
