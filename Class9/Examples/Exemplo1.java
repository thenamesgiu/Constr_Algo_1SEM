package NinthClass;

import java.util.Scanner;
public class Exemplo1 {

    
    public static void main(String[] args) {
        //int matriz[][] = new int[3][3];
        
        Scanner sc = new Scanner(System.in);
        
        /*matriz[0][0] = 100;
        matriz[1][1] = 200;
        matriz[2][2] = 300;
        matriz[3][3]= 400;
        
        int matriz2[][] = {{0,1,2}, {3,4,5}, {6, 7, 8}};*/
        
        int matriz3[][]= new int[3][3];
        
        for(int linha = 0; linha < matriz3.length; linha++){
            for (int coluna = 0; coluna < matriz3[linha].length; coluna++){
                matriz3[linha][coluna] = sc.nextInt();
            }
            
        }
        
        for(int linha = 0; linha < matriz3.length; linha++){
            for (int coluna = 0; coluna < matriz3[linha].length; coluna++){
                System.out.printf(matriz3[linha][coluna]+ " ");
            }
            System.out.println("");
        }
        
        
        
        
    }

}
