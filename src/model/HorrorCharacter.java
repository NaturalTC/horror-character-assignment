// Define a base abstract class HorrorCharacter with the following attributes and methods:
//  - void attack() - Basic attack action.
//  - void flee() - Action when the character flees from danger.
//  - Vulnerability[] getVulnerabilities() - Return the vulnerabilities of the character.
//
//  - String name
//  - int health
//  - Vulnerability[] vulnerabilities

public abstract class HorrorCharacter {

    protected String name;
    protected int health;
    protected Vulnerability[] vulnerabilities;

    public HorrorCharacter(String name, int health, Vulnerability[] vulnerabilities) {
        this.name = name;
        this.health = health;
        this.vulnerabilities = vulnerabilities;
    }

    public abstract void attack();

    public abstract void flee();

    public Vulnerability[] getVulnerabilities() {
        return vulnerabilities;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
