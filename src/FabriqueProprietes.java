import org.jetbrains.annotations.Nullable;

public class FabriqueProprietes {
    public static Propriete creerPropriete(String type, String nom, int prix, @Nullable String couleur) {
        if (type.equalsIgnoreCase("terrain")) {
            return new Terrain(nom, prix, couleur);
        } else if (type.equalsIgnoreCase("gare")) {
            return new Gare(nom, prix);
        } else if (type.equalsIgnoreCase("compagnieee")) {
            return new CompagnieEE(nom, prix);
        } else {
            throw new IllegalArgumentException("Type de propriété inconnu : " + type);
        }
    }
}