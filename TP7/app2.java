import java.util.Scanner;

public class app2 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int nl, nc, Moy, i, j;
            int P = 1;
            int S = 0;
            int[][] M = new int[30][30];

            
            do {
                System.out.println("Donner nl (nl < 30): ");
                nl = scanner.nextInt();
                System.out.println("Donner nc (nc < 30): ");
                nc = scanner.nextInt();
            } while (nl >= 30 || nc >= 30);

            
            for (i = 0; i < nl; i++) {
                for (j = 0; j < nc; j++) {
                    System.out.println("M[" + i + "," + j + "]: ");
                    M[i][j] = scanner.nextInt();
                }
            }

           
            for (i = 0; i < nl; i++) {
                for (j = 0; j < nc; j++) {
                    P *= M[i][j];
                    S += M[i][j];
                }
            }

            
            Moy = S / (nl * nc);

            // Output results
            System.out.println("Produit = " + P);
            System.out.println("Moyenne = " + Moy);
        }
    }
}