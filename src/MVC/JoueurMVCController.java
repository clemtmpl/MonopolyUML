package MVC;

public class JoueurMVCController {
    private JoueurMVC JoueurMVC;
    private JoueurMVCView JoueurMVCView;

    public JoueurMVCController(JoueurMVC JoueurMVC, JoueurMVCView JoueurMVCView) {
        this.JoueurMVC = JoueurMVC;
        this.JoueurMVCView = JoueurMVCView;
    }

    public void afficherJoueurMVC() {
        JoueurMVCView.afficherJoueurMVC(JoueurMVC.getPseudo(), JoueurMVC.getCash());
    }

    public void mettreAJourJoueur(String pseudo, double cash) {
        JoueurMVC.setPseudo(pseudo);
        JoueurMVC.setCash(cash);

        // Afficher les nouvelles informations du joueur après la mise à jour
        JoueurMVCView.afficherJoueurMVC(JoueurMVC.getPseudo(), JoueurMVC.getCash());
    }
}
