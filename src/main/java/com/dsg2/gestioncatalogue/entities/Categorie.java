package com.dsg2.gestioncatalogue.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Categorie {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    @OneToMany(mappedBy = "categorie")
    private List<Produit> produits;
}
