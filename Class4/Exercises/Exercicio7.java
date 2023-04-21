import java.util.Scanner;
public class Exercicio7 {

    
    public static void main(String[] args) {
        /*Construa um algoritmo que calcule qual é o maior número entre duas variáveis inteiras*/
        
        //Declarando variável e atribuindo objeto
        Scanner sc = new Scanner(System.in);
        
        //Entrada
        System.out.println("Informe um primeiro número:");
        int num1 = sc.nextInt();
        System.out.println("Informe um outro número:");
        int num2 = sc.nextInt();
        
        //Estrutura de decisão (condicional)
        if (num1 < num2){
            System.out.printf("\nO número %d é maior do que o número %d.\n", num2, num1);
        }
        else{
            System.out.printf("\nO número %d é maior do que o número %d.\n", num1, num2);
        }
    }

}
