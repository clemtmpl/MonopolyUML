package com.example.monopoly;

public class Terrain extends Propriete {
    private String couleur;

    public Terrain(String nom, int prix, String couleur) {
        this.nom = nom;
        this.prix = prix;
        this.couleur = couleur;
    }

    public String getCouleur() {
        return couleur;
    }

    // Autres méthodes spécifiques aux terrains
}