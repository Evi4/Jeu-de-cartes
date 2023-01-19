package system.nat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class CardGame {
    private final List<Card> cards;
    public final List<Player> players;

    public CardGame(List<Player> players) {
        this.cards = init();
        this.players = players;
    }

    private List<Card> init() {
        List<Card> cards = Arrays.stream(Color.values())
                .flatMap(color -> Arrays.stream(Value.values()).map(value -> new Card(color, value)))
                .collect(Collectors.toList());
        cards.forEach(System.out::println);
        return cards;
    }

    public void dealCards() {
        Random rand = new Random();
        while (cards.size() > 0) {
            players.forEach(p -> {
                int randomIndex = rand.nextInt(cards.size());
                p.addCards(List.of(cards.get(randomIndex)));
                cards.remove(randomIndex);
            });
        }
    }

    public void gameRound() {
        List<Card> pli = players.stream().map(Player::pickCard).collect(Collectors.toList());
        int winner = 0;
        System.out.println(pli);
        for (int i = 1; i < 4; i++) {
            if (pli.get(winner).compareTo(pli.get(i)) < 0) {
                winner = i;
            }
        }
        players.get(winner).addCards(pli);
        System.out.println(players.get(winner).name + " gagne cette partie!");
    }
}
