# TP5 

# Exercice 1 - Hiérarchie de comptes bancaires

- On construit une petite hiérarchie de classes autour d'un compte bancaire de base.
- La classe Compte regroupe ce qui est commun à tous les comptes : un numéro auto-incrémenté, un solde, et les opérations de base (déposer, retirer, afficher les détails).
- CompteEpargne hérite de Compte et ajoute un taux d'intérêt ainsi qu'une méthode pour appliquer les intérêts sur le solde actuel.
- CompteCourant hérite aussi de Compte, mais redéfinit la méthode de retrait pour autoriser un découvert jusqu'à une limite fixée, ce qui n'est pas possible avec un compte de base.
- Chaque sous-classe redéfinit également l'affichage des détails pour montrer ses informations propres, tout en gardant le principe général hérité de la classe parente.
- Cet exercice illustre l'idée centrale de l'héritage : éviter de réécrire le code commun, et ne redéfinir que ce qui change réellement d'un type de compte à l'autre.

<img width="1280" height="668" alt="1" src="https://github.com/user-attachments/assets/a30d6037-5e84-462e-aea9-670316c5798e" />

<img width="1280" height="674" alt="12" src="https://github.com/user-attachments/assets/3a127324-ccc1-41ac-8652-f7c084be94a1" />

<img width="1278" height="670" alt="13" src="https://github.com/user-attachments/assets/fd37a122-39f6-476a-aaa9-a482b18244ba" />

<img width="1280" height="671" alt="14" src="https://github.com/user-attachments/assets/a1aa58dc-3611-4eef-8823-658aff9a9241" />

https://github.com/user-attachments/assets/f901c715-ebf6-449d-8aea-a3b3aa554554


# Exercice 2 - Gestion d'un zoo avec tableau dynamique d'animaux

