import java.util.Scanner; //Importando package

public class Exercicio5 {
    
    public static void main(String[] args) {
        /*Receba o valor de um produto e a porcentagem de desconto
        Calcule e mostre o valor do desconto e o valor do produto com desconto
        */
        
        //Declarando e atribuindo objeto
        Scanner sc = new Scanner(System.in);
        
        //Entrada
        System.out.println("Informe o valor do produto:");
        float price = sc.nextFloat();
        System.out.println("Informe o valor do desconto:");
        float desc = sc.nextFloat();
        
        //Processamento
        float total_desc = price*(desc/100);
        float total_pago = price - total_desc;

        //Saída
        System.out.printf("\nO desconto foi de R$%.2f, o preço pago por você é de R$%.2f.\n",total_desc, total_pago);
    }

}
