package com.dsg2.gestioncatalogue;

import com.dsg2.gestioncatalogue.repository.CategorieRepository;
import com.dsg2.gestioncatalogue.repository.ProduitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GestionCatalogueApplication {
    @Bean
    CommandLineRunner commandLineRunner(CategorieRepository categorieRepository,
                                        ProduitRepository produitRepository)
    {
        return args -> {
            
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(GestionCatalogueApplication.class, args);
    }

}
