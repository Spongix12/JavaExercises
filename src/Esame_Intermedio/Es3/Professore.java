package Esame_Intermedio.Es3;

public class Professore  extends Utente implements  Autenticabile{

    private String materia;

    public Professore(String username, String email, String materia) {
        super(username, email);
        this.materia = materia;
    }

     @Override
     public void presentati(){
         System.out.println("Professore : " + getUsername() + ", insegna : "+ materia);
     }
    @Override
    public void autentica(String password) throws AutenticazioneException {
        if(!"prof2024".equals(password)){
            throw new AutenticazioneException("Password errata per il prof : "+ getUsername());
        }
    }
}
