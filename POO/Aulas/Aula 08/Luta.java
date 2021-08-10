import java.util.Random;

public class Luta {
    // PROPRIETIES
    private Lutador challenged;
    private Lutador defiant;
    private Integer rounds;
    private boolean isapproved;
    // METHODS PUBLIC

    public void markFight(Lutador l1, Lutador l2){
        if (l1.getCategory().equals(l2.getCategory()) && l1 != l2){
            setIsapproved(true);
            setDefiant(l1);
            setChallenged(l2);
        } else {
            setIsapproved(false);
            setChallenged(null);
            setDefiant(null);
        }
    }

    public void fight(){
        if (getIsApproved()){
            print("Desafiado");
            getDefiant().Present();
            print("Desafiante");
            getChallenged().Present();
            Random random = new Random();
            int winner = random.nextInt(3);
            switch (winner){
                case 0: // Draw
                    print("Empatou");
                    getChallenged().drawFight();
                    getDefiant().drawFight();
                    break;

                case 1: // Defiant winner
                    print("Vítoria do " + getDefiant());
                    getDefiant().winFight();
                    getChallenged().loserFight();
                    break;

                case 2: // Challenged winner
                    print("Vítoria do " + getChallenged());
                    getDefiant().loserFight();
                    getChallenged().winFight();
                    break;
            }
        } else{
            print("A luta não pode acontecer");
        }
    }

    // GETTERS

    public Lutador getChallenged(){ return this.challenged; }

    public Lutador getDefiant(){ return this.defiant;
    }

    public Integer getRounds(){ return this.rounds; }

    public Boolean getIsApproved(){ return this.isapproved; }

    // SETTERS

    public void setChallenged(Lutador challenged){ this.challenged = challenged; }

    public void setDefiant(Lutador defiant){ this.defiant = defiant; }

    public void setRounds(Integer rounds){ this.rounds = rounds; }

    public void setIsapproved(Boolean isapproved){ this.isapproved = isapproved; }

    // OTHERS

    public static void print(String x){ System.out.println(x); }
}
