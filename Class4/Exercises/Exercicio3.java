import java.util.Scanner;
public class Exercicio3 {

    
    public static void main(String[] args) {
        //Construa um algoritmo que mostre o triplo de um valor
        
        //Declarando variável e atribuindo objeto
        Scanner sc = new Scanner(System.in);
        
        //Input
        System.out.println("Informe um valor:");
        float num = sc.nextFloat();
        
        //Processamento
        float triplo = num * 3;
        
        //Saída
        System.out.printf("\nO triplo do valor informado é igual a %.2f\n", triplo);
    }

}
