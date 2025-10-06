/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsipbo.sistemgamerpg;

/**
 *
 * @author user
 */
public class Archer extends GameCharacter {
    public Archer(String name, int level, int maxHealth, int attackPower) {
        super(name, level, maxHealth, attackPower);
    }


    @Override
    public void attack() {
        System.out.println(getName() + " menyerang dengan panah tajam! Damage: " + getAttackPower());
    }


    @Override
    public void heal() {
        // Archer heal: sederhana (bandage)
        int healAmount = 15 + getLevel() * 2;
        changeHealth(healAmount);
        System.out.println(getName() + " mengompres lukanya, HP bertambah +" + healAmount + "!");
    }


    @Override
    public void grind() {
        System.out.print(getName() + " berlatih ketepatan menembak... ");
        boolean success = coinFlip();
        if (success) {
            int inc = 6 + getLevel();
            changeAttack(inc);
            System.out.println("BERHASIL! ATK +" + inc + " jadi " + getAttackPower());
        } else {
            int dec = 2;
            changeAttack(-dec);
            System.out.println("GAGAL... ATK -" + dec + " jadi " + getAttackPower());
        }
    }
}
