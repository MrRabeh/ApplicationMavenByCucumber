package exemple.maven.cucumber.api.services;

import exemple.maven.cucumber.api.model.Produit;

public interface IProduitService {

    public void ajouterProduit(Produit produit);

    public double calculerPrixTotalProduit();
}
