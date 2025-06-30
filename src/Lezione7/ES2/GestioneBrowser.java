package Lezione7.ES2;

public class GestioneBrowser {
    public static void main(String[] args) {
        Browser b = new Browser();

        b.visitPage("Ciao.it");
        b.visitPage("Facile.it");
        b.visitPage("SteveJobs.academy");


        System.out.println("\nCronologia iniziale");

        b.printHistory();
        System.out.println("\n");

        //indietro prima volta
        System.out.println("Torna indietro.");
        b.goBack();

        //indietro seconda volta
        System.out.println("\nTorna ancora indietro.");
        b.goBack();

        //indietro seconda volta
        System.out.println("\nTorna ancora indietro.");
        b.goBack();


        System.out.println("\n");

        b.printHistory();

    }
}
