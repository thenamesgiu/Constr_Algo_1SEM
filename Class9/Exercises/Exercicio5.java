package NinthClass;

import java.util.Scanner;


public class Exercicio5 {

    
    public static void main(String[] args) {
        /*Faça um programa que recebe uma matriz 3x4 e mostra a média dos elementos de uma
linha escolhida pelo usuário*/
        Scanner sc = new Scanner(System.in);
        
        int[][] matriz = new int[3][4];
        int linha;
        double medialinha = 0, somalinha = 0;
        
        System.out.println("Informe alguns números para formar a sua matriz:\n");
        
        for (int l=0; l < matriz.length; l++){
            for(int c=0; c < matriz[l].length; c++){
                matriz[l][c] = sc.nextInt();
            }
        }
        
        System.out.println("\nEssa é a matriz que você formou:");
        
        for(int l = 0; l < matriz.length; l++){
            for (int c = 0; c < matriz[l].length; c++){
                System.out.printf(matriz[l][c]+ " ");
            }
            System.out.println("");
        }
        
        System.out.println("\n\nAgora escolha uma linha dessa matriz de 0 a 3");
        linha = sc.nextInt();
        
        if (linha >=0 && linha < 3){
            for (int c = 0; c < 4; c++) {
                somalinha += matriz[linha][c];
            }
            medialinha = somalinha / 4;
            
            System.out.println("\nA média da linha que você escolheu é igual a " + medialinha);
        }
        else{
            System.out.println("Você digitou uma opção inválida, a linha da matriz se inicia por 0, apesar de ter 4 elementos em uma linha, você só tem a opção entre 0 e 3 já que 0 foi incluído na conta.");
        }
        
        
        
        
    }

}
