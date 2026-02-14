package com.masterquest;

import java.util.Scanner;

public class GameLogic {

    private boolean running = true;
    Scanner myObj = new Scanner(System.in);
    Weapon Dagger = new Weapon("Dagger", 2, 5);
    Weapon Fireball = new Weapon("Fireball", 30, 40);
    Weapon Swordoftruth = new Weapon ("Truestriker", 30, 50);
    Messages theMessages = new Messages();
    Goblin theGoblin = new Goblin("Azak", 100);
    Key keyOne = new Key("keyOne");

    private boolean entrance = false;
    private boolean basement = false;
    private boolean westRoom = false;
    private boolean northRoomGate = false;


    public GameLogic() {

    }

    public void startGame() {
        while (running) {

            theMessages.printIntro();
            System.out.println("MASTER QUEST");
            System.out.println("- - - - - - - - - - - - - - -");
            System.out.println("- - - - - - - - - - - - - - -");

            

            boolean helpRules = true;
            while (helpRules) {
                theMessages.printHelp();
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
            System.out.println("What is your name brave hero?");

            String heroName = myObj.nextLine();
            

            

            Hero myHero = new Hero(heroName);
            myHero.addHeroWeapon(Dagger);

            System.out.println("- - - - - - - - - - - - - - -");
            System.out.println("- - - - - - - - - - - - - - -");
            System.out.println("Welcome " + heroName + "!");
            System.out.println("You are truly needed in this time of horror");
            System.out.println("The world has been invaded by dark forces from an unknown dimension");
            System.out.println("You " + heroName + " is our only hope for salvation");
            System.out.println("You have just entered this dungeon and have to find your");
            System.out.println("way to the end and the final enemy");
            System.out.println("Will you conquer evil?");
            System.out.println("Or will you fall to it?");
            System.out.println("- - - - - - - - - - - - - - -");
            System.out.println("- - - - - - - - - - - - - - -");
            System.out.println("Will you continue? yes/no:");

            String doContinue = myObj.nextLine();

            boolean flag1 = true;

            while (flag1) {
                switch (doContinue) {
                case "yes":
                    flag1 = false;
                    break;
                case "no":
                    System.out.println("You have doomed us all!");
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
            System.out.println("You are fresh out of the hero academy " + heroName);
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
                                    System.out.println("You strike resolut, " + theGoblin.name + " falls to the ground and is defeated!");
                                    break; // Goblin defeated
                                }
                                myHero.nextTurn();
                                
                                theGoblin.enemyDamage(myHero);
                                if (myHero.health <= 0) {
                                    System.out.println("My champion your life force is fading away, your health is " + myHero.health);
                                    System.out.println("Humanity is doomed!");
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
                            System.out.println("You hear a loud metallic clang echoing through the dungeon.");
                            System.out.println("The metal gate blocking the northern staircase has opened!");
                            System.out.println("- - - - - - - - - - - - - - -");

                            myHero.continueNext();

                            System.out.println("The goblin is laying dead on the floor, the chest is yours.");
                            System.out.println("You move forward to the chest and can see it is locked, what is hidden inside it?");
                            System.out.println("Will you try to open it? (yes/no):");
                            
                            boolean chestChoice = true;
                            while (chestChoice) {
                                String openChest = myObj.nextLine().toLowerCase();
                                
                                switch (openChest) {
                                    case "yes":
                                        // Check if hero has the key
                                        if (!myHero.keys.isEmpty()) {
                                            System.out.println("- - - - - - - - - - - - - - -");
                                            System.out.println("You use the key from your pocket and unlock the chest!");
                                            System.out.println("Inside you find a legendary weapon: Truestriker!");
                                            System.out.println("The Truestriker has been added to your arsenal!");
                                            myHero.addHeroWeapon(Swordoftruth);
                                            myHero.continueNext();
                                            // Remove the Dagger from inventory
                                            myHero.weapons.removeIf(weapon -> weapon.printWeaponId().equalsIgnoreCase("Dagger"));
                                            System.out.println("You discard your old Dagger to make room for the legendary blade.");
                                            System.out.println("- - - - - - - - - - - - - - -");
                                            theMessages.printEntranceBack();
                                            chestChoice = false;
                                        } else {
                                            System.out.println("- - - - - - - - - - - - - - -");
                                            System.out.println("The chest is locked tight. You need a key to open it.");
                                            System.out.println("You leave the chest and return to the entrance.");
                                            System.out.println("- - - - - - - - - - - - - - -");
                                            myHero.continueNext();
                                            theMessages.printEntranceBack();
                                            chestChoice = false;
                                        }
                                        break;
                                        
                                    case "no":
                                        System.out.println("- - - - - - - - - - - - - - -");
                                        System.out.println("You decide to leave the chest for now.");
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
                                            System.out.println("The answer is wrong, you will pay for this");
                                            myHero.health -= 100;
                                            System.out.println("You feel a mysterious force taking your life force away");
                                            System.out.println("You die champion and we are all doomed");
                                            running = false; // End the game
                                            floorOne = false; // Exit floor loop
                                            riddleAnswered = true;
                                            myHero.continueNext();
                                            break;

                                        case "the moon":
                                            System.out.println("You are correct champion");
                                            System.out.println("You hear a voice saying, take the power of the fireball");
                                            System.out.println("From magic you can't explain you feel something appearing in your pocket");
                                            System.out.println("It is a key. Where will it go? You move back to the entrance");
                                            System.out.println("- - - - - - - - - - - - - - -");
                                            System.out.println("- - - - - - - - - - - - - - -");
                                            myHero.continueNext();
                                            riddleAnswered = true;
                                            myHero.addKey(keyOne);
                                            myHero.addHeroWeapon(Fireball);
                                            theMessages.printEntranceBack();
                                            break;

                                        default:
                                            System.out.println("Please enter one of the answers champion");
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
                                System.out.println("- - - - - - - - - - - - - - -");
                                System.out.println("- - - - - - - - - - - - - - -");
                                System.out.println("You walk through the now-open metal gate and climb the northern staircase.");
                                System.out.println("The stairs lead upward into darkness...");
                                System.out.println("- - - - - - - - - - - - - - -");
                                myHero.continueNext();
                                // TODO: Add northern room content here
                                theMessages.printEntranceBack();
                            } else {
                                System.out.println("- - - - - - - - - - - - - - -");
                                System.out.println("- - - - - - - - - - - - - - -");
                                System.out.println("The northern staircase is blocked by a heavy metal gate.");
                                System.out.println("It appears to be locked by some mechanism.");
                                System.out.println("You need to find a way to unlock it.");
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




