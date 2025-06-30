package Lezione6;

public class Main {
    public static void main(String[] args) {
        AutoIbrida auto = new AutoIbrida();

        System.out.println("Batteria iniziale: " + auto.getBatteria());
        System.out.println("Connesso? "+ auto.isConness());

        auto.connetti();
        System.out.println("Connesso? " + auto.isConness());

        auto.ricarica();
        System.out.println("Batteria dopo ricarica: " + auto.getBatteria());

        auto.disconnetti();
        System.out.println("Conesso? " + auto.isConness());
    }
}
