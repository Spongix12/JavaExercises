package Lezione5.Es1;

import java.util.ArrayList;

public class Carrello {
    static ArrayList <String>  arr1  = new ArrayList<>();


    public static void aggiungiProdotto(String name){
        arr1.add("Nome :" + name);
    }

    public static void aggiungiProdotto(String name, int quantity){
        arr1.add("Nome : "+ name +"  ,Quantità : "+ quantity);
    }

    public static void main(String[] args) {
            System.out.println("--- Test Iniziale del Carrello ---");

            System.out.println("Carrello attuale: " + Carrello.arr1);
            System.out.println("Dimensione carrello: " + Carrello.arr1.size());


            Carrello.aggiungiProdotto("Latte");
            System.out.println("Carrello dopo 'Latte': " + Carrello.arr1);
            System.out.println("Dimensione carrello: " + Carrello.arr1.size());


            Carrello.aggiungiProdotto("Pane");
            System.out.println("Carrello dopo 'Pane': " + Carrello.arr1);


            Carrello.aggiungiProdotto("Mele", 3); // Metodo con quantità
            System.out.println("Carrello dopo 'Mele': " + Carrello.arr1);


            Carrello.aggiungiProdotto("Acqua", 6); // Metodo con quantità
            System.out.println("Carrello dopo 'Acqua': " + Carrello.arr1);

            System.out.println("\n--- Controllo finale del contenuto del carrello ---");

            for (String prodotto : Carrello.arr1) {
                System.out.println("- " + prodotto);
            }
    }
}
