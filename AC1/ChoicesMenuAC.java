import java.util.Scanner;

//Feito por: Ana Giulia Moreira de Lima, Lauren Giulia Marcondes Barbosa e Pedro Henrique da Silva Tejon - ADS 1º SEMESTRE TURMA 5

public class ChoicesMenuAC{

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("\nMenu Principal\n====================================\n1. Média de notas\n2. Aprendendo sobre IMC\n3. Quiz\n====================================\nInsira o número da sua escolha:");
        int choicenumber = sc.nextInt(); 
        System.out.println("====================================");
        
       
        if (choicenumber == 1){
           
            System.out.println("Bem vindo(a) à calculadora de média!\n\nQuantas notas você pretende informar?");
            int totalgrades = sc.nextInt(); 
            
            float gradesum = 0;
            float mediafinal;
            
            for(int i = 1; i <= totalgrades; i++){
                System.out.printf("%d) Informe uma nota:\n", i);
                float grade = sc.nextFloat();
                
                if(grade < 0 || grade > 10){ 
                   
                    System.out.println("Por não estar entre 0 e 10, o valor informado será ignorado na média.\n");
                    continue;
                }
                else{  
                    gradesum += grade;
                }               
            }
      
            mediafinal = gradesum/totalgrades;
            
            if (mediafinal <= 5.0){
                System.out.printf("\nEsse aluno deve ficar de recuperação. Sua nota foi %.1f.\n", mediafinal);
            }
            else{
                System.out.printf("\nEsse aluno foi aprovado, pois sua média é de %.1f\n", mediafinal);
            } 
        }
        else if(choicenumber == 2){ 
            System.out.println("Bem vindo(a) ao Aprendendo sobre IMC, aqui poderemos descobrir a classificação de uma pessoa na tabela de Índice de Massa Corporal!\n\nComo estamos aprendendo, é importante saber que a fórmula de IMC é igual a:\n Massa corporal/(Altura)²");
            System.out.println("\n\nVamos começar? Me informe uma altura (considerarei em metros):");
            float height = sc.nextFloat(); 
            
            System.out.println("\nBeleza, agora me dê um valor de massa(considerarei em kg):");
            float weight = sc.nextFloat(); 
            
            String classification = "";
            
            if (height <= 0 || weight <= 0){ 
                System.out.println("Você não informou valores válidos.");
            }
            else{ 
                float imc = ((weight)/(height*height));

                if(imc < 18.5){
                    classification = "Abaixo do peso normal";
                }
                else if (imc <24.9){
                    classification = "Peso normal";
                }
                else if (imc < 29.9){
                    classification = "Excesso de peso";
                }
                else if (imc < 34.9){
                    classification = "Obesidade classe I";
                }
                else if (imc < 39.9){
                    classification = "Obesidade classe II";
                }
                else{
                    classification = "Obesidade classe III";
                }
                
                System.out.printf("\nA classificação de acordo com a tabela é de: %s.\n", classification);
            }
        }
        
