import java.util.Scanner;
public class Exemplo3 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha = "123456";
        
        System.out.println("Qual é o seu nome de usuário?");
        String nome = sc.nextLine();
        
        System.out.println("Qual é a sua senha?");
        String senhauser = sc.nextLine();
        
        if (senha.equals(senhauser)){
            System.out.printf("\nOlá, %s, pode continuar.\n", nome);
        }
        else{
            System.out.printf("\n%s, sinto muito, mas você não tem acesso.\n", nome);
        }
    }

}
