import java.util.Scanner;
public class Exercicio4 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe seu nome:");
        String name = sc.nextLine();
        
        System.out.println("Informe um número para definir a quantidade de repetições:");
        int number = sc.nextInt();
        
        for (int i=1; i<=number; i++){
            System.out.printf("%d- %s\n", i, name);
        }
    }

}
