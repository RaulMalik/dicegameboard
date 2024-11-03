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


        

    }
}