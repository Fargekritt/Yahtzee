package org.fredrik.lesson2.yahtzee;

public class DiceHand {
    private Dice[] dices;

    public DiceHand(Dice[] dices) {
        this.dices = dices;
    }

    public int getDiceAmount(Dice diceValue) {
        int amount = 0;

        for (Dice dice : dices) {

            if (dice.compareTo(diceValue) == 0) {
                amount++;
            }
        }
        return amount;
    }
}
