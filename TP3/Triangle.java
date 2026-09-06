package formationjava;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez la hauteur : ");
        int hauteur = sc.nextInt();

        int ligne = 1;

        while (ligne <= hauteur) {

            int espaces = hauteur - ligne;
            int i = 0;
            while (i < espaces) {
                System.out.print(" ");
                i++;
            }

            int etoiles = 2 * ligne - 1;
            int j = 0;
            while (j < etoiles) {
                System.out.print("*");
                j++;
            }

            System.out.println();

            ligne++;
        }

    }

}