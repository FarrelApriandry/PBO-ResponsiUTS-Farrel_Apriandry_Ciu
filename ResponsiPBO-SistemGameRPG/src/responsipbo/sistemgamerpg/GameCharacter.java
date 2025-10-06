package responsipbo.sistemgamerpg;

import java.util.Random;

public abstract class GameCharacter {
    private String name;
    private int level;
    private int health;
    private int maxHealth;
    private int attackPower;


    private Random rand = new Random();


    public GameCharacter(String name, int level, int maxHealth, int attackPower) {
        this.name = name;
        this.level = level;
        this.maxHealth = maxHealth;
        this.health = maxHealth; // start full HP
        this.attackPower = Math.max(1, attackPower);
    }


    // Getter & Setter (enkapsulasi)
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }


    public int getLevel() { return level; }
    public void setLevel(int level) { this.level = Math.max(1, level); }


    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = Math.max(0, Math.min(health, maxHealth)); }


    public int getMaxHealth() { return maxHealth; }
    public void setMaxHealth(int maxHealth) { this.maxHealth = Math.max(1, maxHealth); }


    public int getAttackPower() { return attackPower; }
    public void setAttackPower(int attackPower) { this.attackPower = Math.max(1, attackPower); }


    // Method abstrak yang menunjukkan polimorfisme
    public abstract void attack();
    public abstract void heal();
    public abstract void grind();


    // Utility: tampilkan status karakter
    public void showStatus() {
        System.out.println(getName() + " (Level " + getLevel() + ") - HP: " + getHealth() + "/" + getMaxHealth() + " | ATK: " + getAttackPower());
    }


    // Helper: coin flip 50:50
    protected boolean coinFlip() { return rand.nextBoolean(); }


    // Helper untuk mengubah attackPower dengan batas minimum 1
    protected void changeAttack(int delta) {
        int newAtk = Math.max(1, getAttackPower() + delta);
        setAttackPower(newAtk);
    }


    // Helper untuk mengubah health dan menjaga batas 0..maxHealth
    protected void changeHealth(int delta) {
        setHealth(getHealth() + delta);
    }
}
