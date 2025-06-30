package Lezione7.ES2;

import java.util.Stack;

public class Browser {

    private Stack<String> cron = new Stack<>();


    public void visitPage(String url){
        cron.push(url);
        System.out.println("Hai visitato : " + url);
    }

    public void goBack(){
        if(cron.size() > 1){
            String paginaCorr = cron.pop(); //rimuove pagina attuale
            String paginaPre = cron.peek(); //mostra la precedente
            System.out.println("Tornato a : " + paginaPre);
        }else if(cron.size() == 1){
            cron.pop();
            System.out.println("Tutte le pagine sono state chiuse");
        }else{
            System.out.println("Nessuna pagina da cui tornare");
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

