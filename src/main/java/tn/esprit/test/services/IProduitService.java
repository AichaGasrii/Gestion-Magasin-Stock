package tn.esprit.test.services;

import tn.esprit.test.entity.Produit;

import java.util.List;

public interface IProduitService {

    public List<Produit> retrieveAllProduits();

    public Produit addProduit (Produit p, Long idRayon, Long idStock);

   public  Produit retrieveProduit(Long id);

    void assignProduitToStock(Long idProduit, Long idStock);

}
