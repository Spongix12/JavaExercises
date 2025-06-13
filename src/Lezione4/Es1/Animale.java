package Lezione4.Es1;


public abstract class Animale {
    protected String nome;


    public Animale(String nome) {
        this.nome = nome;
    }


    public abstract void emettiVerso();


    public void descrizione() {
        System.out.println("Sono un animale di nome " + nome);
    }
}
