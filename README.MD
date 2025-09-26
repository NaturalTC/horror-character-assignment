# HorrorCharacterApp

## Overview

**HorrorCharacterApp** is a simple Java RPG-inspired console application that demonstrates **object-oriented programming concepts** including inheritance, polymorphism, and interfaces. Players can interact with various horror movie characters such as Vampires, Zombies, and Werewolves, each with unique behaviors and abilities.

The application showcases:

* **Inheritance**: All characters extend the abstract `HorrorCharacter` class.
* **Polymorphism**: Characters are stored in a list typed to the parent class and act according to their subclass implementations.
* **Interfaces**: Certain characters (e.g., Vampire, Werewolf) implement the `Transformable` interface to change behavior dynamically.
* **Gameplay mechanics**: Health, mana, multiple attack moves, and transformation abilities. (In Progress)

---

## Features

* **Characters**

    * **Vampire**: Can transform into a bat, uses mana for special attacks.
    * **Zombie**: Simple attacks, low health, vulnerable to fire.
    * **Werewolf**: Powerful attacks, can transform to increase damage.

* **Combat System**

    * Attack, flee, and transform actions.
    * Mana-based attack system for special moves. (In Progress)
    * Health management and damage tracking. (In Progress)

* **Test/Demo Class**

    * `HorrorCharacterApp` demonstrates polymorphism and class functionality

---

## Project Structure

```
src/
 ├── model/
 │     ├── HorrorCharacter.java
 │     ├── Vampire.java
 │     ├── Zombie.java
 │     └── Werewolf.java
 ├── interfaces/
 │     └── Transformable.java
 └── HorrorCharacterApp.java  # Test class demonstrating polymorphism
```

---

## How to Run

1. **Clone the repository**:

```bash
git clone https://github.com/NaturalTC/HorrorCharacterApp.git
cd HorrorCharacterApp
```

2. **Compile all Java files**:

```bash
javac src/model/*.java src/interfaces/*.java src/game/*.java src/HorrorCharacterApp.java
```

3. **Run the test class**:

```bash
java -cp src HorrorCharacterApp
```

---

## Notes

* This project is intended for **learning purposes** — focusing on OOP concepts in Java.
* Adding new characters or attacks is straightforward by extending `HorrorCharacter` or updating the attack enums.
* The console-based input allows testing of **attack, flee, and transform mechanics**. (In Progress)

---

## License

This project is open source and free to use for educational purposes.
