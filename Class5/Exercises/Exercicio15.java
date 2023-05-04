import java.util.Scanner;
public class Exercicio15 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe um número:");
        int num = sc.nextInt();
        
        double soma = 1;
        
        for(int i=2; i <= num; i++){
            
            soma += 1.0/i;
           
        }
        System.out.printf("%.2f", soma);
    }

}
