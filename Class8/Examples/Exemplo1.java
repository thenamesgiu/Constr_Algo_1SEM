package EighthClass;

import java.util.Scanner;
public class Exemplo1 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num, sum = 0, qts = 0, opc; 
        int maior = Integer.MIN_VALUE;
        double mediaA;
        
        do{
            System.out.println("Informe um número:");
            num = sc.nextInt();
            
            if(num > maior){
                maior = num;
            }
            
            sum += num;
            qts++;
            
            System.out.println("Digite 1 para inserir mais números ou 2 para encerrar.");
            opc = sc.nextInt();
            
        }while (opc == 1);
        
        mediaA = (double) sum/qts;
        
        System.out.printf("O maior número é: %d\nA média aritmética é: %.2f", maior, mediaA);
    }

}
