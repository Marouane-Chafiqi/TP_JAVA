package formationjavaTP4;

public class main {
	 
    public static void main(String[] args) {
 
        Filiere info = new Filiere("Informatique");
        Filiere genie = new Filiere("Genie Civil");
 
        Etudiant e1 = new Etudiant("Chafiqi", "Marouane");
        Etudiant e2 = new Etudiant("Bentaleb", "Fatima");
        Etudiant e3 = new Etudiant("Chafiqi", "Amine");
        Etudiant e4 = new Etudiant("Lahlou", "Salma");
        Etudiant e5 = new Etudiant("Roussafi", "Hassan");
        Etudiant e6 = new Etudiant("Amrani", "Aicha");
 
        info.ajouterEtudiant(e1);
        info.ajouterEtudiant(e2);
        info.ajouterEtudiant(e3);
        info.ajouterEtudiant(e4);
        info.ajouterEtudiant(e5);
        info.ajouterEtudiant(e6);
 
        genie.ajouterEtudiant(new Etudiant("Belkhir", "Khadija"));
        genie.ajouterEtudiant(new Etudiant("Laaroussi", "Walid"));
 
        System.out.println(info);
        info.afficherEtudiants();
        System.out.println();
 
        System.out.println(genie);
        genie.afficherEtudiants();
        System.out.println();
 
        System.out.println("Detail de e2 : " + e2);
        System.out.println("Detail de e4 : " + e4);
        System.out.println("Detail de e6 : " + e6);
    }
 
}
 