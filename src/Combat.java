public class Combat {

    Fighter fighter1;
    Fighter fighter2;
    Fighter winner;
    
    public Combat(Fighter fighter1, Fighter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
        fight();
    }

    private void fight() {
        doFight();
        setWinner();
        resetHealthOfCombatants();
    }

    private void doFight() {

        while (fighter1.getHealth() > 0 && fighter2.getHealth() > 0) {
            int damage;

            damage = fighter1.getDamage();
            fighter2.takeDamage(damage);

            damage = fighter2.getDamage();
            fighter1.takeDamage(damage);
        }
    }

    private void setWinner() {
        if(fighter1.getHealth() <= 0) {
            winner = fighter2;
        }
        else {
            winner = fighter1;
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