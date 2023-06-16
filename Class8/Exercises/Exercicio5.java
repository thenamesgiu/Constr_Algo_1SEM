package EighthClass;

//Importando biblioteca
import java.util.Scanner;

public class Exercicio5 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declaração de vetores e variáveis
        int[] num = new int[10];
        int pares = 0, impares = 0;
        int[] par;
        int[] impar;
 
        System.out.println("Informe alguns números:");
        
        //Adquirindo os números inciiais
        for (int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
            
            if (num[i]%2 ==0){
                pares++;
            }
            else{
                impares++;
            }
        }
        
        //Criando os vetores para armazenar os numeros obtidos pelos contadores anteriores
        impar = new int[impares];
        par = new int[pares];
        pares = 0;
        impares = 0;
        
        //Realizando o preenchimento dos vetores par e impar com os números informados 
        for (int i = 0; i < num.length; i++){
            if(num[i]%2==0){
                par[pares] = num[i];
                pares++;
            }
            else{
                impar[impares] = num[i];
                impares++;
            }
        }
        
        //Output dos resultados com os vetores já preenchidos
        System.out.println("\nNumeros iniciais");
        for (int i=0; i < num.length; i++){
            System.out.println(num[i]);
        }
        System.out.println("\nNumeros impares");
        for (int i=0; i < impar.length; i++){
            System.out.println(impar[i]);
        }
        System.out.println("\nNumeros pares");
        for (int i=0; i < par.length; i++){
            System.out.println(par[i]);
        }
        
                
        
    }

}
