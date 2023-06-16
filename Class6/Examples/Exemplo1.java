package SixthClass;

import java.util.Scanner;


public class Exemplo1 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

           System.out.println("Digite uma letra:");
           String letra = sc.nextLine();

           //escrever switch e apertar enter já forma a estrutura switch
           switch(letra){
               case "a":
                   System.out.println("Abacate");
                   break;       
               case "b":
                   System.out.println("Banana");
                   break;
               case "m": 
                   System.out.println("Morango");
                   break;
               case "p": 
                   System.out.println("Pêra");
                   break;
               default:
                   System.out.println("Letra inválida.");

        }
    }

}
