import java.util.Scanner; //Importando package
        
public class Exercicio_6 {

    public static void main(String[] args) {
        /*Receba dois valores inteiros.
        
        - O primeiro valor corresponde à quantidade de pontos do líder do campeonato brasileiro de futebol. 
        - O segundo valor corresponde à quantidade de pontos do time lanterna.
        
        Considerando que cada vitória vale 3 pontos, elabore uma classe que calcule o número de vitórias 
        necessárias para que o time lanterna alcance (ou ultrapasse) o líder.
        */
        
        //Declarando e atribuindo objeto
        Scanner sc = new Scanner(System.in);
        
        //Entrada
        System.out.println("Informe a quantidade de pontos do líder:");
        int leader = sc.nextInt();
        System.out.println("Informe a quantidade de pontos do time lanterna:");
        int lant = sc.nextInt();
        
        //Processamento
        int total = (leader - lant)/3;
        
        //Saída 
        System.out.printf("\nPara alcançar o líder, é necessário que o time lanterna obtenha %d vitória(s).\n", total);
    }

}
