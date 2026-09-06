package formationjavaTP5;

import java.util.Scanner;

public class MainBiblio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Capacite de la bibliotheque : ");
        int n = sc.nextInt();

        Bibliotheque biblio = new Bibliotheque(n);

        Livre l = new Livre("Les Miserables", "Victor Hugo", 800, "Gallimard");
        Journal j = new Journal("Le Monde", null, "01/01/2024", 100);

        biblio.ajouter(l);
        biblio.ajouter(j);

        int choix = -1;

        while (choix != 0) {

            System.out.println();
            System.out.println("1. Ajouter");
            System.out.println("2. Afficher");
            System.out.println("3. Supprimer");
            System.out.println("4. Afficher les auteurs");
            System.out.println("0. Quitter");
            System.out.print("Choix : ");
            choix = sc.nextInt();

            if (choix == 1) {

                System.out.print("Type (1=Livre, 2=Journal) : ");
                int type = sc.nextInt();

                sc.nextLine();
                System.out.print("Titre : ");
                String titre = sc.nextLine();

                System.out.print("Auteur (ou vide) : ");
                String auteur = sc.nextLine();
                if (auteur.isEmpty()) {
                    auteur = null;
                }

                if (type == 1) {
                    System.out.print("Nombre de pages : ");
                    int pages = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Editeur : ");
                    String editeur = sc.nextLine();

                    Livre nouveauLivre = new Livre(titre, auteur, pages, editeur);
                    boolean ok = biblio.ajouter(nouveauLivre);
                    System.out.println(ok ? "Ajoute avec succes." : "Bibliotheque pleine.");

                } else {
                    System.out.print("Date de parution : ");
                    String date = sc.nextLine();
                    System.out.print("Numero : ");
                    int numero = sc.nextInt();

                    Journal nouveauJournal = new Journal(titre, auteur, date, numero);
                    boolean ok = biblio.ajouter(nouveauJournal);
                    System.out.println(ok ? "Ajoute avec succes." : "Bibliotheque pleine.");
                }

            } else if (choix == 2) {
                biblio.afficherDocuments();

            } else if (choix == 3) {
                System.out.print("Numero d'enregistrement a supprimer : ");
                int numEnrg = sc.nextInt();

                Document doc = biblio.document(numEnrg);

                if (doc == null) {
                    System.out.println("Document introuvable.");
                } else {
                    boolean ok = biblio.supprimer(doc);
                    System.out.println(ok ? "Supprime avec succes." : "Echec de la suppression.");
                }

            } else if (choix == 4) {
                biblio.afficherAuteurs();

            } else if (choix == 0) {
                System.out.println("Au revoir.");

            } else {
                System.out.println("Choix invalide.");
            }
        }

    }

}