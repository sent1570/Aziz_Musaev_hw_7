package com.company;

public abstract class Hero implements HavingSuperAbility {
    public int Health;
    public int Damage;
    public String typeOfSuperPower;

    public Hero(int health, int damage, String typeOfSuperPower) {
        Health = health;
        Damage = damage;
        this.typeOfSuperPower = typeOfSuperPower;
    }
}
