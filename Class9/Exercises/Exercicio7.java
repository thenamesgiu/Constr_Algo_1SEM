package NinthClass;

import java.util.Scanner;
public class Exercicio7 {

    
    public static void main(String[] args) {
        /*Faça um programa que leia uma matriz 5x5 de inteiros e some os elementos de cada
coluna da matriz. Mostre a matriz original, o índice das coluna e a soma de cada uma delas*/
        Scanner sc = new Scanner(System.in);
        
        int[][] matriz = new int[5][5];
        int[] colunas = new int[5];
        
        System.out.println("Informe alguns números:\n");
        
        for(int l=0; l < matriz.length; l++){
            for(int c=0; c < matriz[l].length; c++){
                System.out.println("Posição ["+ l+ "][" + c + "]:");
                matriz[l][c] = sc.nextInt();
            }
        }
        
        for (int c=0; c < 5; c++){
            for (int l=0; l< 5; l++){
                colunas[c] += matriz[l][c];
            }
        }
        
        System.out.println("\nMatriz informada:");
        
        for(int l = 0; l < matriz.length; l++){
            for (int c = 0; c < matriz[l].length; c++){
                System.out.printf(matriz[l][c]+ " ");
            }
            System.out.println("");
        }
        
        System.out.println("\nSoma das colunas");
        
        for (int c=0; c < 5; c++){
            System.out.printf("Coluna nº %d: %d\n", c, colunas[c]);
        }
        
        System.out.println("");
    }

}
