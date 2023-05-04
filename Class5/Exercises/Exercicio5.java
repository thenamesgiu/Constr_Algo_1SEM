import java.util.Scanner;
public class Exercicio5 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb = 0;
        int soma = 0;
        
        for (int i=1; i<=10; i++){
            System.out.printf("%d) Digite um número:\n", i);
            numb = sc.nextInt();
            
            soma += numb;
        }
        
        System.out.println(soma);
    }

}
