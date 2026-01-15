public class Main {
    public static void main(String[] args) {
        Tumbler obj1 = new Tumbler();
        obj1.brand = "Aquaflask";
        obj1.volume = 750;

        Tumbler obj2 = new Tumbler();
        obj2.brand = "Tyeso";
        obj2.volume = 600;

        obj1.printDetails();
        obj2.printDetails();

    }
}
