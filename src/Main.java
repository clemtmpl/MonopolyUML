import MVC.JoueurMVC;
import MVC.JoueurMVCController;
import MVC.JoueurMVCView;

public class Main {
    public static void main(String[] args) {
        Propriete terrain1 = FabriqueProprietes.creerPropriete("terrain", "Baltic Avenue", 60, "Violet");
        Propriete gare1 = FabriqueProprietes.creerPropriete("gare", "Pennsylvania Railroad", 200, null);
        Propriete compagnieEE1 = FabriqueProprietes.creerPropriete("compagnieee", "Electric Company", 150, "Jaune");

        System.out.println(terrain1);
        System.out.println(gare1);
        System.out.println(compagnieEE1);

        Banque b1 = Banque.getInstance();
        System.out.println("Montant de la banque b1 :" + b1.getCaisse());

        Banque b2 = Banque.getInstance();
        System.out.println("Montant de la banque b2 :" + b2.getCaisse());

        b1.decaisser(400);
        System.out.println("Montant de la banque b2 après l'opération b1 :" + b2.getCaisse());

        Plateau plateau = new Plateau();
        Iterator iterator = plateau.createIterator();

        while (iterator.hasNext()) {
            Case caseCourante = iterator.next();
            System.out.println(caseCourante.getNom());
        }

        JoueurDAO joueurDAO = new JoueurDAOImpl();

        Joueur joueur1 = new Joueur(1, "Alice");
        joueurDAO.ajouterJoueur(joueur1);

        Joueur joueur2 = joueurDAO.obtenirJoueur(1);
        System.out.println(joueur2.getNom());

        joueur2.setNom("Bobby");
        joueurDAO.mettreAJourJoueur(joueur2);
        System.out.println(joueur2.getNom());

        joueurDAO.supprimerJoueur(joueur2);

        JoueurMVC joueurMVC = new JoueurMVC("John", 1000.0);
        JoueurMVCView joueurView = new JoueurMVCView();
        JoueurMVCController joueurController = new JoueurMVCController(joueurMVC, joueurView);

        // Affichage initial du joueur
        joueurController.afficherJoueurMVC();

        // Mise à jour du joueur
        joueurController.mettreAJourJoueur("Jane", 1500.0);
    }
}