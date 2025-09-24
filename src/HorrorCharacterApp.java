import model.*;

import java.util.ArrayList;

public class HorrorCharacterApp {
    public static void main(String[] args) {
        // Create an ArrayList of HorrorCharacter (parent class)
        ArrayList<HorrorCharacter> horrorCharacters = new ArrayList<>();

        // Add different types of horror characters
        horrorCharacters.add(new Vampire("Dracula", 100));
        horrorCharacters.add(new Werewolf("Lycan", 120));
        horrorCharacters.add(new Zombie("Walker", 80));

    }
}
