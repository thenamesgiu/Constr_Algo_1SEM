package SeventhClass;

import java.util.Scanner;
public class Exercicio7 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double semAumento = 0, comAumento = 0, preco, newprice, mediaSem, mediaCom;
        int codprod, qtdprod = 0;
        
        do{
            System.out.println("\nQual o código do produto?");
            codprod = sc.nextInt();
            
            if(codprod >= 0){
                System.out.println("Insira o preço de custo:");
                preco = sc.nextDouble();
                
                newprice = preco * (1.2);
                
                System.out.printf("Código do produto: %d\nNovo preço do produto: R$%.2f", codprod, newprice);
                
                semAumento += preco;
                qtdprod++;
                comAumento += newprice;
            }
        }while(codprod >= 0);
        
        mediaCom = comAumento/qtdprod;
        mediaSem = semAumento/qtdprod;
        
        System.out.printf("\nMédia com aumento: R$%.2f\nMédia sem aumento: R$%.2f\n", mediaCom, mediaSem);
    }

}
