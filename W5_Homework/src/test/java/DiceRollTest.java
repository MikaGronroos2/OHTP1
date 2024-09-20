import org.junit.Test;
import static org.junit.Assert.*;

public class DiceRollTest {

    @Test
    public void testRollDice() {
        int sum = DiceRoll.rollDice(3);
        assertTrue(sum >= 3 && sum <= 18);
    }

    @Test
    public void testRollDice2() {
        int sum = DiceRoll.rollDice(4);
        assertTrue(sum >= 4 && sum <= 24);
     }

    @Test
    public void testRollDice3() {
        int sum = DiceRoll.rollDice(5);
        assertTrue(sum >= 5 && sum <= 30);
    }

    @Test
    public void testRollDice4() {
        int sum = DiceRoll.rollDice(6);
        assertTrue(sum >= 6 && sum <= 36);
    }

    @Test
    public void testRollDice5() {
        int sum = DiceRoll.rollDice(2);
        assertTrue(sum >= 2 && sum <= 12);
    }



}