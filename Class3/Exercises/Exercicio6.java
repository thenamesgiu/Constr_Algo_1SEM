import java.util.Scanner;

public class Exercicio6 {
    
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Informe a quantidade de pontos do líder:");
       int leader_p = sc.nextInt();
       System.out.println("Informe a quantidade de pontos do time lanterna:");
       int lant_p = sc.nextInt();
       
       //Tornando a classe um objeto para exportar as variáveis 
       Wins wins = new Wins(leader_p, lant_p);
       
       //Método do objeto wins 
       wins.VictoryCount();
        
    }

    
}
