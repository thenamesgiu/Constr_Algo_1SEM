import java.util.Scanner;
public class Exercicio3 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe seu nome:");
        String name = sc.nextLine();
        
        for(int i=0; i <=10; i++){
            System.out.printf("%d- %s\n", i, name);
        }
    }

}
