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


