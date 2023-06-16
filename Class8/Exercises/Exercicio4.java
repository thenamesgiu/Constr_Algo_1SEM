package EighthClass;

import java.util.Scanner;
public class Exercicio4 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] num = new int[5];
        int sum = 0, mult = 1;
        
        System.out.println("Informe 5 números:");
        
        for (int i=0; i < num.length; i++){
            num[i] = sc.nextInt();
            
            sum += num[i];
            mult *= num[i];
        }
        
        System.out.println("\nOs números informados foram:");
        
        for (int i=0; i < num.length; i++){
            System.out.println(num[i]);
        }
        
        System.out.printf("\nRESULTADOS:\nMultiplicação -> %d\nAdição -> %d\n", mult, sum);
    }

}
