package com.company;

public class Warrior extends Hero {

    public Warrior(int health, int damage, String typeOfSuperPower) {
        super(health, damage, typeOfSuperPower);
    }

    public  void applySuperAbility(){
        System.out.println("Health: " + this.Health + " Damage: " + this.Damage+ " Warrior activated ability: " + this.typeOfSuperPower);
    }
}
