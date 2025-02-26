import java.util.Scanner;

public class app3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Entrez le nombre de lignes (nl <= 20): ");
        int nl = scanner.nextInt();
        System.out.print("Entrez le nombre de colonnes (nc <= 30): ");
        int nc = scanner.nextInt();

        
        if (nl > 20 || nc > 30) {
            System.out.println("Les dimensions de la matrice dépassent les limites.");
            return;
        }

        
        int[][] M = new int[nl][nc];
        int[] T = new int[nl];

        
        System.out.println("Entrez les éléments de la matrice:");
        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                M[i][j] = scanner.nextInt();
            }
        }

        
        for (int i = 0; i < nl; i++) {
            int sum = 0;
            for (int j = 0; j < nc; j++) {
                sum += M[i][j];
            }
            T[i] = sum;
        }

        
        int minSum = T[0];
        int maxSum = T[0];
        for (int i = 1; i < nl; i++) {
            if (T[i] < minSum) {
                minSum = T[i];
            }
            if (T[i] > maxSum) {
                maxSum = T[i];
            }
        }

        
        System.out.println("La somme minimale est: " + minSum);
        System.out.println("La somme maximale est: " + maxSum);

        scanner.close();
    }
}