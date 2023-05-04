import java.util.Scanner;

public class Exercicio10 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int count = 0;
        
        for(int i=1; i<=20; i++){
            System.out.printf("%d) Informe um número:\n", i);
            int num = sc.nextInt();
            
            if(num >= 0 && num <= 100){
                count++;
            }
        }
        System.out.printf("\nDos números informados, %d estão entre 0 e 100.\n", count);
    }

}
