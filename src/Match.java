
public class Match {
    private Fighter fighter1, fighter2;
    private int fPoints1;
    private int fPoints2;
    private Fighter winner;

    public Match(Fighter fighter1, Fighter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
        System.out.println("\nNext match is: ");
        System.out.println(fighter1.toString() + " VS " + fighter2.getName());
        System.out.println("\nPress enter to fight!");
        matchRounds();
        setWinner();
    }

    private void matchRounds() {
        String roundMessage = " is the winner of the round. Press enter to start next round.";
        for (int i = 0; i <= 2; i++) {
            Combat combat = new Combat(fighter1, fighter2);
            if(combat.getWinner().equals(fighter1)){
                Tournament.input.nextLine();
                fPoints1++;
            }else{
                Tournament.input.nextLine();
                fPoints2++;
            }
            System.out.println(combat.getWinner() + roundMessage);

            if (fPoints1 == 2) {
                System.out.println();
                System.out.println(fighter1.getName() + " is the winner of the match and proudly screams: " + fighter1.getWinShout());
                break;
            }
            else if (fPoints2 == 2){
                System.out.println();
                System.out.println(fighter2.getName() + " is the winner of the match and proudly screams: " + fighter2.getWinShout());
                break;
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
