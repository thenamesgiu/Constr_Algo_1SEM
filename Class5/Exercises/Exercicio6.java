import java.util.Scanner;

public class Exercicio6 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int somaidade = 0;
        
        for(int i=1; i<=20; i++){
            System.out.printf("%d) Informe uma idade:\n", i);
            int age = sc.nextInt();
            
            somaidade += age;
        }
        System.out.printf("\nA soma das idades informadas é igual a: %d\n", somaidade);
    }

}
