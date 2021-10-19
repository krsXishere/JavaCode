/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
class Player{
        String nickName;
        double healthPoint;
        int level;
        
        Weapon weapon;
        Armor armor; 
        
        Player(String nickName, double healthPoint){
            this.nickName = nickName;
            this.healthPoint = healthPoint;
        }
        
        void attack(Player opponent){
            double attackPower = this.weapon.damagePower;
            System.out.println(this.nickName + " attcking " + opponent.nickName + " with power " + attackPower);
            opponent.defense(attackPower);
        }
        
        void defense(double attackPower){      
            double damage;
            if (this.armor.defensePower < attackPower){
                damage = attackPower - this.armor.defensePower;
            } else {
                damage = 0;
            }
            this.healthPoint -= damage;
            System.out.println(this.nickName + " gets damage " + attackPower);
        }
        
        void equipWeapon(Weapon weapon){
            this.weapon = weapon;
        }
        
        void equipArmor(Armor armor){
            this.armor = armor;
        }
        
        void display(){
            System.out.println("Nickname : " + this.nickName);
            System.out.println("Health Point : " + this.healthPoint);
            this.weapon.display();
            this.armor.display();
        }
    }
    
    class Weapon{
        String name;
        double damagePower;
        
        Weapon(String name, double damagePower){
            this.name = name;
            this.damagePower = damagePower;
        }
        
        void display(){
            System.out.println("Senjata : " + this.name + ", Damage : " + this.damagePower);
        }
    }
    
    class Armor{
        String name;
        double defensePower;
        
        Armor(String name, double defensePower){
            this.name = name;
            this.defensePower = defensePower;
        }
        
        void display(){
            System.out.println("Zirah : " + this.name + ", Damage : " + this.defensePower);
        }
    }

public class Game {
    public static void main(String[] args) {
        Player player1 = new Player("Ikis", 100);
        Player player2 = new Player("Chala", 100);
        Weapon arrow = new Weapon("Panah", 16);
        Weapon sword = new Weapon("Pedang", 20);
        Armor paperArmor = new Armor("Zirah Kertas", 13);
        Armor ironArmor = new Armor("Zirah Besi", 15);
        
        player1.equipWeapon(arrow);
        player1.equipArmor(paperArmor);
        player1.display();
        player2.equipWeapon(sword);
        player2.equipArmor(ironArmor);
        player2.display();
        
        System.out.println("\nWAR");
        System.out.println("\nMatch 1\n");
        player1.attack(player2);
        player1.display();
        player2.display();
        System.out.println("\nMatch 2\n");
        player2.attack(player1);
        player1.display();
        player2.display();
    }  
}
