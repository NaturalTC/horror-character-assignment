package model;

import interfaces.Transformable;

public class Werewolf extends HorrorCharacter implements Transformable {

    public Werewolf(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack() {
        System.out.println(name + " lunges at its victim with sharp claws!");
    }

    @Override
    public void flee() {
        System.out.println(name + " howls and runs away into the forest!");
    }

    @Override
    public void transform() {
        System.out.println(name + " transforms into a fearsome werewolf!");
        // Change attack behavior when transformed
    }

}
