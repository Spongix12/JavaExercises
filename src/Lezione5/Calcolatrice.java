package Lezione5;

public class Calcolatrice {

    public int somma(int a, int b) {
        return a + b;
    }

    public double somma(int a, int b, int c) {
        return a + b + c;
    }

    public double somma(double a, double b) {
        return a + b;
    }

    public String somma(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calcolatrice calc = new Calcolatrice();

        System.out.println("Somma (int, int): " + calc.somma(3, 5));
        System.out.println("Somma (int, int, int): " + calc.somma(1, 3, 5));
        System.out.println("Somma (double, double): " + calc.somma(3.2, 4.6));
        System.out.println("Somma (String, String): " + calc.somma("Ciao ", " Mondo"));
    }
}
