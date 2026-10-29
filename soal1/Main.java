public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku("BK001", "Pemrograman Java", "Andi", 250000);
        Buku buku2 = new Buku("BK002", "Basis Data", "Budi", 180000);

        buku1.tampilData();
        buku2.tampilData();
    }
}
