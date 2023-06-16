package NinthClass;

import java.util.Scanner;


public class Exercicio6 {

    
    public static void main(String[] args) {
        /*Faça um programa que leia uma matriz 3x5 de inteiros, substitua seus elementos
negativos por 0 e imprima a matriz original e a modificada*/
        Scanner sc = new Scanner(System.in);
        
        int[][] matriz = new int[3][5];
        int[][] mod = new int[3][5];
        
        System.out.println("Informe alguns números positivos e negativos:");
        
        for (int l=0; l < matriz.length; l++){
            for (int c = 0; c < matriz[l].length; c++){
                System.out.println("Elemento na posição ["+ l + "][" + c + "]:");
                matriz[l][c] = sc.nextInt();
            }
        }
        
        for (int l = 0; l < mod.length; l++) {
            for (int c = 0; c < mod[l].length; c++) {
                if (matriz[l][c] < 0) {
                    mod[l][c] = 0;
                } 
                else{
                    mod[l][c] = matriz[l][c];
                }
            }
        }
        
        System.out.println("\nMatriz original:");
        
        for(int l = 0; l < matriz.length; l++){
            for (int c = 0; c < matriz[l].length; c++){
                System.out.printf(matriz[l][c]+ " ");
            }
            System.out.println("");
        }
        
        System.out.println("\nMatriz modificada:");
        
        for(int l = 0; l < mod.length; l++){
            for (int c = 0; c < mod[l].length; c++){
                System.out.printf(mod[l][c]+ " ");
            }
            System.out.println("");
        }
        
    }

}
