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



