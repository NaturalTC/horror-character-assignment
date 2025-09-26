package model;

import interfaces.Transformable;
import java.util.Scanner;

/**
 * Vampire class, a type of HorrorCharacter that can transform into a bat.
 * Vampires are vulnerable to sunlight and holy water.
 */
public class Vampire extends HorrorCharacter implements Transformable {

    // State to track transformation
    private boolean transformed = false;

    /**
     * Constructor
     * @param name
     * @param health
     * @param mana
     */
    public Vampire(String name, int health, int mana) {
        super(name, health, mana);

        // Vampires are vulnerable to sunlight and holy water
        setVulnerabilities(new Vulnerability[] {
                Vulnerability.SUNLIGHT,
                Vulnerability.HOLY_WATER
        });
    }

    /**
     * Attack method, behavior changes based on transformation state.
     */
    @Override
    public void attack() {
        if (transformed) {
            System.out.println(getName() + " swoop down and use bite strike!\n");
        } else {
            System.out.println(getName() + " uses dark vampire magic on enemy!\n");
        }
    }

    /**
     * Flee method
     */
    @Override
    public void flee() {
        System.out.println(getName() + " quickly vanishes into the night!\n");
    }

    /**
     * Transform method, toggles between vampire and bat forms.
     * Transforming into a bat reduces health by 10, transforming back restores 10 health
     * if health is above 0.
     * If health is 0 or below, transformation is not possible.
     */
    @Override
    public void transform() {
        if (getHealth() <= 0) {
            System.out.println(getName() + " you are dead! You cannot transform.\n");
        } else if (transformed) {
            System.out.println(getName() + " is transformed back into a vampire!\n");
            setName(getName().replace("Bat-", ""));
            setHealth(getHealth() + 10);
            transformed = false;
        } else {
            System.out.println(getName() + " transforms into a bat!\n");
            setName("Bat-" + getName());
            setHealth(getHealth() - 10);
            transformed = true;
        }
    }
}
