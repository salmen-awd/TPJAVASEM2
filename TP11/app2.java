import java.util.Scanner;
public class app2 {
    public static void main(String[] args) {
        Scanner scaner=new Scanner(System.in);
        int n = metho2.lecturN();
        int [] tab= new int[n];
        tab=metho2.RemplirTab(n);
        float moy;
        moy = metho2.Moyen(tab, n);
        System.out.println("La moyenne de la classe est " + moy);
    }
    
}
