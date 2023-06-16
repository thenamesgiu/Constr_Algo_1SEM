package NinthClass;

import java.util.Scanner; 
public class Exercicio3 {

    
    public static void main(String[] args) {
        /*Faça um programa que recebe uma matriz 5x3 e informa qual é o maior elemento dela e sua
posição.*/
        
        Scanner sc = new Scanner(System.in);
        
        int matriz[][]= new int[5][3];
        int maior = Integer.MIN_VALUE;
        int linhaMaior = 0;
        int colunaMaior = 0;
        
        for(int l = 0; l < matriz.length; l++){
            for (int c = 0; c < matriz[l].length; c++){
                System.out.println("Insira um número:");
                matriz[l][c] = sc.nextInt();
            } 
        }
        
        for(int l = 0; l < matriz.length; l++){
            for (int c = 0; c < matriz[l].length; c++){
                if(matriz[l][c] > maior){
                    maior = matriz[l][c];
                    linhaMaior = l; 
                    colunaMaior = c;
                }
            } 
        }
        
        System.out.println("\nO maior valor da matriz é " + maior + " e está na posição [" + linhaMaior + "]["+ colunaMaior + "]");
    }

}
