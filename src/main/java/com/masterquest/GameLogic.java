package com.masterquest;

import java.util.Scanner;

public class GameLogic {

    private boolean running = true;
    Scanner myObj = new Scanner(System.in);

    public GameLogic() {

    }

    public void startGame() {
        while (running) {
            System.out.println("Hello there!");
            System.out.println("What is your hero name?");

            var heroName = myObj.nextLine();

            if (heroName.equals("q")) {
                running = false;
                continue;
            }

            Hero myHero = new Hero(heroName);

            myHero.printHeroInfo();
            myHero.printHeroHealth();

            System.out.println("Do you want to quit?");

            var quit = myObj.nextLine();

            if (quit.equals("q")) {
                running = false;
                continue;
            }

        }
    }

}
