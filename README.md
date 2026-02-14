<div align="center">

# ⚔️ MasterQuest: A Journey Through Darkness

**Where old-school dungeon crawling meets modern Object-Oriented Programming.** A text-based, turn-based RPG built with clean Java architecture, strategic combat, hidden secrets, and player agency at its core.

</div>

## 💡 Description

I built MasterQuest to demonstrate that **simplicity doesn't mean sacrificing quality**. This is a classic text-based RPG that proves you can create an engaging, atmospheric game while maintaining clean OOP principles, proper separation of concerns, and thoughtful game design.

Step into a dark dungeon where every choice matters. Battle fierce enemies, solve ancient puzzles, uncover hidden secrets, and face the Lord of Shadow in an epic final confrontation. But beware—death is swift, and the wrong answer can mean instant doom.

This isn't just a simple text game—it's a showcase of **Object-Oriented Design**, **turn-based combat mechanics**, **branching narratives**, and **player choice**, proving that even terminal-based games can deliver depth and atmosphere.

### Key Design Highlights:

- **Clean OOP Architecture:** Proper class hierarchy with `Enemy` superclass extended by `Goblin`, `Firedemon`, and `FinalBoss`. Separate `Hero`, `Weapon`, `Key`, and `Room` entities following single-responsibility principles.
- **Separation of Concerns:** The `Messages` class handles all narrative text, `GameLogic` manages game flow and state, and entity classes focus on their domain responsibilities. No spaghetti code here.
- **Turn-Based Combat System:** Strategic weapon selection with damage ranges. Choose your weapon wisely—different enemies require different tactics.
- **Player Choice & Consequences:** Multiple decision points with real stakes. Puzzles with instant-death penalties, optional secrets (like the angel statue buff), and branching paths.
- **Atmospheric Storytelling:** Over 1000 lines of carefully crafted narrative text that builds tension, creates ambiance, and makes you *feel* the dungeon's darkness.
- **Hidden Secrets:** Discover the four-element puzzle, unlock divine blessings, and find optional power-ups that make the difference between victory and oblivion.
- **Progressive Difficulty:** Three major boss battles with escalating challenge—from the goblin Azak (100 HP) to the firedemon Banzkar (300 HP) to the Lord of Shadow himself (1000 HP).
- **State Management:** Boolean flags and integer counters track player progress, room visits, puzzle solutions, and weapon limitations across the entire campaign.

---

## 🧰 Tech Stack

<p align="center">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" width="40" height="40" alt="Java" title="Java 21 (The Foundation)"/>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/maven/maven-original.svg" width="40" height="40" alt="Maven" title="Maven (Dependency Management)"/>
  <img src="https://img.icons8.com/color/48/000000/console.png" width="40" height="40" alt="Terminal" title="Terminal (The Canvas)"/>
</p>

---

## 🎯 Features

### ⚔️ Turn-Based Combat

- **Strategic Weapon System:** Choose from Dagger, Fireball, Truestriker, and the legendary HolyHymn
- **Damage Ranges:** Each weapon has min/max damage using RNG for combat variety
- **Enemy AI:** Enemies attack with randomized damage, testing your health management
- **Weapon Progression:** Unlock more powerful weapons by defeating bosses and solving puzzles

### 🧩 Puzzles & Secrets

- **Riddles with Consequences:** Answer incorrectly and face instant death
- **Mathematical Challenges:** The golden chamber's equation demands cleverness
- **Element Puzzle:** Discover the four-element secret to unlock divine power
- **Hidden Buffs:** The angel statue grants those worthy with supreme vitality (200 HP)
- **Limited Resources:** The HolyHymn can only be used twice against the firedemon—use it wisely

### 🗺️ Multi-Floor Dungeon

- **Entrance Hall:** Your journey begins in the abandoned fortress
- **West & East Rooms (Floor 1):** Face puzzles and the goblin Azak
- **Upper Floor:** Mystical chambers, a firedemon guardian, and the glowing angel statue
- **Throne of Eternal Darkness:** The final confrontation with the Lord of Shadow

### 🎭 Player Agency

- **Multiple Paths:** Reach the final boss with or without the divine buff (but good luck without it!)
- **Choices Matter:** Your answers determine life or death, power or weakness
- **Optional Content:** The angel statue buff is hidden—only clever players find it
- **Persistent World:** Return to previous rooms and revisit locations freely

### 📖 Atmospheric Narrative

- **1000+ Lines of Story Text:** Every room drips with atmosphere
- **Boss Introductions:** Dramatic encounters with named enemies
- **Victory & Defeat Scenes:** Unique endings based on your performance
- **Environmental Storytelling:** Discover clues and lore through room descriptions

---

## 🖼️ Screenshots

<p align="center">
  <img src="src/main/java/com/masterquest/images/masterquestlogo.png" alt="Screenshot 1: MasterQuest Artwork" width="800">
</p>
<p align="center">
  <strong>Screenshot 1:</strong> The spirit of MasterQuest—old-school dungeon crawling meets pixel-art nostalgia.
</p>

<p align="center">
  <img src="src/main/java/com/masterquest/images/masterquestterminal.png" alt="Screenshot 2: Gameplay in Terminal" width="800">
</p>
<p align="center">
  <strong>Screenshot 2:</strong> The game in action—turn-based combat against the firedemon Banzkar.
</p>

---

## ⚙️ How to Play

### Prerequisites

You'll need:

- **Java 21 JDK** (or later)
- **Maven 3.6+** (for dependency management)
- A terminal emulator (PowerShell, Bash, CMD, etc.)

### Installation & Startup

