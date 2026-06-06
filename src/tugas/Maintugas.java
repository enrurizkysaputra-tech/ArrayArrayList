// Nama : Enru Rizky
// NPM  : 2410010143

package tugas;


public class Maintugas {

   
    public static void main(String[] args) {
         String[] mataKuliah = {
            "Pemrograman Berbasis Objek 1",
            "Struktur Data",
            "Basis Data",
            "Matematika Diskrit"
        };
 
      
        System.out.println("       DAFTAR MATA KULIAH SEMESTER      ");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println((i + 1) + ". " + mataKuliah[i]);
        }
        System.out.println("\n");
 
        
        // BAGIAN 2 – Membuat objek KelasKuliah dan menambah mahasiswa
       
        Kelaskuliah kelas = new Kelaskuliah();
 
        System.out.println("--- Menambahkan data mahasiswa ---");
        kelas.tambahMahasiswa(new Mahasiswa("Andi Saputra",   "2301001", 85.0));
        kelas.tambahMahasiswa(new Mahasiswa("Budi Santoso",   "2301002", 55.5));
        kelas.tambahMahasiswa(new Mahasiswa("Citra Dewi",     "2301003", 78.0));
        kelas.tambahMahasiswa(new Mahasiswa("Doni Firmansyah","2301004", 92.0));
        kelas.tambahMahasiswa(new Mahasiswa("Eva Nurlita",    "2301005", 48.0));
 
      
        // BAGIAN 3 – Tampilkan semua data
      
        kelas.tampilkanSemua();
 
        
        // BAGIAN 4 – Rata-rata nilai dan jumlah lulus

        System.out.println("              REKAP NILAI               ");
        System.out.printf ("Rata-rata nilai   : %.2f%n", kelas.hitungRataRata());
        System.out.println("Jumlah mahasiswa  : " + kelas.jumlahMahasiswa());
        System.out.println("Jumlah lulus      : " + kelas.jumlahLulus());
        System.out.println("Jumlah tidak lulus: "
                + (kelas.jumlahMahasiswa() - kelas.jumlahLulus()));
        System.out.println("\n");
 
        
        // BAGIAN 5 – Tambah satu mahasiswa baru, tampilkan jumlah baru
    
        System.out.println("--- Menambahkan 1 mahasiswa baru ---");
        kelas.tambahMahasiswa(new Mahasiswa("Fajar Ramadhan", "2301006", 70.0));
 
        System.out.println("\nJumlah mahasiswa setelah penambahan: "
                + kelas.jumlahMahasiswa());
 
        // Tampilkan seluruh data akhir
        kelas.tampilkanSemua();
    }
    
    
}
