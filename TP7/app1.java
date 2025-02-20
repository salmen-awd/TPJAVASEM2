import java.util.Scanner;
public class app1 {
    
    public static void main(String [] args){
        try(Scanner scanner=new Scanner(System.in)){
        int nl,nc,i,j,x,Y;
        int [][] M1= new int[50][505];
        do{
            System.out.println("donner nl = ");
            nl=scanner.nextInt();
            System.out.println("donner nc");
            nc=scanner.nextInt();

        }while( nl>50 || nc>510 );
        for(i=0;i<=nl;i++){
            for(j=0;j<=nc;j++){
               do{ 
                    System.out.println("M1"+" "+"["+i+","+j+"]");
                    M1[i][j]=scanner.nextInt();
                }while(M1[i][j]%2!=0);


            }

        
        }
        System.out.println("donner x ");
        x=scanner.nextInt();
        for(i=0;i<=nl;i++){
            for(j=0;j<=nc;j++){
                if (x==M1[i][j]){
                    System.out.println(x+" "+"est existe");
                    break;
                }
                else{
                    M1[i][j]=M1[i][j]+1;
                }

            }

        }
        System.out.println(x+"n'existe pas");

    }
}
    
}