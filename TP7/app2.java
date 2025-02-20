import java.util.Scanner;

public class app2 {

    public static void main(String[] args) {
        try(Scanner scanner=new Scanner(System.in)){
        int nl,nc,Moy,i,j;
        int P=1;
        int S=0;
        int M=new int[30][30];
        do{
            System.out.println("donner nl");
            nl=scanner.nextLine();
            System.out.println("donner nc");
            nc=scanner.nextLine();
        }while(nl>=30 || nc>=30);
        for(i=0;i<=nl;i++){
            for(j=0;j<=nc;j++){
                System.out.println("M["+i+","+j+"]");
                M[i][j]=scanner.nextLine();

            }
        }
        for(i=0;i<=nl;i++){
            for(j=0;j<=nc;j++){
                P=M[i][j]*P;
                S=S+M[i][j];
                Moy=(i+j)/S;
            
            
            
            
            
            
            
            
            }}
            System.out.println("produit= "+P);
            System.out.println("moyenne est = "+Moy);



        
        
        
        
        


    }
}
}