- On modélise plusieurs types d'animaux qui partagent des caractéristiques communes, mais qui ont chacun un comportement spécifique.
- La classe Animal regroupe l'identifiant, le nom, l'âge, et un comportement générique de déplacement.
- Les classes Mammifere, Oiseau et Reptile héritent toutes de Animal. Chacune ajoute son propre attribut (couleur de fourrure, envergure, type d'écailles) ainsi qu'une méthode qui lui est propre (allaiter, voler, se chauffer au soleil).
- La classe Zoo garde un tableau d'animaux qui s'agrandit automatiquement lorsqu'il devient plein, exactement comme dans les exercices précédents sur les tableaux dynamiques.
- Le point intéressant ici est que le tableau du zoo est de type Animal, mais qu'il peut contenir n'importe lequel des trois sous-types. Quand on affiche un animal, c'est toujours la bonne version de l'affichage (celle du type réel de l'objet) qui est utilisée automatiquement.

<img width="1280" height="672" alt="2" src="https://github.com/user-attachments/assets/46e3e2fc-1055-445a-80c4-1374d8f94e0d" />

<img width="1280" height="668" alt="21" src="https://github.com/user-attachments/assets/857e3c86-98e3-467a-a627-a40cc31af1aa" />

<img width="1280" height="669" alt="22" src="https://github.com/user-attachments/assets/f236e27f-bb48-420e-825d-41d9710f63b8" />

<img width="1280" height="672" alt="23" src="https://github.com/user-attachments/assets/e82b48aa-5ca4-4712-90f3-0425bba34a6d" />

<img width="1280" height="674" alt="24" src="https://github.com/user-attachments/assets/afecae75-9669-428d-a798-4efb0c89b5f1" />

<img width="1280" height="672" alt="25" src="https://github.com/user-attachments/assets/e7861bf1-bbf4-4313-a4cf-546c5ce895d6" />

https://github.com/user-attachments/assets/b4e9c2b6-3f5a-4572-8afd-31e4088c0739


# Exercice 3 - Parc de véhicules avec héritage et composition

- Cet exercice combine héritage sur plusieurs niveaux et composition.
- Vehicule est la classe de base, avec un identifiant et un modèle. Motorise hérite de Vehicule et ajoute tout ce qui concerne le fonctionnement mécanique : un moteur, un niveau de carburant, un kilométrage total, ainsi que les actions de démarrer, rouler et faire le plein.
- Le moteur n'est pas hérité, il est composé : chaque véhicule motorisé possède un objet Moteur comme attribut, ce qui illustre la relation "a un" plutôt que "est un".
- Voiture, Camion et Moto héritent de Motorise et ajoutent chacun leur propre spécificité (nombre de portes, capacité de charge, cylindrée).
- VoitureElectrique hérite également de Motorise, mais redéfinit la méthode de ravitaillement pour parler de recharge plutôt que de plein, et modifie légèrement l'affichage pour remplacer le mot carburant par batterie.
- Plutôt que de bloquer le programme avec une erreur si le carburant est insuffisant, la méthode affiche simplement un message d'avertissement et n'effectue pas le trajet.
- La classe Flotte regroupe tous les véhicules dans un tableau dynamique et peut calculer des statistiques globales, comme la distance totale parcourue par l'ensemble du parc.

<img width="1280" height="671" alt="3" src="https://github.com/user-attachments/assets/a590ad0a-1549-4a03-a709-23a80fe414fc" />

<img width="1280" height="669" alt="31" src="https://github.com/user-attachments/assets/67ef6a4d-4abd-4cc7-9237-3963aefdcbc5" />

<img width="1280" height="666" alt="32" src="https://github.com/user-attachments/assets/819bd711-0ed9-4d1b-a20d-66edd7547d39" />

<img width="1280" height="676" alt="33" src="https://github.com/user-attachments/assets/e594aa7b-2cc1-4c36-a484-fbc781517f95" />

<img width="1280" height="670" alt="34" src="https://github.com/user-attachments/assets/a86e8557-18d8-4dc7-abe8-ef0884ed6727" />

<img width="1280" height="672" alt="35" src="https://github.com/user-attachments/assets/996c4ffc-cc51-4332-86ee-e63882145311" />

<img width="1280" height="673" alt="36" src="https://github.com/user-attachments/assets/b13719b0-951b-4fb6-9e3d-77d17d049bed" />

<img width="1280" height="673" alt="37" src="https://github.com/user-attachments/assets/88428d35-b629-4357-9584-23b8a167c7e0" />

<img width="1280" height="673" alt="38" src="https://github.com/user-attachments/assets/b889740c-807b-4d0b-8479-d7b1232b69b6" />

https://github.com/user-attachments/assets/cbc48a36-513f-4a25-bac4-60ec2e90211b


# Exercice 4 - Gestion d'une bibliothèque

- On modélise une bibliothèque capable de contenir différents types de documents.
- La classe Document regroupe ce qui est commun à tout document : un numéro d'enregistrement auto-incrémenté, un titre, et un auteur qui peut être absent selon le type de document.
- Livre et Journal héritent de Document. Le livre ajoute un nombre de pages et un éditeur, tandis que le journal ajoute une date de parution et un numéro. Chacun complète l'affichage hérité avec ses propres informations.
- Tous les attributs sont encapsulés : ils sont privés et ne sont accessibles que via des méthodes dédiées, ce qui protège les données contre des modifications directes non contrôlées.
- La classe Bibliotheque gère une collection de documents dans un tableau de taille fixe. Elle permet d'ajouter un document tant qu'il reste de la place, de le retirer, de le retrouver à partir de son numéro d'enregistrement, d'afficher tous les documents, et de lister les auteurs présents.
- Le programme de test propose un menu interactif : demander la capacité de la bibliothèque, l'initialiser avec deux documents de départ, puis proposer d'ajouter, d'afficher, de supprimer ou de lister les auteurs, jusqu'à ce que l'utilisateur choisisse de quitter.

<img width="1278" height="671" alt="4" src="https://github.com/user-attachments/assets/a724fbfc-ef36-4daf-aca9-297541396e74" />

<img width="1280" height="672" alt="41" src="https://github.com/user-attachments/assets/2f8ecc0d-62c0-4a0e-9855-3c1f27f6773d" />

<img width="1280" height="668" alt="42" src="https://github.com/user-attachments/assets/4a9cdfe8-cc51-48c7-8df9-76af9e53a417" />

<img width="1280" height="670" alt="43" src="https://github.com/user-attachments/assets/4be24ec7-a818-44b3-a4d4-77becc086193" />

<img width="1280" height="673" alt="44" src="https://github.com/user-attachments/assets/0b7c1145-04e7-43d6-ae02-260f87d685b7" />

<img width="1280" height="669" alt="45" src="https://github.com/user-attachments/assets/0b886821-3a6a-4402-9fc3-75cfc70002c5" />

<img width="1280" height="674" alt="46" src="https://github.com/user-attachments/assets/73503567-3b68-4ff5-9d21-9220c60931e5" />

<img width="1280" height="675" alt="47" src="https://github.com/user-attachments/assets/8badf223-4939-4e94-827f-2bbb857c9aa4" />

https://github.com/user-attachments/assets/b1f5842d-ce4e-4782-bfb0-4739a544abf6

