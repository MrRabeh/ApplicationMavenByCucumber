package exemple.maven.cucumber.api.model;

import lombok.Builder;

@Builder
public record Produit(String produit,double prix,int quantite) {

}
