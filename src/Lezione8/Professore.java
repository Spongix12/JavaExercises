package Lezione8;

class Professore {
    String nome, cognome;
    public Professore(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }
    public String toString() {
        return "Professore: " + nome + " " + cognome;
    }
}
