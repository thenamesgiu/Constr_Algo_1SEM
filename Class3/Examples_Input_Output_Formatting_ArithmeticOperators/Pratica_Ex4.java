import java.util.Scanner;

public class Pratica_Ex4 {

    public static void main(String[] args) {
        //Crie um scanner para duas variáveis, obtenha dois input e realize a soma deles
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Digite um número:");
        int num1 = sc.nextInt();
        System.out.println("Digite outro número:");
        int num2 = sc.nextInt();
        
        //Somando inputs
        int soma = num1 + num2;
        
        System.out.printf("\nA soma desses números é igual a %d\n", soma);
        
    }
    
}
