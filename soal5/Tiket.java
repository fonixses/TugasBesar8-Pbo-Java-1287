package soal5;

import java.text.NumberFormat;
import java.util.Locale;

public class Tiket {
    // Encapsulation: seluruh atribut dibuat private.
    private String kodeTiket;
    private String namaFilm;
    private String jenisTiket;
    private double hargaTiket;
    private int jumlahTiket;

    // Constructor dan this: parameter menginisialisasi atribut pada objek ini.
    public Tiket(String kodeTiket, String namaFilm, String jenisTiket,
            double hargaTiket, int jumlahTiket) {
        this.kodeTiket = kodeTiket;
        this.namaFilm = namaFilm;
        this.jenisTiket = jenisTiket;
        this.hargaTiket = hargaTiket;
        this.jumlahTiket = jumlahTiket;
    }

    // Return value: menghitung dan mengembalikan total harga dalam double.
    public double hitungTotal() {
        return hargaTiket * jumlahTiket;
    }

    public void tampilData() {
        NumberFormat rupiah = NumberFormat.getNumberInstance(Locale.forLanguageTag("id-ID"));
        rupiah.setMaximumFractionDigits(0);
        rupiah.setMinimumFractionDigits(0);

        System.out.println("========================================");
        System.out.println("          DATA PEMESANAN TIKET          ");
        System.out.println("========================================");
        System.out.printf("%-13s: %s%n", "Kode Tiket", kodeTiket);
        System.out.printf("%-13s: %s%n", "Film", namaFilm);
        System.out.printf("%-13s: %s%n", "Jenis Tiket", jenisTiket);
        System.out.printf("%-13s: Rp%s%n", "Harga", rupiah.format(hargaTiket));
        System.out.printf("%-13s: %d%n", "Jumlah", jumlahTiket);
        System.out.printf("%-13s: Rp%s%n", "Total", rupiah.format(hitungTotal()));
        System.out.println("----------------------------------------");
    }
}
