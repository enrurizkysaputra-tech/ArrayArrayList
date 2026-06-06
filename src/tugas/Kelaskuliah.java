
package tugas;

import java.util.ArrayList;


public class Kelaskuliah {
      private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
 
    // Operasi dasar
   
    public void tambahMahasiswa(Mahasiswa mhs) {
        daftarMahasiswa.add(mhs);
        System.out.println("Mahasiswa '" + mhs.getNama() + "' berhasil ditambahkan.");
    }
 
   
    public void tampilkanSemua() {
        System.out.println("\n========================================");
        System.out.println("        DAFTAR MAHASISWA KELAS          ");
        System.out.println("========================================");
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("(Belum ada data mahasiswa)");
        } else {
            for (int i = 0; i < daftarMahasiswa.size(); i++) {
                System.out.println((i + 1) + ". " + daftarMahasiswa.get(i).info());
            }
        }
        System.out.println("Total mahasiswa: " + daftarMahasiswa.size());
        System.out.println("========================================\n");
    }
 
    
    // Operasi agregat
    
 
    
    public double hitungRataRata() {
        if (daftarMahasiswa.isEmpty()) return 0;
        double total = 0;
        for (Mahasiswa mhs : daftarMahasiswa) {
            total += mhs.getNilai();
        }
        return total / daftarMahasiswa.size();
    }
 
    
    public int jumlahLulus() {
        int lulus = 0;
        for (Mahasiswa mhs : daftarMahasiswa) {
            if (mhs.lulus()) lulus++;
        }
        return lulus;
    }
 
   
    public int jumlahMahasiswa() {
        return daftarMahasiswa.size();
    }
}
