import java.util.Scanner;

public class Exercicio_11 {

    
    public static void main(String[] args) {
        //Crie um programa que leia três números e exiba-os em ordem crescente
        
        //Declarando variável e atribuindo objeto
        Scanner sc = new Scanner(System.in);
     
        //Entrada
        System.out.println("Informe o primeiro número:");
        float num1 = sc.nextFloat();
        System.out.println("Informe o segundo número:");
        float num2 = sc.nextFloat();
        System.out.println("Informe o terceiro número:");
        float num3 = sc.nextFloat();
        
        //Variáveis para ordenação
        float minval, maxval, meanval;
        
        //Processamento dentro da estrutura de decisão
        if (num1 < num2){
            if (num1 < num3){
                minval = num1;
                
                if (num2 < num3){
                    maxval = num3;
                    meanval = num2;
                }
                else{
                    maxval = num2;
                    meanval = num3;
                }
                
            }
            else{
                minval = num3;
                meanval = num1;
                maxval = num2;
            }     
        }
        else{
            if (num2 < num3){
                minval = num2;
                
                if (num1 < num3){
                    maxval = num3;
                    meanval = num1;
                }
                else{
                    maxval = num1;
                    meanval = num3;
                }
                
            }
            else{
                maxval = num1;
                minval = num3;
                meanval = num2;
            }
        }
        
        //Saída
        System.out.printf("\nAqui estão os números em ordem crescente:\n%.1f\n%.1f\n%.1f\n", minval, meanval, maxval);
        
    }

}
