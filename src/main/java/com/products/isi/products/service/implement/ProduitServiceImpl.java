package com.products.isi.products.service.implement;

import com.products.isi.products.entity.Produit;
import com.products.isi.products.repository.ProduitRepository;
import jakarta.validation.constraints.Max;
import org.springframework.stereotype.Service;
import com.products.isi.products.service.interfaces.IProduitService;
import lombok.*;

import java.util.List;

@Service
//@RequiredArgsConstructor
public class ProduitServiceImpl implements IProduitService {

    private final ProduitRepository produitRepository;

    public ProduitServiceImpl(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }

    @Override
    public Produit creerProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public List<Produit> ListTout() {
       return produitRepository.findAll();
    }


}
