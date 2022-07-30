package experience.collections;

import java.util.Comparator;

public class NameComparator implements Comparator<Humen> {
    @Override
    public int compare(Humen o1, Humen o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
