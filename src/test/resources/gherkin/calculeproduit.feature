# language: fr
  Fonctionnalité: gestion Produit

    Scénario: calcule prix Total
      Etant donné les produit en stock
        | produit  | <produit> |
        | prix     | <prix>    |
        | quantite | <quantite>|
      Lorsque on calcule le prix Total
      Alors la somme de produit est <prixtotal>

      Exemples:
      | produit | prix  | quantite  | prixtotal  |
      | banane  | 5     | 5         | 25         |
      | carotte | 5     | 6         | 30         |