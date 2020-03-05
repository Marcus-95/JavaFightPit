public class Match {
    private Fighter fighter1, fighter2;
    private int fighterPoints;
    private Fighter winner;

    public Match(Fighter fighter1, Fighter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
        //matchRounds();
        setWinner();
    }

    public Fighter getWinner() {
        return winner;
    }

    private void matchRounds() {
        for (int i = 0; i <= 3; i++) {
            Combat combat = new Combat(fighter1, fighter2);

            combat.getWinner();
            if(combat.getWinner() == fighter1){
                fighterPoints++;
                System.out.println("Winner of the round is: " + winner);
            }
            else if(combat.getWinner() == fighter2){
                fighterPoints++;
                System.out.println("Winner of the round is: " + winner);
            }
        }
    }
//FEL GÖR GOM
    private void setWinner() {
        if(fighterPoints == 2) {
            winner = fighter1;
        }
        else {
            winner = fighter2;
        }
    }

    public String toString() {
        return fighter1.getName() + " VS " + fighter2.getName();
    }
}
