package formationjava;

public class MaxRectangle {

    static class Rectangle {
        int top;
        int left;
        int bottom;
        int right;
        int area;
    }

    public static Rectangle trouverMaxRectangle(int[][] m) {
        int R = m.length;
        int C = m[0].length;

        int[][] h = new int[R][C];

        for (int j = 0; j < C; j++) {
            if (m[0][j] == 1) {
                h[0][j] = 1;
            } else {
                h[0][j] = 0;
            }
        }

        for (int i = 1; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (m[i][j] == 1) {
                    h[i][j] = h[i - 1][j] + 1;
                } else {
                    h[i][j] = 0;
                }
            }
        }

        Rectangle meilleur = new Rectangle();
        meilleur.top = -1;
        meilleur.left = -1;
        meilleur.bottom = -1;
        meilleur.right = -1;
        meilleur.area = 0;

        for (int i = 0; i < R; i++) {
            for (int left = 0; left < C; left++) {

                int hauteurMin = h[i][left];

                if (hauteurMin > 0) {
                    for (int right = left; right < C; right++) {

                        if (h[i][right] < hauteurMin) {
                            hauteurMin = h[i][right];
                        }

                        if (hauteurMin == 0) {
                            break;
                        }

                        int largeur = right - left + 1;
                        int aire = hauteurMin * largeur;

                        if (aire > meilleur.area) {
                            meilleur.area = aire;
                            meilleur.left = left;
                            meilleur.right = right;
                            meilleur.bottom = i;
                            meilleur.top = i - hauteurMin + 1;
                        }
                    }
                }
            }
        }

        return meilleur;
    }

    public static void main(String[] args) {
        int[][] m1 = {
            {0, 1, 1, 0, 1},
            {1, 1, 1, 1, 0},
            {1, 1, 1, 1, 0},
            {1, 1, 0, 0, 1}
        };

        int[][] m2 = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1}
        };

        int[][] m3 = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };

        Rectangle r1 = trouverMaxRectangle(m1);
        System.out.println("Aire max : " + r1.area);
        System.out.println("top=" + r1.top + " left=" + r1.left + " bottom=" + r1.bottom + " right=" + r1.right);

        Rectangle r2 = trouverMaxRectangle(m2);
        System.out.println("Aire max : " + r2.area);
        System.out.println("top=" + r2.top + " left=" + r2.left + " bottom=" + r2.bottom + " right=" + r2.right);

        Rectangle r3 = trouverMaxRectangle(m3);
        System.out.println("Aire max : " + r3.area);
        System.out.println("top=" + r3.top + " left=" + r3.left + " bottom=" + r3.bottom + " right=" + r3.right);
    }

}