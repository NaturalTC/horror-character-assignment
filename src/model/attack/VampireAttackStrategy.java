package model.attack;

import model.HorrorCharacter;
/**
 * Strategy class for Vampire attacks.
 */
public class VampireAttackStrategy {
    public void attack(HorrorCharacter target, VampireAttackType type) {
        switch (type) {
            case BITE:
                target.takeDamage(30);
                break;
            case HYPNOTIZE:
                target.takeDamage(10);
                break;
            case DRAIN_BLOOD:
                target.takeDamage(20);
                break;
        }
    }
}

