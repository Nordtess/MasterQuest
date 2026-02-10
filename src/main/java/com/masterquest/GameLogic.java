package com.masterquest;

import java.util.Scanner;

public class GameLogic {

    private boolean running = true;
    Scanner myObj = new Scanner(System.in);
    Weapon Dagger = new Weapon("Dagger", 2, 5);
    Messages theMessages = new Messages();


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
            
            
            

            

        }
    }

}


