package SeventhClass;

import java.util.Scanner;

public class Exemplo4 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int opt = 0;
        boolean isReady = true;
        
        do{
            System.out.println("Quer sair? Digite 2");
            opt = sc.nextInt();
            
            if (opt == 2){
                isReady = false;
            }
            
        }while(isReady);
    }

}
