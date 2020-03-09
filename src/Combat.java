public class Combat {

    Fighter fighter1;
    Fighter fighter2;
    Fighter winner;

    public Combat(Fighter fighter1, Fighter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
        fight();
    }

    public void fight() {
        doFight();
        resetHealthOfCombatants();
    }

    private void doFight() {

        while(true){
            Fighter goesFirst, goesSecond;
            if(Math.random() < 0.5){
                goesFirst = fighter1;
                goesSecond = fighter2;
            }
            else{
                goesFirst = fighter2;
                goesSecond = fighter1;
            }
            goesFirst.takeDamage(goesSecond.getDamage());
            goesSecond.takeDamage(goesFirst.getDamage());

            if(fighter1.getHealth() <= 0){
                winner = fighter2;
                break;
            }
            else if(fighter2.getHealth() <= 0){
                winner = fighter1;
                break;
            }
        }
    }
    private void resetHealthOfCombatants() {
        fighter1.resetHealth();
        fighter2.resetHealth();
    }

    public Fighter getWinner() {
        return winner;
    }
}