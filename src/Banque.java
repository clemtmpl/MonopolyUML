public class Banque {
    private int caisse;
    private static Banque instance;

    private Banque(int montant) {
        caisse = montant;
    }

    public static Banque getInstance() {
        if (instance == null) {
            instance = new Banque(2000);
        }
        return instance;
    }

    public void encaisser(int montant){
        caisse += montant;
    }

    public void decaisser(int montant) {
        caisse -= montant;
    }

    public int getCaisse(){
        return caisse;
    }
}