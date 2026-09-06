# TP3 

# Exercice 1 - Série harmonique

- On calcule la somme des n premiers termes de la série 1 + 1/2 + 1/3 + ... + 1/n, n étant fourni par l'utilisateur.
- On lit d'abord n au clavier, puis on prépare un accumulateur de type double pour garder les décimales.
- On parcourt les entiers de 1 à n, et à chaque étape on ajoute l'inverse du nombre courant à l'accumulateur.
- Le 1.0 dans le calcul de l'inverse force Java à faire une division décimale plutôt qu'une division entière, sinon le résultat serait toujours 0.
- Une fois la boucle terminée, on affiche la somme obtenue.

<img width="1280" height="672" alt="1" src="https://github.com/user-attachments/assets/b25a761a-7c57-443c-bc66-dfbc2ff48557" />

# Exercice 2 - Triangle isocèle

- On dessine un triangle d'étoiles dont la hauteur est donnée par l'utilisateur, avec la dernière ligne collée au bord gauche de l'écran.
- Le nombre d'étoiles suit la suite 1, 3, 5, 7... ce qui correspond à la formule 2 fois le numéro de la ligne moins 1.
- Avant les étoiles, on affiche un nombre d'espaces qui diminue à chaque ligne, pour que le triangle soit centré et que sa base touche le bord gauche.
- Pour chaque ligne, on affiche donc d'abord les espaces, puis les étoiles, puis on passe à la ligne suivante.

<img width="1280" height="674" alt="2" src="https://github.com/user-attachments/assets/791cbf2e-97cc-4791-8a55-1d0813dd5485" />

<img width="1280" height="675" alt="21" src="https://github.com/user-attachments/assets/40cd72c5-bb3a-4e3d-86ec-12f58f1ec700" />

# Exercice 3 - Carrés des nombres impairs

- On construit un tableau contenant les carrés des n premiers nombres impairs (1, 3, 5, 7...), n étant lu au clavier.
- Le i-ème nombre impair s'obtient avec la formule 2 fois i moins 1, et son carré s'obtient en le multipliant par lui-même.
- On remplit d'abord le tableau avec tous les carrés calculés.
- On parcourt ensuite ce tableau pour afficher chaque nombre impair suivi de son carré, dans le format demandé par l'énoncé.

<img width="1280" height="671" alt="3" src="https://github.com/user-attachments/assets/56df9a25-0532-4118-b9f1-8e008373b49c" />

<img width="1280" height="668" alt="31" src="https://github.com/user-attachments/assets/ab856d5f-2b8b-4c31-8949-4fef7b2cad6f" />

# Exercice 4 - Classe utilitaire pour tableaux 2D

- On regroupe plusieurs méthodes statiques qui travaillent sur des tableaux à deux dimensions de double.
- La méthode d'affichage parcourt chaque ligne et chaque colonne pour imprimer les valeurs, une ligne du tableau correspondant à une ligne à l'écran.
- La méthode de vérification de régularité compare la taille de chaque ligne à celle de la première ligne : si une différence apparaît, le tableau n'est pas régulier.
- La méthode de somme des lignes additionne les éléments de chaque ligne séparément et stocke chaque résultat dans un tableau.
- La méthode d'addition de deux tableaux commence par vérifier que les deux tableaux sont réguliers et ont exactement les mêmes dimensions, sinon elle renvoie une valeur nulle. Si tout est compatible, elle additionne les tableaux case par case et renvoie le résultat.

<img width="1280" height="670" alt="4" src="https://github.com/user-attachments/assets/c661bbca-7855-4272-9c11-e9bc27e9069f" />

<img width="1280" height="670" alt="41" src="https://github.com/user-attachments/assets/618c6623-5c1c-4ebc-837f-3a4c2d993c09" />

<img width="1279" height="674" alt="42" src="https://github.com/user-attachments/assets/6dade6cc-9908-492e-b9ad-8bd9e1152806" />

# Exercice 5 - Rotation d'une matrice à 90 degrés

- On fait pivoter une matrice carrée de 90 degrés dans le sens horaire, directement en place, sans utiliser de second tableau.
- La méthode se déroule en deux étapes. D'abord la transposition : on échange chaque élément situé au-dessus de la diagonale principale avec son symétrique en dessous, ce qui transforme les lignes en colonnes.
- Ensuite, on inverse chaque ligne horizontalement, en échangeant les éléments du début avec ceux de la fin, jusqu'au milieu de la ligne.
- La combinaison de ces deux étapes donne exactement une rotation de 90 degrés dans le sens horaire, sans avoir besoin de mémoire supplémentaire.

<img width="1280" height="667" alt="5" src="https://github.com/user-attachments/assets/9805a304-1a74-437c-87db-73ded1dabeb6" />

<img width="1280" height="668" alt="51" src="https://github.com/user-attachments/assets/6a7424d0-b047-4f89-b5e9-23790ddcb97e" />

<img width="1280" height="673" alt="52" src="https://github.com/user-attachments/assets/22660f7c-f7da-4c7e-a7e2-c17b6782874d" />

https://github.com/user-attachments/assets/3058ed79-1560-4237-8043-4031d6553a3c

# Exercice 6 - Fenêtre glissante, nombre de valeurs distinctes

- On considère un tableau et une fenêtre de taille fixe qui se déplace le long de ce tableau, une position à la fois.
- Pour chaque position de la fenêtre, on veut savoir combien de valeurs différentes elle contient.
- Pour chaque nouvelle position, on parcourt les éléments de la fenêtre actuelle et, pour chacun, on vérifie s'il est déjà apparu plus tôt dans cette même fenêtre.
- Si l'élément n'était pas encore apparu, on compte une valeur distincte de plus.
- On répète cette vérification pour chaque position de la fenêtre, du début jusqu'à la fin du tableau, et on affiche le résultat obtenu à chaque déplacement.

<img width="1280" height="667" alt="6" src="https://github.com/user-attachments/assets/96c3399c-6d17-4fba-b45d-3a0157584cb7" />

<img width="1280" height="669" alt="61" src="https://github.com/user-attachments/assets/e4296db5-ab28-485b-842e-9ee2bb3c880e" />

<img width="1280" height="667" alt="62" src="https://github.com/user-attachments/assets/bc758d23-c82f-4faa-9699-6a621c50599c" />

https://github.com/user-attachments/assets/a84781ed-7909-4250-81a8-36ead9c1b5f4


