package EighthClass;

import java.util.Scanner;
public class Exercicio2 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] reverse = new int[3];
        int[] num = new int[3];
        System.out.println("Informe alguns números:");
        
        for (int i = 0; i < num.length; i++){
            System.out.print((i+1) + "º número: ");
            num[i] = sc.nextInt();
            System.out.println(" ");
        }
        
        for (int i = 0; i < num.length; i++){
            reverse[i] = num[num.length - 1 - i];
            System.out.println(reverse[i]);
        }
        
    }

}
