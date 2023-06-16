package EighthClass;


public class Exemplo5 {

    
    public static void main(String[] args) {
        String[] meses = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        
        int[] diames = {31, 28, 31,30,10, 4, 5, 6, 7, 8, 8, 10};
        
        for (int i = 0; i < meses.length; i++){
            System.out.println("O mes " + meses[i]+" tem " + diames[i] + " dias.");
        }
         
    }

}
