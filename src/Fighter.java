import java.util.*;

public class Fighter {
    private String name;
    private String winShout;
    public int health = 50;
    
    public Fighter(String name, String winShout) {
        this.name = name;
        this.winShout = winShout;
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
        health = 50;
    }

    public String toString() {
        return  this.name;
    }
}
