package Lezione4.Es2;
import java.util.ArrayList;



public class Admin extends Utenti {

    public Admin(String username, String email) {
        super(username, email);
    }

    @Override
    public ArrayList<String> getPermessi() {
        ArrayList<String> permessi = new ArrayList<>();
        permessi.add("READ");
        permessi.add("WRITE");
        permessi.add("DELETE");
        return permessi;
    }
}



