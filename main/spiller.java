package main;

public class spiller {
    private String playerName;
    private main.konto playerKonto;  // Instance of konto

    public spiller() {
        this.playerKonto = new main.konto();  // Initialize konto
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    // Delegate balance methods to konto
    public int getPlayerBalance() {
        return playerKonto.getBalance();
    }

    public void setPlayerBalance(int playerBalance) {
        playerKonto.setBalance(playerBalance);
    }
} 