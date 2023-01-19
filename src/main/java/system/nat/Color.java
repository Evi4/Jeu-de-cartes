package system.nat;

public enum Color {
    PIQUE("Pique"), TREFLE("Trefle"), CARREAU("Carreau"), COEUR("Coeur");

    public final String label;

    Color(String label) {
        this.label = label;
    }
}
