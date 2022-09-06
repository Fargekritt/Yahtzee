package org.fredrik.lesson2.yahtzee;

public class Yahtzee {

    private DiceHand diceHand;

    public Yahtzee(DiceHand diceHand) {
        this.diceHand = diceHand;
    }

    public int CountDice(Dice diceValue) {
        return diceHand.getDiceAmount(diceValue);

    }

    public int totalScore() {
        return 0;
    }
}
