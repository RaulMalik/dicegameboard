package main;

public class boardLogic {

    public void boardLogicGame(int total, main.spiller player) {
        boolean reroll;

        do {
            reroll = false;  // Reset reroll flag at the start of each loop
            switch (total) {
                case 2:
                    // Tower
                    player.setPlayerBalance(player.getPlayerBalance() + 250);
                    System.out.println("You have landed on Tower, resulting in +250 coins");
                    break;
                case 3:
                    // Crater
                    player.setPlayerBalance(player.getPlayerBalance() - 100);
                    System.out.println("You have landed on Crater, resulting in -100 coins");
                    break;
                case 4:
                    // Palace gates
                    player.setPlayerBalance(player.getPlayerBalance() + 100);
                    System.out.println("You have landed on Gates, resulting in +100 coins");
                    break;
                case 5:
                    // Cold Desert
                    player.setPlayerBalance(player.getPlayerBalance() - 20);
                    System.out.println("You have landed on Cold Desert, resulting in -20 coins");
                    break;
                case 6:
                    // Walled city
                    player.setPlayerBalance(player.getPlayerBalance() + 180);
                    System.out.println("You have landed on Walled City, resulting in +180 coins");
                    break;
                case 7:
                    // Monastery
                    System.out.println("You have landed on Monastery, resulting in no change");
                    break;
                case 8:
                    // Black cave
                    player.setPlayerBalance(player.getPlayerBalance() - 70);
                    System.out.println("You have landed on Black Cave, resulting in -70 coins");
                    break;
                case 9:
                    // Huts in the mountain
                    player.setPlayerBalance(player.getPlayerBalance() + 60);
                    System.out.println("You have landed on Huts in the mountain, resulting in +60 coins");
                    break;
                case 10:
                    // The Werewall (werewolf-wall)
                    player.setPlayerBalance(player.getPlayerBalance() - 80);
                    System.out.println("You have landed on the Werewolf wall, resulting in -80 coins and a re-roll");
                    DiceResult diceResult = DiceRollMechanism.rollDice();
                    total = diceResult.total;
                    System.out.println(player.getPlayerName() + " rolled " + diceResult.die1 + " and " + diceResult.die2 + " a total of " + total);
                    System.out.println("You have landed on " + total);
                    reroll = true;  // Set reroll flag to true to trigger the loop
                    break;
                case 11:
                    // The pit
                    player.setPlayerBalance(player.getPlayerBalance() - 50);
                    System.out.println("You have landed in The pit, resulting in -50 coins");
                    break;
                case 12:
                    // Goldmine
                    player.setPlayerBalance(player.getPlayerBalance() + 650);
                    System.out.println("You have landed on Goldmine, resulting in +650 coins");
                    break;
            }
        } while (reroll);  // Continue the loop if reroll is true
    }
}
