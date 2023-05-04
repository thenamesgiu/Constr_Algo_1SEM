import java.util.Scanner;
public class Pratica3 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual tabuada você deseja calcular?");
        int number = sc.nextInt();
        
        for (int i=1; i<=10; i++){
            int mult = i * number;
            System.out.printf("%d x %d = %d\n", number, i, mult);
        }
    }

}
