package model;

public class HeroCharacter {
    // Attributes
    private String name;
    private int health;
    private int maxHealth;
    private int mana;
    private int maxMana;
    private Vulnerability[] vulnerabilities;

    /**
     * Constructor for a HorrorCharacter with health and optional mana.
     *
     * @param name   Name of the character.
     * @param health Initial health value.
     * @param mana   Initial mana value.
     *
     */
    public HeroCharacter(String name, int health, int mana) {
        this.name = name;
        this.health = health;
        this.maxHealth = health;
        this.mana = mana;
        this.maxMana = mana;
        this.vulnerabilities = Vulnerability.values(); // default: all vulnerabilities
    }
    /**
     * Consume mana for special attacks or abilities.
     *
     * @param amount Mana cost.
     * @return True if mana was enough and deducted; false otherwise.
     */
    public boolean useMana(int amount) {
        if (mana >= amount) {
            mana -= amount;
            return true;
        } else {
            System.out.println(name + " does not have enough mana!");
            return false;
        }
    }

    /**
     * Restore mana, cannot exceed maxMana.
     *
     * @param amount Amount of mana to restore.
     */
    public void restoreMana(int amount) {
        mana = Math.min(maxMana, mana + amount);
    }

    /**
     * Restore health, cannot exceed maxHealth.
     *
     * @param amount Amount of health to restore.
     */
    public void restoreHealth(int amount) {
        health = Math.min(maxHealth, health + amount);
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
