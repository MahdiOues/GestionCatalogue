package com.dsg2.gestioncatalogue.repository;

import com.dsg2.gestioncatalogue.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
}
