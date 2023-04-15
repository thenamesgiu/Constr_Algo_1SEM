import java.util.Scanner; //Importando package

public class Exercicio1 {

    
    public static void main(String[] args) {
        /*Crie um algoritmo que peça para o usuário informar um número decimal 
        e depois imprima na tela
        */
        
        //Declarando e atribuindo objeto
        Scanner sc = new Scanner(System.in);
        
        //Entrada
        System.out.println("Informe um número decimal:");
        float dec_numb = sc.nextFloat();
        
        //Saída
        System.out.printf("O número informado foi %f\n", dec_numb);
        
        
    }

}
