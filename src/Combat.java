public class Combat {

    Fighter fighter1;
    Fighter fighter2;
    Fighter winner;

    public Combat(Fighter fighter1, Fighter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
        //fight();
    }


    public void fight() {
        //doFight();
       // setWinner();
        resetHealthOfCombatants();
    }

    public Fighter doFight(Fighter fighter1, Fighter fighter2) {

                fighter1.takeDamage(fighter2.getDamage());
                fighter2.takeDamage(fighter1.getDamage());

                if(fighter1.getHealth() <= 0) {
                    return fighter2 = winner;
                }
                else {
                    return fighter1 = winner;
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