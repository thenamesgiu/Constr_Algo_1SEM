package SeventhClass;

import java.util.Scanner;

public class Exercicio1 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int medianum;
        int count = 0;
        int soma = 0;
        int mediaf;
        
        System.out.println("Informe as notas:");
        do{
            medianum = sc.nextInt();
            
            if (medianum >= 0){
                soma += medianum;
                count++;
            } 
        }while(medianum >= 0);
        
        if(count > 0){
            mediaf = soma/count;
            System.out.printf("A leitura foi interromída.\nA média aritmética é de %d, os valores negativos foram ignorados.", mediaf);
            
        }
        else{
            System.out.println("Nenhum valor válido foi inserido.");
        }
    }

}
