package Lezione7.ES1;

public class GestionePosta {
        public static void main(String[] args) {
            Posta p = new Posta();


            Persona p1 = new Persona("Anna");
            Persona p2 = new Persona("Marco");
            Persona p3 = new Persona("Lucia");

            p.entraInCoda(p1);
            p.entraInCoda(p2);
            p.entraInCoda(p3);


            System.out.println("\n");
            p.mostraCoda();


            System.out.println("\nIl prossimo da servire è: " + p.chiEIlProssimo());


            System.out.println("\n" + p.servireProssimo());
            System.out.println(p.servireProssimo());


            System.out.println();
            p.mostraCoda();
        }
    }