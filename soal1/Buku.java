public class Buku {
    String kodeBuku;
    String judul;
    String penulis;
    double harga;

    public Buku(String kodeBuku, String judul, String penulis, double harga) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
    }

    public void tampilData() {
        System.out.println("================    ====================");
        System.out.println("Data Buku");
        System.out.println("====================================");
        System.out.println("Kode Buku : " + kodeBuku);
        System.out.println("Judul     : " + judul);
        System.out.println("Penulis   : " + penulis);
        System.out.println("Harga     : Rp " + harga);
        System.out.println("====================================");
        System.out.println();
    }
}
