package Lezione4.Es2;
import java.util.ArrayList;

public class GestioneUtenti {
        private ArrayList<Utenti> utenti;

        public GestioneUtenti() {
            utenti = new ArrayList<>();
        }


        public void aggiungiUtente(Utenti u) {
            utenti.add(u);
        }


        public void stampaPermessi() {
            for (Utenti u : utenti) {
                u.stampaInfo();
                System.out.println("Permessi: " + u.getPermessi());
                System.out.println("---------------------------");
            }
        }
    }

