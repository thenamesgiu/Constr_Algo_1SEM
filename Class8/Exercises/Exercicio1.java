package EighthClass;

import java.util.Scanner;
public class Exercicio1 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] num = new int[5];
        System.out.println("Informe alguns números:");
        
        for (int i = 0; i < num.length; i++){
            System.out.print((i+1) + "º número: ");
            num[i] = sc.nextInt();
            System.out.println(" ");
        }
        
        for(int i = 0; i <num.length; i++){
            System.out.println((i+1) + "º número informado: " + num[i]);
        }
        
    }

}
