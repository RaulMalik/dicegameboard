package tests;

import main.spiller;
import main.konto;
import main.DiceResult;
import main.boardLogic;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SpillerTest {

    private spiller player;

    @Before
    public void setUp() {
        // Initialize the spiller object before each test
        player = new spiller();
    }

    // Test to ensure balance cannot become negative
    @Test
    public void testBalanceNeverNegative() {
        player.setPlayerBalance(-100); // Try setting a negative balance
        assertTrue("Balance should not be negative", player.getPlayerBalance() >= 0);

        player.setPlayerBalance(50);  // Set balance to a positive value
        player.setPlayerBalance(player.getPlayerBalance() - 200);  // Try reducing it below zero
        assertTrue("Balance should still not be negative", player.getPlayerBalance() >= 0);
    }

    // Test that balance increases correctly
    @Test
    public void testBalanceIncrease() {
        int initialBalance = player.getPlayerBalance();
        player.setPlayerBalance(initialBalance + 200);  // Increase balance
        Assert.assertEquals("Balance should have increased by 200", initialBalance + 200, player.getPlayerBalance());
    }

    // Test that balance decreases correctly but does not go negative
    @Test
    public void testBalanceDecrease() {
        player.setPlayerBalance(500);  // Set initial balance to 500
        player.setPlayerBalance(player.getPlayerBalance() - 100);  // Decrease by 100
        Assert.assertEquals("Balance should have decreased by 100", 400, player.getPlayerBalance());

        player.setPlayerBalance(player.getPlayerBalance() - 500);  // Try to decrease below zero
        assertTrue("Balance should not be negative", player.getPlayerBalance() >= 0);
    }

    // Test that initial balance is set to 1000 as per konto.java default value
    @Test
    public void testInitialBalance() {
        Assert.assertEquals("Initial balance should be 1000", 1000, player.getPlayerBalance());
    }

    // Test that player names are set and retrieved correctly
    @Test
    public void testPlayerName() {
        player.setPlayerName("Alice");
        Assert.assertEquals("Player name should be Alice", "Alice", player.getPlayerName());

        player.setPlayerName("Bob");
        Assert.assertEquals("Player name should be Bob", "Bob", player.getPlayerName());
    }
}