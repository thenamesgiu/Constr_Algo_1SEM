package SeventhClass;

import java.util.Scanner;

public class Exercicio5 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int range1 = 0, range2 = 0, range3 = 0, range4 = 0, range5 = 0;
        int user;
        
        System.out.println("Insira alguns números:");
        
        do{
            user = sc.nextInt();
            
            if (user>= 0 && user <=25){
                range1++;
            }
            else if(user>=26 && user<=50){
                range2++;
            }
            else if(user>=51 && user<=75){
                range3++;
            }
            else if(user>=76 && user<=100){
                range4++;
            }
            else{
                range5++;
            }
        }while(user >=0);
        
        System.out.printf("\nA leitura foi interrompida.\n\nQtd números entre 0-25: %d\nQtd números entre 26-50: %d\nQtd números entre 51-75: %d\nQtd números entre 76-100: %d\nQtd números fora do alcance: %d\n", range1, range2, range3, range4, range5);
    }

}
