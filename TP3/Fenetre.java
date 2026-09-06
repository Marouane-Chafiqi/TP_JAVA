package formationjava;

import java.util.Scanner;

public class Fenetre {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez n et k :");
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] T = new int[n];

        System.out.println("Entrez les valeurs :");
        for (int i = 0; i < n; i++) {
            T[i] = sc.nextInt();
        }

        int MAXV = 100000;
        int[] freq = new int[MAXV + 1];
        int distinct = 0;

        for (int i = 0; i < k; i++) {
            int x = T[i];
            freq[x]++;
            if (freq[x] == 1) {
                distinct++;
            }
        }

        System.out.print(distinct + " ");

        for (int i = k; i < n; i++) {
            int out = T[i - k];
            freq[out]--;
            if (freq[out] == 0) {
                distinct--;
            }

            int in = T[i];
            freq[in]++;
            if (freq[in] == 1) {
                distinct++;
            }

            System.out.print(distinct + " ");
        }

        System.out.println();
    }

}