public interface JoueurDAO {
    void ajouterJoueur(Joueur joueur);
    Joueur obtenirJoueur(int id);
    void mettreAJourJoueur(Joueur joueur);
    void supprimerJoueur(Joueur joueur);
}

