# TP_1
# Étape 1 - Affichage du menu

* On utilise `System.out.println()` pour afficher chaque ligne du menu.
* Aucune logique de calcul à ce stade, uniquement du texte affiché à l'écran.
* Le but est de montrer à l'utilisateur les options disponibles avant de lui demander quoi que ce soit.
<img width="1280" height="673" alt="1" src="https://github.com/user-attachments/assets/16252334-3fbe-4d32-a1cb-31773082fbbc" />



# Étape 2 - Lecture du choix + boucle
* On crée un `Scanner` relié à `System.in` pour pouvoir lire ce que l'utilisateur tape au clavier.
* `sc.nextInt()` récupère le nombre saisi et le stocke dans la variable `x`.
* Tout est entouré d'une boucle `do { ... } while (x != 0)` pour que le menu se réaffiche tant que l'utilisateur n'a pas tapé `0`.
* Le `do-while` garantit que le menu s'affiche au moins une fois, même avant la première saisie.
<img width="1280" height="673" alt="2" src="https://github.com/user-attachments/assets/03602559-0110-4561-b441-438a857ff5c6" />

# Étape 3 - Création des méthodes

Chaque opération est isolée dans sa propre méthode, indépendante du menu :

* `addition(int a, int b)` - retourne la somme des deux entiers.
* `multiplication(int a, int b)` - retourne le produit des deux entiers.
* `moyenne(int... valeurs)` - accepte un nombre variable de valeurs (varargs), additionne tout, puis divise par le nombre de valeurs. Retourne un `double` pour garder la partie décimale.
* `maximum(int... valeurs)` - accepte un nombre variable de valeurs, parcourt la liste et retourne la plus grande.

Toutes les méthodes sont `static`, donc appelables directement depuis `main` sans créer d'objet.

À ce stade, les méthodes existent mais ne sont pas encore utilisées par le menu.

<img width="1280" height="673" alt="3" src="https://github.com/user-attachments/assets/181682eb-8cdf-476c-be0e-1d61a67f30ea" />

<img width="1258" height="640" alt="31" src="https://github.com/user-attachments/assets/ac22e1a3-7b9e-4551-b269-709a95ea1b3b" />



# Étape 4 - Connexion du menu aux méthodes (switch)

* On ajoute un `switch (x)` à l'intérieur de la boucle `do-while`.
* Chaque `case` correspond à une option du menu :
  * **case 1** : demande deux entiers, appelle `addition(a, b)`, affiche le résultat.
  * **case 2** : demande deux entiers, appelle `multiplication(a, b)`, affiche le résultat.
  * **case 3** : demande combien de valeurs, les stocke dans un tableau `int[]`, appelle `moyenne(valeurs)`, affiche le résultat.
  * **case 4** : demande combien de nombres, les stocke dans un tableau `int[]`, appelle `maximum(entiers)`, affiche le résultat.
  * **case 0** : affiche un message de fin et sort de la boucle.
  * **default** : affiche "Option invalide" si l'utilisateur tape un chiffre non prévu.
* Le menu ne fait que collecter les données et appeler la bonne méthode : c'est la méthode qui fait le calcul. Cette séparation rend le code plus lisible et plus facile à maintenir.


<img width="901" height="474" alt="4" src="https://github.com/user-attachments/assets/34f9876a-69f6-4e06-80ab-0f3f033b65e2" />

<img width="948" height="491" alt="41" src="https://github.com/user-attachments/assets/dfda00fc-963f-48b9-9e96-d173acef2de4" />

<img width="1082" height="520" alt="42" src="https://github.com/user-attachments/assets/f790dd57-1ac7-4e2b-971f-b949ddd48337" />

<img width="1280" height="670" alt="43" src="https://github.com/user-attachments/assets/b8818fce-6a68-46f2-8da4-4b41a8a267c6" />

<img width="1277" height="666" alt="44" src="https://github.com/user-attachments/assets/b79b471c-2604-45b5-ad24-304a430117b4" />

