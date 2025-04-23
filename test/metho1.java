import java.util.Scanner;

public class metho1 {
    public static int lecturN() {
        Scanner scanner = new Scanner(System.in);
        int n;
        
        while (true) {
            System.out.print("Donner un entier positif n = ");
            
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 0) {
                    return n;
                }
            } else {
                scanner.next();
            }
        }
    }
}
public class opp {
    public static int plus(int a, int b) {
        return a + b;
    }
    
    public static int sout(int a, int b) {
        return a - b;
    }
    
    public static int multi(int a, int b) {
        return a * b;
    }
    
    public static int div(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero!");
            return 0;
        }
    }
}