
package tugas;


public class Mahasiswa {
    // Atribut
    private String nama;
    private String npm;
    private double nilai;
 
    // Constructor
    public Mahasiswa(String nama, String npm, double nilai) {
        this.nama  = nama;
        this.npm   = npm;
        this.nilai = nilai;
    }
 
    // Getter
    public String getNama()  { return nama; }
    public String getNpm()   { return npm; }
    public double getNilai() { return nilai; }
 
    /**
     * Mengembalikan true jika nilai >= 60 (lulus).
     */
    public boolean lulus() {
        return nilai >= 60;
    }
 
    /**
     * Representasi teks singkat objek ini.
     */
    public String info() {
        String status = lulus() ? "LULUS" : "TIDAK LULUS";
        return String.format("%-20s | NPM: %-12s | Nilai: %5.1f | %s",
                nama, npm, nilai, status);
    }
}
