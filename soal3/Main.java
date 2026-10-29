package soal3;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu("M01", "Nasi Goreng", 18000, "Makanan");
        int jumlah = 2;

        menu.tampilMenu();
        System.out.println("Jumlah  : " + jumlah);
        System.out.printf("Total   : %.0f%n", menu.hitungHarga(jumlah));

        Menu menu2 = new Menu("M02", "Mie Goreng", 15000, "Makanan");
        int jumlah2 = 1;
        System.out.println();
        menu2.tampilMenu();
        System.out.println("Jumlah  : " + jumlah2);
        System.out.printf("Total   : %.0f%n", menu2.hitungHarga(jumlah2));

        Menu menu3 = new Menu("M03", "Es Teh", 5000, "Minuman");
        int jumlah3 = 3;
        System.out.println();
        menu3.tampilMenu();
        System.out.println("Jumlah  : " + jumlah3);
        System.out.printf("Total   : %.0f%n", menu3.hitungHarga(jumlah3));
    }
}
