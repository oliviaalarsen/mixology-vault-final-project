package com.mixology.mixology_vault.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Ingredient {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false, unique = true)
  private String name;

  @ManyToMany(mappedBy = "ingredients")
  @JsonIgnoreProperties("ingredients")
  @Builder.Default
  private List<Cocktail> cocktails = new ArrayList<>();


}
