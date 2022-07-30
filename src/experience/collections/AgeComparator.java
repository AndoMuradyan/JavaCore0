package experience.collections;

import java.util.Comparator;

public class AgeComparator implements Comparator<Humen> {
    @Override
    public int compare(Humen o1, Humen o2) {
        return o1.getAge()-o2.getAge();
    }
}
