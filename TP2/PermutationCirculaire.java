package formationjava;

public class PermutationCirculaire {

    public static boolean estPermutationCirculaire(int[] t) {
        int n = t.length;

        boolean[] vu = new boolean[n + 1];

        for (int i = 0; i < n; i++) {
            int x = t[i];

            if (x < 1 || x > n) {
                return false;
            }

            if (vu[x] == true) {
                return false;
            }

            vu[x] = true;
        }

        int pos = -1;
        for (int i = 0; i < n; i++) {
            if (t[i] == 1) {
                pos = i;
            }
        }

        if (pos == -1) {
            return false;
        }

        for (int k = 0; k < n; k++) {
            int idx = (pos + k) % n;
            int v = k + 1;

            if (t[idx] != v) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] t1 = {1};
        int[] t2 = {1, 2, 3, 4, 5};
        int[] t3 = {2, 3, 4, 5, 1};
        int[] t4 = {4, 5, 1, 2, 3};
        int[] t5 = {3, 1, 2, 4, 5};
        int[] t6 = {0, 1, 2, 3, 4};
        int[] t7 = {1, 2, 2, 3, 4};

        System.out.println("test 1 : " + estPermutationCirculaire(t1));
        System.out.println("test 2 : " + estPermutationCirculaire(t2));
        System.out.println("test 3 : " + estPermutationCirculaire(t3));
        System.out.println("test 4 : " + estPermutationCirculaire(t4));
        System.out.println("test 5 : " + estPermutationCirculaire(t5));
        System.out.println("test 6 : " + estPermutationCirculaire(t6));
        System.out.println("test 7 : " + estPermutationCirculaire(t7));
    }

}