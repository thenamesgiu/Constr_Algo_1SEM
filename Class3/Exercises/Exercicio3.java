import java.util.Scanner; //Importando package

public class Exercicio3 {

    
    public static void main(String[] args) {
        /*Crie um algoritmo que peça ao usuário para informar os dados abaixo e, depois disso
        os imprima na tela:
        
        -Nome;
        -Endereço;
        -Número de telefone;
        -Área de atuação profissional.
        */
        
        //Declarando e atribuindo objeto
        Scanner sc = new Scanner(System.in);
        
        //Entrada
        System.out.println("Informe seu nome:");
        String nome = sc.nextLine();
        System.out.println("Informe seu endereço:");
        String ende = sc.nextLine();
        System.out.println("Informe seu número de telefone:");
        String tel = sc.nextLine();
        System.out.println("Informe sua área de atuação profissional:");
        String area = sc.nextLine();
        
        //Saída
        System.out.printf("\nSeu nome é %s, você reside no endereço %s, seu número de telefone é o %s e sua área de atuação é %s.\n", nome, ende, tel, area);
        
        
    }

}
