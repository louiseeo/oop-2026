public class Tumbler {
    String brand;
    double volume;

    void printDetails() {
        System.out.printf("""
        %s %s
                """, brand, volume);
    }
}