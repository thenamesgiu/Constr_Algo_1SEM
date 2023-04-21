import java.util.Scanner;
import java.util.Arrays;

public class Exercicio11 {

    
    public static void main(String[] args) {
        //Crie um programa que leia três números e exiba-os em ordem crescente
        
        //Declarando variável e atribuindo objeto
        Scanner sc = new Scanner(System.in);
        
        //Criando array para armazenar os números de input
        float[] num = new float[3];
        
        //Entrada
        System.out.println("Informe três números:");
        //Armazenando valores em cada index, considerando que a indexação em Java é iniciada por 0
        num[0] = sc.nextFloat();
        num[1] = sc.nextFloat();
        num[2] = sc.nextFloat();
        
        Arrays.sort(num);
        
        System.out.println("\nAqui estão os números em ordem crescente:");
        //Estrutura de repetição (Vai exibir todos os números em ordem crescente a partir do método sort)
        for(float i:num){
            
            System.out.println(i);
        }
        
    }

}
