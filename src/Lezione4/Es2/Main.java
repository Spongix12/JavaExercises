package Lezione4.Es2;

public class Main {
    public static void main(String[] args) {
        Admin a1 = new Admin("Billy","Billy@gmail.com");
        Admin a2 = new Admin("Billy2","Billy2@gmail.com");

        Cliente c1 = new Cliente("Billy3","Billy3@gmail.com");
        Cliente c2 = new Cliente("Billy4","Billy4@gmail.com");

        GestioneUtenti g1 = new GestioneUtenti();
        g1.aggiungiUtente(a1);
        g1.aggiungiUtente(a2);
        g1.aggiungiUtente(c1);
        g1.aggiungiUtente(c2);

        g1.stampaPermessi();
    }
}
