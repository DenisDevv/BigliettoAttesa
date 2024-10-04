public class Main {
    public static void main(String[] args) {
        BigliettoAttesa m1 = new BigliettoAttesa();
        m1.start();
        BigliettoAttesa m2 = new BigliettoAttesa();
        m2.start();
        BigliettoAttesa m3 = new BigliettoAttesa();
        m3.start();
    }
}