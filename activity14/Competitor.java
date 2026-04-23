public interface Competitor {
    void playMatch();

    default void reportStatus() {
        System.out.println("[Status] Competitor is ready for next round.");
    }

    static boolean isValidScore(int score) {
        return (score >= 0 && score <= 100);
    }
}
