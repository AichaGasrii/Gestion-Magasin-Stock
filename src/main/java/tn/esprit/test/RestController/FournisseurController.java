package tn.esprit.test.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.test.entity.Fournisseur;
import tn.esprit.test.services.IFournisseurService;

import java.util.List;


@RestController
@RequestMapping("/fournisseur")
public class FournisseurController {
    @Autowired
    IFournisseurService fournisseurService;
    @GetMapping()
    public List<Fournisseur> retrieveAllFournisseurs(){
        return fournisseurService.retrieveAllFournisseurs();
    }
    @PostMapping("/add")
    public Fournisseur addFournisseur (@RequestBody Fournisseur f){
        return fournisseurService.addFournisseur(f);
    }
    @PutMapping("/edit")
    public Fournisseur updateFournisseur (@RequestBody Fournisseur f){
        return fournisseurService.updateFournisseur(f);
    }
    @GetMapping("/{id}")
    public Fournisseur retrieveFournisseur (@PathVariable Long id){
        return fournisseurService.retrieveFournisseur(id);
    }

    @PutMapping("/assign/{idFournisseur}/{idProduit}")
    public void assignFournisseurToProduit(@PathVariable Long fournisseurId,@PathVariable Long produitId){
        fournisseurService.assignFournisseurToProduit( fournisseurId,  produitId);
    }
}
