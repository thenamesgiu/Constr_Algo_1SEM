package EighthClass;

import java.util.Scanner;

public class Exemplo4 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  
        String[] cidades = new String[5];
        System.out.println("Informe algumas cidades:");
        
        for (int i = 0 ; i < cidades.length; i++){
            System.out.print((i+1) + "º:");
            cidades[i] = sc.nextLine();
            System.out.println(" ");
            
        }
        
        for (int i = 0; i < cidades.length; i++){
            System.out.println((i+1) + " - " + cidades[i]);
        }
    }

}
