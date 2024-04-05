# Réponses à l'activité pratique :

## Activité Pratique N° 2 : ORM JPA Hibernate Spring Data

1. Installer IntelliJ Ultimate
2. Créer un projet Spring Initializer avec les dépendances JPA, H2, Spring Web et Lombock
3. Créer l'entité JPA Product ayant les attributs :
- `id` de type `Long`
- `name` de type `String`
- `price` de type `double`
- `quantity` de type `int`
4. Configurer l'unité de persistance dans le fichier `application.properties`
5. Créer l'interface JPA Repository basée sur Spring data
6. Tester quelques opérations de gestion de produits :
- Ajouter des produits
- Consulter tous les produits
- Consulter un produit
- Chercher des produits
- Mettre à jour un produit
- Supprimer un produit

### Résultats de l'exécution :

```
**********Add Products *********
All Products are added Successfully



**********Show the list of all products *********
Product(id=1, name=Phone, price=5500.0, quantity=3)
Product(id=2, name=Comp, price=300.0, quantity=14)
Product(id=3, name=Comp, price=430.0, quantity=44)
Product(id=5, name=MacBook, price=50000.0, quantity=2)
Product(id=6, name=MacBook, price=50000.0, quantity=2)
Product(id=7, name=MacBook, price=50000.0, quantity=2)




**********Search for A Product By ID *********
1
Phone
3




**********Search for A Product Method 1 *********
Product list : Product(id=2, name=Comp, price=300.0, quantity=14)
Product list : Product(id=3, name=Comp, price=430.0, quantity=44)
Product list : Product(id=5, name=MacBook, price=50000.0, quantity=2)
Product list : Product(id=6, name=MacBook, price=50000.0, quantity=2)
Product list : Product(id=7, name=MacBook, price=50000.0, quantity=2)




**********Search for A Product Method 2 *********




**********Product Update*********
Update Was Successful




**********Product Modification*********
Product with ID 1 updated successfully!
Product(id=1, name=Phone, price=5500.0, quantity=3)
Product(id=2, name=Comp, price=300.0, quantity=14)
Product(id=3, name=Comp, price=430.0, quantity=44)
Product(id=5, name=MacBook, price=50000.0, quantity=2)
Product(id=6, name=MacBook, price=50000.0, quantity=2)
Product(id=7, name=MacBook, price=50000.0, quantity=2)




**********Product Deletion*********
Product with ID 4 deleted successfully!


```

7. Migrer de H2 Database vers MySQL
8. Reprendre les exemples du Patient, Médecin, rendez-vous, consultation, users et rôles

### Ressources en ligne :
- [Spring Initializr](https://start.spring.io/)
- [Vidéo: Création d'un projet Spring Initializr](https://www.youtube.com/watch?v=cz3p4y7tUEs&ab_channel=ProfesseurMohamedYOUSSFI)
- [Vidéo: JPA Hibernate Spring Data](https://www.youtube.com/watch?v=Kfv_7m8INlU)
- [Vidéo: Migrer de H2 vers MySQL](https://www.youtube.com/watch?v=s6p2dE3qrsU)