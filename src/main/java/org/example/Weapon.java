package org.example;

public enum Weapon {
    SWORD(30,4),
    AXE(40,2),
    ARROW(25,5),;

    private int damage;
    private double attackSpeed;
    Weapon(int damage, double attackSpeed){
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }
public int getDamage(){
        return this.damage;
}
public double getAttackSpeed(){
        return this.attackSpeed;
}
}
