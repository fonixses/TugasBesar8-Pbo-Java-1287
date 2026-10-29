package soal2;

public class Sepeda {
    // Encapsulation: atribut dibuat private agar diakses melalui method class.
    private String kodeSepeda;
    private String jenisSepeda;
    private int lamaSewa;
    private double hargaPerJam;

    public Sepeda(String kodeSepeda, String jenisSepeda, int lamaSewa, double hargaPerJam) {
        // Keyword this membedakan atribut objek dari parameter constructor.
        this.kodeSepeda = kodeSepeda;
        this.jenisSepeda = jenisSepeda;
        this.lamaSewa = lamaSewa;
        this.hargaPerJam = hargaPerJam;
    }

    // Method ini memiliki return value berupa total biaya sewa.
    public double hitungBiaya() {
        return lamaSewa * hargaPerJam;
    }

    public void tampilData() {
        System.out.println("Kode Sepeda   : " + kodeSepeda);
        System.out.println("Jenis Sepeda  : " + jenisSepeda);
        System.out.println("Lama Sewa     : " + lamaSewa + " jam");
        System.out.printf("Harga per Jam : Rp %.2f%n", hargaPerJam);
        System.out.printf("Total Biaya   : Rp %.2f%n", hitungBiaya());
    }
}