<img width="1280" height="673" alt="45" src="https://github.com/user-attachments/assets/41d449b8-5b0f-42a4-8edd-806289a0ebf3" />

<img width="1280" height="676" alt="46" src="https://github.com/user-attachments/assets/9a8d3c71-7b50-45b8-a830-a6166a4bd85f" />


# TP2

# Exercice 1 - Sous-suite maximale croissante (LIS)

- On cherche la longueur de la plus longue sous-séquence strictement croissante dans un tableau, sans obligation que les éléments soient consécutifs.
- On construit un tableau `dp` où `dp[i]` représente la longueur de la meilleure sous-séquence qui se termine exactement à la position i.
- Au départ, chaque `dp[i]` vaut 1, car un élément seul est toujours une sous-séquence valide.
- Pour chaque position i, on regarde toutes les positions j avant elle : si l'élément à j est plus petit que celui à i, on peut prolonger la sous-séquence qui se termine en j.
- La réponse finale est la plus grande valeur trouvée dans tout le tableau `dp`.
- Cette approche est en O(n²), largement suffisante pour des tableaux de taille raisonnable.

<img width="1270" height="674" alt="1" src="https://github.com/user-attachments/assets/9347c118-ff4c-424a-a96f-4e59c78a258a" />

<img width="1280" height="675" alt="12" src="https://github.com/user-attachments/assets/71dc019c-9d85-4839-9711-cbb8497af211" />


# Exercice 2 - Tableau pivot

- Un pivot est un élément du tableau tel que tout ce qui se trouve à sa gauche est plus petit ou égal, et tout ce qui se trouve à sa droite est plus grand ou égal.
- Les deux extrémités du tableau ne sont jamais considérées comme des pivots.
- Plutôt que de comparer chaque élément à tous les autres (solution lente), on précalcule deux informations utiles :
  * le maximum de tous les éléments à gauche de chaque position,
  * le minimum de tous les éléments à droite de chaque position.
- Un élément est alors un pivot si le maximum à sa gauche ne dépasse pas sa valeur, et si le minimum à sa droite ne descend pas en dessous de sa valeur.
- Cette méthode ramène la complexité de O(n²) à O(n), car chaque position n'est vérifiée qu'une seule fois grâce aux informations déjà calculées.

<img width="1280" height="665" alt="2" src="https://github.com/user-attachments/assets/94fb1df6-af10-4880-af3c-8caf5d6acc49" />

# Exercice 3 - Matrice en spirale

- On remplit une matrice carrée avec les nombres de 1 à n², en suivant un parcours en spirale dans le sens horaire.
- On utilise quatre limites qui délimitent la zone encore à remplir : le haut, le bas, la gauche et la droite.
- Le remplissage suit toujours le même cycle : on avance sur la ligne du haut de gauche à droite, puis sur la colonne de droite de haut en bas, puis sur la ligne du bas de droite à gauche, puis sur la colonne de gauche de bas en haut.
- Après chaque parcours, la limite correspondante se resserre, pour ne jamais revisiter une case déjà remplie.
- On répète ce cycle jusqu'à ce que toutes les cases de la matrice soient remplies.

<img width="1280" height="666" alt="3" src="https://github.com/user-attachments/assets/bdb74ead-6223-47ad-b909-e8671951ea84" />

<img width="1278" height="679" alt="31" src="https://github.com/user-attachments/assets/f6113b12-7172-457c-ad0d-c0ac3b6ff1a4" />

<img width="1277" height="673" alt="32" src="https://github.com/user-attachments/assets/3694d2d5-06b5-454d-8a3a-41bc8ea707ad" />

# Exercice 4 - Plus grand rectangle de 1 dans une matrice binaire

