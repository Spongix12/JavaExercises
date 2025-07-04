package Esame_Intermedio.Es3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Utente> utenti = new ArrayList<>();
        Studente s1 = new Studente("Alessione", "alessionebronte@gmail.com", "123456");
        Professore p1 = new Professore("Andreex", "sjbdjbdjbdj@gmail.com", "Matematica");
        Segreteria s2 = new Segreteria("Sig.Paolo", "dwijeijddj@gmail.com", "Postale");

        utenti.add(s1);
        utenti.add(s2);
        utenti.add(p1);


        for (Utente utente : utenti) {
            utente.presentati();
            try {
                //INSTANCEOF cercato nella documentazione
                if (utente instanceof Autenticabile) {
                    Autenticabile autenticabile = (Autenticabile) utente;
                    if (utente instanceof Studente) {
                        autenticabile.autentica("studente123");
                        System.out.println("Autenticazione studente " + (utente).getUsername() + " riuscita!");
                    } else if (utente instanceof Professore) {
                        autenticabile.autentica("prof2024");
                        System.out.println("Autenticazione professore " + (utente).getUsername() + " riuscita!");
                    }
                }
            } catch (AutenticazioneException e) {
                System.out.println("Errore di autenticazione: " + e.getMessage());
            }
            System.out.println("---");
        }
    }
}