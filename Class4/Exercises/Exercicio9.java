import java.util.Scanner;

public class Exercicio9 {

    
    public static void main(String[] args) {
        /*Escreva um programa que peça a idade de uma pessoa e exiba uma mensagem
        indicando se ela é criança, adolescente , adulto ou idoso.*/
        
        //Declarando variável e atribuindo objeto
        Scanner sc = new Scanner(System.in);
        
        //Entrada
        System.out.println("Qual é a sua idade?");
        int age = sc.nextInt();
        
        //Estrutura de decisão (condicional)
        if (age < 12){
            System.out.println("Você é uma criança");
        }
        else if (age < 18){
            System.out.println("Você é adolescente.");
        }
         else if (age < 60){
            System.out.println("Você é adulto.");
        }
        else{
            System.out.println("Você é idoso.");
        }
    }

}
