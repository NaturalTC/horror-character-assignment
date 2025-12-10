package model;

import interfaces.Transformable;

/**
 * Werewolf class, a type of HorrorCharacter that can transform into a human.
 * Werewolves are vulnerable to sunlight and silver.
 */
public class Werewolf extends HorrorCharacter implements Transformable
{

    // State to track transformation
    private boolean transformed = false;

    /**
     * Constructor
     * @param name name of the werewolf
     * @param health health of the werewolf
     * @param mana mana of the werewolf
     */
    public Werewolf(String name, int health, int mana)
    {
        super(name, health, mana);

        // Werewolves are vulnerable to sunlight and silver
        setVulnerabilities(new Vulnerability[] {
                Vulnerability.SUNLIGHT,
                Vulnerability.SILVER
        });
    }

    /**
     * Attack method, behavior changes based on transformation state.
     */
    @Override
    public void attack()
    {
        if (transformed) {
            System.out.printf("%s throws a weak human punch!\n", getName());
        } else {
            System.out.printf("%s jumps onto enemy and maws them!\n", getName());
        }
    }

    /**
     * Flee method
     */
    @Override
    public void flee()
    {
        System.out.printf("%s evades the conflict!\n", getName());
    }

    /**
     * Transform method, turn into werewolf
     * Transforming into a werewolf give you 69 health, transforming back subtracts 69 health
     * If health is 0 or below, transformation is not possible because your dead mate
     */
    @Override
    public void transform()
    {
        if (getHealth() <= 0) {
            System.out.printf("%s you are dead! You cannot transform.\n", getName());
        } else if (transformed) {
            System.out.printf("%s transformed back into normal form!\n", getName());
            setHealth(getHealth() - 69);
            transformed = false;
        } else {
            System.out.printf("%s is transformed into a werewolf!\n", getName());
            setHealth(getHealth() + 69);
            transformed = true;
        }
    }
}
