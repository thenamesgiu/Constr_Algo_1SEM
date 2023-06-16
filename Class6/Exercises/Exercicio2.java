package SixthClass;

import java.util.Scanner;

public class Exercicio2 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("_____________________________________________________________________");
        System.out.println("|    Código    |       Produto            |    Preço unit(R$)       |");
        System.out.println("|--------------|--------------------------|-------------------------|");
        System.out.println("|    [100]     |    Cachorro quente       |       R$1,70            |");
        System.out.println("|    [101]     |    Bauru Simples         |       R$2,30            |");
        System.out.println("|    [102]     |    Bauru com ovo         |       R$2,60            |");
        System.out.println("|    [103]     |    Hamburguer            |       R$2,40            |");
        System.out.println("|    [104]     |    Cheeseburguer         |       R$2,50            |");
        System.out.println("|    [105]     |    Refrigerante          |       R$1,00            |");
        System.out.println("|______________|__________________________|_________________________|");
        
        System.out.println("Informe o código do produto que você comprou:");
        int prod = sc.nextInt();
        
        System.out.println("Quantas unidades você comprou?");
        int unid = sc.nextInt();
              
        double price = 0;
        
        switch(prod){
            case 100:
                price = 1.7 * unid;
                break;
            case 101:
                price = 2.3 * unid;
                break;
            case 102:
                price = 2.6*unid;
                break;
            case 103:
                price = 2.4 * unid;
                break;
            case 104:
                price = 2.5 * unid;
                break;
            case 105:  
                 price = 1 * unid;
                 break;
            default:
                System.out.println("Nenhum código válido foi informado.");
                break;
        }
        
        if (prod >= 100 && prod <= 105 && unid > 0){
            System.out.printf("\nO preço a pagar é igual a R$%.2f\n", price);
        }
        else{
            System.out.println("\nNão foi possível realizar a operação.");
        }
        
    }

}
