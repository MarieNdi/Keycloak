package com.products.isi.products.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Table(name="produit")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nom;
    private Integer prix;

    public Produit(String nom, Integer prix) {
        this.nom = nom;
        this.prix = prix;
    }
}
