package SeventhClass;

import java.util.Scanner;
public class Exercicio2 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cod, choice1 = 0, choice2 = 0, choice3 = 0, choice4 = 0, nulos = 0, branco = 0;
        
        System.out.println("Digite o código do candidato de sua escolha\n(0) Encerre a execução\n(1) Candidato 1\n (2) Candidato 2\n(3)Candidato 3\n(4) Candidato 4\n(5) Voto Nulo\n(6) Voto em branco\n");
        cod = sc.nextInt();
        
        while(cod != 0){
            switch(cod){
                case 1:
                    choice1++;
                    break;
                case 2:
                    choice2++;
                    break;
                case 3: 
                    choice3++;
                    break;
                case 4:
                    choice4++;
                    break;
                case 5: 
                    nulos++;
                    break;
                case 6: 
                    branco++;
                    break;
                default:
                    System.out.println("Código de voto não reconhecido. Não contabilizado.");
                    break;
            }
            
            System.out.println("Digite o código do candidato de sua escolha\n(0) Encerre a execução\n(1) Candidato 1\n(2) Candidato 2\n(3)Candidato 3\n(4) Candidato 4\n(5) Voto Nulo\n(6) Voto em branco\n");
            cod = sc.nextInt();
        }
        
        System.out.printf("\nRESULTADO DA VOTAÇÃO\n(1) Candidato 1 obteve %d votos\n(2) Candidato 2 obteve %d votos\n(3) Candidato 3 obteve %d votos\n(4) Candidato 4 obteve %d votos\n(5) Votos nulos: %d\n(6) Votos em branco: %d\n", choice1, choice2, choice4, choice4, nulos, branco);
    }

}
