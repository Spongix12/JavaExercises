package Esame_Intermedio.Es3;

public class Segreteria extends Utente{

    private String ufficio;

    public Segreteria(String username, String email,String ufficio) {
        super(username, email);
        this.ufficio = ufficio;
    }

    @Override
    public void presentati(){
        System.out.println("Personale di segreteria : " + getUsername() + ",Ufficio: " + ufficio);
    }
}
