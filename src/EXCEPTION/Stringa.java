package EXCEPTION;

import java.util.Scanner;

public class Stringa {

    public static int parseNumero(String input){
        try{
            return  Integer.parseInt(input);
        }catch(NumberFormatException e){
            System.out.println("Errore: '" + input + "' 1Non è un numero valido");
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero:  ");
        String input = scanner.nextLine();

        int numero = parseNumero(input);
        if (numero != -1){
            System.out.println("Hai inserito il numero: "+ numero);
        }else{
            System.out.println("Operazione fallita.");
        }
        scanner.close();
    }
}
