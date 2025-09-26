import model.*;
import interfaces.Transformable;
import java.util.*;

/*
Name  : Jose Jimenez
Date  : 09 22 2025
Class : Prog Design
Problem  : Assignment #1
 */

public class HorrorCharacterApp {
    public static void main(String[] args) {
        /*
           1st - Create at least two classes that extend the abstract base class model.HorrorCharacter.
                 Each subclass should implement the abstract methods attack() and flee().
                 For example, you might create classes like model.Vampire and model.Werewolf.

                 - Complete

            2nd - Create an interface Interfaces.Transformable with a method void transform();.
                    Implement the Interfaces.Transformable interface for the model.Vampire and model.Werewolf classes.
                    When transformed, the attack() methods of these creatures should change

                - Complete

            3rd - Create a simple text-based game loop in a class named HorrorCharacterApp.
                    The player should be able to choose actions like "attack", "flee", or "transform" (if applicable).
                    The game should allow navigation between different horror characters (e.g., moving to the next or previous character).
                    Use a List to manage multiple horror characters and allow the player to encounter them one by one.

                - In Progress

            4th - Implement a battle system where the player can fight against different horror characters.

                - In Progress

            5th - Ensure proper encapsulation and use of access modifiers for class fields and methods.
                    Use constructors to initialize character attributes.
                    Include error handling for invalid inputs during the game loop.

                - Complete (mostly)

            6th - Add comments and documentation to explain the purpose of classes, methods, and
                    any complex logic within the code.

                - Complete

            7th - Optional: Implement a simple leveling system where characters gain experience points (XP)
                    for defeating enemies and can level up to increase their health or mana.

                - Not Started

            8th - Optional: Implement a simple scoring system that rewards the player for defeating enemies
                    and penalizes for fleeing.

                - Not Started

            9th - Optional: Add a mana system where certain attacks or transformations consume mana.
                    Characters should have a limited amount of mana that regenerates over time or through specific actions.

                - In Progress

            10th - Optional: Create a simple inventory system where players can collect items that provide
                            buffs or healing during battles.

                 - Not Started
         */

        /**
        * My test application to demonstrate the HorrorCharacter hierarchy and polymorphism.
        */

        // Create a list of horror characters
        List<HorrorCharacter> horrorList = new ArrayList<>();
        horrorList.add(new Vampire("Alucard", 80, 30));
        horrorList.add(new Werewolf("Fenrir", 90, 25));
        horrorList.add(new Zombie("Walker", 70, 0));

        // Demonstrate polymorphism and method overriding
        System.out.println("\nDemonstrating inheritance:\n");
        for (HorrorCharacter hc : horrorList) {
            System.out.println(hc.getName() + " attacks:");
            hc.attack();
            System.out.println(hc.getName() + " flees:");
            hc.flee();

            // Prints the vulnerabilities if the character has them
            System.out.println(hc.getName() + " vulnerabilities:");
            for (Vulnerability v : hc.getVulnerabilities()) {
                System.out.println("- " + v);
            }
            System.out.println("\n");

            // If the character is transformable, demonstrate transformation
            if (hc instanceof Transformable t) {
                System.out.println(hc.getName() + " transforms:");
                t.transform();
                System.out.println(hc.getName() + " attacks after transforming:");
                hc.attack();

                // Transform back logic can be uncommented if needed
//                System.out.println(hc.getName() + " transforms back:");
//                t.transform();
//                System.out.println(hc.getName() + " attacks after transforming back:");
//                hc.attack();
            }

            // Clean up print statements
            System.out.println("---\n");
        }
    }
}
