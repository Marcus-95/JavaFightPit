import java.util.*;

public class Fighter {
    private String name, winShout;
    private int health;
    private int maxHealth = 50;

    public Fighter(String name, String winShout) {
        this.name = name;
        this.winShout = winShout;
        health = maxHealth;
    }

    public String getName() {
        return name;
    }

    public String getWinShout() {
        return winShout;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        Random rand = new Random();
        return rand.nextInt(20);
    }

    public void takeDamage(int damage) {
        health = health - damage;
    }

    public void resetHealth() {
        health = maxHealth;
    }

    public String toString() {
        return  this.name  + this.winShout;
    }
}
