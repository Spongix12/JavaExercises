package Esame_Intermedio.Es2;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Gabriele", "Dell'Aquila");
        Professore p2 = new Professore("Andrea" , "Calabretta", "Java");
        Studente s1 = new Studente("Alessio", "D'antonio","ciao");

        Persona[] persone = new Persona[3];
        persone[0] = p1;
        persone[1] = p2;
        persone[2] = s1;


        System.out.println("----Stampa Persona---- \n");
        for(int i = 0; i < persone.length; i++){
            persone[i].presentati();
        }
    }
}
