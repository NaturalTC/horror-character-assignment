package model;

public abstract class HorrorCharacter {

    public String name;
    public int health;
    public Vulnerability[] vulnerabilities;

    public HorrorCharacter(String name, int health) {
        this.name = name;
        this.health = health;
        vulnerabilities = Vulnerability.values();
    }

    public abstract void attack();

    public abstract void flee();

    public Vulnerability[] getVulnerabilities() {
        return vulnerabilities;
    }

    public String getName() {
        return name;
    }

    public String getHealth() {
        return Integer.toString(health);
    }
}
