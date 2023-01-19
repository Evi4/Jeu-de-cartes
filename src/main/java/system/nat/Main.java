package system.nat;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Player player1 = new Player("Joueur1");
        Player player2 = new Player("Joueur2");
        Player player3 = new Player("Joueur3");
        Player player4 = new Player("Joueur4");

        List<Player> players = Arrays.asList(player1, player2, player3, player4);

        CardGame game = new CardGame(players);
        game.dealCards();

        game.gameRound();
    }
}