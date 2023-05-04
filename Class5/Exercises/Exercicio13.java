import java.util.Scanner;
public class Exercicio13 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        
        for(int i=1; i<=10; i++){
            System.out.printf("%d) Informe um número:\n", i);
            int num = sc.nextInt();
            
            if(num > maior){
                maior = num;
            }
            if(num < menor){
                menor = num;
            }
        }
        
        System.out.printf("\nO menor número é %d e o maior número é %d.\n", menor, maior);
        
    }

}
