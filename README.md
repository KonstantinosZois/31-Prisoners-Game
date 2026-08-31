## 31 Prisoners Game

A Object-Oriented Java simulation of the classic **Prisoner's 31 Game** played in the Command Line Interface (CLI).

This cardless variant simulates card-drawing by having two players simultaneously reveal a number between `1` and `5` fingers. The sum of both numbers forms the points accumulated in each step.


## Game Rules

1. **Card Drawing Mechanism**:
   * Instead of drawing cards, the active player and the opponent simultaneously pick a number from `1` to `5`.
   * The sum of both picked numbers is added to the active player's point total.
2. **Turn Objective**:
   * The active player continues "drawing" until their point total reaches **at least 26 points**.
   * If the active player exceeds **31 points**, they **bust** immediately and lose the round.
3. **Winning a Round**:
   * If the first player busts, the second player wins automatically.
   * If the second player busts, the first player wins automatically.
   * If neither busts, the player with the highest total points wins the round.
   * In case of a tie in points, the **first player** wins.
4. **Match Structure**:
   * Players play multiple rounds.
   * The starting player alternates after every round.
   * The player with the most accumulated round wins at the end wins the overall game.


## How to Play

### Game mode selection

Upon execution, select your desired match mode: Enter `1` to play as a Human vs a Computer player. Enter `2` to run an automated simulation between two Computer players.

### Gameplay Controls

**Human Turn:** When it's your turn to accumulate points, type a number between `1` and `5` at each prompt

**Opposing Human Input:** Even during the Computer's turn, you must enter a number between `1` and `5` to simulate the simultaneous finger-reveal mechanism against the computer.

**Continuing or Ending the Match:** After each round, view the score and type `y` (yes) or `n` (no) if you want to continue playing another round.


## How to Run

Simply compile and run the `PrisonerGame.java` file. 
