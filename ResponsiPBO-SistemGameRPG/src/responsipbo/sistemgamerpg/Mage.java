package responsipbo.sistemgamerpg;

public class Mage extends GameCharacter {
    public Mage(String name, int level, int maxHealth, int attackPower) {
        super(name, level, maxHealth, attackPower);
    }


    @Override
    public void attack() {
        System.out.println(getName() + " menyerang dengan bola api! Damage: " + getAttackPower());
    }


    @Override
    public void heal() {
        // Mage heal: sihir -> lebih besar
        int healAmount = 25 + getLevel() * 3;
        changeHealth(healAmount);
        System.out.println(getName() + " memanggil mantra penyembuhan, HP bertambah +" + healAmount + "!");
    }


    @Override
    public void grind() {
        System.out.print(getName() + " meditasi mencari pencerahan... ");
        boolean success = coinFlip();
        if (success) {
            int inc = 7 + getLevel();
            changeAttack(inc);
            System.out.println("BERHASIL! ATK +" + inc + " jadi " + getAttackPower());
        } else {
            int dec = 4;
            changeAttack(-dec);
            System.out.println("GAGAL... ATK -" + dec + " jadi " + getAttackPower());
        }
    }
}
