import java.util.Scanner;
public class Exemplo5pt2 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Lembrando que o input tem que ser True ou False
        System.out.println("Você está de folga?");
        boolean folga = sc.nextBoolean();
        
        System.out.println("Tem sol?");
        boolean temsol = sc.nextBoolean();
        
        if (temsol || folga){
            System.out.println("Passearei hoje.");
        }
        else{
            System.out.println("Não passearei hoje.");
        } 
    }

}
