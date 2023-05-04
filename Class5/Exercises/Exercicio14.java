public class Exercicio14 {

    
    public static void main(String[] args) {
    
        int before = 0;
        int now = 1;
        
        
        System.out.printf("%d  %d ", before, now);

        for (int i = 3; i <= 100; i++) {
            int next = before + now;

            System.out.printf("  %d",next);
            
            before = now;
            now = next;

        }
    }

}
