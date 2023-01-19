package system.nat;

public class Card {
    Color color;
    Value value;

    public Card(Color color, Value value) {
        this.color = color;
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%s de %s", value.label, color.label);
    }

    public int compareTo(Card opponent) {
        return this.value.compareTo(opponent.value);
    }
}