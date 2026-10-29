package soal2;

public class Main {
    public static void main(String[] args) {
        Sepeda sepeda1 = new Sepeda("SPD001", "Sepeda Gunung", 3, 15000.0);
        Sepeda sepeda2 = new Sepeda("SPD002", "Sepeda Lipat", 5, 12000.0);

        System.out.println("=== Data Sepeda 1 ===");
        sepeda1.tampilData();

        System.out.println();
        System.out.println("=== Data Sepeda 2 ===");
        sepeda2.tampilData();
    }
}
