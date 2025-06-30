package Lezione7.ES1;

import java.util.LinkedList;
import java.util.Queue;

public class Posta {

     Queue<Persona> coda = new LinkedList<>();


    public void entraInCoda(Persona p){
        coda.add(p);
        System.out.println(p.getNome() + " è entrato in coda");
    }

    public String chiEIlProssimo() {
        Persona prossimo = coda.peek();  // restituisce la testa della coda, o null se vuoto
        if (prossimo != null) {
            return prossimo.getNome();
        } else {
            return "Nessuno in coda";
        }
    }


    public String servireProssimo() {
        Persona servito = coda.poll();  // rimuove e restituisce la testa della coda, o null se vuota

        if (servito != null) {
            return servito.getNome() + " è stato servito.";
        } else {
            return "Nessuno da servire.";
        }
    }


    public void mostraCoda(){
        if(coda.isEmpty()){
            System.out.println("La coda è vuota.");
        }else{
            System.out.println("Persone in coda: ");
            for(Persona p : coda){
            System.out.println("- "+p.getNome());
            }
        }
    }
}