- On cherche, dans une matrice composée uniquement de 0 et de 1, le plus grand rectangle ne contenant que des 1.
- La première étape consiste à transformer chaque ligne en une sorte d'histogramme : pour chaque colonne, on compte combien de 1 consécutifs se trouvent juste au-dessus (en incluant la ligne actuelle).
- Une fois cet histogramme construit pour une ligne donnée, on cherche le plus grand rectangle possible à l'intérieur, en testant différents segments de colonnes et en gardant la hauteur minimale rencontrée sur chaque segment.
- On répète cette opération pour chaque ligne de la matrice, en gardant à chaque fois le meilleur résultat trouvé (surface et coordonnées).
- Cette approche évite de tester tous les rectangles possibles un par un, ce qui serait beaucoup trop lent.

<img width="1277" height="672" alt="4" src="https://github.com/user-attachments/assets/2e71ff83-0bc0-47de-b235-26adfb4b4fa6" />

<img width="1280" height="667" alt="41" src="https://github.com/user-attachments/assets/b9416e7d-7a85-4d24-8a50-85e10837cf34" />

<img width="1280" height="671" alt="42" src="https://github.com/user-attachments/assets/28712800-81c9-46e8-86de-0143c1a0d04f" />

<img width="1280" height="674" alt="43" src="https://github.com/user-attachments/assets/d9311215-1edc-462b-8916-36e5c878193a" />

<img width="1280" height="674" alt="44" src="https://github.com/user-attachments/assets/7be811f2-8812-4820-8ffe-d963af62ff85" />

# Exercice 5 - Permutation circulaire

- On considère un tableau qui est censé contenir tous les entiers de 1 à n, mais rangés dans un ordre particulier : celui d'une rotation de la suite 1, 2, 3, ..., n.
- Concrètement, cela veut dire que si on part d'un certain point du tableau et qu'on continue en boucle jusqu'au bout puis on revient au début, on doit retomber exactement sur la suite 1, 2, 3, ..., n dans l'ordre.
- On vérifie d'abord que le tableau contient bien chaque entier de 1 à n une seule fois, sans doublon ni valeur en dehors de cet intervalle.
- On cherche ensuite la position où se trouve la valeur 1, car c'est forcément le point de départ de la rotation.
- À partir de cette position, on avance dans le tableau en "tournant" (en revenant au début quand on atteint la fin), et on vérifie que les valeurs rencontrées suivent bien l'ordre 1, 2, 3, ..., n.
- Si à un seul moment la valeur attendue ne correspond pas, ce n'est pas une permutation circulaire valide.
- Cette méthode ne nécessite que quelques passages simples sur le tableau, ce qui donne une complexité linéaire.

<img width="1280" height="671" alt="5" src="https://github.com/user-attachments/assets/1d9b856a-4fc4-4cd9-85fe-6cad508b01df" />

<img width="1280" height="667" alt="51" src="https://github.com/user-attachments/assets/34b616ee-cb34-4907-93b6-b586f80114fe" />

<img width="1280" height="672" alt="52" src="https://github.com/user-attachments/assets/cf151cef-bcfa-4392-836a-1b0d9c720012" />

# Exercice 6 - Sous-tableau de somme maximale (Kadane)

- On cherche la somme maximale que l'on peut obtenir en prenant des éléments consécutifs dans un tableau (contrairement à une sous-séquence, ici l'ordre ET la continuité comptent).
- On parcourt le tableau une seule fois, en maintenant deux valeurs : la meilleure somme se terminant à la position actuelle, et la meilleure somme trouvée depuis le début.
- À chaque élément, on se pose la question : est-il plus avantageux de continuer la suite actuelle en ajoutant cet élément, ou de repartir de zéro à partir de cet élément seul ?
- Si la suite actuelle est devenue trop négative, mieux vaut repartir de zéro à partir de l'élément courant.
- Cette méthode permet de résoudre le problème en une seule passe, donc en temps linéaire.

<img width="1280" height="667" alt="6" src="https://github.com/user-attachments/assets/2f9c0d77-0f6b-4cd6-8492-8874261c8c4f" />

