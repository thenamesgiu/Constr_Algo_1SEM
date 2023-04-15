public class Wins {
    private int lant_p;
    private int leader_p;
    
    public Wins(int leader_p, int lant_p){
        
        this.leader_p = leader_p;
        this.lant_p = lant_p;
    }
    public void VictoryCount(){
        int winned = (leader_p - lant_p)/3;
        
        System.out.printf("\nO número de vitórias necessárias é de %d\n", winned);
    }
}
