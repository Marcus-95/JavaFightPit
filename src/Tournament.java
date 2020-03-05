import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tournament{

    Scanner input = new Scanner(System.in);
    public static ArrayList<Fighter> fighterList = new ArrayList<>();
    public static ArrayList<Match> matchList = new ArrayList<>();

    public void startMatch() {
        createFighters();
        for(int i = 0; i < fighterList.size() - 1; i = i+2) {
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
        String match1 = fighterList.get(0).getName() + " vs " + fighterList.get(1).getName();
        String match2 = fighterList.get(2).getName() + " vs " + fighterList.get(3).getName();
        String match3 = fighterList.get(4).getName() + " vs " + fighterList.get(5).getName();
        String match4 = fighterList.get(6).getName() + " vs " + fighterList.get(7).getName();

        System.out.println("Welcome to the Fightpit where our competitors will fight to the death!");
        System.out.println("Here are our competitors!\n");
        System.out.println(match1);
        System.out.println(match2);
        System.out.println(match3);
        System.out.println(match4);
        System.out.println("\nPress enter to proceed");
        input.nextLine();

        for (int i = 0; i <= matchList.size()-1; i++) {
            Match m = matchList.get(i);
            System.out.println(m.getWinner());

        }


    }
}