<img width="1280" height="670" alt="61" src="https://github.com/user-attachments/assets/274d3fdd-234f-430b-afbd-b59e2a050f9b" />

<img width="1280" height="667" alt="62" src="https://github.com/user-attachments/assets/741006a7-1cd4-42c8-83bf-4ec200f6d281" />

# Exercice 7 - Élément majoritaire (vote de Boyer-Moore)

- Un élément est dit majoritaire s'il apparaît strictement plus de la moitié du nombre total d'éléments dans le tableau.
- L'algorithme fonctionne en deux passes.
- Dans la première passe, on garde un candidat et un compteur : si le compteur tombe à zéro, on change de candidat ; si l'élément courant est le même que le candidat, on augmente le compteur ; sinon, on le diminue.
- À la fin de cette première passe, le candidat restant est potentiellement l'élément majoritaire, mais rien ne le garantit encore.
- Une deuxième passe est donc indispensable : on recompte réellement combien de fois ce candidat apparaît dans le tableau, et on vérifie que cette fréquence dépasse bien la moitié de la taille du tableau.
- Cette méthode permet de trouver l'élément majoritaire, s'il existe, en temps linéaire et sans structure de données supplémentaire.

<img width="1280" height="673" alt="7" src="https://github.com/user-attachments/assets/c85b7814-e33b-4d0c-a231-136c8a6c0bd7" />

<img width="1280" height="672" alt="71" src="https://github.com/user-attachments/assets/5bded19a-fa5d-4941-8cd8-d3f3c106372a" />

<img width="1280" height="673" alt="72" src="https://github.com/user-attachments/assets/8c96cbd5-1cbe-4714-bfc1-cd5dfd374bd4" />

<img width="1280" height="660" alt="73" src="https://github.com/user-attachments/assets/5bcaa712-d4ff-4bdf-8046-42094e50ee28" />

# Exercice 8 - Nombres absents

- On considère un tableau dont les valeurs sont censées appartenir à l'intervalle allant de 1 à n (n étant la taille du tableau), avec parfois des doublons ou des valeurs manquantes.
- On crée un tableau de booléens de taille n+1, chaque case représentant la présence ou non d'un nombre.
- On parcourt une première fois le tableau d'origine, et pour chaque valeur rencontrée dans l'intervalle valide, on marque sa présence.
- On parcourt ensuite ce tableau de présence de 1 à n : chaque case restée à false correspond à un nombre absent du tableau d'origine.
- Cette méthode ne nécessite que deux passages sur les données, ce qui donne une complexité linéaire.

<img width="1280" height="670" alt="8" src="https://github.com/user-attachments/assets/6719531c-2df4-4a1e-a8a9-e8d6309e97dc" />

<img width="1280" height="671" alt="81" src="https://github.com/user-attachments/assets/884f1436-ca86-454e-b9c9-9665d096c55a" />

<img width="1280" height="668" alt="82" src="https://github.com/user-attachments/assets/ae175f4b-b4b1-4d63-a8f9-078f31409674" />

# Exercice 9 - Différence entre les deux diagonales d'une matrice

- Dans une matrice carrée, la diagonale principale correspond aux éléments dont l'indice de ligne et l'indice de colonne sont identiques.
- La diagonale secondaire correspond aux éléments dont la somme des indices ligne et colonne vaut toujours la taille de la matrice moins un.
- On parcourt une seule fois les lignes de la matrice, en additionnant à chaque étape l'élément de la diagonale principale et celui de la diagonale secondaire dans deux totaux séparés.
- Une fois les deux sommes obtenues, on calcule la valeur absolue de leur différence.
- Cette approche ne nécessite qu'un seul passage sur la matrice, ce qui donne une complexité linéaire par rapport à la taille de la matrice.

<img width="1280" height="674" alt="9" src="https://github.com/user-attachments/assets/2ce64cc1-8b06-420b-a2b8-fffd5baaedb4" />

<img width="1280" height="672" alt="91" src="https://github.com/user-attachments/assets/55b9fec4-fe1d-4679-8e05-50eb411a5b62" />

