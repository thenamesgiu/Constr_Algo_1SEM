package SeventhClass;

import java.util.Scanner;


public class Exercicio6 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        int count = 0;
        int soma = 0;

        
        System.out.println("Informe um número:");
        do{
            num = sc.nextInt();
            
            if(num == 0){
                break;
            }
            
            if (num < 0){
                soma += num;
                count++;
            }
 
        }while(true);
        
        if(count > 0){
            System.out.printf("A soma é de %d, os valores positivos foram ignorados.", soma);
            
        }
        else{
            System.out.println("Nenhum valor válido foi inserido.");
        }
    }

}
