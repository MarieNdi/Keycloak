package com.products.isi.products.service.interfaces;

import com.products.isi.products.entity.Produit;
import jakarta.validation.constraints.Max;

import java.util.List;

public interface IProduitService {

    Produit creerProduit(Produit produit);

    List<Produit> ListTout();

}
