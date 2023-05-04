
import java.util.Scanner;


public class Pratica8 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Informe quantos números quer inserir:");
            int times = sc.nextInt();
            
            int count = 0;
            int counting = 0;

            for(int i=1; i<=times; i++){
                
                System.out.printf("%d) Digite um número:\n", i);
                int n = sc.nextInt();

                if (n>=10 && n<=20){
                    count++;
                }
                else{
                    counting++;
                }

            }
                
            System.out.printf("\n%d estavam entre 10 e 20; %d estavam fora desse intervalo.\n",count, counting);
    }

}
