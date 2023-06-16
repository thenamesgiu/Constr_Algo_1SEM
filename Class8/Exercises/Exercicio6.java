package EighthClass;

import java.util.Scanner;
public class Exercicio6 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double[] meanGrade = new double[3];
        double grade, mediaNotas = 0.0, soma = 0.0;
        
        System.out.println("Informe as notas de 3 alunos:\n");
        int count = 0; 
        
        for (int i = 0; i < 3; i++){
            for(int g = 0; g < 4; g++){
                System.out.println("Notas do aluno " + (i+1)+ " - " +(g+1) + "ª nota: ");
                grade = sc.nextDouble();
                soma += grade;
                System.out.println(" ");
            }
            
            mediaNotas = soma/4;
            meanGrade[i]+= mediaNotas;
            
            if(mediaNotas >= 7.0){
                count++;
            }
        }
     
        System.out.printf("\n%d alunos obtiveram uma media maior ou igual a 7.\n", count);
    }

}
