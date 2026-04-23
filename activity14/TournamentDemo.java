import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TournamentDemo {
    public static void main(String[] args) {
        Tournament<Athlete> athletes = new Tournament<>();

        Athlete a1 = new Athlete("Kayla Sanchez", 56, List.of("Gold Medal"));
        Athlete a2 = new Athlete("Katie Ledecky", 120, List.of("Silver Medal"));
        Athlete a3 = new Athlete("Emma McKeon", 23, List.of("Bronze Medal"));

        Collections.sort((List<T>) athletes);
    }
}