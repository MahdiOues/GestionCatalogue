package com.dsg2.gestioncatalogue.repository;

import com.dsg2.gestioncatalogue.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProduitRepository extends JpaRepository<Produit,Long> {
    //Derived query
    public List<Produit> findByNomContains(String mc);
}
