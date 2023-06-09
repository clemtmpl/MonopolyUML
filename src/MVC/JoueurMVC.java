package MVC;

public class JoueurMVC {
    private String pseudo;
    private double cash;

    public JoueurMVC(String pseudo, double cash) {
        this.pseudo = pseudo;
        this.cash = cash;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }
}
