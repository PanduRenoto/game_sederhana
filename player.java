package game;

public class player {
    
    String name;
    int speed, hp, dmg, armor, damage, defense;
    player hero, enemy;
    
    void run() {
        System.out.println(name + " is running...");
        System.out.println("Speed: " + speed);
    }
    
    void attack(String a) {
        damage = Math.max(0, dmg - enemy.defense - enemy.defense);
        System.out.println(name + " is attacking..." + enemy.name);
        System.out.println("Damage: " + damage);
        enemy.damageTaken(damage);
    }
    
    void damageTaken(int damageMasuk) {
        int damageDealt = Math.max(0, damageMasuk - enemy.armor);
        hp -= damageDealt;
        System.out.println(enemy.name + " menerima " + damageDealt + " damage");
        System.out.println("HP tersisa dari " + enemy.name + ": " + enemy.hp);
    }
    
    boolean isDead() {
        return hp < 1;
    }
}