// Create three subclasses: Vampire, Zombie, and Werewolf, that extend the HorrorCharacter class. Feel free to add others if you choose.
//  - Provide a unique implementation for the attack() and flee() methods.
//  - Have vulnerabilities based on the Vulnerability enum (e.g., a Vampire might be vulnerable to SUNLIGHT and HOLY_WATER, while a Zombie might be vulnerable to FIRE and HOLY_WATER).
//  - Include unique behavior in the attack() method (e.g., a Vampire could bite its victim, a Zombie could lunge, etc.).

import Interfaces.Transformable;

public class Vampire extends HorrorCharacter implements Transformable {

    public Vampire(String name, int health, Vulnerability[] vulnerabilities) {
        super(name, health, vulnerabilities);
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
        System.out.println(name + " transforms into a bat!");
    }
}
