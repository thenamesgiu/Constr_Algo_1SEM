import java.util.Scanner;

public class Exercicio12 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int pos = 0;
        int neg = 0;
        int zero = 0;
        
        for(int i=1; i<=10; i++){
            System.out.printf("%d) Informe um número:\n", i);
            int num = sc.nextInt();
            
            if (num < 0){
                neg++;
            }
            else if (num == 0){
                zero++;
            }
            else{
                pos++;
            }
        }
        
        System.out.printf("\nDos número informados: %d são positivos, %d são negativos e %d são zero.\n", pos, neg, zero);
    }

}
