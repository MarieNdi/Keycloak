package com.products.isi.products.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Version;

@Entity
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;  // L'ID est généré automatiquement avec la stratégie d'identité.

    private String nom;  // Le nom du produit.

    private Integer prix;  // Le prix du produit.

    @Version
    private Integer version;  // Champ de versionnement pour éviter les conflits d'écriture (optimistic locking).

    // Constructeur sans arguments (requis par Hibernate)
    public Produit() {
    }

    // Constructeur avec paramètres (facultatif)
    public Produit(String nom, Integer prix) {
        this.nom = nom;
        this.prix = prix;
    }

    // Getters et setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getPrix() {
        return prix;
    }

    public void setPrix(Integer prix) {
        this.prix = prix;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prix=" + prix +
                ", version=" + version +
                '}';
    }
}
