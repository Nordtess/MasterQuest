package com.masterquest;

public class Messages {


    public Messages() {

    }


    public void printIntro() {
        System.out.println ("        )         \r\n" + //
                        "          (            \r\n" + //
                        "        '    }      \r\n" + //
                        "      (    '      \r\n" + //
                        "     '      (   \r\n" + //
                        "      )  |    ) \r\n" + //
                        "    '   /|\\    `\r\n" + //
                        "   )   / | \\  ` )   \r\n" + //
                        "  {    | | |  {   \r\n" + //
                        " }     | | |  .\r\n" + //
                        "  '    | | |    )\r\n" + //
                        " (    /| | |\\    .\r\n" + //
                        "  .  / | | | \\  (\r\n" + //
                        "}    \\ \\ | / /  .        \r\n" + //
                        " (    \\ `-' /    }\r\n" + //
                        " '    / ,-. \\    ' \r\n" + //
                        "  }  / / | \\ \\  }\r\n" + //
                        " '   \\ | | | /   } \r\n" + //
                        "  (   \\| | |/  (\r\n" + //
                        "    )  | | |  )\r\n" + //
                        "    .  | | |  '\r\n" + //
                        "       J | L\r\n" + //
                        " /|    J_|_L    |\\\r\n" + //
                        " \\ \\___/ o \\___/ /\r\n" + //
                        "  \\_____ _ _____/\r\n" + //
                        "        |-|\r\n" + //
                        "        |-|\r\n" + //
                        "        |-|\r\n" + //
                        "       ,'-'.\r\n" + //
                        "       '---'\r\n" + //
                        "");
    }

    public void printHelp() {
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("The following tips will help you along your journey");
        System.out.println("Enter 'Weapons' to show your weapons" );
        System.out.println("Enter 'Keys' to show the keys you are carrying");
        System.out.println("Enter 'Health' to show your current health");
        System.out.println("Enter 'Quit' whenever you are done adventuring");
    }



    public void printEntrance() {
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("You are standing at the entrance to the dungeon");
        System.out.println("There is no going back now");
        System.out.println("To the east you have a basement");
        System.out.println("To the north you have a staircase leading up");
        System.out.println("To the west you have a door leading into a room");
        System.out.println("Where are you going?");
        System.out.println("East/North/West:");
    }

    
    
}
