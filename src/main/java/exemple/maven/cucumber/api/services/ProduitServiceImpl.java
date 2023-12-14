package exemple.maven.cucumber.api.services;

import exemple.maven.cucumber.api.model.Produit;

public class ProduitServiceImpl implements IProduitService{

    Produit produit;
    @Override
    public void ajouterProduit(Produit produit) {
        this.produit=produit;
    }

    @Override
    public double calculerPrixTotalProduit() {
        return produit.prix()*produit.quantite();
    }
}
