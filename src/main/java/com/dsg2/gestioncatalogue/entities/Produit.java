package com.dsg2.gestioncatalogue.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Produit {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    private double prix;
    private int quantite;
    @ManyToOne
    private Categorie categorie;
}
