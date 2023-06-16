package EighthClass;

import java.util.Scanner;
public class Exemplo2 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] nomes = new String[10];
        
        nomes[0] = "Fabio";
        nomes[1] = "Darth Vader";
        nomes[9] = "Homem Aranha";
        
        System.out.println("Indice 0:" + nomes[0]);
        System.out.println("Indice 1:" + nomes[1]);
        System.out.println("Indice 2:" + nomes[2]);
        System.out.println("Indice 9:" + nomes[9]);
        
        int[] idades = new int[50];
        
        idades[0] = 11;
        idades[49] = 85;
        
        int[] valores = {11, 85, 18, 14, 24};
        System.out.println(valores[2]);
    }

}
