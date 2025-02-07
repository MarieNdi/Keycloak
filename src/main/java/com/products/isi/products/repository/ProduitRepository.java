package com.products.isi.products.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.products.isi.products.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Integer> {
}

