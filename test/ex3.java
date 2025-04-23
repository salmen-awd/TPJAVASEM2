import java.util.Scanner;

public class SimpleVerbGroupIdentifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un verbe à l'infinitif : ");
        String verbe = scanner.nextLine().toLowerCase().trim();
        
        if (verbe.endsWith("er") && !verbe.equals("aller")) {
            System.out.println("1er groupe");
        } 
        else if (verbe.endsWith("ir") && (verbe.endsWith("finir") || verbe.endsWith("choisir"))) {
            System.out.println("2ème groupe");
        }
        else {
            System.out.println("3ème groupe");
        }
    }
}