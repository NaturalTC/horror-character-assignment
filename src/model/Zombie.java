package model;

import interfaces.Transformable;

public class Zombie extends HorrorCharacter implements Transformable {

    public Zombie(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack() {
        System.out.println(name + " lunges at its victim with a slow, relentless hunger!");
    }

    @Override
    public void flee() {
        System.out.println(name + " stumbles away aimlessly!");
    }

    @Override
    public void transform() {
        System.out.println(name + " transforms into a mindless zombie!");
    }
}
