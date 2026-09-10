package TP6;

import java.util.List;

public class Utils {
    public static void listerPersonnes(List<Personne> personnes) {
        for (int i = 0; i < personnes.size(); i++) {
            Personne p = personnes.get(i);
            p.affiche();
        }
    }
}