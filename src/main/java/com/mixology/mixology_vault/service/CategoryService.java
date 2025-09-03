package com.mixology.mixology_vault.service;

import com.mixology.mixology_vault.model.Category;
import com.mixology.mixology_vault.repository.CategoryRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoryService {
  private final CategoryRepository repo;
  public CategoryService(CategoryRepository repo) { this.repo = repo; }
  public List<Category> findAll() { return repo.findAll(); }
  public Category create(Category c) { return repo.save(c); }
  public void delete(Long id) { repo.deleteById(id); }
}
