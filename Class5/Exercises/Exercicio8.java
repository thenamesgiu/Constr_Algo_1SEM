import java.util.Scanner;
public class Exercicio8 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int notminor = 0;

        for(int i=1; i<=20; i++){
            System.out.printf("%d) Informe uma idade:\n", i);
            int age = sc.nextInt();
            
            if(age >= 18){
                notminor++;
            } 
        }
        
        System.out.printf("\nHá %d pessoas maiores de idade.\n", notminor);
    }

}
