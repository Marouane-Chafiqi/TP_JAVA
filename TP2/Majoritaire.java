package formationjava;

public class Majoritaire {

    public static int elementMajoritaire(int[] t) {
        int n = t.length;

        if (n == 0) {
            return -1;
        }

        int candidat = t[0];
        int compteur = 0;

        for (int i = 0; i < n; i++) {

            if (compteur == 0) {
                candidat = t[i];
                compteur = 1;
            } else {
                if (t[i] == candidat) {
                    compteur++;
                } else {
                    compteur--;
                }
            }
        }

        int nbOccurrences = 0;
        for (int i = 0; i < n; i++) {
            if (t[i] == candidat) {
                nbOccurrences++;
            }
        }

        if (nbOccurrences > n / 2) {
            return candidat;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] t1 = {3, 3, 4, 3, 5};
        int[] t2 = {2, 2, 1, 2, 3, 2, 2};
        int[] t3 = {1, 1, 1, 1};
        int[] t4 = {7};
        int[] t5 = {1, 2, 3, 4};
        int[] t6 = {1, 2, 2, 3};
        int[] t7 = {1, 1, 2, 2};
        int[] t8 = {-1, -1, -1, 2, 3};
        int[] t9 = {-2, -2, -2, -2, 1, 3};
        int[] t10 = {};
        int[] t11 = {10};

        System.out.println("test 1 : " + elementMajoritaire(t1));
        System.out.println("test 2 : " + elementMajoritaire(t2));
        System.out.println("test 3 : " + elementMajoritaire(t3));
        System.out.println("test 4 : " + elementMajoritaire(t4));
        System.out.println("test 5 : " + elementMajoritaire(t5));
        System.out.println("test 6 : " + elementMajoritaire(t6));
        System.out.println("test 7 : " + elementMajoritaire(t7));
        System.out.println("test 8 : " + elementMajoritaire(t8));
        System.out.println("test 9 : " + elementMajoritaire(t9));
        System.out.println("test 10 : " + elementMajoritaire(t10));
        System.out.println("test 11 : " + elementMajoritaire(t11));
    }

}