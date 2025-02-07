package com.products.isi.products.service.implement;

import com.products.isi.products.entity.Produit;
import com.products.isi.products.repository.ProduitRepository;
import org.springframework.stereotype.Service;
import com.products.isi.products.service.interfaces.IProduitService;
import lombok.*;

@Service
//@RequiredArgsConstructor
public class ProduitServiceImpl implements IProduitService {

    private final ProduitRepository produitRepository;

    public ProduitServiceImpl(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }

    @Override
    public Produit creerProduit(Produit produit) {
        Produit produit1 = produitRepository.save(produit);
        System.out.println("😊😊 le produit enregistre" + produit1);
        return produit1;
    }
}
