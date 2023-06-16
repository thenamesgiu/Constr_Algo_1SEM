package NinthClass;

import java.util.Scanner;
public class Exercise1 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int matriz[][]= new int[4][3];
        
        System.out.println("Insira alguns números:\n");
        
        for(int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[linha].length; coluna++){
                System.out.println("Número [" + linha + "]" + "[" + coluna + "]:");
                matriz[linha][coluna] = sc.nextInt();
            }
            
        }
        
        for(int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[linha].length; coluna++){
                System.out.printf(matriz[linha][coluna]+ " ");
            }
            System.out.println("");
        }
    }

}
