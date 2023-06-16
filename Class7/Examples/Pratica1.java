package SeventhClass;

import java.util.Scanner;

public class Pratica1 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String opt = "";
        
        while (!opt.equals("s") && !opt.equals("S")){
             System.out.println("1 - Cadastrar, 2 - Editar, 3 - Apagar, 4 - Sair");
             opt = sc.nextLine();
             
             switch(opt){
                 case "c":
                 case "C":
                     System.out.println("Cadastrando...");
                     break;
                 case "e":
                 case "E":
                     System.out.println("Editando...");
                     break;
                 case "a":
                 case "A":
                     System.out.println("Apagando...");
                     break;
                 case "s":
                 case "S":
                     System.out.println("Saindo...");
                     break;
                 default:
                     System.out.println("Opção inválida.");
                     break;
             }
        }
    }

}
