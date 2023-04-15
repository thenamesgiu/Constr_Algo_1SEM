import java.util.Scanner; //Importando package

public class Exercicio4 {

    
    public static void main(String[] args) {
        /*Faça um algoritmo para calcular quantas ferraduras são necessárias para equipar todos os cavalos 
        comprados para um haras
        */
        
        //Declarando e atribuindo objeto
        Scanner sc = new Scanner(System.in);
        
        //Entrada
        System.out.println("Informe a quantidade de cavalos comprados:");
        int horses = sc.nextInt();
        
        //Processamento
        int horseshoe = horses * 4;
        
        //Saída
        System.out.printf("\nSerão necessárias %d ferraduras.\n", horseshoe);
    }

}
