import java.util.Scanner;
public class EX1{
    public static  int lecturN(){
        Scanner scanner = new Scanner(System.in);
        int n;
        do { 
            System.out.println("donner un nomber");
            while(!scanner.hasNext()){
                System.out.println("Erreur:Veuillez entrer un entier vzlide");
                scanner.next();
            }
        
        n=scanner.nextInt();
        if (n <= 0){
            System.out.println("Errur:L'entier  doit etre strictement positif");
            
        }}while(n <= 0);
        return n ;

    }
    public static boolean EstPair(int n){
        return n%2 == 0;
    }

    public static void main(String[] args) {
        int[] entier=new int[10];
        System.out.println("Veuillez entre" ) ;
        for (int i =0; i<10; i++ ){
            entier[i]=lecturN();
            if(EstPair(i)){
                System.out.println(i);
            }
        }
        
        }

}