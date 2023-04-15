import java.util.Scanner;

public class Exemplo4 {

    public static void main(String[] args) {
       //declarando variável e atribuindo um objeto a ela
       Scanner sc = new Scanner(System.in);
       
        System.out.println("Informe sua idade:");
        
        //criando variável e atribuindo scanner para ler o input, logo idade = input
        int idade = sc.nextInt();
        
        //Não era pra fazer isso aqui, só fiz no tédio mesmo
        if (idade > 1){
            System.out.printf("\nSua idade é igual a %d anos\n", idade);
        }
        else if (idade < 0){
            System.out.printf("\nÉ meio impossível ter idade negativa\n");
        }
        else{
            System.out.printf("\nSua idade é igual a %d ano\n", idade);
        }
        
    }
    
}
