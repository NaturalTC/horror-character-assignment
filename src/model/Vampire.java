package model;

import interfaces.Transformable;

public class Vampire extends HorrorCharacter implements Transformable {

    public Vampire(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack() {
        System.out.println(name + " bites its victim!");
    }

    @Override
    public void flee() {
        System.out.println(name + " flees swiftly into the shadows!");
    }

    @Override
    public void transform() {
        if (health <= 0) {
            System.out.println(name + " is too weak to transform.");
        } else {
            System.out.println(name + " transforms into a bat!");
            name = "Bat-" + name;
            health = health - 10;
        }
    }
}
