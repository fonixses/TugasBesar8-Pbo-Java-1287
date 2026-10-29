package soal3;

public class Menu {
    private String kodeMenu;
    private String namaMenu;
    private double harga;
    private String kategori;

    // Constructor overloading: tersedia constructor tanpa parameter dan berparameter.
    public Menu() {
        this("", "", 0.0, "");
    }

    public Menu(String kodeMenu, String namaMenu, double harga, String kategori) {
        this.kodeMenu = kodeMenu;
        this.namaMenu = namaMenu;
        this.harga = harga;
        this.kategori = kategori;
    }

    public double hitungHarga(int jml) {
        // jml adalah method parameter input yang menentukan jumlah pesanan.
        return harga * jml;
    }

    public String getKategori() {
        return kategori;
    }

    public void tampilMenu() {
        System.out.println("Kode    : " + kodeMenu);
        System.out.println("Nama    : " + namaMenu);
        System.out.printf("Harga   : %.0f%n", harga);
    }
}
