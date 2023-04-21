
public class Exemplo4 {

    
    public static void main(String[] args) {
        int idade = 17;
        String nome = "Maria";
        
        if (idade >= 18){
            System.out.println("Você é maior de 18 anos e pode entrar.");
        }
        else if(nome.equals("Maria")){
            System.out.println("Você é a Maria e pode acessar.");
        }
        else{
            System.out.println("Você não pode acessar.");  
        }
    }

}
