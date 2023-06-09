package com.example.monopoly;

public class Banque {
    private static Banque instance;

    private Banque() {
        // Initialisation de la banque
    }

    // Méthode statique pour récupérer l'instance unique de la classe Banque
    public static Banque getInstance() {
        if (instance == null) {
            synchronized (Banque.class) {
                if (instance == null) {
                    instance = new Banque();
                }
            }
        }
        return instance;
    }
    public void effectuerTransaction(String compteSource, String compteDestination, double montant) {
    }
}