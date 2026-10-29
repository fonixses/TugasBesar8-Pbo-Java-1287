package soal5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // ArrayList menyimpan daftar objek Tiket secara dinamis.
        ArrayList<Tiket> daftarTiket = new ArrayList<>();
        daftarTiket.add(new Tiket("T001", "Petualangan di Hutan", "Reguler", 50000, 2));
        daftarTiket.add(new Tiket("T002", "Misteri Malam", "VIP", 85000, 1));
        daftarTiket.add(new Tiket("T003", "Galaksi Terakhir", "Reguler", 60000, 3));

        // Looping for-each menampilkan struk semua tiket dalam daftar.
        for (Tiket tiket : daftarTiket) {
            tiket.tampilData();
        }
    }
}
