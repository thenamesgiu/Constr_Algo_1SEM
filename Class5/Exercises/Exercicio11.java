import java.util.Scanner;
public class Exercicio11 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe um número inteiro positivo:");
        int num = sc.nextInt();
        
        for (int i=1; i<=10; i++){
            int mult = i * num;
            System.out.printf("\n%d x %d = %d\n", num, i, mult);
        }
    }

}
