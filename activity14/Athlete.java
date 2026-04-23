import java.util.ArrayList;
import java.util.List;

public class Athlete implements Competitor, Comparable<Athlete>, Cloneable {
    private String name;
    private int score;
    private List<String> trophies;

    public Athlete(String name, int score, List<String> trophies) {
        this.name = name;
        this.score = score;
        this.trophies = new ArrayList<>(trophies);
    }

    @Override
    public int compareTo(Athlete other) {
        if (this.score != other.score) {
            return Integer.compare(other.score, this.score);
        }
        return this.name.compareTo(other.name);
    }

    @Override
    public Athlete clone() throws CloneNotSupportedException {
        Athlete cloned = (Athlete) super.clone();
        cloned.trophies = new ArrayList<>(this.trophies);
        return cloned;
    }

    public void addTrophy(String trophy) {
        this.trophies.add(trophy);
    }

    @Override
    public void playMatch() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'playMatch'");
    }
    
}
