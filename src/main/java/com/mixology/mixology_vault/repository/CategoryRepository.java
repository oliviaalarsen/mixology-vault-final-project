package com.mixology.mixology_vault.repository;

import com.mixology.mixology_vault.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> { }
