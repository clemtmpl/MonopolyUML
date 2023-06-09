import java.util.ArrayList;
import java.util.List;

public class Plateau {
    private final List<Case> cases;

    public Plateau() {
        cases = new ArrayList<>();

    }

    public Iterator createIterator() {
        return new PlateauIterator();
    }

    // Classe interne PlateauIterator implémentant l'interface Iterator
    private class PlateauIterator implements Iterator {
        private int position;

        public PlateauIterator() {
            position = 0;
        }

        public boolean hasNext() {
            return position < cases.size();
        }

        public Case next() {
            if (hasNext()) {
                Case caseCourante = cases.get(position);
                position++;
                return caseCourante;
            }
            return null;
        }
    }
}
