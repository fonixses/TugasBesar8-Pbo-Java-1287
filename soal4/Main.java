package soal4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Collection: ArrayList<Pemeriksaan> menyimpan beberapa objek pemeriksaan.
        ArrayList<Pemeriksaan> daftarPemeriksaan = new ArrayList<>();
        daftarPemeriksaan.add(new Pemeriksaan("PK001", "Andi Saputra", "dr. Siti Aminah", 50000));
        daftarPemeriksaan.add(new Pemeriksaan("PK002", "Budi Santoso", "dr. Rudi Hartono", 75000));
        daftarPemeriksaan.add(new Pemeriksaan("PK003", "Citra Lestari", "dr. Siti Aminah", 100000));

        // Iteration/Looping: for-each menampilkan semua objek di dalam ArrayList.
        for (Pemeriksaan pemeriksaan : daftarPemeriksaan) {
            pemeriksaan.tampilData();
            System.out.println("------------------------------");
        }
    }
}
