import org.junit.jupiter.api.Test;
import system.nat.Card;
import system.nat.Color;
import system.nat.Value;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CardTest {

    @Test
    public void testCompareTo() {
        Card card1 = new Card(Color.COEUR, Value.TROIS);
        Card card2 = new Card(Color.TREFLE, Value.NEUF);
        Card card3 = new Card(Color.CARREAU, Value.AS);
        Card card4 = new Card(Color.TREFLE, Value.NEUF);

        // Test for greater than
        assertTrue(card3.compareTo(card1) > 0);

        // Test for less than
        assertTrue(card1.compareTo(card2) < 0);

        // Test for equal
        assertEquals(0, card2.compareTo(card4));
    }
}

