package Lezione6;

public class Veicolo {
    int batteria;

    public Veicolo()  {
    this.batteria = 50;
    }

    public void caricaBatteria(){
        this.batteria = 100;
        System.out.println("Batteria caricata al 100%");
    }
    public int getBatteria(){
        return  batteria ;
        }
    }

