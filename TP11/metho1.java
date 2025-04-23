import java.util.Scanner;

public class metho1 {
    public static int lecturN() {
        Scanner scanner = new Scanner(System.in);
        int n;
        
        while (true) {
            System.out.print("Donner un entier positif n = ");
            
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 10) {
                    return n;
                }
            } else {
                scanner.next();
            }
        }
    }
    public static int[] RemplirTab(int n) {
        int[] tab = new int[n];
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i <= n; i++) {  
            System.out.print("Donner un entier tab[" + i + "] = ");
            while (true) {
                if (scanner.hasNextInt()) {
                    int num = scanner.nextInt();
                    if (num <20) {
                        tab[i] = num;
                        break;
                    } else {
                        System.out.print("Le nombre doit être positif. Réessayez: ");
                    }
                } else {
                    System.out.print("Entrée invalide. Veuillez entrer un entier: ");
                    scanner.next();  
                }
            }
        }
        return tab;
    }
    public static int Remplacr(int[] tab, int n, int x1, int x2) {
        for (int i = 0; i < n; i++) {
            if (tab[i] == x1) {
                tab[i] = x2;
            }
        }
        return 0;
    }
    public  static  void affiche(int [] tab , int n){
        System.out.println("tableau");
        for (int i = 0; i <= n ; i++) {
            System.out.println(tab[i]+" ");
            
        }

    }
    public  static float  Moyen(int[] tab ,int  n ){
        int somme=0;
        for (int i = 0; i <n; i++) {
             somme=somme+i;
            
        }
        float moyen;
        moyen=somme/n;

        return  moyen; 

    } 
}