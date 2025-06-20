package Lezione5.Interface;


public class Laptop implements DispositivoElettronico {
    private String marca;
    private boolean acceso;

    public Laptop(String marca) {
        this.marca = marca;
        this.acceso = false; // Inizialmente spento
    }

    @Override
    public void accendi() {
        if (!acceso) {
            acceso = true;
            System.out.println(marca + " laptop si sta avviando...");
        } else {
            System.out.println(marca + " laptop è già acceso.");
        }
    }

    @Override
    public void spegni() {
        if (acceso) {
            acceso = false;
            System.out.println(marca + " laptop si sta spegnendo.");
        } else {
            System.out.println(marca + " laptop è già spento.");
        }
    }

    @Override
    public boolean isAcceso() {
        return acceso;
    }


    public void apriProgramma(String programma) {
        if (acceso) {
            System.out.println(marca + " laptop sta aprendo: " + programma);
        } else {
            System.out.println(marca + " laptop è spento, non può aprire programmi.");
        }
    }
}
