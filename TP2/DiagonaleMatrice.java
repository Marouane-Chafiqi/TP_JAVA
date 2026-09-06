package formationjava;

public class DiagonaleMatrice {

    public static int differenceDiagonales(int[][] m) {
        int n = m.length;

        int sommePrincipale = 0;
        int sommeSecondaire = 0;

        for (int i = 0; i < n; i++) {
            sommePrincipale = sommePrincipale + m[i][i];
            sommeSecondaire = sommeSecondaire + m[i][n - 1 - i];
        }

        int diff = sommePrincipale - sommeSecondaire;
        int absDiff = Math.abs(diff);

        System.out.println("Somme diagonale principale : " + sommePrincipale);
        System.out.println("Somme diagonale secondaire : " + sommeSecondaire);
        System.out.println("Difference absolue : " + absDiff);

        return absDiff;
    }

    public static void main(String[] args) {
        int[][] m1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] m2 = {
            {1, 3, 5},
            {2, 4, 6},
            {7, 8, 9}
        };

        int[][] m3 = {
            {5}
        };

        int[][] m4 = {
            {-1, 2},
            {3, -4}
        };

        System.out.println("test 1 :");
        differenceDiagonales(m1);

        System.out.println("test 2 :");
        differenceDiagonales(m2);

        System.out.println("test 3 :");
        differenceDiagonales(m3);

        System.out.println("test 4 :");
        differenceDiagonales(m4);
    }

}