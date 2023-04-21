import java.util.Scanner;
public class Exercicio8 {

    
    public static void main(String[] args) {
        /*Escreva um programa que pergunte a temperatura atual (Celsius) e exiba 
        uma mensagem dizendo se está quente, morno ou frio.
        */
        
        //Declarando variável e atribuindo objeto
        Scanner sc = new Scanner(System.in);
        
        //Entrada
        System.out.println("Qual a temperatura atual? (Será considerado em C°)");
        float temp = sc.nextFloat();
        
        //Estrutura de decisão (condicional)
        if (temp > 30){
            System.out.println("Está quente.");
        }
        else if (temp<=15){
            System.out.println("Está frio.");
        }
        else{
            System.out.println("Está morno.");
        }
    }

}
