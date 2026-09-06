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


