package com.company;

public class Medic extends Hero {
    public int healPoints;

    public Medic(int health, int damage, String typeOfSuperPower, int healPoints) {
        super(health, damage, typeOfSuperPower);
        this.healPoints=healPoints;
    }

    public void increaseExperience() {
        int c1 = healPoints / 10;
        healPoints = healPoints + c1;
        System.out.println("Medic experience increase by " + c1 + " points");
    }

    public void applySuperAbility() {
        System.out.println("Health: " + this.Health + " Damage: " + this.Damage+ " Medic activated ability: " + this.typeOfSuperPower
                + " Heal points : " + this.healPoints);
    }

}
