package com.products.isi.products.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import com.products.isi.products.service.interfaces.IProduitService;
import com.products.isi.products.entity.Produit;
import lombok.*;

@RestController
@RequestMapping("/produits")
//@RequiredArgsConstructor
@Tag(name = "Produit", description = "API de gestion des produits")
public class ProduitController {

    private  final  IProduitService iProduitService;

    public ProduitController(IProduitService iProduitService) {
        this.iProduitService = iProduitService;
    }

    @PostMapping(path="/creer_Produit")
    public Produit creeProduit(@RequestBody Produit produit){
        return iProduitService.creerProduit(produit);
    }



}
