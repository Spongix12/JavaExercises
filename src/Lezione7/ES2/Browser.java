package Lezione7.ES2;

import java.util.EmptyStackException;
import java.util.Stack;

public class Browser {

    private Stack<String> cron = new Stack<>();


    public void visitPage(String url){
        cron.push(url);
        System.out.println("Hai visitato : " + url);
    }


    public void goBack() {
        try {
            if (cron.size() > 1) {
                String paginaCorr = cron.pop();
                String paginaPre = cron.peek();
                System.out.println("Tornato a : " + paginaPre);
                System.out.println("Pagina eliminata : " + paginaCorr);
            } else if (cron.size() == 1) {
                cron.pop();
                System.out.println("Tutte le pagine sono state chiuse");
            } else {
                System.out.println("Nessuna pagina da cui tornare");
            }
        } catch (EmptyStackException e) {
            System.out.println("Errore: la pila è vuota. Nessuna operazione possibile.");
        }
    }



    public void printHistory() {
        if (cron.isEmpty()) {
            System.out.println("Cronologia vuota.");
        } else {
            System.out.println("Cronologia (dal più recente al più vecchio):");
            for (int i = cron.size() - 1; i >= 0; i--) {
                System.out.println("- " + cron.get(i));
            }
         }
          }
    }

