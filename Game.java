package game;

public class Game {

    public static void main(String[] args) {
        
        player hero = new player();
        player enemy = new player();
        
        hero.enemy = enemy;
        enemy.enemy = hero;
           
        hero.name = "gunnakam";
        hero.hp = 100;
        hero.speed = 99;
        hero.dmg = 200;
        hero.armor = 15;
        hero.defense = 10;
        
        enemy.name = "rusdi";
        enemy.hp = 50;
        enemy.speed = 50;
        enemy.dmg = 10;
        enemy.armor = 10;
        enemy.defense = 10;
        
        hero.run();  
        hero.attack(enemy.name);
        hero.damageTaken(hero.dmg);
        
        if(hero.isDead() || enemy.isDead()) {
            System.out.println("Game Over!");
        }
    }   
}
