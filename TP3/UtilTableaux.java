package formationjava;

public class UtilTableaux {

    public static void affiche(double t[][]) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean regulier(double t[][]) {
        int taille = t[0].length;
        boolean res = true;

        for (int i = 0; i < t.length; i++) {
            if (t[i].length != taille) {
                res = false;
            }
        }

        return res;
    }

    public static double[] sommeLignes(double t[][]) {
        double[] tab = new double[t.length];

        for (int i = 0; i < t.length; i++) {
            double s = 0;
            for (int j = 0; j < t[i].length; j++) {
                s = s + t[i][j];
            }
            tab[i] = s;
        }

        return tab;
    }

    public static double[][] somme(double[][] t1, double[][] t2) {

        if (!regulier(t1) || !regulier(t2)) {
            return null;
        }

        if (t1.length != t2.length || t1[0].length != t2[0].length) {
            return null;
        }

        double[][] res = new double[t1.length][t1[0].length];

        for (int i = 0; i < t1.length; i++) {
            for (int j = 0; j < t1[i].length; j++) {
                res[i][j] = t1[i][j] + t2[i][j];
            }
        }

        return res;
    }

    public static void main(String[] args) {

        double[][] a = { {1, 2, 3}, {4, 5, 6} };
        double[][] b = { {10, 20, 30}, {40, 50, 60} };
        double[][] c = { {1, 2}, {3, 4, 5} };

        System.out.println("tableau a");
        affiche(a);

        System.out.println("regulier a ? " + regulier(a));
        System.out.println("regulier c ? " + regulier(c));

        double[] s = sommeLignes(a);
        for (int i = 0; i < s.length; i++) {
            System.out.println("ligne " + i + " somme = " + s[i]);
        }

        double[][] res = somme(a, b);
        System.out.println("a + b :");
        affiche(res);

        double[][] res2 = somme(a, c);
        System.out.println(res2);
    }

}