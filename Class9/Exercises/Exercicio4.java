package NinthClass;

import java.util.Scanner; 
public class Exercicio4 {

    
    public static void main(String[] args) {
        /*Faça um programa que recebe uma matriz 3x3 e gera uma segunda matriz com o dobro de cada
valor. No final, exiba as duas matrizes na tela.*/
        Scanner sc = new Scanner(System.in);
        
        int[][] matriz = new int[3][3];
        int[][] dobro = new int[3][3];
        
        System.out.println("Informe alguns números para formar uma matriz e descobrir o dobro de cada valor.\n");
        
        for (int l = 0; l < matriz.length; l++){
            for(int c = 0; c < matriz[l].length; c++){
                System.out.println("Informe um número para a posição [" + l + "][" + c + "]:");
                matriz[l][c] = sc.nextInt();
            }
        }
        
        for (int l = 0; l < dobro.length; l++){
            for(int c = 0; c < dobro[l].length; c++){
                dobro[l][c] = matriz[l][c]*2;
            }
        }
        
        System.out.println("\nMatriz informada:");
        
        for(int l = 0; l < matriz.length; l++){
            for (int c = 0; c < matriz[l].length; c++){
                System.out.printf(matriz[l][c]+ " ");
            }
            System.out.println("");
        }
        
        System.out.println("\nMatriz com o dobro dos elementos:");
        
        for(int l = 0; l < dobro.length; l++){
            for (int c = 0; c < dobro[l].length; c++){
                System.out.printf(dobro[l][c]+ " ");
            }
            System.out.println("");
        }
        
    }

}
