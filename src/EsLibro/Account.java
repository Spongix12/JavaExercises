package EsLibro;

public class Account {
    String name; //variabile di istanza
    double balance; //variabile di istanza

    public Account(String name, double balance){
        this.name = name;

        if(balance > 0.0){
            this.balance = balance;
        }
    }

    public void deposit(double depositam){
        if(depositam > 0.0 )
            balance = balance + depositam;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }
}
