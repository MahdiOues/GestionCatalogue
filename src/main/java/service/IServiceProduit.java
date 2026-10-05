package service;

import com.dsg2.gestioncatalogue.entities.Produit;

import java.util.List;

public interface IServiceProduit {
     void ajoutProduit (Produit p);
     void supprimerProduit(Long id);
     void modifierProduit(Long id, Produit p);
     void getProduit(Long id);
     List<Produit> getAllProucts();
     List<Produit> getProductsParMC(String mc);
}
