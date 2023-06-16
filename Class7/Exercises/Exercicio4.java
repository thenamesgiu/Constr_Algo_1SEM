package SeventhClass;

import java.util.Scanner;


public class Exercicio4 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int medianum;
        int count = 0;
        int soma = 0;
        int mediaf;
        
        System.out.println("Informe uma nota");
        do{
            medianum = sc.nextInt();
            
            if(medianum == 0){
                break;
            }
            
            if (medianum%2 == 0){
                soma += medianum;
                count++;
            }
            
            
        }while(true);
        
        if(count > 0){
            mediaf = soma/count;
            System.out.printf("A média aritmética é de %d, os valores ímpares foram ignorados.", mediaf);
            
        }
        else{
            System.out.println("Nenhum valor válido foi inserido.");
        }
    }

}
