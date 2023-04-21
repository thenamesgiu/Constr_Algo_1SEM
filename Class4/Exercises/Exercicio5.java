import java.util.Scanner;
public class Exercicio5 {

    
    public static void main(String[] args) {
        /*Construa um algoritmo que calcule o antecessor e sucessor de 
        um número qualquer*/
        
        //Declarando variável e atribuindo objeto
        Scanner sc = new Scanner(System.in);
        
        //Entrada
        System.out.println("Informe um número:");
        int numb = sc.nextInt();
        
        //Processamento
        int ante = numb-1;
        int suc = numb+1;
        
        //Saída
        System.out.printf("\nO antecessor do número informado é %d e o seu sucessor é o número %d.\n", ante, suc);
        
    }

}
