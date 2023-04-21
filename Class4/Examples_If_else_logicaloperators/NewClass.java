import java.util.Scanner;
public class NewClass {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Informe um número:");
        float num1 = sc.nextFloat();
        System.out.println("Informe um outro número.");
        float num2 = sc.nextFloat();

        float mult = num1 * num2;
        System.out.printf("\nA multiplicação dos números informados resulta em: %f\n", mult);
    }

}
