import java.util.Scanner;
public class Exercicio4 {

    
    public static void main(String[] args) {
        //Construa um algoritmo que calcule a área de um retângulo
        
        //Declarando variável e atribuindo objeto
        Scanner sc = new Scanner(System.in);
        
        //Entrada
        System.out.println("Informe o valor da base do retângulo:");
        float base = sc.nextFloat();
        System.out.println("Informe o valor da altura do retângulo:");
        float altura = sc.nextFloat();
        
        //Processamento
        float areatotal = base * altura;
        
        //Saída
        System.out.printf("\nA área do retângulo, baseada nas medidas informadas é igual a %.2f\n", areatotal);
    }

}