<img width="1279" height="672" alt="92" src="https://github.com/user-attachments/assets/c2998b90-19df-437e-9959-f0b51254d30e" />

# Exercice 10 - Carré magique 3x3

- Une matrice 3x3 est dite magique si toutes ses lignes, toutes ses colonnes et ses deux diagonales donnent exactement la même somme.
- On commence par calculer une somme de référence, généralement celle de la première ligne.
- On vérifie ensuite que chacune des deux autres lignes donne bien cette même somme.
- On fait la même vérification pour les trois colonnes.
- On termine par la vérification des deux diagonales.
- Dès qu'une des sommes ne correspond pas à la référence, on peut immédiatement conclure que la matrice n'est pas magique, sans avoir besoin de vérifier le reste.

<img width="1280" height="669" alt="FIN" src="https://github.com/user-attachments/assets/eebd9352-5534-4e3d-ade6-1a308eda5868" />


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


# TP4 

# Exercice 1 - Gestion d'un étudiant avec tableau de notes

- On crée une classe Etudiant capable de stocker une identité (id auto-incrémenté, nom, prénom) et un tableau de notes.
- Un compteur static partagé par toutes les instances permet de donner à chaque étudiant un identifiant unique, incrémenté à chaque création d'objet.
- Le tableau de notes commence avec une petite capacité de départ. Quand on ajoute une note et que le tableau est déjà plein, on crée un nouveau tableau deux fois plus grand, on recopie les anciennes valeurs dedans, puis on continue à ajouter dedans.
- La moyenne se calcule en additionnant toutes les notes réellement présentes puis en divisant par leur nombre.
- Une méthode d'affichage permet de lister les notes d'un étudiant, et une redéfinition de toString permet d'afficher un résumé complet de l'étudiant (id, nom, prénom, moyenne).

<img width="1280" height="673" alt="1" src="https://github.com/user-attachments/assets/27cc6ff3-7827-464c-964b-09c9143d751a" />

<img width="1280" height="670" alt="11" src="https://github.com/user-attachments/assets/b3862c32-66ce-4f0f-b84c-c8a20dd561a8" />

<img width="1280" height="674" alt="12" src="https://github.com/user-attachments/assets/c04ab25c-7136-4779-8ce7-c0c06a11b771" />

<img width="1273" height="651" alt="13" src="https://github.com/user-attachments/assets/17295f8c-1efd-4b71-b618-9150f0f014b4" />

<img width="1280" height="669" alt="14" src="https://github.com/user-attachments/assets/7655dcce-5d46-4dbe-a58f-7d36185ac9f0" />

<img width="1280" height="663" alt="15" src="https://github.com/user-attachments/assets/06ad7036-e9c0-44d1-a660-5a61f27e9fc0" />

# Exercice 2 - Association Étudiant / Filière

- On ajoute une deuxième classe, Filiere, qui représente un groupe d'étudiants.
- Chaque filière possède un tableau dynamique d'étudiants (même principe d'agrandissement que pour les notes) et un compteur du nombre d'étudiants réellement inscrits.
- Quand on ajoute un étudiant à une filière, deux choses se passent : l'étudiant est placé dans le tableau de la filière, et en même temps la filière est enregistrée dans l'étudiant lui-même. C'est ce qu'on appelle une association bidirectionnelle : chaque objet connaît l'autre.
- Cette organisation permet de répondre à deux questions différentes : à partir d'un étudiant, on peut savoir dans quelle filière il est inscrit, et à partir d'une filière, on peut lister tous ses étudiants.

<img width="1280" height="671" alt="2" src="https://github.com/user-attachments/assets/b7893a04-6445-4846-a1e5-0600fc560423" />

<img width="1280" height="668" alt="21" src="https://github.com/user-attachments/assets/9ec45bf0-f4ed-467b-b9eb-06efc243db6a" />

