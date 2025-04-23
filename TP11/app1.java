public class app1{
    public static void main(String[] args) {
        int n;
        int x1 = metho1.lecturN();
        int x2 = metho1.lecturN();
        n = metho1.lecturN();
        int[] tab;
        tab = metho1.RemplirTab(n);
        System.out.println("Le tableau est : ");
        tab = metho1.Remplacr(tab, n, x1, x2);
        metho1.affiche(tab, n);
    }
}