package Esame_Intermedio.Es3;

public class Studente extends Utente implements Autenticabile{

    private String matricola;

    public Studente(String username, String email,String matricola) {
        super(username, email);
        this.matricola = matricola;
    }

    @Override
    public void presentati(){
        System.out.println("Studente : " + getUsername() +  ", " +
                "matricola :" + matricola);
    }

    @Override
    public void autentica(String password) throws AutenticazioneException {
        if(!"studente123".equals(password)){
            throw new AutenticazioneException("Password errata per lo studente : " + getUsername());
        }
    }
}
