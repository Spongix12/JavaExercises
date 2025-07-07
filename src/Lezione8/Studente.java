package Lezione8;

public class Studente {
    String nome,cognome;

    public Studente(String nome , String cognome){
        this.nome = nome;
        this.cognome = cognome;

    }

    public String toString() {
        return "Studente: " + nome + " " + cognome;
    }
}
