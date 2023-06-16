package SeventhClass;

import java.util.Scanner;

public class Pratica5 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe sua senha");
        String senha = sc.nextLine();

        boolean a = senha.equals("alo") ?true: false;
        
        if (a == true){
            
            System.out.println("Acesso liberado");
        }
        else{
            System.out.println("Acesso negado");
           
        }
   
    }

}
