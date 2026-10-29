package soal4;

import java.text.NumberFormat;
import java.util.Locale;

public class Pemeriksaan {
    // Encapsulation: atribut private menjaga data objek tetap terenkapsulasi.
    private String noPemeriksaan;
    private String namaPasien;
    private String namaDokter;
    private double biayaPemeriksaan;

    // Constructor dan this: parameter digunakan untuk menginisialisasi atribut objek.
    public Pemeriksaan(String noPemeriksaan, String namaPasien, String namaDokter,
            double biayaPemeriksaan) {
        this.noPemeriksaan = noPemeriksaan;
        this.namaPasien = namaPasien;
        this.namaDokter = namaDokter;
        this.biayaPemeriksaan = biayaPemeriksaan;
    }

    // Return value: mengembalikan total biaya bertipe double.
    public double hitungTotal() {
        return biayaPemeriksaan;
    }

    public void tampilData() {
        NumberFormat formatRupiah = NumberFormat.getNumberInstance(Locale.forLanguageTag("id-ID"));
        formatRupiah.setMaximumFractionDigits(0);
        formatRupiah.setMinimumFractionDigits(0);

        System.out.println("Nomor Pemeriksaan : " + noPemeriksaan);
        System.out.println("Nama Pasien       : " + namaPasien);
        System.out.println("Nama Dokter       : " + namaDokter);
        System.out.println("Biaya Pemeriksaan : Rp" + formatRupiah.format(biayaPemeriksaan));
        System.out.println("Total Biaya       : Rp" + formatRupiah.format(hitungTotal()));
    }
}
