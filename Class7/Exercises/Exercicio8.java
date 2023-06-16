package SeventhClass;

import java.util.Scanner;

public class Exercicio8 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int h = 5;
        
        int count = 0;
        int totalAge = 0;
        int totalW = 0;
        int totalP = 0;
        int ageM = 0;
        int gender, age;
        double altura, mediaAge, mediaHeight, meanAgeH, perc;
        
        do{
            System.out.println((count + 1) + "º habitante:\nQual seu gênero?\n(0) - feminino\n(1) - masculino\n");
            gender = sc.nextInt();
            System.out.println("Qual sua altura?");
            altura = sc.nextDouble();
            System.out.println("Qual sua idade?");
            age = sc.nextInt();
            
            totalAge += age;
            
            if (gender ==0){
                totalW++;
            }
            else{
                ageM += age;
            }
            if (age >= 18 && age <= 35){
                totalP++;
            }
            
            count++;
        }while(count <= h);
        
        sc.close();
        
        mediaAge = totalAge/h;
        mediaHeight = totalW > 0 ? totalAge/totalW : 0.0;
        meanAgeH = h - totalW > 0 ? ageM/(h - totalW): 0.0;
        perc = totalP/h * 100;
                
        System.out.println("\nRESULTADOS\nPercentual de pessoas com idade entre 18 e 35: " + perc + "\nMédia de altura das mulheres: "+ mediaHeight + "\nMédia da idade dos homens: "+ meanAgeH + "\nMédia de idade: "+ mediaAge+ "\n");
        
    }

}
