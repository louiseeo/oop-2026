import java.util.ArrayList;
import java.util.List;

public class Athlete implements Competitor, Comparable<Athlete>, Cloneable {
    // Private fields
    private String name;
    private int score;
    private List<String> trophies;

    public Athlete(String name, int score, List<String> trophies) {
        this.name = name;
        this.score = score;
        this.trophies = new ArrayList<>(trophies);
    }

    // Implement compareTo to sort athletes
    @Override
    public int compareTo(Athlete other) {
        if (this.score != other.score) {
            return Integer.compare(other.score, this.score);
        }
        return this.name.compareTo(other.name);
    }

    // Override clone() for deep copy
    @Override
    public Athlete clone() throws CloneNotSupportedException {
        Athlete cloned = (Athlete) super.clone();
        cloned.trophies = new ArrayList<>(this.trophies);
        return cloned;
    }

    // Method for adding trophy
    public void addTrophy(String trophy) {
        this.trophies.add(trophy);
    }

    // Implement the abstract method from Competitor
    @Override
    public void playMatch() {
        System.out.println(name + " is playing a match!");
    }

    // Override toString() for formatted output
    @Override
    public String toString() {
        return String.format("""
                Athlete: %s
                Score: %d
                Trophies: %s
                """, name, score, trophies);
    }

}
