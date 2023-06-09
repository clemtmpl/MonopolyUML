import java.util.ArrayList;
import java.util.List;
public class JoueurDAOImpl implements JoueurDAO {
    private List<Joueur> joueurs; // Source de données simulée

    public JoueurDAOImpl() {
        joueurs = new ArrayList<>();
    }

    @Override
    public void ajouterJoueur(Joueur joueur) {
        joueurs.add(joueur);
    }

    @Override
    public Joueur obtenirJoueur(int id) {
        for (Joueur joueur : joueurs) {
            if (joueur.getId() == id) {
                return joueur;
            }
        }
        return null;
    }

    @Override
    public void mettreAJourJoueur(Joueur joueur) {
        for (int i = 0; i < joueurs.size(); i++) {
            if (joueurs.get(i).getId() == joueur.getId()) {
                joueurs.set(i, joueur);
                break;
            }
        }
    }

    @Override
    public void supprimerJoueur(Joueur joueur) {
        joueurs.remove(joueur);
    }

    // Autres opérations liées à Joueur
}