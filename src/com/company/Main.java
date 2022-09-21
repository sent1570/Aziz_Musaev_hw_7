package com.company;

public class Main {

    public static void main(String[] args) {
        Magic Magic = new Magic(210,30,"Weather Control");
        Warrior Warrior = new Warrior(220,25,"Critical Damage");
        Medic Medic = new Medic(200,20,"Recovery",40);
        HavingSuperAbility[] Heroes = {Magic, Warrior, Medic};
        for (int i = 0; i < Heroes.length; i++) {
            Heroes[i].applySuperAbility();
            if (Heroes[i] instanceof Medic) {
                ((Medic) Heroes[i]).increaseExperience();
            }
        }
        System.out.println("Health: " + Magic.Health + " Damage: " + Magic.Damage + " Magic activated ability: " + Magic.typeOfSuperPower);
        System.out.println("Health: " + Warrior.Health + " Damage: " + Warrior.Damage + " Warrior activated ability: " + Warrior.typeOfSuperPower);
        System.out.println("Health: " + Medic.Health + " Damage: " + Medic.Damage + " Medic activated ability: " + Medic.typeOfSuperPower
                + " Heal points : " + Medic.healPoints);
    }

}
