package Lezione4.Es2;

import java.util.ArrayList;

class Cliente extends Utenti {

    public Cliente(String username, String email) {
        super(username, email);
    }

    @Override
    public ArrayList<String> getPermessi() {
        ArrayList<String> permessi = new ArrayList<>();
        permessi.add("READ");
        return permessi;
    }
}