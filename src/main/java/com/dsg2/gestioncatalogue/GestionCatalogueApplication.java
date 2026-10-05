package com.dsg2.gestioncatalogue;

import com.dsg2.gestioncatalogue.entities.Categorie;
import com.dsg2.gestioncatalogue.entities.Produit;
import com.dsg2.gestioncatalogue.repository.CategorieRepository;
import com.dsg2.gestioncatalogue.repository.ProduitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GestionCatalogueApplication {
    //@Bean
    CommandLineRunner commandLineRunner(CategorieRepository categorieRepository,
                                        ProduitRepository produitRepository)
    {
        return args -> {
            Categorie c1 = new Categorie(null,"information", null);
            Categorie c2= Categorie.builder().nom("electronique").build();
            categorieRepository.save(c1);
            categorieRepository.save(c2);

            produitRepository.save(
                    Produit.builder().nom("pc")
                            .quantite(10)
                            .prix(5000)
                            .categorie(c1)
                            .build());
            produitRepository.save(
                    Produit.builder().nom("clavier")
                            .quantite(5)
                            .prix(2800)
                            .categorie(c1)
                            .build());

            produitRepository.save(
                    Produit.builder().nom("smartphone")
                            .quantite(5)
                            .prix(2800)
                            .categorie(c2)
                            .build());

        };
    }

    public static void main(String[] args) {
        SpringApplication.run(GestionCatalogueApplication.class, args);
    }

}
