import java.util.Scanner;


public class ChoicesMenuAC{

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Sistema de escolha de opções, como um menu
        System.out.println("\nMenu Principal\n====================================\n1. Média de notas\n2. Aprendendo sobre IMC\n3.Quiz\n====================================\nInsira o número da sua escolha:");
        int choicenumber = sc.nextInt(); //Aqui o usuário insere um número inteiro para escolher a opção desejada
        System.out.println("====================================");
        
        //Caso o usuário escolha a calculadora de média - opção 1
        if (choicenumber == 1){
            //Mensagem de introdução
            System.out.println("Bem vindo(a) à calculadora de média!\n\nQuantas notas você pretende informar?");
            int totalgrades = sc.nextInt(); //O usuário informará quantas notas deseja informar
            
            //Inicializando variáveis para processamento
            float gradesum = 0;
            float mediafinal;
            
            //O laço de repetição for continuará até que o usuário tenha inserido a quantidade de notas que deseja
            for(int i = 1; i <= totalgrades; i++){
                System.out.printf("%d) Informe uma nota:\n", i);
                float grade = sc.nextFloat();
                
                if(grade < 0 || grade > 10){ 
                    //Se o input for menor do que 0 e maior do que 10, o valor será ignorado pelo for
                    System.out.println("Por não estar entre 0 e 10, o valor informado será ignorado na média.\n");
                    continue;
                }
                else{
                    //Atribuindo a soma dos valores da variável grade para a variável gradesum 
                    gradesum += grade;
                }
                
            }
            //Média aritmética considerando a quantidade de notas que o usuário informou
            mediafinal = gradesum/totalgrades;
            
            //Se a nota do aluno foi igual ou inferior a 5, ele deve ficar de recuperação
            if (mediafinal <= 5.0){
                System.out.printf("\nEsse aluno deve ficar de recuperação. Sua nota foi %.1f.\n", mediafinal);
            }
            //Caso seja superior a 5, o aluno estará aprovado
            else{
                System.out.printf("\nEsse aluno foi aprovado, pois sua média é de %.1f\n", mediafinal);
            } 
        }
        else if(choicenumber == 2){ //Caso o usuário escolha a opção 2 - Aprendendo sobre IMC
            System.out.println("Bem vindo(a) ao Aprendendo sobre IMC, aqui poderemos descobrir a classificação de uma pessoa na tabela de Índice de Massa Corporal!\n\nComo estamos aprendendo, é importante saber que a fórmula de IMC é igual a:\n Massa corporal/(Altura)²");
            System.out.println("\n\nVamos começar? Me informe uma altura (considerarei em metros):");
            float height = sc.nextFloat(); //Informando altura em metros
            
            System.out.println("\nBeleza, agora me dê um valor de massa(considerarei em kg):");
            float weight = sc.nextFloat(); //Informando peso em quilogramas
            
            //Iniciando variável de classificação
            String classification = "";
            
            if (height <= 0 || weight <= 0){ //Não há altura nem massa corporal menores do que zero, o programa será encerrado
                System.out.println("Você não informou valores válidos.");
            }
            else{ //O usuário forneceu um input válido
                //Fórmula de IMC
                float imc = ((weight)/(height*height));

                //if-else para verificar classificação na tabela IMC
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
                
                //Output caso o usuário tenha inserido valores válidos
                System.out.printf("\nA classificação de acordo com a tabela é de: %s.\n", classification);
            }
        }
        
        else if(choicenumber == 3){ //Caso o usuário escolha a opção 3 - Quiz
            System.out.println("Bem vindo(a) ao Quiz, vamos testar seus conhecimentos?\n\nEscolha o tema de sua preferência:\n\n1. História do Brasil\n2. Biomas brasileiros\n3. Conjugação verbal\n");
            int choicequiz = sc.nextInt();
            
            
            //Se o usuário escolher a opção 1 - História do Brasil
            if (choicequiz == 1){
                System.out.println("Quem foi o líder da Inconfidência Mineira?\n1)Pedro Álvares Cabral\n2)Tiradentes\n3)Lampião");
                int answer = sc.nextInt();
                
                //Se resposta correta
                if(answer == 2){
                    System.out.println("Resposta correta!\n\n");
                }
                else{ //Se incorreta
                    System.out.println("Resposta incorreta.\n\n");
                }   
                
                System.out.println("Quem foi o primeiro presidente do Brasil após a redemocratização em 1985?\n1)Fernando Collor de Mello\n2)Luiz Inácio Lula da Silva\n3)José Sarney");
                int answer2 = sc.nextInt();
                
                //Se resposta correta
                if(answer2 == 3){
                    System.out.println("Resposta correta!\n\n");
                }
                else{ //Se incorreta
                    System.out.println("Resposta incorreta.\n\n");
                }  
            }
            
            else if (choicequiz == 2){ //Se o usuário escolhar a opção 2 - biomas brasileiros
                System.out.println("Qual o bioma brasileiro mais extenso?\n1)Cerrado\n2)Amazônia\n3)Pantanal");
                int answer = sc.nextInt();
                
                //Se resposta correta
                if(answer == 1){
                    System.out.println("Resposta correta!\n\n");
                }
                else{ //Se incorreta
                    System.out.println("Resposta incorreta.\n\n");
                }   
                
                System.out.println("Qual o bioma brasileiro que apresenta uma vegetação composta por cactos adaptados ao clima seco?\n1)Pampas\n2)Caatinga\n3)Pantanal");
                int answer2 = sc.nextInt();
                
                //Se resposta correta
                if(answer2 == 2){
                    System.out.println("Resposta correta!\n\n");
                }
                else{ //Se incorreta
                    System.out.println("Resposta incorreta.\n\n");
                } 
            }
            else if (choicequiz == 3){ //Se o usuário escolher a opção 3 - conjugação verbal
                System.out.println("Qual a conjugação de 'amar' no presente do indicativo da terceira pessoa do singular?\n1)Amas\n2)Amam\n3)Ama\n4)Amamos");
                int answer = sc.nextInt();
                
                //Se resposta correta
                if(answer == 3){
                    System.out.println("Resposta correta!\n\n");
                }
                else{ //Se incorreta
                    System.out.println("Resposta incorreta.\n\n");
                }   
                
                System.out.println("Qual a conjugação de 'partir' no futuro do presente do indicativo na segunda pessoa do plural?\n1)Partirás\n2)Partirá\n3)Partirão\n4)Partireis");
                int answer2 = sc.nextInt();
                
                //Se resposta correta
                if(answer2 == 4){
                    System.out.println("Resposta correta!\n\n");
                }
                else{ //Se incorreta
                    System.out.println("Resposta incorreta.\n\n");
                } 
            }
        }
        //Isso ocorre caso o usuário não dê uma resposta válida no menu principal
        else{
            System.out.println("Reinicie o programa e informe uma opção válida.");
        }
        
    }

}
