package com.dsg2.gestioncatalogue.repository;

import com.dsg2.gestioncatalogue.entities.Categorie;
import com.dsg2.gestioncatalogue.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategorieRepository extends JpaRepository<Categorie,Long> {


}


