package formationjava;

import java.util.Scanner;

public class CarresImpairs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Combien de valeurs : ");
        int n = sc.nextInt();

        int[] carres = new int[n];

        int i = 1;
        while (i <= n) {
            int impair = 2 * i - 1;
            int carre = impair * impair;
            carres[i - 1] = carre;
            i++;
        }

        int j = 1;
        while (j <= n) {
            int impair = 2 * j - 1;
            System.out.println(impair + " a pour carre " + carres[j - 1]);
            j++;
        }

    }

}