import java.util.Scanner;
public class Exercicio1 {

    
    public static void main(String[] args) {
        //COnstrua um algoritmo que calcule se um valor é par ou ímpar
        
        //Criação de variavel e atribuição de objeto
        Scanner sc = new Scanner(System.in);
        
        //Input do usuário
        System.out.println("Informe um número:");
        int numbergiven = sc.nextInt();
        
        //Estrutura de decisão
        if (numbergiven%2==0){
            System.out.println("O número informado é par.");
        }
        else{
            System.out.println("O número informado não é par.");
        }
        
    }

}
