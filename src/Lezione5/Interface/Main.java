package Lezione5.Interface;

public class Main {
    public static void main(String[] args) {
        Smartphone miotel = new Smartphone("Iphone 15");
        Laptop mioLaptop = new Laptop("Mackbook");

        DispositivoElettronico disp1 = miotel;
        DispositivoElettronico disp2 = mioLaptop;

        System.out.println("---Test con variabili di Interfaccia");
        disp1.accendi();
        disp2.accendi();


        System.out.println("\n\nStato dopo l'accensione");
        System.out.println("E' acceso ? = "+ miotel.isAcceso());
        System.out.println("E' acceso ? = "+ mioLaptop.isAcceso());

        disp1.spegni();
        disp2.spegni();

        System.out.println("\n\nStato dopo lo spegnimento");
        System.out.println("E' spento ? = " + miotel.isAcceso());
        System.out.println("E' spento ? = "+mioLaptop.isAcceso());
    }
}
