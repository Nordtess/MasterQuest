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
        System.out.println("Heed these words well, for they shall guide you through the darkness:");
        System.out.println("Speak 'Weapons' to behold your armaments");
        System.out.println("Speak 'Keys' to reveal what secrets you carry");
        System.out.println("Speak 'Health' to know the state of your mortal vessel");
        System.out.println("Speak 'Quit' should you wish to abandon your quest");
    }



    public void printEntrance() {
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("You stand at the threshold of the ancient dungeon");
        System.out.println("The entrance seals behind you with a resounding echo");
        System.out.println("There is no turning back now");
        System.out.println("To the east, stone steps descend into a shadowy basement");
        System.out.println("To the north, a grand staircase ascends into darkness");
        System.out.println("The northern path is barred by an imposing metal gate");
        System.out.println("To the west, a weathered door beckons with mysterious whispers");
        System.out.println("Which path do you choose, brave hero?");
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("East/North/West:");
    }

    public void printEntranceBack () {
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("Your footsteps echo as you return to the dungeon's entrance hall");
        System.out.println("The three paths await your decision once more");
        System.out.println("East/North/West:");
    }

    public void westRoom() {
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("You push through the western door into a forgotten chamber");
        System.out.println("The room appears abandoned, untouched by time or intruder");
        System.out.println("Thick dust blankets the floor like fresh snow");
        System.out.println("On the right wall hangs a curious painting, its eyes seeming to follow you");
        System.out.println("As you approach, the painting's lips begin to move");
        System.out.println("A whisper emanates from the ancient canvas");
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("'Answer my riddle correctly, and power shall be yours'");
        System.out.println("'Answer wrongly, and your very essence shall be my payment'");
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("'I am a light for the night, but I have no fire.'");
        System.out.println("'I am a circle, yet I am often only a crescent.'");
        System.out.println("'I die every month, yet I am born again. What am I?'");
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("What is your answer, hero of humanity?");
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("The sun");
        System.out.println("A firefly");
        System.out.println("The moon");
        System.out.println("- - - - - - - - - - - - - - -");


    }
    
    public void westRoomBack() {
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("You have already conquered this chamber, champion");
        System.out.println("The painting now hangs silent, its riddle spent");
        System.out.println("There is nothing more for you here");
        System.out.println("You turn and make your way back to the entrance");
    }


    public void eastRoom() {
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("You descend the eastern steps into the musty basement");
        System.out.println("In the far corner, a chest gleams faintly in the dim torchlight");
        System.out.println("But between you and your prize stands a menacing figure");
        System.out.println("A grotesque goblin clad in frost-kissed armor blocks your path");
        System.out.println("His fangs drip with anticipation as crimson eyes bore into your soul");
        System.out.println("He lets out a guttural growl that echoes through the chamber");
        System.out.println("This is a battle from which there is no escape, hero");
        System.out.println("Steel yourself for combat!");

    }

    public void eastRoomRevisit() {
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("You return to the basement, site of your first victory");
        System.out.println("The empty chest stands open, its treasures already claimed");
        System.out.println("The goblin's lifeless form lies crumpled in a frozen heap");
        System.out.println("There is nothing more for you in this place");
        
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
