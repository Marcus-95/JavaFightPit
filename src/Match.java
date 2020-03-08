public class Match {
    private Fighter fighter1, fighter2;
    private int fPoints1;
    private int fPoints2;
    private Fighter winner;

    public Match(Fighter fighter1, Fighter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
        matchRounds();
        setWinner();
    }

    public void matchRounds() {
        for (int i = 0; i <= 3; i++) {
            Combat combat = new Combat(fighter1, fighter2);
            //combat.doFight();

            if(combat.getWinner() == fighter1){
                fPoints1++;
            }
            else if(combat.getWinner() == fighter2){
                fPoints2++;
            }
        }
    }

    private void setWinner() {
        if(fPoints1 == 2) {
            winner = fighter1;
        }
        else {
            winner = fighter2;
        }
    }

    public Fighter getWinner() {
        return winner;
    }

    public String toString() {
        return fighter1.getName() + " VS " + fighter2.getName();
    }
}
