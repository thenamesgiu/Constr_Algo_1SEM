import java.util.Scanner;

public class Exercicio12 {

    
    public static void main(String[] args) {
        /*Escreva um programa que calcule o preço total de uma compra em um supermercado,
        levando em consideração que os produtos podem ter desconto ou acréscimo de acordo
        com a forma de pagamento escolhida
        dinheiro -> 5% de desconto
        cartão de crédito -> 10% de acréscimo
        débito -> sem desconto ou acréscimo
        */
        
        //Declarando variável e atribuindo objeto
        Scanner sc = new Scanner(System.in);
        
        //Entrada
        System.out.println("Qual é o preço total da sua compra?");
        double price = sc.nextFloat();
        System.out.println("Qual é a forma de pagamento?");
        System.out.println("1 - Dinheiro");
        System.out.println("2 - Cartão de crédito");
        System.out.println("3 - Cartão de débito");
        int pay = sc.nextInt();
        
        double totalprice;
        
        //Estrutura de decisão (condicional)
        if(pay == 1){
            totalprice = price - price * (0.05);
            System.out.printf("\nO total a pagar é R$%.2f.\n", totalprice);
        }
        else if(pay == 2){
            totalprice = price + price * 0.1;
            System.out.printf("\nO total a pagar é R$%.2f.\n", totalprice);
        }
        else{
            System.out.printf("\nNão há desconto, então o total a pagar é R$%.2f.\n", price);
        }
        
       
    }

}
