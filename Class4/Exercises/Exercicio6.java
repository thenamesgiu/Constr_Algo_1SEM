import java.util.Scanner;
public class Exercicio6 {

    
    public static void main(String[] args) {
        //COnstrua um algoritmo que calcule se um valor é positivo, negativo ou zero
        
        //Declaração de variável e atribuição de objeto
        Scanner sc = new Scanner(System.in);
        
        //Entrada
        System.out.println("Informe um número:");
        float numb = sc.nextFloat();
        
        //Estrutura de decisão (condicional)
        if (numb < 0){
            System.out.println("O número informado é negativo.");
        }
        else if (numb == 0){
            System.out.println("Você informou o número zero (0).");
        }
        else{
            System.out.println("O número informado é positivo.");
        }
    }

}
