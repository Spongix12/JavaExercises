package EXCEPTION;

import java.util.Scanner;

public class Divisione {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Inserisci il primo numero: ");
            int num1 = scanner.nextInt();

            System.out.println("Inserisci il secondo numero: ");
            int num2 = scanner.nextInt();

            int risultato = num1 / num2;
            System.out.println("Risultato : "+ risultato);
        } catch (ArithmeticException e){
            System.out.println("Errore: divisione per zero non consentita.");
        }catch (Exception e){
            System.out.println("Errore genrico : input non valido.");
        }finally {
            System.out.println("Operazione conclusa");
            scanner.close();
        }
    }
}
