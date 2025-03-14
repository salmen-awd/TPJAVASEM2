public class metho2{
    public static boolean EstPair(int n){
        return n%2 == 0;
    }
    public static int compter(int n){
        int i =0 ;
        while (n!=0){
            n=n/10 ;
            i++;

        }
        return i;



    }
    public static int calcul(int n){
        int S=0;
        for (int i = 0; i <= n; i++) {
            S=S+i*i;
            
        }
        return S;
    }
}