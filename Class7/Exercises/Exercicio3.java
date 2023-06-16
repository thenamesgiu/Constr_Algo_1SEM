package SeventhClass;

import java.util.Scanner;

public class Exercicio3 {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int qtdaluno = 0, codaluno;
       float grade1, grade2, grade3, mediafinal, soma = 0;
       
       System.out.println("Qual é o código do aluno em questãoo?");
       codaluno = sc.nextInt();
       
       while(codaluno !=0){
           System.out.println("1ª nota:");
           grade1 = sc.nextFloat();
           
           System.out.println("2ª nota:");
           grade2 = sc.nextFloat();
           
           System.out.println("3ª nota:");
           grade3 = sc.nextFloat();
           
           mediafinal = (grade1+grade2+grade3)/3;  
           System.out.println("A média do aluno é igual a " + mediafinal);
           
           qtdaluno++;
           soma += mediafinal;
           
           System.out.println("Informe o código do próximo aluno:");
           codaluno = sc.nextInt();
       }
       
       
        if (qtdaluno > 0) {
            double mediaGeral = soma / qtdaluno;
            System.out.println("A média geral da classe é: " + mediaGeral);
        } else {
            System.out.println("Nenhum aluno foi informado.");
        }
    }

}
