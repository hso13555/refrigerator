package com.example.demo.repository;

import com.example.demo.entity.Recipe;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
  Recipe findByName(String name);
  Page<Recipe> findAll(Pageable pageable);
}
