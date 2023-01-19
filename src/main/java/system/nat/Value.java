package system.nat;

public enum Value {
    DEUX("2"), TROIS("3"), QUATRE("4"), CIND("5"), SIX("6"), SEPT("7"), HUIT("8"), NEUF("9"), DIX("10"), VALET("Valet"), DAME("Dame"), ROI("Roi"), AS("As");
    public final String label;

    Value(String label) {
        this.label = label;
    }
}
