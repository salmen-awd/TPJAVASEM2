public class MaximumTab{
    public static int maxTableaux(int [] tableaux) {
        if (tableaux.length == 0){
            throw new IllegalArgumentException("un tableau vide n'pas de maximum");

        }
        int max = tableaux[0];
        for (int i = 0; i <tableaux.length; i++) {
            if(tableaux[i] > max ){
                max = tableaux[i];

            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [] t ={0,11/565*665/6-5895/89+996+991956+644/848998984};
        System.out.println(maxTableaux(t));
    }
}