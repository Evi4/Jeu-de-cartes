import org.junit.jupiter.api.Test;
import system.nat.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CardGameTest {
    @Test
    public void testGameRound() {
        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");
        Player player3 = new Player("Player3");
        Player player4 = new Player("Player4");
        List<Player> players = Arrays.asList(player1, player2, player3, player4);

        CardGame game = new CardGame(players);

        // Adding cards to the players hands
        List<Card> cards = new ArrayList<>();
        cards.add(new Card(Color.COEUR, Value.AS));
        cards.add(new Card(Color.COEUR, Value.ROI));
        cards.add(new Card(Color.COEUR, Value.DAME));
        player1.addCards(cards);

        cards.clear();
        cards.add(new Card(Color.TREFLE, Value.AS));
        cards.add(new Card(Color.TREFLE, Value.ROI));
        cards.add(new Card(Color.TREFLE, Value.DAME));
        player2.addCards(cards);

        cards.clear();
        cards.add(new Card(Color.CARREAU, Value.AS));
        cards.add(new Card(Color.CARREAU, Value.ROI));
        cards.add(new Card(Color.CARREAU, Value.DAME));
        player3.addCards(cards);

        cards.clear();
        cards.add(new Card(Color.PIQUE, Value.AS));
        cards.add(new Card(Color.PIQUE, Value.ROI));
        cards.add(new Card(Color.PIQUE, Value.DAME));
        player4.addCards(cards);
        //start the game
        game.gameRound();
        //Check the winner of the round
        assertEquals("Player1", game.players.get(0).name);
    }
}