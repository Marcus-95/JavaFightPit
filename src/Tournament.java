import java.util.ArrayList;
import java.util.Collections;

public class Tournament{
    public static ArrayList<Fighter> fighterList = new ArrayList<>();
    public static ArrayList<Match> matchList = new ArrayList<>();
   
    public void startMatch() {
        createFighters();
        for(int i = 0; i < fighterList.size() / 2; i = i+2) {
            Match match = new Match(fighterList.get(i), fighterList.get(i+1));
            matchList.add(match);
        }
    }

    public static void createFighters() {
        fighterList.add(new Fighter("Marcus", " For Glory!"));
        fighterList.add(new Fighter("Vicke", " AAAAAAAAHHHH!!"));
        fighterList.add(new Fighter("Mikaela", " Kränk mig rå!"));
        fighterList.add(new Fighter("Elliot", " Jag har slutat snusa, jag lovar!"));
        fighterList.add(new Fighter("Valter", " Fan vad jag hungrig jag blev nu.."));
        fighterList.add(new Fighter("Skaug", " *Chugs beer*"));
        fighterList.add(new Fighter("Casamassa", " Stronzo!"));
        fighterList.add(new Fighter("Emil", " KONG STRONG!"));
        Collections.shuffle(fighterList);
    }

    public void runTournament() {

        String round1 = matchList.get(0).toString() + " " + matchList.get(1).toString();
        String round2 = matchList.get(2).toString() + " " + matchList.get(3).toString();
        String round3 = matchList.get(4).toString() + " " + matchList.get(5).toString();
        String round4 = matchList.get(6).toString() + " " + matchList.get(7).toString();

        System.out.println("Welcome to the Fightpit where our competitors will fight to the death!");
        System.out.println("Here are our competitors!");
        System.out.println(round1);
        System.out.println(round2);
        System.out.println(round3);
        System.out.println(round4);
        System.out.println("\nPress enter to proceed");
      

        for (int i = 0; i <= matchList.size()-1; i++) {
            Match m = matchList.get(i);
            System.out.println(m.getWinner());
        }
    }
}
