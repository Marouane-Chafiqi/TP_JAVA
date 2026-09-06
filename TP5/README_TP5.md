# TP5 

# Exercice 1 - Hiérarchie de comptes bancaires

- On construit une petite hiérarchie de classes autour d'un compte bancaire de base.
- La classe Compte regroupe ce qui est commun à tous les comptes : un numéro auto-incrémenté, un solde, et les opérations de base (déposer, retirer, afficher les détails).
- CompteEpargne hérite de Compte et ajoute un taux d'intérêt ainsi qu'une méthode pour appliquer les intérêts sur le solde actuel.
- CompteCourant hérite aussi de Compte, mais redéfinit la méthode de retrait pour autoriser un découvert jusqu'à une limite fixée, ce qui n'est pas possible avec un compte de base.
- Chaque sous-classe redéfinit également l'affichage des détails pour montrer ses informations propres, tout en gardant le principe général hérité de la classe parente.
- Cet exercice illustre l'idée centrale de l'héritage : éviter de réécrire le code commun, et ne redéfinir que ce qui change réellement d'un type de compte à l'autre.

![alt text](1.png)

![alt text](12.png)

![alt text](13.png)

![alt text](14.png)

[text](../../../../../Desktop/TP_JAVA/TP.5/15.mkv)

# Exercice 2 - Gestion d'un zoo avec tableau dynamique d'animaux

- On modélise plusieurs types d'animaux qui partagent des caractéristiques communes, mais qui ont chacun un comportement spécifique.
- La classe Animal regroupe l'identifiant, le nom, l'âge, et un comportement générique de déplacement.
- Les classes Mammifere, Oiseau et Reptile héritent toutes de Animal. Chacune ajoute son propre attribut (couleur de fourrure, envergure, type d'écailles) ainsi qu'une méthode qui lui est propre (allaiter, voler, se chauffer au soleil).
- La classe Zoo garde un tableau d'animaux qui s'agrandit automatiquement lorsqu'il devient plein, exactement comme dans les exercices précédents sur les tableaux dynamiques.
- Le point intéressant ici est que le tableau du zoo est de type Animal, mais qu'il peut contenir n'importe lequel des trois sous-types. Quand on affiche un animal, c'est toujours la bonne version de l'affichage (celle du type réel de l'objet) qui est utilisée automatiquement.

![alt text](2.png)

![alt text](21.png)

![alt text](22.png)

![alt text](23.png)

![alt text](24.png)

![alt text](25.png)

[text](../../../../../Desktop/TP_JAVA/TP.5/26.mkv)

# Exercice 3 - Parc de véhicules avec héritage et composition

- Cet exercice combine héritage sur plusieurs niveaux et composition.
- Vehicule est la classe de base, avec un identifiant et un modèle. Motorise hérite de Vehicule et ajoute tout ce qui concerne le fonctionnement mécanique : un moteur, un niveau de carburant, un kilométrage total, ainsi que les actions de démarrer, rouler et faire le plein.
- Le moteur n'est pas hérité, il est composé : chaque véhicule motorisé possède un objet Moteur comme attribut, ce qui illustre la relation "a un" plutôt que "est un".
- Voiture, Camion et Moto héritent de Motorise et ajoutent chacun leur propre spécificité (nombre de portes, capacité de charge, cylindrée).
- VoitureElectrique hérite également de Motorise, mais redéfinit la méthode de ravitaillement pour parler de recharge plutôt que de plein, et modifie légèrement l'affichage pour remplacer le mot carburant par batterie.
- Plutôt que de bloquer le programme avec une erreur si le carburant est insuffisant, la méthode affiche simplement un message d'avertissement et n'effectue pas le trajet.
- La classe Flotte regroupe tous les véhicules dans un tableau dynamique et peut calculer des statistiques globales, comme la distance totale parcourue par l'ensemble du parc.

![alt text](3.png)

![alt text](31.png)

![alt text](32.png)

![alt text](33.png)

![alt text](34.png)

![alt text](38.png) 

![alt text](35.png) 

![alt text](36.png) 

![alt text](37.png)

[text](../../../../../Desktop/TP_JAVA/TP.5/39.mkv)

# Exercice 4 - Gestion d'une bibliothèque

- On modélise une bibliothèque capable de contenir différents types de documents.
- La classe Document regroupe ce qui est commun à tout document : un numéro d'enregistrement auto-incrémenté, un titre, et un auteur qui peut être absent selon le type de document.
- Livre et Journal héritent de Document. Le livre ajoute un nombre de pages et un éditeur, tandis que le journal ajoute une date de parution et un numéro. Chacun complète l'affichage hérité avec ses propres informations.
- Tous les attributs sont encapsulés : ils sont privés et ne sont accessibles que via des méthodes dédiées, ce qui protège les données contre des modifications directes non contrôlées.
- La classe Bibliotheque gère une collection de documents dans un tableau de taille fixe. Elle permet d'ajouter un document tant qu'il reste de la place, de le retirer, de le retrouver à partir de son numéro d'enregistrement, d'afficher tous les documents, et de lister les auteurs présents.
- Le programme de test propose un menu interactif : demander la capacité de la bibliothèque, l'initialiser avec deux documents de départ, puis proposer d'ajouter, d'afficher, de supprimer ou de lister les auteurs, jusqu'à ce que l'utilisateur choisisse de quitter.

![alt text](41.png) 

![alt text](42.png) 

![alt text](43.png) 

![alt text](44.png) 

![alt text](45.png) 

![alt text](46.png) 

![alt text](47.png)

[text](../../../../../Desktop/TP_JAVA/TP.5/48.mkv)
