package tn.esprit.test.services;

import tn.esprit.test.entity.Fournisseur;

import java.util.List;

public interface IFournisseurService {
    public List<Fournisseur> retrieveAllFournisseurs();
    public Fournisseur addFournisseur (Fournisseur f);
    public Fournisseur updateFournisseur (Fournisseur f);
    public Fournisseur retrieveFournisseur (Long id);
    public void assignFournisseurToProduit(Long fournisseurId, Long produitId);
}
