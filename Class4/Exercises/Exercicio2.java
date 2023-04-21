
public class Exercicio2 {

    
    public static void main(String[] args) {
        /*COnstrua um algoritmo que troque o valor de duas variáveis (mostrar antes e depois dos valores)
        sem usar cálculo matemático*/
        
        //Valores iniciais
        String x = "A";
        String y = "B";
        
        //Mostrando valores iniciais
        System.out.printf("\nO valor inicial de x é igual a %s e o valor inicial de y é igual a %s.\n", x, y);
        
        //Variável temporária
        String teste = y;
        
        //Substituindo valores
        y = x;
        x = teste;
        
        //Mostrando valores alterados
        System.out.printf("\nO valor de x é igual a %s e o valor de y é igual a %s.\n", x, y);
    }

}
