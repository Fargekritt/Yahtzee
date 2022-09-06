package org.fredrik.lesson2.yahtzee;

public class Yahtzee {

    private Dice[] dice;

    public Yahtzee(Dice[] dice) {
        this.dice = dice;
    }

    public int CountDice(Dice diceValue) {
        int amount = 0;

        for (Dice dice : dice) {

            if (dice.compareTo(diceValue) == 0) {
                amount++;
            }
        }
        return amount;
    }

    public int totalScore() {
        return 0;
    }

    //penis
}
