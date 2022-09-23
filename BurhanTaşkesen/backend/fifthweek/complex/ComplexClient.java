package backend.fifthweek.complex;

public class ComplexClient {
    public static void main(String[] args) {
        ComplexApp c1 = new ComplexApp(7,21);
        ComplexApp c2 = new ComplexApp(7,25);

        byte[] topSecretArray = {(byte) c1.add(63).re, (byte) c2.add(c2.re*10).re,(byte) c1.add(new ComplexApp(0,c1.im*3-1)).im,(byte) c2.add(new ComplexApp(0, c2.im * 3 - 17)).im};

        for (byte b : topSecretArray) {
            System.out.print((char) b);
        }
    }
}
