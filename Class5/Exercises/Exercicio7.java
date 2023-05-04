import java.util.Scanner;
public class Exercicio7 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int somaidade = 0;
        
        for(int i=1; i<=20; i++){
            System.out.printf("%d) Informe uma idade:\n", i);
            int age = sc.nextInt();
            
            somaidade += age;
        }
        
        float mean = (float)somaidade/20; 
        System.out.printf("\nA média das idades é igual a %.2f.\n", mean);
        
    }

}