        else if(choicenumber == 3){ 
            System.out.println("Bem vindo(a) ao Quiz, vamos testar seus conhecimentos? Para responder as perguntas, apenas digite os números da alternativa.\n\nEscolha o tema de sua preferência:\n\n1. História do Brasil\n2. Biomas brasileiros\n3. Conjugação verbal\n====================================");
            int choicequiz = sc.nextInt();
            
            int points = 0;
            
            if (choicequiz == 1){
                //Pergunta 1
                System.out.println("1) Quem foi o líder da Inconfidência Mineira?\n1)Pedro Álvares Cabral\n2)Tiradentes\n3)Lampião");
                int answer = sc.nextInt();
                               
                if(answer == 2){
                    System.out.println("Resposta correta!\n\n");
                    points++;
                }
                else{ 
                    System.out.println("Resposta incorreta.\n\n");
                } 
                
                //Pergunta 2
                System.out.println("2) Quem foi o primeiro presidente do Brasil após a redemocratização em 1985?\n1)Fernando Collor de Mello\n2)Luiz Inácio Lula da Silva\n3)José Sarney");
                int answer2 = sc.nextInt();
  
                if(answer2 == 3){
                    System.out.println("Resposta correta!\n\n");
                    points++;
                }
                else{
                    System.out.println("Resposta incorreta.\n\n");
                } 
                
                //Pergunta 3
                System.out.println("3) Em que ano a escravidão foi abolida?\n1)1808\n2)1888\n3)1822");
                int answer3 = sc.nextInt();
                
                if(answer3 == 2){
                    System.out.println("Resposta correta!\n\n");
                    points++;
                }
                else{ 
                    System.out.println("Resposta incorreta.\n\n");
                } 
                
                //Pergunta 4
                System.out.println("4) Quando o Brasil foi descoberto?\n1)1500\n2)1600\n3)1700");
                int answer4 = sc.nextInt();
                
                if(answer4 == 1){
                    System.out.println("Resposta correta!\n\n");
                    points++; 
                }
                else{
                    System.out.println("Resposta incorreta.\n\n");
                } 
                
                if (points == 4){
                    System.out.println("Uau, você acertou todas! Sua pontuação foi de " + points + " pontos!!!");
                }
                else if (points >=2){
                    System.out.println("Sua pontuação foi de " + points + ", parabéns!!!");
                }
                else{
                    System.out.println("Poxa, sua pontuação foi de " + points + ", mas dá sempre pra tentar de novo. Continue praticando!");
                }
                
            }
            
            else if (choicequiz == 2){ 
                //Pergunta 1
                System.out.println("1)Qual o bioma brasileiro mais extenso?\n1)Cerrado\n2)Amazônia\n3)Pantanal");
                int answer = sc.nextInt();
                
                if(answer == 2){
                    System.out.println("Resposta correta!\n\n");
                    points++;
                }
                else{ 
                    System.out.println("Resposta incorreta.\n\n");
                }   
                
                //Pergunta 2
                System.out.println("2) Qual o bioma brasileiro que apresenta uma vegetação composta por cactos adaptados ao clima seco?\n1)Pampas\n2)Caatinga\n3)Pantanal");
                int answer2 = sc.nextInt();
                
                if(answer2 == 2){
                    System.out.println("Resposta correta!\n\n");
                    points++;
                }
                else{
                    System.out.println("Resposta incorreta.\n\n");
                } 
                
                //Pergunta 3
                System.out.println("3) Qual é o bioma com maior diversidade de flora?\n1)Mata Atlântica\n2)Cerrado\n3)Pantanal");
                int answer3 = sc.nextInt();
                
                if(answer3 == 1){
                    System.out.println("Resposta correta!\n\n");
                    points++;
                }
                else{
                    System.out.println("Resposta incorreta.\n\n");
                } 
                
                //Pergunta 4
                System.out.println("4) Qual é o bioma brasileiro com menor índice pluviométrico\n1)Pampas\n2)Caatinga\n3)Pantanal");
                int answer4 = sc.nextInt();
                
                if(answer4 == 2){
                    System.out.println("Resposta correta!\n\n");
                    points++;
                }
                else{
                    System.out.println("Resposta incorreta.\n\n");
                }    
                 
                if (points == 4){
                    System.out.println("Uau, você acertou todas! Sua pontuação foi de " + points + " pontos!!!");
                }
                else if (points >=2){
                    System.out.println("Sua pontuação foi de " + points + ", parabéns!!!");
                }
                else{
                    System.out.println("Poxa, sua pontuação foi de " + points + ", mas dá sempre pra tentar de novo. Continue praticando!");
                }
            }
            else if (choicequiz == 3){ 
                //Pergunta 1
                System.out.println("1) Qual a conjugação de 'amar' no presente do indicativo da terceira pessoa do singular?\n1)Amas\n2)Amam\n3)Ama\n4)Amamos");
                int answer = sc.nextInt();
                
                if(answer == 3){
                    System.out.println("Resposta correta!\n\n");
                    points++;
                }
                else{
                    System.out.println("Resposta incorreta.\n\n");
                }   
                
                //Pergunta 2
                System.out.println("2) Qual a conjugação de 'partir' no futuro do presente do indicativo na segunda pessoa do plural?\n1)Partirás\n2)Partirá\n3)Partirão\n4)Partireis");
                int answer2 = sc.nextInt();
                
                if(answer2 == 4){
                    System.out.println("Resposta correta!\n\n");
                    points++;
                }
                else{ 
                    System.out.println("Resposta incorreta.\n\n");
                }
                
                //Pergunta 3
                System.out.println("3) Qual é a forma verbal que indica uma ação no futuro?\n1)Pretérido imperfeito\n2)Pretérito-mais-que-perfeito\n3)Presente do indicativo\n4)Futuro do presente");
                int answer3 = sc.nextInt();
                
                if(answer3 == 4){
                    System.out.println("Resposta correta!\n\n");
                    points++;
                }
                else{ 
                    System.out.println("Resposta incorreta.\n\n");
                } 
                
                //Pergunta 4
                System.out.println("4) Qual é a forma verbal que indica uma ação hipotética ou uma condição?\n1)Subjuntivo\n2)Infinitivo\n3)Imperativo\n4)Condicionativo");
                int answer4 = sc.nextInt();
                
                if(answer4 == 1){
                    System.out.println("Resposta correta!\n\n");
                    points++;
                }
                else{ 
                    System.out.println("Resposta incorreta.\n\n");
                } 
                if (points == 4){
                    System.out.println("Uau, você acertou todas! Sua pontuação foi de " + points + " pontos!!!");
                }
                else if (points >=2){
                    System.out.println("Sua pontuação foi de " + points + ", parabéns!!!");
                }
                else{
                    System.out.println("Poxa, sua pontuação foi de " + points + ", mas dá sempre pra tentar de novo. Continue praticando!");
                }
            }
            
            else{
                System.out.println("Não temos essa opção, reinicie o programa.");
            }
        }
        else{
            System.out.println("Reinicie o programa e informe uma opção válida.");
        }   
    }
}

//Feito por: Ana Giulia Moreira de Lima, Lauren Giulia Marcondes Barbosa e Pedro Henrique da Silva Tejon - ADS 1º SEMESTRE TURMA 5