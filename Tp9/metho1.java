import java.util.Scanner;
public class metho1{
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
    
    

}