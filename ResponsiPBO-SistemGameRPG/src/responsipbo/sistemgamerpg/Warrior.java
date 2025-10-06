package responsipbo.sistemgamerpg;

public class Warrior extends GameCharacter {
    
    public Warrior(String name, int level, int maxHealth, int attackPower) {
        super(name, level, maxHealth, attackPower);
    }


    @Override
    public void attack() {
        System.out.println(getName() + " menyerang dengan pedang! Damage: " + getAttackPower());
    }


    @Override
    public void heal() {
        // Warrior heal: pakai ramuan -> moderate heal
        int healAmount = 20 + getLevel() * 2;
        changeHealth(healAmount);
        System.out.println(getName() + " menggunakan ramuan pertempuran, HP bertambah +" + healAmount + "!");
    }


    @Override
    public void grind() {
        System.out.print(getName() + " grinding (latihan keras)... ");
        boolean success = coinFlip(); // 50:50
        if (success) {
        int inc = 5 + getLevel();
        changeAttack(inc);
        System.out.println("BERHASIL! ATK +" + inc + " jadi " + getAttackPower());
        } else {
        int dec = 3;
        changeAttack(-dec);
        System.out.println("GAGAL... ATK -" + dec + " jadi " + getAttackPower());
        }
    }
}
