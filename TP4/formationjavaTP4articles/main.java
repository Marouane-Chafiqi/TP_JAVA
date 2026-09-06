package formationjavaTP4articles;

public class main {
	 
    public static void main(String[] args) {
 
        Categorie[] cats = new Categorie[2];
        cats[0] = new Categorie("Ordinateur Portable", "O PR");
        cats[1] = new Categorie("Ordinateur Poste", "O PO");
 
        Article[] arts = new Article[4];
        arts[0] = new Article(14, "DELL INSPIRON", cats[0]);
        arts[1] = new Article(4, "SONY VAIO", cats[0]);
        arts[2] = new Article(74, "TERRA", cats[1]);
        arts[3] = new Article(785, "HP Compaq", cats[1]);
 
        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i].getLibelle() + " :");
 
            for (int j = 0; j < arts.length; j++) {
                if (arts[j].getCategorie().getId() == cats[i].getId()) {
                    System.out.println("  - " + arts[j]);
                }
            }
 
            System.out.println();
        }
 
    }
 
}
 