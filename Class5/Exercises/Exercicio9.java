import java.util.Scanner;
public class Exercicio9 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int odd = 0;
        int even = 0;
        
        for(int i=1; i <= 20; i++){
            System.out.printf("%d) Informe um número:\n", i);
            int num = sc.nextInt();
            
            if(num%2==0){
                even++;
            }
            else{
                odd++;
            } 
        }
        
        System.out.printf("\nDos números informados: %d são ímpares e %d são pares.\n", odd, even);
    }

}
