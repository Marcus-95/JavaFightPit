import java.util.*;

public class Tournament{
    public static List<Fighter> fighterList;
    public static List<Match> matchList;
    static Scanner input = new Scanner(System.in);
    Fighter winner;

    public void startMatch() {
        createFighters();
        matchList = new ArrayList<>();
    }

    public void createFighters() {
        fighterList = Arrays.asList(new Fighter("Marcus", " For Glory!"),
                new Fighter("Vicke", " AAAAAAAAHHHH!!"),
                new Fighter("Mikaela", " Kränk mig rå!"),
                new Fighter("Elliot", " Jag har slutat snusa, jag lovar!"),
                new Fighter("Valter", " Fan vad jag hungrig jag blev nu.."),
                new Fighter("Skaug", " *Chugs beer*"),
                new Fighter("Casamassa", " Stronzo!"),
                new Fighter("Emil", " KONG STRONG!"));
        Collections.shuffle(fighterList);
    }

    public void runTournament() {
        System.out.println("Welcome to the Fightpit where our competitors will fight to the death!");
        System.out.println("Here is the competitors for the match!\n");
        String match1 = fighterList.get(0).toString() + " VS " + fighterList.get(1).toString();
        String match2 = fighterList.get(2).toString() + " VS " + fighterList.get(3).toString();
        String match3 = fighterList.get(4).toString() + " VS " + fighterList.get(5).toString();
        String match4 = fighterList.get(6).toString() + " VS " + fighterList.get(7).toString();
        System.out.println(match1);
        System.out.println(match2);
        System.out.println(match3);
        System.out.println(match4);

        while(true) {
            for (int i = 0; i < fighterList.size() - 1; i = i + 2) {
                Match match = new Match(fighterList.get(i), fighterList.get(i + 1));
                matchList.add(match);
            }

            fighterList = new ArrayList<>();
            for (int i = 0; i <= matchList.size() - 1; i++) {
                Match m = matchList.get(i);
                fighterList.add(m.getWinner());
            }
            Collections.shuffle(fighterList);
            matchList = new ArrayList<>();

            if(fighterList.size() == 1){
                System.out.println();
                System.out.println(fighterList.get(0) + " is the winner of the game!");
                winner = fighterList.get(0);
                break;
            }
        }
    }
}
