package Lezione6;

public  class AutoIbrida  extends Veicolo implements  Connettivita ,Ricaricabile{

    private  boolean connesso;

    public  AutoIbrida(){
        super();
        this.connesso = false;
    }


    @Override
    public void connetti() {
        connesso = true;
        System.out.println("Auto connessa  via Bluethooth");
    }

    @Override
    public void disconnetti() {
        connesso = false;
        System.out.println("Connessione Bluethoot disattivata");
    }

    @Override
    public boolean isConness() {
        return connesso;
    }

    @Override
    public void ricarica() {
        caricaBatteria();
    }
}
