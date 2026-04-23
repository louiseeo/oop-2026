import java.util.ArrayList;
import java.util.List;

public class Tournament<T> {
    private List<T> participants = new ArrayList<>();

    public void addParticipant(T participant) {
        participants.add(participant);
    }

    public void showAll() {
        for (T prt : participants) {
            System.out.println(prt);
        }
    }
}