package system.nat;

import java.util.ArrayList;
import java.util.List;

public class Player {
    public String name;
    List<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public void addCards(List<Card> cards) {
        hand.addAll(cards);
    }

    public Card pickCard() {
        return hand.remove(0);
    }
}
