# TP6

# Exercice 1 - Système de dessin de formes (polymorphisme)

- On construit une hiérarchie de classes autour d'une forme géométrique de base.
- La classe Forme regroupe ce qui est commun à toutes les formes : une couleur et une méthode générique de dessin.
- Cercle, Rectangle et Triangle héritent de Forme et redéfinissent chacune la méthode dessiner() pour afficher leurs propres informations (rayon, largeur/hauteur, base/hauteur).
- Toutes ces formes, bien que de types différents, sont stockées dans un même tableau de type Forme.
- Cet exercice illustre le principe central du polymorphisme : lorsqu'on parcourt le tableau et qu'on appelle dessiner() sur chaque élément, c'est toujours la bonne version de la méthode (celle du type réel de l'objet) qui est exécutée automatiquement grâce à la liaison dynamique.

<img width="1276" height="671" alt="1" src="https://github.com/user-attachments/assets/92a5bff9-a435-48ea-82ed-4a01388e5e97" />

<img width="1280" height="668" alt="11" src="https://github.com/user-attachments/assets/57eabd67-5ba6-4ff5-9828-fa1c6350c474" />

<img width="1280" height="669" alt="12" src="https://github.com/user-attachments/assets/618f09bb-8ffd-4465-a634-31a9ab3481fa" />

<img width="1280" height="675" alt="13" src="https://github.com/user-attachments/assets/2d0b9bd6-7de4-423e-9966-b33d9a2e7744" />

https://github.com/user-attachments/assets/00b38d29-df54-44e4-b1ec-baa017186088


# Exercice 2 - Gestion d'une bibliothèque multimédia

- On modélise plusieurs types de médias qui partagent des caractéristiques communes, mais qui ont chacun un comportement de lecture spécifique.
- La classe Media regroupe le titre commun à tous les médias, ainsi que les méthodes génériques lire() et getDuree().
- Les classes Audio, Video et LiveStream héritent toutes de Media. Chacune ajoute ses propres attributs (durée, résolution, url) et redéfinit lire() et getDuree() selon son fonctionnement propre. LiveStream renvoie une durée de -1 pour signifier qu'elle est indéterminée.
- La classe MediaLibrary garde un tableau de médias qui s'agrandit automatiquement lorsqu'il devient plein, exactement comme dans les exercices précédents sur les tableaux dynamiques.
- Le point intéressant ici est que le tableau de la bibliothèque est de type Media, mais qu'il peut contenir n'importe lequel des trois sous-types. Quand on joue tous les médias ou qu'on calcule la durée totale, c'est toujours la bonne version de chaque méthode qui est utilisée automatiquement selon le type réel de l'objet.

<img width="1278" height="668" alt="2" src="https://github.com/user-attachments/assets/11b612d8-c843-4ced-846f-f21624c15f12" />

<img width="1280" height="670" alt="21" src="https://github.com/user-attachments/assets/163b079f-323b-4452-8228-005474d224af" />

<img width="1280" height="673" alt="22" src="https://github.com/user-attachments/assets/22502927-a0b2-46f7-b540-0f15a53d1d62" />

<img width="1279" height="666" alt="23" src="https://github.com/user-attachments/assets/9c1d5339-a681-4c66-aed3-a74fd8d8abd4" />

<img width="1280" height="668" alt="24" src="https://github.com/user-attachments/assets/9adbe9bb-c714-4582-8672-e2e7547a5a5c" />

<img width="1280" height="669" alt="25" src="https://github.com/user-attachments/assets/d02feb92-0706-421a-a6c0-571c4bdbe660" />

https://github.com/user-attachments/assets/15dd224b-1f4a-43c2-9e99-2b90c01c3fb5


# Exercice 3 - Personne, Développeur et Manager (classes abstraites et généricité)

- Cet exercice combine héritage, classe abstraite et méthode générique.
- Personne est une classe abstraite qui regroupe le nom et le salaire de base communs à tous les employés, ainsi qu'une méthode abstraite calculerSalaire() que chaque sous-classe doit obligatoirement implémenter.
- Developpeur et Manager héritent de Personne et redéfinissent chacun calculerSalaire() avec leur propre taux de prime (10% pour un développeur, 30% pour un manager).
- La méthode affiche(), elle, n'est pas abstraite : elle est héritée telle quelle et s'appuie en interne sur calculerSalaire(), ce qui permet de l'utiliser sans jamais la redéfinir dans les sous-classes.
- Une méthode générique listerPersonnes() permet de parcourir une liste contenant n'importe quel mélange de Developpeur et de Manager, et d'appeler uniformément affiche() sur chacun, illustrant à nouveau la puissance du polymorphisme combiné aux classes abstraites.

<img width="1280" height="670" alt="3" src="https://github.com/user-attachments/assets/c5b6e2f3-613f-4f17-a717-e8f6d0204a74" />

<img width="1280" height="670" alt="31" src="https://github.com/user-attachments/assets/f305e87d-b603-4c28-a57f-a4d37e056b18" />

<img width="1279" height="668" alt="32" src="https://github.com/user-attachments/assets/309192a5-19b4-4984-88db-a1cfd83a6fb8" />

<img width="1280" height="673" alt="33" src="https://github.com/user-attachments/assets/8effe129-6f5a-4664-bede-f57958e315ef" />

https://github.com/user-attachments/assets/9c339b6d-17e1-4af5-8ede-aea83197f1fc











