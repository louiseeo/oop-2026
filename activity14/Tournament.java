import java.util.ArrayList;
import java.util.List;

public class Tournament<T> {
    // Field ArrayList<T> participants
    private List<T> participants = new ArrayList<>();

    // Method for adding participant
    public void addParticipant(T participant) {
        participants.add(participant);
    }

    // Method that prints details of every participant
    public void showAll() {
        for (T participant : participants) {
            System.out.println(participant);
        }
    }
}