package formationjava;

public class Pivots {

    public static void afficherPivots(int[] t) {
        int n = t.length;

        if (n < 3) {
            System.out.println("Aucun pivot");
            return;
        }

        int[] maxPrefix = new int[n];
        int[] minSuffix = new int[n];

        maxPrefix[0] = t[0];
        for (int i = 1; i < n; i++) {
            if (t[i] > maxPrefix[i - 1]) {
                maxPrefix[i] = t[i];
            } else {
                maxPrefix[i] = maxPrefix[i - 1];
            }
        }

        minSuffix[n - 1] = t[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (t[i] < minSuffix[i + 1]) {
                minSuffix[i] = t[i];
            } else {
                minSuffix[i] = minSuffix[i + 1];
            }
        }

        String resultat = "";
        boolean trouve = false;

        for (int i = 1; i < n - 1; i++) {
            if (maxPrefix[i - 1] <= t[i] && minSuffix[i + 1] >= t[i]) {
                resultat = resultat + t[i] + " ";
                trouve = true;
            }
        }

        if (trouve) {
            System.out.println("Pivots : " + resultat);
        } else {
            System.out.println("Aucun pivot");
        }
    }

    public static void main(String[] args) {
        int[] t1 = {2, 4, 3, 5, 6};
        int[] t2 = {1, 2, 3, 4, 5};
        int[] t3 = {5, 4, 3, 2, 1};
        int[] t4 = {3, 3, 3, 3};
        int[] t5 = {7, 1, 5, 2, 6, 3, 4};

        System.out.print("test 1 : ");
        afficherPivots(t1);

        System.out.print("test 2 : ");
        afficherPivots(t2);

        System.out.print("test 3 : ");
        afficherPivots(t3);

        System.out.print("test 4 : ");
        afficherPivots(t4);

        System.out.print("test 5 : ");
        afficherPivots(t5);
    }

}