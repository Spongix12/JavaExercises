package Lezione4.Es1;
import java.util.ArrayList;

public class Rifugio {
    private ArrayList<Animale> animali;

    public Rifugio() {
        animali = new ArrayList<>();
    }

    public void aggiungiAnimale(Animale a) {
        animali.add(a);
    }

    public void stampaVersi() {
        for (Animale a : animali) {
            a.descrizione();
            a.emettiVerso();
            System.out.println();
        }
    }
}
