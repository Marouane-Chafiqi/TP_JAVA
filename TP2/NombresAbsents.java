package formationjava;

public class NombresAbsents {

    public static void afficherElementsManquants(int[] t) {
        int n = t.length;

        boolean[] present = new boolean[n + 1];

        for (int i = 0; i < n; i++) {
            int v = t[i];
            if (v >= 1 && v <= n) {
                present[v] = true;
            }
        }

        String resultat = "";
        boolean trouve = false;

        for (int k = 1; k <= n; k++) {
            if (present[k] == false) {
                resultat = resultat + k + " ";
                trouve = true;
            }
        }

        if (trouve) {
            System.out.println(resultat);
        } else {
            System.out.println("Aucun element manquant");
        }
    }

    public static void main(String[] args) {
        int[] t1 = {1, 3, 3, 5};
        int[] t2 = {1, 2, 3, 4};
        int[] t3 = {3, 3, 3};
        int[] t4 = {1, 1, 1, 1};
        int[] t5 = {4, 2, 2, 1, 5};
        int[] t6 = {1};

        System.out.print("test 1 : ");
        afficherElementsManquants(t1);

        System.out.print("test 2 : ");
        afficherElementsManquants(t2);

        System.out.print("test 3 : ");
        afficherElementsManquants(t3);

        System.out.print("test 4 : ");
        afficherElementsManquants(t4);

        System.out.print("test 5 : ");
        afficherElementsManquants(t5);

        System.out.print("test 6 : ");
        afficherElementsManquants(t6);
    }

}