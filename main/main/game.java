package main;

import java.util.Locale;
import java.util.Scanner;

public class game {
    public static main.spiller player1 = new main.spiller();
    public static main.spiller player2 = new main.spiller();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        System.out.print("Player 1's name: ");
        String player1Name = scanner.nextLine();
        player1.setPlayerName(player1Name);

        System.out.print("Player 2's name: ");
        String player2Name = scanner.nextLine();
        player2.setPlayerName(player2Name);

        System.out.println("Let the game begin!");

        do {
            // player 1's turn
            String Start1;
            String Start2;
            do {
                System.out.println(player1.getPlayerName() + " start by writing Roll");
                Start1 = scanner.nextLine();
            } while (!Start1.equalsIgnoreCase("roll"));

            main.DiceResult diceResult1 = main.DiceRollMechanism.rollDice(); // Now we return DiceResult
            int total1 = diceResult1.total; // Get total from DiceResult
            System.out.println(player1.getPlayerName() + " rolled " + diceResult1.die1 + " and " + diceResult1.die2 + " a total of " + total1);
            main.boardLogic BoardLogic = new main.boardLogic();
            BoardLogic.boardLogicGame(total1, player1);
            System.out.println(player1.getPlayerName() + " your balance is " + player1.getPlayerBalance());

            do {
                System.out.println(player2.getPlayerName() + " start by writing Roll");
                Start2 = scanner.nextLine();
            } while (!Start2.equalsIgnoreCase("roll"));

            main.DiceResult diceResult2 = main.DiceRollMechanism.rollDice(); // Now we return DiceResult
            int total2 = diceResult2.total; // Get total from DiceResult
            System.out.println(player2.getPlayerName() + " rolled " + diceResult1.die1 + " and " + diceResult1.die2 + " a total of " + total2);
            BoardLogic.boardLogicGame(total2, player2);
            System.out.println(player2.getPlayerName() + " your balance is " + player2.getPlayerBalance());


        } while (player1.getPlayerBalance() < 3000 && player2.getPlayerBalance() < 3000);

        if (player1.getPlayerBalance() >= 3000) {
            System.out.println(player1.getPlayerName() + " Has won");
        } else if (player1.getPlayerBalance() == player2.getPlayerBalance()) {
            System.out.println(player2.getPlayerName() + " Has won");
        } else
            System.out.println("The game is a draw");
    }


}