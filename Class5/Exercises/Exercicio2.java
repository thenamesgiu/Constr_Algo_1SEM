
public class Exercicio2 {

    
    public static void main(String[] args) {
        int soma = 0;
        
        for(int i=1; i<=15; i++){
            System.out.printf("%d + %d = %d\n", soma, i, soma + i);
            soma += i;
        }
        System.out.printf("\nA soma dos números entre 1 e 15 é igual a %d\n", soma );
    }

}
