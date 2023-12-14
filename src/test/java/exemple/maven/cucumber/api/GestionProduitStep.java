package exemple.maven.cucumber.api;

import exemple.maven.cucumber.api.model.Produit;
import exemple.maven.cucumber.api.services.IProduitService;
import exemple.maven.cucumber.api.services.ProduitServiceImpl;
import io.cucumber.java.fr.Alors;
import io.cucumber.java.fr.Etantdonné;
import io.cucumber.java.fr.Lorsque;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class GestionProduitStep {

    IProduitService produitService = new ProduitServiceImpl();
    double resultatPrixTotal;

    @Etantdonné("les produit en stock")
    public void les_produit_en_stock(Map<String,String> donnees) {
        produitService.ajouterProduit(Produit.builder()
                .produit(donnees.get("produit"))
                .prix(Double.parseDouble(donnees.get("prix")))
                .quantite(Integer.parseInt(donnees.get("quantite")))
                .build());
    }
    @Lorsque("on calcule le prix Total")
    public void on_calcule_le_prix_total() {
         resultatPrixTotal = produitService.calculerPrixTotalProduit();
    }
    @Alors("la somme de produit est {double}")
    public void la_somme_de_produit_est(double prixtotal) {
        assertThat(resultatPrixTotal).isEqualTo(prixtotal);
    }
}