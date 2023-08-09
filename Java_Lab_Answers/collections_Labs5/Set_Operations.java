package collections_Labs5;

import java.util.HashSet;
import java.util.Set;

public class Set_Operations {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        set1.add("Apple");
        set1.add("Samsung");
        set1.add("LG");
        set1.add("Nokia");
        set1.add("Micromax");

        set2.add("Sony");
        set2.add("Apple");
        set2.add("Nokia");
        set2.add("HTC");
        set2.add("Spice");

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);

        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("\nUnion: " + union);

        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);

        Set<String> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Difference (Set1 - Set2): " + difference);
    }

}
