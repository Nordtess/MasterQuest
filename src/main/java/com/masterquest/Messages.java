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
        System.out.println("The northern staircase is blocked by a metal gate");
        System.out.println("To the west you have a door leading into a room");
        System.out.println("Where are you going?");
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("East/North/West:");
    }

    public void printEntranceBack () {
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("Once again you are back at the entrance");
        System.out.println("Where are you going?");
        System.out.println("East/North/West:");
    }

    public void westRoom() {
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("You enter the room to the west of the entrance");
        System.out.println("There is no one inside, or something inside");
        System.out.println("A layer of dust covers the floor and on the right wall there is a curious painting");
        System.out.println("When you go forward to the painting somehow it speaks to you queitly");
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("Answer my question correct and you will get something for it");
        System.out.println("Answer it wrong and pay with your life force");
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("I am a light for the night, but I have no fire. I am a circle, yet I am often only a crescent. I die every month, yet I am born again. What am I?");
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("What is your answer hero of humanity?");
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("The sun");
        System.out.println("A firefly");
        System.out.println("The moon");
        System.out.println("- - - - - - - - - - - - - - -");


    }
    
    public void westRoomBack() {
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("You have already been in here champion!");
        System.out.println("There is nothing more for you here");
        System.out.println("You move back to the entrance");
    }


    public void eastRoom() {
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("You enter the basement and in the corner you see a chest in a dim light");
        System.out.println("Before you stand a growling goblin in an icy type of armor");
        System.out.println("He drewls while looking at you with his bright red eyes of doom");
        System.out.println("This is a battle you can't run from hero");
        System.out.println("Get ready!");

    }

    public void eastRoomRevisit() {
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("You once again enter the basement");
        System.out.println("The chest is already looted");
        System.out.println("And the goblin lays dead on the floor");
        System.out.println("There is nothing more for you here");
        
    }

    public void upperRoom() {
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("You ascend the staircase and arrive at the upper floor");
        System.out.println("In the center of the room stands an angel-like statue, glowing ever so slightly");
        System.out.println("Its ethereal light casts dancing shadows across the ancient walls");
        System.out.println("To the east you see a room with ornate carvings on its doorframe");
        System.out.println("To the west there is a room with a faint golden shimmer emanating from within");
        System.out.println("To the north a grand staircase leads upward, but it is sealed by mystical chains");
        System.out.println("The chains won't break until the guardian of this floor has been vanquished");
        System.out.println("Where are you going?");
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("East/North/West:");
    }


    public void upperRoomRevisit() {
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("You return to the upper floor");
        System.out.println("The angel statue continues to glow peacefully in the center");
        System.out.println("Where are you going?");
        System.out.println("East/North/West:");
    }

    public void upperWestRoom() {
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("You step into the western chamber and are immediately bathed in golden light");
        System.out.println("The room is adorned with treasures and ancient artifacts");
        System.out.println("Along the walls hang 4 golden shields, each engraved with mysterious runes");
        System.out.println("In the corners stand 3 tall golden candelabras, each holding 7 flickering candles");
        System.out.println("On a marble pedestal in the center rests 2 ornate golden chalices");
        System.out.println("Suddenly, a deep voice echoes through the chamber");
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("Seeker of fortune, prove your wit is true");
        System.out.println("Answer correctly and treasures await you");
        System.out.println("Answer wrongly and your vitality shall fade");
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("Count well, brave hero: Each candelabra holds 7 candles, and there are 3 candelabras in this room.");
        System.out.println("Add to this the number of golden shields and chalices you see.");
        System.out.println("What is the total count of all these golden treasures?");
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("What is your answer champion?");
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("27");
        System.out.println("31");
        System.out.println("34");
        System.out.println("- - - - - - - - - - - - - - -");
    }

    public void upperWestRoomRevisit() {
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("You have already solved the puzzle in this golden chamber!");
        System.out.println("There is nothing more for you here");
        System.out.println("You return to the upper floor");
    }

    public void upperEastRoom() {
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("You enter the eastern chamber and a wave of scorching heat washes over you");
        System.out.println("The walls are blackened with soot and embers dance in the air");
        System.out.println("Before you stands a towering firedemon wreathed in flames");
        System.out.println("Its eyes burn like molten lava as it lets out a thunderous roar");
        System.out.println("The very air around it shimmers and distorts from the infernal heat");
        System.out.println("This guardian will not let you pass without a fight!");
        System.out.println("Get ready!");
    }

    public void upperEastRoomRevisit() {
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("You return to the eastern chamber");
        System.out.println("The firedemon's ashes smolder on the scorched floor");
        System.out.println("There is nothing more for you here");
    }
































    

    
    
}
