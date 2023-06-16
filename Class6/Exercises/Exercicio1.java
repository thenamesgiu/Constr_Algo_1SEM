package SixthClass;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe um número:");
        float num1 = sc.nextFloat();
        
        System.out.println("Informe outro número:");
        float num2 = sc.nextFloat();
        
        System.out.println("\n====================================\nCalculadora\n====================================\n1.Soma\n2.Subtração\n3.Multiplicação\n4.Divisão\n====================================\nEscolha a operação desejada inserindo o número correspondente a ela:");
        int ope = sc.nextInt();
        
        float total = 0;
        switch(ope){
            case 1:
                total = num1 + num2;
                break;
            case 2:
                total = num1 - num2;
                break;
            case 3:
                total = num1 * num2;
                break;
            case 4:
                total = num1 / num2;
                break;
            default:
                System.out.println("\nDigite uma operação válida.");
        }
        if (ope >= 1 && ope<=4){
            System.out.printf("\nO resultado da operação é %.2f\n", total);
        }

        
    }

}
