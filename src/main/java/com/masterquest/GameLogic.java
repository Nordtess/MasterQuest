package com.masterquest;

import java.util.Scanner;

public class GameLogic {

    private boolean running = true;
    Scanner myObj = new Scanner(System.in);
    Weapon Dagger = new Weapon("Dagger", 2, 5);
    Messages theMessages = new Messages();
    Goblin theGoblin = new Goblin("Azak", 100);
    Key keyOne = new Key("keyOne");

    private boolean entrance = false;
    private boolean basement = false;
    private boolean westRoom = false;
    private boolean northRoom = false;


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
            System.out.println("Welcome " + heroName + "!");
            System.out.println("You are truly needed in this time of horror");
            System.out.println("The world has been invaded by dark forces from an unknown dimension");
            System.out.println("You " + heroName + " is our only hope for salvation");
            System.out.println("You have just entered this dungeon and have to find your");
            System.out.println("way to the end and the final enemy");
            System.out.println("Will you conquer evil?");
            System.out.println("Or will you fall to it?");
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

                            System.out.println("The goblin is laying dead on the floor, the chest is yours.");
                            System.out.println("You move forward to the chest and can see it is locked, what is hidden inside it?");
                            System.out.println("Will you try to open it?");

                            



                        } else {
                            theMessages.eastRoomRevisit();
                            theMessages.printEntranceBack();
                            floorOne = false;
                            
                        }

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
                                            break;

                                        case "the moon":
                                            System.out.println("You are correct champion");
                                            System.out.println("From magic you can't explain you feel something appearing in your pocket");
                                            System.out.println("It is a key. Where will it go? You move back to the entrance");
                                            riddleAnswered = true;
                                            myHero.addKey(keyOne);
                                            break;

                                        default:
                                            System.out.println("Please enter one of the answers champion");
                                            break;
                                    }
                                }
                                
                                if (westRoom && myHero.health > 0) {
                                    theMessages.westRoomBack();
                                    theMessages.printEntranceBack();
                                }
                            } else {
                                System.out.println("You have already visited this room.");
                                theMessages.printEntranceBack();
                            }
                            break;




                    }
                }
                
                
                
    
            }
        }
    }




