public interface Competitor {
    // Abstract method
    void playMatch();

    // Default method
    default void reportStatus() {
        System.out.println("[Status] Competitor is ready for the next round.");
    }

    // Static method
    static boolean isValidScore(int score) {
        return (score >= 0 && score <= 100);
    }
}
