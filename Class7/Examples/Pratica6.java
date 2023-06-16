package SeventhClass;

import java.util.Scanner;

public class Pratica6 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int opt = 0;
        
        do{
            System.out.println("1 - Cadastrar\n2 - Editar\n3 - Apagar\n4 - Sair");
            opt = sc.nextInt();
            
            switch (opt){
                case 1:
                    System.out.println("\nCadastrando...\n");
                    break;
                case 2:
                    System.out.println("\nEditando...\n");
                    break;
                case 3:
                    System.out.println("\nApagando...\n");
                    break;
                case 4:
                    System.out.println("\nSaindo...\n");
                    break;
                default:
                    System.out.println("\nOpção inválida.\n");
                    break;
            }
            
            
        }while(opt != 4);
    }

}
