import java.util.Scanner;

public class Exercicio10 {

    
    public static void main(String[] args) {
        /*Escreva um programa que pergunte a nota de um aluno em uma prova e exiba
        uma mensagem indicando se ele foi aprovado (nota >= 7), repovado (nota < 5)
        ou em recuperação (5>nota>7).
        */
        
        //Declarando variável e atribuindo objeto
        Scanner sc = new Scanner(System.in);
        
        //Entrada
        System.out.println("Qual foi a nota obtida na prova?");
        float score = sc.nextFloat();
        
        //Estrutura de decisão (condicional)
        if (score >= 7){
            System.out.println("O aluno foi aprovado.");
        }
        else if (score < 5){
            System.out.println("O aluno foi reprovado.");
        }
        else{
            System.out.println("O aluno está em recuperação.");
        }
    }

}
