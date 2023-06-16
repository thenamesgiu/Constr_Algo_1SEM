package SeventhClass;

import java.util.Scanner;
public class Exercicio9 {

    
    public static void main(String[] args) {
        int weight, age, soma = 0, count = 1, outofrange = 0;
        float media;

        Scanner sc = new Scanner(System.in);
        
        while (count <= 7){
            System.out.println("\nInforme o peso:");
            weight = sc.nextInt();
            
            System.out.println("\nInforme a idade:");
            age = sc.nextInt();
            
            if(weight > 90){
                outofrange++;
            }
            
            soma += age;
            count++;
        }
        
        media = soma/7;
        
        System.out.printf("\nA média de idade dessas pessoas é de %.2f e a quantidade de pessoas com mais de 90kg é de %d\n", media, outofrange);
        
    }

}
