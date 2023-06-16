package NinthClass;

import java.util.Scanner; 
public class Exercicio2 {

    
    public static void main(String[] args) {
        //Faça um programa que recebe uma matriz 3x4 e mostra a soma dos seus elementos
        
        Scanner sc = new Scanner(System.in);
        
        int matriz[][]= new int[3][4];
        int matrizsum[][] = new int[3][4];
        int sum = 0;
        
        for(int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[linha].length; coluna++){
                System.out.println("Insira um número:");
                matriz[linha][coluna] = sc.nextInt();
            } 
        }
        
        for(int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[linha].length; coluna++){
                sum += matriz[linha][coluna];
                matrizsum[linha][coluna] = sum;
            }
        }
        
        for(int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[linha].length; coluna++){
                System.out.print(matrizsum[linha][coluna] + " ");
            }
            System.out.println();
        }
    }

}
