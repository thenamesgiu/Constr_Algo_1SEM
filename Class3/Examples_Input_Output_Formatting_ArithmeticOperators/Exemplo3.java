public class Exemplo3 {

    public static void main(String[] args) {
        //Saída de dados
        System.out.println("Pula linha");
        System.out.print("Não pula linha...");
        System.out.println("Viu só");
        
        System.out.println("\n\nTeste pular\n uma linha");
        System.out.println("\\alo \"aaaaaa\"");
        
        //Formatting
        String nome = "Ana";
        int idade = 18;
        System.out.printf("\nMeu nome é %s e tenho %d anos \n", nome, idade);
        System.out.printf("\nMeu nome é " + nome +" e tenho " +idade + " anos \n");
        
        //Prática
        String faculdade = "Facens";
        int numSemestres = 5;
        
        //Formatação
        System.out.printf("\nEstudo na %s em um curso com a duração de %d semestres.", faculdade, numSemestres);
        //Concatenação
        System.out.println("\nEstudo na " + faculdade + " em um curso com a duração de " + numSemestres + " semestres.");
    }
    
}
