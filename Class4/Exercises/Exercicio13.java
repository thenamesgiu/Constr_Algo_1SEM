import java.util.Scanner;

public class Exercicio13 {

    
    public static void main(String[] args) {
        /*Faça um programa que receba a idade, altura e peso de uma pessoa e exiba
        uma mensagem indicando se ela está dentro dos limites para tester um protótipo de avião
        
        [idade >= 18 && idade <= 35]
        [altura >= 1.65]
        [peso <= 100]
        */
        
        //Declarando variável e atribuindo objeto
        Scanner sc = new Scanner(System.in);
        
        //Entrada
        System.out.println("Qual é a sua idade?");
        int idade = sc.nextInt();
        System.out.println("Qual é a sua altura?");
        float altura = sc.nextFloat();
        System.out.println("Qual é o seu peso?");
        float peso = sc.nextFloat();
        
        //Estrutura de decisão (condicional)
        if (idade >= 18 && idade <= 35 && altura >= 1.65 && peso <= 100){
            System.out.println("Você está dentro dos limites para a testagem.");
        }
        else{
            System.out.println("Você não pode testar.");
        }
    }

}
