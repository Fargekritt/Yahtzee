import org.fredrik.lesson2.yahtzee.Dice;
import org.fredrik.lesson2.yahtzee.DiceHand;
import org.fredrik.lesson2.yahtzee.Yahtzee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YahtzeeTest {

    @Test
    void shouldReturnAmountOf1sTest(){
        var yahtzee = new Yahtzee(new DiceHand(new Dice[]
        {
            Dice.ONE,
            Dice.TWO,
            Dice.ONE,
            Dice.FOUR,
            Dice.THREE,
            Dice.FIVE
        }));
        assertEquals(2, yahtzee.CountDice(Dice.ONE));
    }

    @Test
    void shouldReturnTotalScoreTest(){
        var yahtzee = new Yahtzee(new DiceHand(new Dice[]
                {
                        Dice.SIX,
                        Dice.SIX,
                        Dice.ONE,
                        Dice.FOUR,
                        Dice.THREE,
                        Dice.FIVE
                }));
        assertEquals(25, yahtzee.totalScore());
    }
}
