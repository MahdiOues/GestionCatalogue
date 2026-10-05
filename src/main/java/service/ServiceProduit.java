package service;

import com.dsg2.gestioncatalogue.entities.Produit;
import com.dsg2.gestioncatalogue.repository.ProduitRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class ServiceProduit implements IServiceProduit{
    private ProduitRepository produitRepository;

    @Override
    public void ajoutProduit(Produit p) {

    }

    @Override
    public void supprimerProduit(Long id) {

    }

    @Override
    public void modifierProduit(Long id, Produit p) {

    }

    @Override
    public void getProduit(Long id) {

    }

    @Override
    public List<Produit> getAllProucts() {
        return List.of();
    }

    @Override
    public List<Produit> getProductsParMC(String mc) {
        return List.of();
    }



}
