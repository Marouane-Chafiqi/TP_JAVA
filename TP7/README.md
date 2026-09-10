# TP7

# Exercice 1 - Gestion de la paie des employés

- On construit un système de calcul de salaire capable de gérer différents types d'employés à travers une interface commune.
- La classe Employe est abstraite et regroupe le nom et le prénom communs à tous les employés, ainsi qu'une méthode abstraite calculerSalaire() que chaque sous-classe doit obligatoirement implémenter. Elle fournit aussi un toString() qui affiche le nom, le prénom et le salaire calculé.
- EmployeHoraire hérite d'Employe et calcule son salaire à partir d'un taux horaire et d'un nombre d'heures travaillées.
- EmployeSalarie hérite également d'Employe et renvoie simplement son salaire mensuel fixe.
- Vendeur hérite quant à lui de EmployeSalarie (héritage sur deux niveaux) et ajoute une commission qui s'ajoute au salaire mensuel de base.
- La classe Entreprise garde un tableau dynamique d'employés qui s'agrandit automatiquement lorsqu'il devient plein, et permet d'afficher la fiche de paie de chacun ainsi que la masse salariale totale.
- Cet exercice illustre comment une même méthode (calculerSalaire()) peut produire des résultats différents selon le type réel de l'employé, tout en gardant un code d'affichage totalement générique.

<img width="1280" height="664" alt="1" src="https://github.com/user-attachments/assets/8bdd7944-a163-4634-9190-84483cbaa5a4" />

<img width="1274" height="664" alt="12" src="https://github.com/user-attachments/assets/bbba9396-b853-4d1f-90a3-e2645b836a06" />

<img width="1280" height="667" alt="13" src="https://github.com/user-attachments/assets/11817cf5-73ab-451a-93fa-73a0362fff33" />

<img width="1280" height="672" alt="14" src="https://github.com/user-attachments/assets/baa71567-1295-4891-be81-afbae80d2401" />

<img width="1278" height="668" alt="15" src="https://github.com/user-attachments/assets/27de8c36-0719-4064-a5c8-697d899f7e12" />

https://github.com/user-attachments/assets/e03fb48c-51c8-4cbf-9a7a-43d09b51798b


# Exercice 2 - Modélisation d'un système de fichiers

- On modélise un mini système de fichiers où chaque élément peut être soit un fichier, soit un répertoire, chacun sachant calculer sa propre taille.
- La classe FsItem est abstraite et regroupe le nom commun à tout élément du système de fichiers, ainsi qu'une méthode abstraite getSize() que chaque sous-classe doit implémenter. Elle fournit aussi un toString() générique affichant le nom et la taille.
- FileItem hérite de FsItem et représente un fichier simple : sa taille est directement stockée et renvoyée telle quelle.
- Directory hérite également de FsItem, mais représente un répertoire capable de contenir d'autres éléments (fichiers ou sous-répertoires) grâce à un tableau interne qui s'agrandit automatiquement. Sa taille est calculée récursivement en additionnant la taille de tous ses enfants, quel que soit leur type.
- La méthode list() de Directory affiche l'arborescence complète avec une indentation qui augmente à chaque niveau de profondeur, produisant une représentation visuelle hiérarchique.
- La classe FileSystem regroupe les éléments racines du système (fichiers ou répertoires qui ne sont contenus dans aucun autre répertoire), et permet d'afficher l'arborescence complète ainsi que la taille totale de l'ensemble.
- Le point clé de cet exercice est la récursivité combinée au polymorphisme : un répertoire peut contenir d'autres répertoires, et le calcul de la taille totale se propage automatiquement à travers toute la hiérarchie, quelle que soit sa profondeur.

<img width="1280" height="668" alt="2" src="https://github.com/user-attachments/assets/7a80b9b6-dd6c-41b1-a995-1d096b77519a" />

<img width="1280" height="664" alt="21" src="https://github.com/user-attachments/assets/9ce0562c-8287-44cf-97ca-cd6043d66b01" />

<img width="1278" height="673" alt="22" src="https://github.com/user-attachments/assets/4fb6d0b0-9f7b-4d95-9fa7-476d9a468060" />

<img width="1280" height="665" alt="23" src="https://github.com/user-attachments/assets/d252c793-65a6-45e8-bf9d-a9eb0b30757b" />

<img width="1280" height="664" alt="24" src="https://github.com/user-attachments/assets/0971fcfb-ed47-448c-bf58-c4c85a573871" />

<img width="1269" height="668" alt="25" src="https://github.com/user-attachments/assets/07d0a898-b7ed-4796-8581-9c18731ac9fd" />

https://github.com/user-attachments/assets/b9ae2e6a-f78d-49e6-8c0d-446ab223ee5a



