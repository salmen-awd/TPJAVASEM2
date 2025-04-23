import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String op;
        
        System.out.println("donner l'opération addition, soustraction, multiplication, division : ");
        op=scanner.nextLine();
        
        int n1, n2;
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        
        if (op.equals("+")){
            int result = opp.plus(n1,n2);
            System.out.println("le resultat est : " + result);
        } else if (op.equals("-")){
            int result = opp.sout(n1, n2);
            System.out.println("le resultat est : " + result);
        } else if (op.equals("*")){
            int result = opp.multi(n1, n2);
            System.out.println("le resultat est : " + result);
        } else if (op.equals("/")){
            int result = opp.div(n1, n2);
            System.out.println("le resultat est : " + result);
            
        } else {
            System.out.println("opération non valide");
        }   
    
    
    
    
    
    
    
    }

    
}
