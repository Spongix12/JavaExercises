package Lezione4.Es2;

import java.util.ArrayList;

public abstract class Utenti {
    protected String username;
    protected String email;

    public Utenti(String username, String email) {
        this.username = username;
        this.email = email;
    }


    public abstract ArrayList<String> getPermessi();


    public void stampaInfo() {
        System.out.println("Username: " + username + " - Email: " + email);
    }
}
