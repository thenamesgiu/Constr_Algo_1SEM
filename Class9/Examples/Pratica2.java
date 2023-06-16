package NinthClass;

import java.util.Scanner;
public class Pratica2 {

    
    public static void main(String[] args) {
        /*Receber 10 números e armazená-los em um vetor. Copiar os números em outro vetor na ordem
        inversa e mostrar na tela todas as posições em que se tem o mesmo número nos dois vetores*/
        
        /*Exemplo:
        1 2 3 1 2 3 1 2 3 1
        1 3 2 1 3 2 1 3 2 1
        */
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int[] reverse = new int[10];
        int count=0;
        
        System.out.println("Informe alguns números");
        
        for (int i = 0; i < num.length; i++){
            System.out.print((i+1) + "º número: ");
            num[i] = sc.nextInt();
        }
        
        System.out.println("\nVeja os números inseridos e o array invertido:\n");
        
        for (int i = 0; i < num.length; i++){
            System.out.print(num[i]+" ");
        }
        System.out.println(" ");
        
        for (int i = 0; i < num.length; i++){
            reverse[i] = num[num.length - 1 - i];
            System.out.print(reverse[i]+" ");
        }
        
        System.out.println("\n\nOs seguintes elementos estão na mesma posição:\n");
        
        for(int i = 0; i < num.length; i++){
            if (num[i] == reverse[i]){
                System.out.println("Posição " +i+": número " + num[i]);
                count++;
            }
            
        }
        
        if(count == 0){
            System.out.println("Nenhum número está na mesma posição.");
        }
        
        System.out.println(" ");
        
    }

}
