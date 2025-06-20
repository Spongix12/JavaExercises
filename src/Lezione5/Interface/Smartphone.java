package Lezione5.Interface;

public class Smartphone implements  DispositivoElettronico{
    String modello;
    boolean acceso;

    public Smartphone(String modello){
        this.modello = modello;
        this.acceso = false;
    }

    @Override
    public void accendi() {
        if(!acceso) {
            acceso = true;
            System.out.println(modello + "Si sta accendendo....");
        }else{
            System.out.println(modello + "è già acceso");
        }
    }

    @Override
    public void spegni() {
    if(acceso){
        acceso = false;
        System.out.println(modello + " si sta spegnendo...");
    }else{
        System.out.println(modello + "è già spento...");
    }
    }

    @Override
    public boolean isAcceso() {
        return acceso;
    }
}