<img width="1280" height="670" alt="22" src="https://github.com/user-attachments/assets/5195229b-a63b-434e-bc62-56ec6ce8b377" />

<img width="1280" height="666" alt="23" src="https://github.com/user-attachments/assets/48c2e1c4-4cd9-4fb2-9b30-cdc466624b0c" />

<img width="1280" height="666" alt="24" src="https://github.com/user-attachments/assets/ecd8c086-46d1-4e46-a4e8-1f9734fe1f68" />

https://github.com/user-attachments/assets/85d8ec25-ca72-49b0-96ab-f78c84113cde

# Exercice 3 - Gestion des articles (Catégorie / Article)

- On modélise une petite gestion de stock avec deux classes, Categorie et Article.
- Chaque catégorie a un identifiant auto-incrémenté, un libellé et un code court. Chaque article a lui aussi un identifiant auto-incrémenté, un code, une désignation, et une référence vers la catégorie à laquelle il appartient.
- Le lien entre un article et sa catégorie est une simple référence stockée dans l'article : chaque article "connaît" sa catégorie, mais la catégorie ne garde pas de liste de ses articles.
- Dans le programme de test, on affiche les articles regroupés par catégorie en parcourant deux tableaux avec des boucles imbriquées : pour chaque catégorie, on cherche tous les articles dont la catégorie correspond, puis on les affiche en dessous.

<img width="1280" height="673" alt="3" src="https://github.com/user-attachments/assets/45a5ca38-3345-4aaf-ad28-1a1c92929b16" />

<img width="1280" height="669" alt="31" src="https://github.com/user-attachments/assets/e5c92e4d-0406-4939-aa1a-d2db6051bced" />

<img width="1280" height="687" alt="32" src="https://github.com/user-attachments/assets/f37fae04-ff7f-4782-b29f-69195ff156d4" />

https://github.com/user-attachments/assets/241c7ec7-8865-4bd9-ab5b-e6392e61712c

# Exercice 4 - Gestion d'Auteurs, Livres et Bibliothèques

- On modélise une relation plus riche entre trois classes : Auteur, Livre et Bibliotheque.
- La relation entre un auteur et ses livres est une relation un-à-plusieurs : chaque auteur garde une liste de tous les livres qu'il a écrits. Quand un livre est créé, il s'ajoute automatiquement à la liste de son auteur.
- La relation entre les bibliothèques et les livres est différente : un même livre peut se trouver dans plusieurs bibliothèques différentes, et une bibliothèque contient plusieurs livres. C'est une relation plusieurs-à-plusieurs.
- Pour éviter qu'un même livre soit compté deux fois dans une bibliothèque, la collection de livres d'une bibliothèque est un ensemble plutôt qu'une simple liste : un ensemble refuse automatiquement les doublons.
- Chaque classe garde son propre identifiant auto-incrémenté, ce qui permet de distinguer deux objets même s'ils ont des attributs identiques par ailleurs.

<img width="1280" height="670" alt="4" src="https://github.com/user-attachments/assets/f870a790-23f0-49c5-85ee-1f0a668062b6" />

<img width="1280" height="670" alt="41" src="https://github.com/user-attachments/assets/8faacb57-c1ea-47fe-bb7a-5b0faacad4a4" />

<img width="1280" height="673" alt="42" src="https://github.com/user-attachments/assets/a7ba13bb-0355-4b18-8a04-f89fec878763" />

<img width="1280" height="673" alt="43" src="https://github.com/user-attachments/assets/32dfab2b-3c33-48f0-b854-13b2c8abca3b" />

<img width="1278" height="669" alt="44" src="https://github.com/user-attachments/assets/a70a7ac0-57c7-41c9-83ce-0521f2169bb2" />

<img width="1280" height="670" alt="45" src="https://github.com/user-attachments/assets/7dfdff0b-9adc-40e9-b402-28dc07186294" />

https://github.com/user-attachments/assets/60202606-5c1a-450c-9f87-29815c325df6



