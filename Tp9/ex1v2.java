public class ex1v2{
    public static void main(String[] args) {
        int[] entier=new int[10];
        System.out.println("Veuillez entre" ) ;
        for (int i =0; i<10; i++ ){
            entier[i]=metho1.lecturN();
            if(metho2.EstPair(i)){
                System.out.println(i);
            }
        }
        
        }

}