```bash
# 1. Clone the repository
git clone https://github.com/yourusername/Masterquest
cd Masterquest

# 2. Compile the project
mvn clean compile

# 3. Run the game
mvn exec:java -Dexec.mainClass="com.masterquest.App"

# Alternative: Package and run the JAR
mvn clean package
java -jar target/masterquest-1.0-SNAPSHOT.jar
```

### Gameplay Tips

- **Read carefully:** Clues are hidden in room descriptions
- **Manage your health:** Each boss hits harder than the last
- **Explore everything:** Secrets reward the curious
- **Choose weapons wisely:** Some fights demand specific strategies
- **The buff matters:** Don't skip the angel statue puzzle if you want to win

---

## 🏗️ Project Architecture

```
Masterquest/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── masterquest/
│   │               ├── App.java              # Entry point
│   │               ├── GameLogic.java        # Game flow & state management
│   │               ├── Messages.java         # All narrative text (1000+ lines)
│   │               ├── Hero.java             # Player class with combat logic
│   │               ├── Enemy.java            # Abstract enemy base class
│   │               ├── Goblin.java           # First boss (100 HP)
│   │               ├── Firedemon.java        # Second boss (300 HP)
│   │               ├── FinalBoss.java        # Lord of Shadow (1000 HP)
│   │               ├── Weapon.java           # Weapon entity with damage ranges
│   │               ├── Key.java              # Key items for progression
│   │               ├── Room.java             # Room entity (currently unused)
│   │               └── images/               # Artwork & screenshots
│   └── test/
│       └── java/
│           └── com/
│               └── masterquest/
│                   └── AppTest.java          # Unit tests
├── pom.xml                                    # Maven configuration
└── README.md                                  # This file
```

### Class Responsibilities

**Entity Classes:**

- `Hero`: Player stats (health, weapons, keys), damage calculation, weapon selection UI
- `Enemy`: Abstract base with health, name, attack logic
- `Goblin`, `Firedemon`, `FinalBoss`: Concrete enemy implementations with unique stats
- `Weapon`: Damage ranges, RNG-based damage calculation
- `Key`: Simple item entity for unlocking progression

**Game Logic:**

- `GameLogic`: Central controller managing game state, room navigation, combat loops, puzzles, and win/lose conditions
- `Messages`: Presentation layer containing all narrative text, room descriptions, boss intros, and ending sequences

**Entry Point:**

- `App`: Main method that instantiates `GameLogic` and starts the adventure

---

## 🎮 Game Design Deep Dive

### Turn-Based Combat Mechanics

Combat follows a structured loop:

1. Player chooses a weapon from their inventory
2. Weapon deals randomized damage within its range (e.g., Fireball: 30-40 dmg)
3. Enemy counterattacks with their damage range
4. Repeat until one combatant reaches 0 HP

**Weapon Progression:**

- **Dagger** (2-5 dmg): Starting weapon, ineffective against bosses
- **Fireball** (30-40 dmg): Unlocked after defeating Azak
- **Truestriker** (30-50 dmg): Found in the upper floor
- **HolyHymn** (100-150 dmg + healing): Rewards solving the math puzzle, limited uses

### State Management System

The game tracks 10+ boolean flags:

- `entrance`, `basement`, `upperFloor` (room states)
- `upperWestRoom`, `upperEastRoom` (puzzle completion)
- `angelBuff` (divine blessing status)
- `upperNorthGate` (final boss access)
- `holyHymnUsesAgainstDemon` (resource limitation)

This creates a persistent world where actions have consequences and progression feels earned.

### The Angel Buff Secret

The game's best-kept secret:

1. Defeat the firedemon in the east room
2. Discover the cryptic clue: "Fire, earth, air...."
3. Approach the angel statue
4. Speak the missing element: "Water"
5. Gain full healing (200 HP) and a divine combat buff (500 dmg per strike)

**Without this buff, the final boss is nearly impossible to defeat.** This teaches players to explore thoroughly and rewards observation.

---

## 📝 Code Quality Features

**Object-Oriented Principles:**

- **Inheritance:** `Enemy` → `Goblin`, `Firedemon`, `FinalBoss`
- **Encapsulation:** Private fields with public methods
- **Polymorphism:** `enemyDamage()` method works across all enemy types
- **Single Responsibility:** Each class has one clear purpose

**Clean Code Practices:**

- Descriptive variable names (`upperNorthGate`, `holyHymnUsesAgainstDemon`)
- Separation of UI (Messages) from logic (GameLogic)
- No magic numbers—damage values defined in constructors
- Consistent formatting and structure

**Game Design Patterns:**

- **State Machine:** Boolean flags control room access and progression
- **Factory Pattern:** Weapon creation with defined stats
- **Command Pattern:** User input drives all game actions
- **Observer Pattern:** Health tracking determines game state changes

---

## 🚀 Future Enhancements (Roadmap)

- [ ] Save/load system using file I/O
- [ ] Character classes (Warrior, Mage, Rogue) with unique abilities
- [ ] Inventory system with consumable items (potions, scrolls)
- [ ] More floors with additional bosses and challenges
- [ ] Multiple endings based on player choices
- [ ] Achievements/trophy system
- [ ] Difficulty modes (Easy/Normal/Hard)

---

## 👨‍💻 Author

**Nordtess**  
_Java Developer & Old-School RPG Enthusiast_

---

## 📜 License

This project is licensed under the MIT License—feel free to use it, learn from it, or extend it with your own dungeons!

---

<div align="center">

**Built with ⚔️ and a love for classic dungeon crawlers in Sweden 🇸🇪**

*"The darkness is broken. The tyrant is fallen. The world is free."*

</div>
