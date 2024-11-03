# Dice Game

This is a simple 2-player dice game implemented in Java. The goal of the game is to be the first player to reach a balance of 3000 coins by rolling two dice and landing on different board locations, each affecting the player's balance. The game includes a reroll mechanic when landing on a specific board tile.

## Table of Contents

- [How to Play](#how-to-play)
- [Rules](#rules)
- [Classes Overview](#classes-overview)
- [How to Run](#how-to-run)

## How to Play

1. Players take turns rolling two dice by typing `Roll` when prompted.
2. Each dice roll is interpreted as landing on a specific board tile based on the total of the dice.
3. The player's balance will be affected positively or negatively depending on the tile they land on.
4. The first player to reach 3000 coins wins the game. If both players reach 3000 at the same time, the game results in a draw.

## Rules

- **Tower (total: 2):** +250 coins.
- **Crater (total: 3):** -100 coins.
- **Palace Gates (total: 4):** +100 coins.
- **Cold Desert (total: 5):** -20 coins.
- **Walled City (total: 6):** +180 coins.
- **Monastery (total: 7):** No change in balance.
- **Black Cave (total: 8):** -70 coins.
- **Huts in the Mountain (total: 9):** +60 coins.
- **The Werewall (total: 10):** -80 coins and forces a reroll.
- **The Pit (total: 11):** -50 coins.
- **Goldmine (total: 12):** +650 coins.

## Classes Overview

### 1. `game.java`

- This is the main class where the game flow is managed.
- It prompts players to enter their names and take turns rolling the dice.
- The game continues until one player reaches a balance of 3000 coins or more.

### 2. `spiller.java`

- Represents a player with a name and an associated `konto` (account) object for managing the player's balance.

### 3. `konto.java`

- Manages the player's balance, with methods for depositing, withdrawing, and setting the balance.

### 4. `boardLogic.java`

- Handles the logic for updating the player's balance based on the total of the dice roll.
- Includes special logic for handling a reroll when landing on "The Werewall."

### 5. `DiceRollMechanism.java`

- Contains the method `rollDice()` which simulates rolling two dice using Java's `Random` class.
- Returns the dice results in the form of a `DiceResult` object.

### 6. `DiceResult.java`

- Stores the results of a dice roll, including the values of both dice and their total.

## How to Run

1. Clone the repository to your local machine:

    ```bash
    git clone https://github.com/your-username/dice-game.git
    ```

2. Navigate to the project directory:

    ```bash
    cd dice-game
    ```

3. Compile the Java files:

    ```bash
    javac -d bin src/main/*.java
    ```

4. Run the game:

    ```bash
    java -cp bin main.game
    ```

OR download zip and import.
