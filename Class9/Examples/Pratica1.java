package NinthClass;

import java.util.Scanner;
public class Pratica1 {

    
    public static void main(String[] args) {
        /*Receber numeros do usuario pra preencher um vetor de 10 posiçoes, porém, só
        é permitido armazenar no vetor numeros positivo(repetir ate q as 10 pos do vetor sejam preench)
        no final, exiba a soma de tds os num que estao nas posições impares do vetor*/
        Scanner sc = new Scanner(System.in);
        
        int[] num = new int[10];
        int sum = 0, count=0;
        
        System.out.println("Informe números positivos:");
        
        while(count <10){
            int n = sc.nextInt();
            
            if (n >= 0){
                num[count] = n;
                count++;
            }
            else{
                System.out.println("Só números positivos são aceitos");
            }
            
            
        }
        
        for(int i=1; i<= num.length; i+=2){
            sum += num[i];
        }
        
        System.out.printf("A soma dos números em vetores ímpares é igual a: %s", sum);
        
        
    }

}
