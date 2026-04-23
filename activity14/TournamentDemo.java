import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TournamentDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Create tournament object
        Tournament<Athlete> athletes = new Tournament<>();

        // Add three athletes with different scores
        Athlete a1 = new Athlete("Kayla Sanchez", 35, List.of("Silver Medal"));
        Athlete a2 = new Athlete("Katie Ledecky", 99, List.of("Gold Medal"));
        Athlete a3 = new Athlete("Emma McKeon", 67, List.of("Bronze Medal"));

        athletes.addParticipant(a1);
        athletes.addParticipant(a2);
        athletes.addParticipant(a3);
        athletes.showAll();

        // Sort the athletes
        List<Athlete> list = new ArrayList<>(List.of(a1, a2, a3));
        Collections.sort(list);
        System.out.println("------ Sorted by Score (Descending) -------");
        for (Athlete a : list) {
            System.out.println(a);
        }

        // Demonstrate deep copy
        Athlete clone = a2.clone();
        clone.addTrophy("Diamond Cup");
        System.out.println("----- CLONED ATHLETE -----\n" + clone);
        System.out.println("----- ORIGINAL ATHLETE -----\n" + a2);

        // Test static and default methods from Competitor interface
        a2.reportStatus();
        System.out.println("Valid score: " + Competitor.isValidScore(99));
    }
}