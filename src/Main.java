import java.util.Scanner;

public class Main {
    private static Object Fighter;
    private static Fighter fighter1;
    private static Fighter fighter2;

    public static void main(String[] args) {
        Tournament tournament = new Tournament();
        Match match = new Match(fighter1,fighter2);
        match.matchRounds(fighter1,fighter2);
        tournament.startMatch();
        tournament.runTournament();






    }
}