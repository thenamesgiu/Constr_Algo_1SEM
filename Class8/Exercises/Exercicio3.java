package EighthClass;

import java.util.Scanner;
public class Exercicio3 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double[] grade = new double[4];
        double sum = 0, media = 0;
        
        System.out.println("Informe algumas notas:\n");
        
        for (int i = 0; i < grade.length; i++){
            System.out.printf((i + 1) + "ª nota:");
            grade[i] = sc.nextDouble();
            
            sum += grade[i];
        }
        
        media = sum/4;
        System.out.println(" ");
        for (int i = 0; i<grade.length; i++){
            System.out.println((i + 1) + "ª nota: " + grade[i]);
        }
        
        System.out.println("A média do aluno foi de: " + media);
        
    }

}
