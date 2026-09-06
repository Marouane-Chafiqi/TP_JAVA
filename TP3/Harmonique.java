package formationjava;

import java.util.Scanner;

public class Harmonique {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez n : ");
        int n = sc.nextInt();

        double somme = 0;

        for (int i = 1; i <= n; i++) {
            somme = somme + 1.0 / i;
        }

        System.out.println("Somme de la serie harmonique : " + somme);
    }

}