import java.util.Scanner;
public class Pratica6 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe quantos números quer inserir:");
        int times = sc.nextInt();
        
        for(int i=1; i<=times; i++){
            System.out.printf("%d) Digite um número:\n", i);
            int n = sc.nextInt();
            System.out.printf("O número digitado foi: %d\n\n", n);
            
        }
    }

}
