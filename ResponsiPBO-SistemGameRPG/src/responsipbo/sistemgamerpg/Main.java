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
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Simulasi Karakter Game (Responsi UTS) ===\n");


        GameCharacter w = new Warrior("Ragnar", 1, 120, 50);
        GameCharacter m = new Mage("Lyra", 1, 90, 60);
        GameCharacter a = new Archer("Elda", 1, 100, 45);


        // Status awal
        System.out.println(">>> STATUS AWAL");
        w.showStatus();
        m.showStatus();
        a.showStatus();
        System.out.println();


        // Grinding
        System.out.println(">>> GRINDING (Random 50:50)");
        w.grind();
        m.grind();
        a.grind();
        System.out.println();


        // Status setelah grinding
        System.out.println(">>> STATUS SETELAH GRIND");
        w.showStatus();
        m.showStatus();
        a.showStatus();
        System.out.println();


        // Healing (polymorphic)
        System.out.println(">>> HEALING (Polymorphic)");
        w.heal();
        m.heal();
        a.heal();
        System.out.println();


        // Status akhir
        System.out.println(">>> STATUS AKHIR");
        w.showStatus();
        m.showStatus();
        a.showStatus();
        System.out.println();


        // Demo attack
        System.out.println(">>> ATTACK DEMO");
        w.attack();
        m.attack();
        a.attack();
    }    
}
