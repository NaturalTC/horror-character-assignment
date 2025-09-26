package model;

/**
 * Abstract base class for all horror characters.
 * Each character has a name, health, vulnerabilities, and mana.
 */
public abstract class HorrorCharacter {

    // Character attributes
    private String name;
    private int health;
    private int maxHealth;
    private int mana;
    private int maxMana;
    private Vulnerability[] vulnerabilities;

    /**
     * Constructor for a HorrorCharacter with health and optional mana.
     * @param name   Name of the character.
     * @param health Initial health value.
     * @param mana   Initial mana value.
     */
    public HorrorCharacter(String name, int health, int mana) {
        this.name = name;
        this.health = health;
        this.maxHealth = health;
        this.mana = mana;
        this.maxMana = mana;
        this.vulnerabilities = Vulnerability.values(); // default: all vulnerabilities
    }

    /**
     * Abstract method for attacking another character.
     *
     */
    public abstract void attack();

    /**
     * Abstract method for fleeing from battle.
     */
    public abstract void flee();

    /**
     * Returns the vulnerabilities of the character.
     * @return Array of Vulnerability enums.
     */
    public Vulnerability[] getVulnerabilities() {
        return vulnerabilities;
    }

    /**
     * Sets the vulnerabilities of the character.
     * @param vulnerabilities Array of Vulnerability enums.
     */
    public void setVulnerabilities(Vulnerability[] vulnerabilities) {
        this.vulnerabilities = vulnerabilities;
    }


    /**
     * Returns the name of the character.
     * @return Name of the character.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the current health of the character.
     * @return Current health value.
     */
    public int getHealth() {
        return health;
    }

    /**
     * Returns the current mana of the character.
     * @return Current mana value.
     */
    public int getMana() {
        return mana;
    }

    /**
     * Sets the mana of the character.
     * @param mana New mana value.
     */
    public void setMana(int mana) {
        this.mana = mana;
    }

    /**
     * Sets the name of the character.
     * @param name New name for the character.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the health of the character.
     * @param health New health value.
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Apply damage to this character, reducing health.
     *
     * @param damage Amount of damage to take.
     */
    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
        System.out.println(name + " takes " + damage + " damage! Remaining health: " + health);
    }


}
