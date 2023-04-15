import java.util.Scanner; //Importando package

public class Exercicio2 {

    
    public static void main(String[] args) {
       /*Crie um algoritmo que peça dois números inteiros e depois mostre o 
        resultado de todas as operações matemáticas básicas envolvendo-os
        */
       
        //Declarando e atribuindo objeto
        Scanner sc = new Scanner(System.in);
       
        //Entrada
        System.out.println("Informe um número:");
        float n1 = sc.nextInt();
        System.out.println("Informe um outro número:");
        float n2 = sc.nextInt();
        
        //Processamento
        float soma = n1 + n2;
        float div = n1/n2;
        float mult = n1*n2;
        float sub = n1 - n2;
        
        //Saída
        System.out.printf("\nO resultado da soma dos número informados é igual a %d\n", soma);
        System.out.printf("O resultado da subtração dos número informados é igual a %d\n", sub);
        System.out.printf("O resultado da multiplicação dos número informados é igual a %d\n", mult);
        System.out.printf("O resultado da divisão dos número informados é igual a %d\n", div);
       
    }

}
