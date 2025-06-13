package Lezione4.Es1;

public class Main {
    public static void main(String[] args) {
        Cane c1 = new Cane("Billy");
        Gatto g1 = new Gatto("ZioBilly");

        Rifugio r1 = new Rifugio();

        r1.aggiungiAnimale(c1);
        r1.aggiungiAnimale(g1);

        r1.stampaVersi();
    }
}
