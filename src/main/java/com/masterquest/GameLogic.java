package com.masterquest;

import java.util.Scanner;

public class GameLogic {

    private boolean running = true;
    Scanner myObj = new Scanner(System.in);
    Weapon Dagger = new Weapon("Dagger", 2, 5);
    Weapon Fireball = new Weapon("Fireball", 30, 40);
    Weapon Swordoftruth = new Weapon ("Truestriker", 30, 50);
    Weapon HolyHymn = new Weapon("HolyHymn", 100, 150);
    Messages theMessages = new Messages();
    Goblin theGoblin = new Goblin("Azak", 100);
    Firedemon theFiredemon = new Firedemon("Banzkar", 300);
    Key keyOne = new Key("keyOne");

    private boolean entrance = false;
    private boolean basement = false;
    private boolean westRoom = false;
    private boolean northRoomGate = false;
    private boolean upperFloor = false;
    private boolean upperWestRoom = false;
    private boolean upperEastRoom = false;
    private boolean angelBuff = false;


    public GameLogic() {

    }

    public void startGame() {
        while (running) {

            theMessages.printIntro();
            System.out.println("═════════════════════════════");
            System.out.println("    M A S T E R   Q U E S T    ");
            System.out.println("═════════════════════════════");
            System.out.println("- - - - - - - - - - - - - - -");
            System.out.println("- - - - - - - - - - - - - - -");

            

            boolean helpRules = true;
            while (helpRules) {
                theMessages.printHelp();
                System.out.println("- - - - - - - - - - - - - - -");
                System.out.println("- - - - - - - - - - - - - - -");
                System.out.println("Do you understand everything? (yes/no):");
                String answer = myObj.nextLine();
                String answer2 = answer.toLowerCase();

                switch (answer2) {
                    case "yes":
                        helpRules = false;
                        break;
                    case "no":
                        break;
                    default:
                        System.out.println("Please enter yes or no");
                        answer2 = myObj.nextLine();
                        break;
                }
                

            }

            
            System.out.println("- - - - - - - - - - - - - - -");
            System.out.println("- - - - - - - - - - - - - - -");
            System.out.println("What name do you carry, brave champion?");

            String heroName = myObj.nextLine();
            

            

            Hero myHero = new Hero(heroName);
            myHero.addHeroWeapon(Dagger);

            System.out.println("- - - - - - - - - - - - - - -");
            System.out.println("- - - - - - - - - - - - - - -");
            System.out.println("Welcome, " + heroName + "!");
            System.out.println("The realm cries out for a savior in this hour of desperation");
            System.out.println("Dark forces from beyond the veil have torn through our world");
            System.out.println("Creatures of nightmare now walk freely, spreading chaos and death");
            System.out.println("You, " + heroName + ", are humanity's last flickering hope");
            System.out.println("This ancient dungeon holds secrets and terrors untold");
            System.out.println("You must journey through its depths to confront the source of evil");
            System.out.println("Will you rise as the legendary hero we desperately need?");
            System.out.println("Or will you become just another lost soul in the darkness?");
            System.out.println("- - - - - - - - - - - - - - -");
            System.out.println("- - - - - - - - - - - - - - -");
            System.out.println("Will you accept this quest? (yes/no):");

            String doContinue = myObj.nextLine();

            boolean flag1 = true;

            while (flag1) {
                switch (doContinue) {
                case "yes":
                    flag1 = false;
                    break;
                case "no":
                    System.out.println("- - - - - - - - - - - - - - -");
                    System.out.println("You turn your back on destiny...");
                    System.out.println("The shadows grow longer as hope fades from the world");
                    System.out.println("Humanity is doomed to eternal darkness");
                    System.out.println("- - - - - - - - - - - - - - -");
                    flag1 = false;
                    running = false;
                    break;
                default:
                    System.out.println("Please enter yes or no:");
                    doContinue = myObj.nextLine();
                    break;
            }
            }

            if (!running) {
                continue;
            }
            System.out.println("- - - - - - - - - - - - - - -");
            System.out.println("- - - - - - - - - - - - - - -");
            System.out.println("Fresh from the Hero's Academy, " + heroName + ", your journey begins");
            System.out.println("Though young and untested, the fire of courage burns within you");
            myHero.printHeroHealth();
            myHero.printAllHeroWeapons();
            

            theMessages.printEntrance();

            String floorDirection = myObj.nextLine().toLowerCase();
            

            boolean floorOne = true;
            while (floorOne) {
                switch (floorDirection) {
                    case "east":
                        if (!basement) {
                            this.basement = true;
                            theMessages.eastRoom();
                            System.out.println("- - - - - - - - - - - - - - -");
                            System.out.println("- - - - - - - - - - - - - - -");
                            System.out.println("What weapon will you use against the enemy, hero?");

                            // Combat loop - continues until hero or goblin is defeated
                            while (myHero.health > 0 && theGoblin.health > 0) {
                                myHero.heroDamage(theGoblin, "");
                                if (theGoblin.health <= 0) {
                                    System.out.println("- - - - - - - - - - - - - - -");
                                    System.out.println("- - - - - - - - - - - - - - -");
                                    System.out.println("With a final, resolute strike, " + theGoblin.name + " crumples to the ground!");
                                    System.out.println("The goblin's crimson eyes dim as life leaves his twisted form");
                                    System.out.println("Victory is yours, brave champion!");
                                    break; // Goblin defeated
                                }
                                myHero.nextTurn();
                                
                                theGoblin.enemyDamage(myHero);
                                if (myHero.health <= 0) {
                                    System.out.println("- - - - - - - - - - - - - - -");
                                    System.out.println("The goblin's blade finds its mark...");
                                    System.out.println("You feel your life essence draining away, health: " + myHero.health);
                                    System.out.println("Darkness closes in around you as you fall...");
                                    System.out.println("Humanity's last hope has been extinguished");
                                    System.out.println("The world is doomed to eternal shadow");
                                    System.out.println("- - - - - - - - - - - - - - -");
                                    running = false; // End the game
                                    floorOne = false; // Exit floor loop
                                    break; // Hero defeated
                                }
                                myHero.nextTurn();
                            }
                            
                            // If hero died, exit this case
                            if (!running) {
                                break;
                            }

                            // Goblin defeated - open the northern gate
                            northRoomGate = true;
                            System.out.println("- - - - - - - - - - - - - - -");
                            System.out.println("A thunderous metallic clang reverberates through the dungeon");
                            System.out.println("Somewhere above, ancient mechanisms grind to life");
                            System.out.println("The metal gate sealing the northern staircase has unlocked!");
                            System.out.println("Your victory has opened the path forward");
                            System.out.println("- - - - - - - - - - - - - - -");

                            myHero.continueNext();

                            System.out.println("The slain goblin will trouble no one again");
                            System.out.println("The chest in the corner beckons, promising rewards");
                            System.out.println("You approach and find it sealed with an intricate lock");
                            System.out.println("What mysteries might it contain?");
                            System.out.println("Will you attempt to open it? (yes/no):");
                            
                            boolean chestChoice = true;
                            while (chestChoice) {
                                String openChest = myObj.nextLine().toLowerCase();
                                
                                switch (openChest) {
                                    case "yes":
                                        // Check if hero has the key
                                        if (!myHero.keys.isEmpty()) {
                                            System.out.println("- - - - - - - - - - - - - - -");
                                            System.out.println("The key from your journey perfectly fits the ancient lock!");
                                            System.out.println("With a satisfying click, the chest springs open");
                                            System.out.println("Inside, bathed in ethereal light, rests a legendary blade: the Truestriker!");
                                            System.out.println("This weapon of heroes past now belongs to you");
                                            System.out.println("The Truestriker has been added to your arsenal!");
                                            myHero.addHeroWeapon(Swordoftruth);
                                            myHero.continueNext();
                                            // Remove the Dagger from inventory
                                            myHero.weapons.removeIf(weapon -> weapon.printWeaponId().equalsIgnoreCase("Dagger"));
                                            System.out.println("You set aside your training dagger, no longer needing such a simple blade");
                                            System.out.println("- - - - - - - - - - - - - - -");
                                            theMessages.printEntranceBack();
                                            chestChoice = false;
                                        } else {
                                            System.out.println("- - - - - - - - - - - - - - -");
                                            System.out.println("The chest remains stubbornly sealed");
                                            System.out.println("You lack the key needed to unlock its secrets");
                                            System.out.println("Perhaps your journey will lead you to it...");
                                            System.out.println("You leave the chest behind and return to the entrance");
                                            System.out.println("- - - - - - - - - - - - - - -");
                                            myHero.continueNext();
                                            theMessages.printEntranceBack();
                                            chestChoice = false;
                                        }
                                        break;
                                        
                                    case "no":
                                        System.out.println("- - - - - - - - - - - - - - -");
                                        System.out.println("You decide to leave the chest undisturbed for now");
                                        System.out.println("Perhaps you will return when better prepared");
                                        System.out.println("- - - - - - - - - - - - - - -");
                                        myHero.continueNext();
                                        theMessages.printEntranceBack();
                                        chestChoice = false;
                                        break;
                                        
                                    default:
                                        System.out.println("Please enter yes or no:");
                                        break;
                                }
                            }
                            break;

                        } else {
                            theMessages.eastRoomRevisit();
                            myHero.continueNext();
                            theMessages.printEntranceBack();
                            
                        }
                        break;

                        case "west":
                            if(!westRoom) {
                                theMessages.westRoom();
                                westRoom = true;
                                
                                boolean riddleAnswered = false;
                                while (!riddleAnswered && myHero.health > 0) {
                                    String answer = myObj.nextLine().toLowerCase();
                                    
                                    switch (answer) {
                                        case "the sun":
                                        case "a firefly":
                                            System.out.println("- - - - - - - - - - - - - - -");
                                            System.out.println("The painting's expression twists into a malevolent grin");
                                            System.out.println("'WRONG!' it shrieks with terrible fury");
                                            System.out.println("'You shall pay the ultimate price for your ignorance!'");
                                            myHero.health -= 100;
                                            System.out.println("An invisible force tears at your very soul");
                                            System.out.println("Your life essence drains away into the cursed painting");
                                            System.out.println("You collapse, another victim claimed by the riddle");
                                            System.out.println("With your death, humanity's hope dies as well");
                                            System.out.println("- - - - - - - - - - - - - - -");
                                            running = false; // End the game
                                            floorOne = false; // Exit floor loop
                                            riddleAnswered = true;
                                            myHero.continueNext();
                                            break;

                                        case "the moon":
                                            System.out.println("- - - - - - - - - - - - - - -");
                                            System.out.println("The painting's eyes gleam with approval");
                                            System.out.println("'Correct, worthy champion!' the voice rings out warmly");
                                            System.out.println("'Your wisdom has earned you great power'");
                                            System.out.println("A surge of ancient magic courses through the chamber");
                                            System.out.println("You feel mystical energy gathering in your hand");
                                            System.out.println("The power of the Fireball spell is now yours to command!");
                                            System.out.println("Something materializes in your pocket with a soft clink");
                                            System.out.println("A mysterious key... it must open something important");
                                            System.out.println("- - - - - - - - - - - - - - -");
                                            System.out.println("- - - - - - - - - - - - - - -");
                                            myHero.continueNext();
                                            riddleAnswered = true;
                                            myHero.addKey(keyOne);
                                            myHero.addHeroWeapon(Fireball);
                                            theMessages.printEntranceBack();
                                            break;

                                        default:
                                            System.out.println("The painting stares at you expectantly...");
                                            System.out.println("Please choose one of the offered answers, champion:");
                                            break;
                                    }
                                }
                            } else {
                                theMessages.westRoomBack();
                                myHero.continueNext();
                                theMessages.printEntranceBack();
                            }
                            break;

                        case "north":
                            if (northRoomGate) {
                                // First time or revisit logic
                                if (!upperFloor) {
                                    upperFloor = true;
                                    theMessages.upperRoom();
                                } else {
                                    theMessages.upperRoomRevisit();
                                }
                                
                                String upperFloorDirection = myObj.nextLine().toLowerCase();
                                
                                boolean upperFloorActive = true;
                                while (upperFloorActive && running) {
                                    switch (upperFloorDirection) {
                                        case "west":
                                            if (!upperWestRoom) {
                                                theMessages.upperWestRoom();
                                                upperWestRoom = true;
                                                
                                                boolean puzzleAnswered = false;
                                                while (!puzzleAnswered && myHero.health > 0) {
                                                    String puzzleAnswer = myObj.nextLine().toLowerCase();
                                                    
                                                    switch (puzzleAnswer) {
                                                        case "31":
                                                        case "34":
                                                            System.out.println("The voice booms: Wrong! Your ignorance will cost you dearly!");
                                                            myHero.health -= 100;
                                                            System.out.println("A searing light burns through your very essence");
                                                            System.out.println("You fall to the ground, defeated. Humanity is doomed!");
                                                            running = false;
                                                            floorOne = false;
                                                            upperFloorActive = false;
                                                            puzzleAnswered = true;
                                                            myHero.continueNext();
                                                            break;
                                                            
                                                        case "27":
                                                            System.out.println("The voice speaks warmly: Correct, wise champion!");
                                                            System.out.println("You have proven your intellect worthy");
                                                            System.out.println("A divine light surrounds you as the HolyHymn manifests in your hands");
                                                            System.out.println("This sacred weapon will serve you well against the darkness ahead");
                                                            System.out.println("The holy power of the HolyHymn flows through you, healing your wounds!");
                                                            myHero.health = 200;
                                                            System.out.println("Your vitality surges to extraordinary heights: " + myHero.health + "!");
                                                            System.out.println("You have never felt more alive and powerful!");
                                                            System.out.println("- - - - - - - - - - - - - - -");
                                                            System.out.println("- - - - - - - - - - - - - - -");
                                                            myHero.continueNext();
                                                            puzzleAnswered = true;
                                                            myHero.addHeroWeapon(HolyHymn);
                                                            // Remove Fireball from inventory
                                                            myHero.weapons.removeIf(weapon -> weapon.printWeaponId().equalsIgnoreCase("Fireball"));
                                                            System.out.println("The Fireball spell fades away, replaced by the superior HolyHymn.");
                                                            System.out.println("- - - - - - - - - - - - - - -");
                                                            theMessages.upperRoomRevisit();
                                                            break;
                                                            
                                                        default:
                                                            System.out.println("Please enter one of the numbers shown:");
                                                            break;
                                                    }
                                                }
                                            } else {
                                                theMessages.upperWestRoomRevisit();
                                                myHero.continueNext();
                                                theMessages.upperRoomRevisit();
                                            }
                                            break;
                                            
                                        case "east":
                                            if (!upperEastRoom) {
                                                this.upperEastRoom = true;
                                                theMessages.upperEastRoom();
                                                System.out.println("- - - - - - - - - - - - - - -");
                                                System.out.println("- - - - - - - - - - - - - - -");
                                                System.out.println("What weapon will you use against the firedemon, hero?");

                                                // Combat loop - continues until hero or firedemon is defeated
                                                while (myHero.health > 0 && theFiredemon.health > 0) {
                                                    myHero.heroDamage(theFiredemon, "");
                                                    if (theFiredemon.health <= 0) {
                                                        System.out.println("- - - - - - - - - - - - - - -");
                                                        System.out.println("- - - - - - - - - - - - - - -");
                                                    System.out.println("With a devastating final blow, " + theFiredemon.name + " staggers backward!");
                                                    System.out.println("The demon's flames flicker and die as it crumbles to ash");
                                                    System.out.println("The infernal heat dissipates, leaving only cooling embers");
                                                    System.out.println("You have vanquished the guardian of this floor!");
                                                    System.out.println("A great victory for humanity!");
                                                        break; // Firedemon defeated
                                                    }
                                                    myHero.nextTurn();
                                                    
                                                    theFiredemon.enemyDamage(myHero);
                                                    if (myHero.health <= 0) {
                                                    System.out.println("- - - - - - - - - - - - - - -");
                                                    System.out.println("The firedemon's blazing sword pierces through your defenses");
                                                    System.out.println("Searing pain overwhelms you as flames consume your body");
                                                    System.out.println("Your life force fades... health: " + myHero.health);
                                                    System.out.println("You fall, defeated by the infernal guardian");
                                                    System.out.println("Humanity's champion has fallen, darkness prevails");
                                                    System.out.println("- - - - - - - - - - - - - - -");
                                                        running = false; // End the game
                                                        floorOne = false; // Exit floor loop
                                                        upperFloorActive = false; // Exit upper floor loop
                                                        break; // Hero defeated
                                                    }
                                                    myHero.nextTurn();
                                                }
                                                
                                                // If hero died, exit this case
                                                if (!running) {
                                                    break;
                                                }

                                                // Firedemon defeated
                                                System.out.println("- - - - - - - - - - - - - - -");
                                                System.out.println("As the demon's ashes settle, something catches your eye");
                                                System.out.println("Etched into the scorched floor are mysterious words:");
                                                System.out.println("'Fire, earth, air....'");
                                                System.out.println("The message trails off, incomplete");
                                                System.out.println("What could this cryptic clue mean?");
                                                System.out.println("Perhaps the glowing angel statue holds the answer...");
                                                System.out.println("- - - - - - - - - - - - - - -");
                                                myHero.continueNext();
                                                theMessages.upperRoomRevisit();
                                                
                                            } else {
                                                theMessages.upperEastRoomRevisit();
                                                myHero.continueNext();
                                                theMessages.upperRoomRevisit();
                                            }
                                            break;
                                            
                                        case "north":
                                            System.out.println("- - - - - - - - - - - - - - -");
                                            System.out.println("The grand northern staircase beckons upward into shadow");
                                            System.out.println("But mystical chains forged of pure energy still bar your passage");
                                            System.out.println("Ancient runes glow along their ethereal links");
                                            System.out.println("The guardian of this floor must be defeated first");
                                            System.out.println("Only then will the seals break");
                                            System.out.println("- - - - - - - - - - - - - - -");
                                            myHero.continueNext();
                                            theMessages.upperRoomRevisit();
                                            break;
                                            
                                        case "statue":
                                        case "angel":
                                            if (!angelBuff && upperEastRoom) {
                                                System.out.println("- - - - - - - - - - - - - - -");
                                                System.out.println("You approach the radiant angel statue at the chamber's heart");
                                                System.out.println("As you draw near, its divine glow intensifies dramatically");
                                                System.out.println("The statue seems to recognize something within you");
                                                System.out.println("You recall the cryptic message from the scorched floor:");
                                                System.out.println("'Fire, earth, air....'");
                                                System.out.println("The statue awaits your words... what do you say?");
                                                System.out.println("- - - - - - - - - - - - - - -");
                                                
                                                String statueAnswer = myObj.nextLine().toLowerCase();
                                                
                                                if (statueAnswer.equals("water")) {
                                                    System.out.println("- - - - - - - - - - - - - - -");
                                                    System.out.println("You speak the word 'Water' with conviction!");
                                                    System.out.println("The statue explodes with brilliant heavenly radiance!");
                                                    System.out.println("The angel's stone eyes blaze with divine light");
                                                    System.out.println("Celestial power flows through you like a raging river");
                                                    System.out.println("Fire, Earth, Air, and Water - the four elements unite within your soul!");
                                                    System.out.println("You feel your very essence empowered by their ancient harmony!");
                                                    angelBuff = true;
                                                    myHero.health += 50;
                                                    System.out.println("Your maximum vitality surges! Health: " + myHero.health);
                                                    System.out.println("The blessing of the elements courses through your veins");
                                                    System.out.println("You are now truly prepared to face the ultimate evil!");
                                                    System.out.println("- - - - - - - - - - - - - - -");
                                                } else {
                                                    System.out.println("- - - - - - - - - - - - - - -");
                                                    System.out.println("The statue's glow dims slightly in disappointment");
                                                    System.out.println("It returns to its peaceful luminescence, unchanged");
                                                    System.out.println("That was not the answer it sought...");
                                                    System.out.println("Perhaps you need to ponder the clue more carefully");
                                                    System.out.println("- - - - - - - - - - - - - - -");
                                                }
                                                myHero.continueNext();
                                                theMessages.upperRoomRevisit();
                                            } else if (angelBuff) {
                                                System.out.println("- - - - - - - - - - - - - - -");
                                                System.out.println("The angel statue radiates warmth and approval");
                                                System.out.println("Its divine blessing already flows within you");
                                                System.out.println("You feel the power of the four elements pulsing in harmony");
                                                System.out.println("- - - - - - - - - - - - - - -");
                                                myHero.continueNext();
                                                theMessages.upperRoomRevisit();
                                            } else {
                                                System.out.println("- - - - - - - - - - - - - - -");
                                                System.out.println("You approach the glowing angel statue");
                                                System.out.println("It watches you with serene, eternal patience");
                                                System.out.println("But you sense it has nothing to reveal to you yet");
                                                System.out.println("Perhaps you need to discover something first...");
                                                System.out.println("- - - - - - - - - - - - - - -");
                                                myHero.continueNext();
                                                theMessages.upperRoomRevisit();
                                            }
                                            break;
                                            
                                        default:
                                            System.out.println("Please enter a valid direction (East/North/West) or 'Statue' to interact:");
                                            break;
                                    }
                                    
                                    if (upperFloorActive && running) {
                                        upperFloorDirection = myObj.nextLine().toLowerCase();
                                    }
                                }
                            } else {
                                System.out.println("- - - - - - - - - - - - - - -");
                                System.out.println("- - - - - - - - - - - - - - -");
                                System.out.println("You approach the northern staircase, eager to progress");
                                System.out.println("But an imposing metal gate bars your passage");
                                System.out.println("It appears sealed by powerful mechanisms");
                                System.out.println("You must vanquish a great foe to unlock this path");
                                System.out.println("- - - - - - - - - - - - - - -");
                                myHero.continueNext();
                                theMessages.printEntranceBack();
                            }
                            break;

                        default:
                            System.out.println("Please enter a valid direction (East/North/West):");
                            break;
                    }
                    
                    // Read next direction after completing any room action
                    if (floorOne && running) {
                        floorDirection = myObj.nextLine().toLowerCase();
                    }
                }
                
                
                
    
            }
        }
    }




