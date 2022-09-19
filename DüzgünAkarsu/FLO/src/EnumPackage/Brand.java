package EnumPackage;

public enum Brand {
    NIKE(1), LUMBERJACK(2), ADIDAS(3), POLARIS(4),
    PUMA(5), SLAZENGER(6), HUMMEL(7), VOYAGER(8);

    public int x;

    Brand(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
}
