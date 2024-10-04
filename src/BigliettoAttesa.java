public class BigliettoAttesa extends Thread {
    private static int biglietto = 1;
    private static final int[] biglietti = new int[3];

    public void run() {
        synchronized (biglietti) {
            biglietti[biglietto - 1] = biglietto;
            System.out.println("Biglietto 0" + biglietto + " emesso");
            biglietto++;
        }
    }
}
