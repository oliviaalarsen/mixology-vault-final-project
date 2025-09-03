package com.mixology.mixology_vault.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Cocktail {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String name;

  private String description;

  @Builder.Default
  @Column(nullable = false, columnDefinition = "BOOLEAN DEFAULT FALSE")
  private Boolean starred = false;

  // Many-to-one: Category has many Cocktails
  @ManyToOne
  @JoinColumn(name = "category_id")
  @JsonIgnoreProperties("cocktails")
  private Category category;

  // Many-to-many: Cocktail <-> Ingredient
  @ManyToMany
  @JoinTable(
      name = "cocktail_ingredient",
      joinColumns = @JoinColumn(name = "cocktail_id"),
      inverseJoinColumns = @JoinColumn(name = "ingredient_id")
  )
  @Builder.Default
  @JsonIgnoreProperties("cocktails")
  private Set<Ingredient> ingredients = new HashSet<>();
}
